package jp.tnasu.f1tvnews.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.nio.charset.Charset;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Logger;

import jp.tnasu.f1tvnews.model.HtmlContent;
import jp.tnasu.f1tvnews.model.HtmlDocument;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;
import org.slim3.datastore.Datastore;
import org.slim3.datastore.EntityNotFoundRuntimeException;

import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.Text;
import com.sun.syndication.feed.synd.SyndContent;
import com.sun.syndication.feed.synd.SyndContentImpl;
import com.sun.syndication.feed.synd.SyndEntry;
import com.sun.syndication.feed.synd.SyndEntryImpl;
import com.sun.syndication.feed.synd.SyndFeed;
import com.sun.syndication.feed.synd.SyndFeedImpl;
import com.sun.syndication.io.FeedException;
import com.sun.syndication.io.SyndFeedOutput;

public class RssController extends Controller {

	static final Logger LOGGER = Logger.getLogger(RssController.class.getName());

	static final String ENDPOINT = "http://www.bsfuji.tv/top/pub/f1.html";

	@Override
	public Navigation run() throws Exception {
		Key key = Datastore.createKey(HtmlDocument.class, 1L);
		HtmlDocument htmlDocument = getHtmlContentByDatastore(key);
		long lastModified = 0L;
		long nextModify = 1L;
		if (htmlDocument.getHtmlContentList().size() != 0) {
			HtmlContent latest = htmlDocument.getHtmlContentList().get(0);
			lastModified = latest.getLastModified();
			nextModify = latest.getNextModify();
		}
		if (lastModified < nextModify && nextModify < new Date().getTime()) {
			HtmlContent htmlContent = new HtmlContent();
			fillHtml(lastModified, htmlContent);
			if (lastModified != htmlContent.getLastModified()) {
				fillData(htmlContent);
				fillNextModify(htmlContent);
				fillDocument(htmlDocument, htmlContent);
				htmlDocument.getHtmlContentList().add(0, htmlContent);
				putHtmlContentByDatastore(htmlDocument);
			}
		}
		outputRss(getFeed(htmlDocument));
		return null;
	}

	private HtmlDocument getHtmlContentByDatastore(Key key) {
		try {
			return Datastore.get(HtmlDocument.class, key);
		} catch (EntityNotFoundRuntimeException e) {
			error(e);
			HtmlDocument htmlDocument = new HtmlDocument();
			htmlDocument.setHtmlContentList(new ArrayList<HtmlContent>());
			htmlDocument.setKey(key);
			return htmlDocument;
		}
	}

	private void putHtmlContentByDatastore(HtmlDocument htmlDocument) {
		Datastore.putAsync(htmlDocument);
	}

	private HttpURLConnection getConnection(long lastModified) throws MalformedURLException, ProtocolException, IOException {
		URL url = new URL(ENDPOINT);
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		con.setReadTimeout(1000);
		con.setConnectTimeout(1000);
		con.setDoInput(true);
		con.setDoOutput(true);
		con.setRequestMethod("GET");
		con.setInstanceFollowRedirects(false);
		con.setRequestProperty("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8");
		con.setRequestProperty("Accept-Charset", "Shift_JIS,utf-8;q=0.7,*;q=0.3");
		con.setRequestProperty("Accept-Encoding", "gzip,deflate,sdch");
		con.setRequestProperty("Accept-Language", "ja,en-US;q=0.8,en;q=0.6");
		con.setRequestProperty("Cache-Control", "max-age=0");
		con.setRequestProperty("Connection", "keep-alive");
		con.setRequestProperty("Host", "www.bsfuji.tv");
		con.setRequestProperty("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_6_8) AppleWebKit/535.11 (KHTML, like Gecko) Chrome/17.0.963.79 Safari/535.11");
		if (lastModified != 0) {
			Date date = new Date(lastModified);
			SimpleDateFormat sdf = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z");
			Locale.setDefault(Locale.ENGLISH);
			con.setRequestProperty("If-Modified-Since", sdf.format(date).replace(" UTC", " GMT"));
		}
		con.connect();
		debug(con);
		return con;
	}

	private String getHtml(HttpURLConnection con) throws IOException {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader((InputStream) con.getContent(), Charset.forName("UTF-8")));
			StringWriter sw = new StringWriter();
			while (br.ready()) {
				sw.append(br.readLine().trim().replace("　", "").replace("\t", ""));
			}
			sw.flush();
			String html = sw.toString();
			sw.close();
			//LOGGER.severe(html);
			return html;
		} finally {
			if (br != null) {
				br.close();
			}
		}
	}

	private HtmlContent fillHtml(long lastModified, HtmlContent htmlContent) throws MalformedURLException, ProtocolException, IOException {
		HttpURLConnection con = null;
		try {
			con = getConnection(lastModified);
			htmlContent.setLastModified(con.getLastModified());
			if (con.getResponseCode() == 200) {
				htmlContent.setHtml(new Text(getHtml(con)));
			}
			return htmlContent;
		} finally {
			if (con != null) {
				con.disconnect();
			}
		}
	}

	private HtmlContent fillData(HtmlContent htmlContent) {
		String html = htmlContent.getHtml().getValue();
		int beginIndex = html.indexOf("<div id=\"containerInner\" class=\"clearfix\">");
		if (beginIndex != -1) {
			html = html.substring(beginIndex);
		}
		int endIndex = html.indexOf("<div id=\"rightArea\">");
		if (endIndex != -1) {
			html = html.substring(0, endIndex);
		}
		//LOGGER.severe(html);
		htmlContent.setData(new Text(html));
		htmlContent.setTitle(fillValue(html, "<div class=\"title\">", "</div>") + fillValue(html, "<div class=\"subtitle\">", "</div>"));
		htmlContent.setDescription(fillValue(html, "<div class=\"midokoroIn\">", "</div>").replace("<p>", " ").replace("</p>", " "));
		htmlContent.setShowtime(fillValue(html, "<div class=\"free\">", "</div>").replace("<br />", " "));
		return htmlContent;
	}

	private HtmlContent fillNextModify(HtmlContent htmlContent) throws ParseException {
		String prefix = "【決勝】";
		String suffix = "(";
		String showtime = htmlContent.getShowtime();
		int beginIndex = showtime.indexOf(prefix);
		if (beginIndex != -1) {
			showtime = showtime.substring(beginIndex + prefix.length());
		}
		int endIndex = showtime.indexOf(suffix);
		if (endIndex != -1) {
			showtime = showtime.substring(0, endIndex);
		}
		SimpleDateFormat sdf = new SimpleDateFormat("MM月dd日");
		Calendar last = Calendar.getInstance();
		last.setTimeInMillis(htmlContent.getLastModified());
		Calendar next = Calendar.getInstance();
		next.setTime(sdf.parse(showtime));
		next.set(Calendar.YEAR, last.get(Calendar.YEAR));
		next.set(Calendar.HOUR, 9);
		next.add(Calendar.DATE, 1);
		LOGGER.severe(new Date(next.getTimeInMillis()).toString());
		htmlContent.setNextModify(next.getTimeInMillis());
		return htmlContent;
	}

	private HtmlDocument fillDocument(HtmlDocument htmlDocument, HtmlContent htmlContent) {
		String html = htmlContent.getHtml().getValue();
		String description = fillValue(html, "<meta name=\"description\" content=\"", "\" />");
		String title = fillValue(html, "<title>", "</title>");
		htmlDocument.setTitle(title);
		htmlDocument.setLink(ENDPOINT);
		htmlDocument.setDescription(description);
		htmlDocument.setLanguage("ja-JP");
		htmlDocument.setCopyright("http://www.bsfuji.tv/top/index/copyright.html");
		htmlDocument.setPublishedDate(new Date(htmlContent.getLastModified()));
		return htmlDocument;
	}

	private String fillValue(String html, String prefix, String suffix) {
		int beginIndex = html.indexOf(prefix);
		if (beginIndex != -1) {
			html = html.substring(beginIndex + prefix.length());
		}
		int endIndex = html.indexOf(suffix);
		if (endIndex != -1) {
			html = html.substring(0, endIndex);
		}
		//LOGGER.severe(html);
		return html;
	}

	private SyndFeed getFeed(HtmlDocument htmlDocument) throws IOException, FeedException {
		SyndFeed feed = new SyndFeedImpl();
		feed.setFeedType("rss_2.0");
        feed.setTitle(htmlDocument.getHtmlContentList().get(0).getTitle());
        feed.setLink(htmlDocument.getLink());
        feed.setDescription(htmlDocument.getDescription());
		feed.setLanguage(htmlDocument.getLanguage());
		feed.setCopyright(htmlDocument.getCopyright());
        feed.setPublishedDate(htmlDocument.getPublishedDate());
		List<SyndEntry> entries = new ArrayList<SyndEntry>();
		feed.setEntries(entries);
		for (HtmlContent htmlContent : htmlDocument.getHtmlContentList()) {
			SyndContent description = new SyndContentImpl();
	        description.setType("text/plain");
	        description.setValue(htmlContent.getShowtime());
			SyndEntry entry = new SyndEntryImpl();
			entry.setTitle(htmlContent.getTitle());
			entry.setDescription(description);
			entries.add(entry);
		}
		return feed;
	}

	private void outputRss(SyndFeed feed) throws IOException, FeedException {
		response.setContentType("application/xml; charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		Writer writer = response.getWriter();
		SyndFeedOutput output = new SyndFeedOutput();
		output.output(feed, writer);
	}

	private void debug(HttpURLConnection con) throws IOException {
		Map<String, List<String>> headers = con.getHeaderFields();
		StringBuilder sb = new StringBuilder();
		for (String headerKey : headers.keySet()) {
			sb.append(headerKey);
			List<String> headerValues = headers.get(headerKey);
			for (String headerValue : headerValues) {
				sb.append("\t");
				sb.append(headerValue);
			}
			sb.append("\n");
		}
		//LOGGER.severe(sb.toString());
		//LOGGER.severe(new Date(con.getDate()).toString());
		LOGGER.severe(new Date(con.getLastModified()).toString());
		//LOGGER.severe(con.getContentType());
		//LOGGER.severe(con.getContentEncoding());
		LOGGER.severe(String.valueOf(con.getResponseCode()));
	}

	private void error(Exception e) {
		StringWriter sw = new StringWriter();
		PrintWriter pw = new PrintWriter(sw);
		e.printStackTrace(pw);
		LOGGER.info(sw.toString());
		pw.close();
	}

}
