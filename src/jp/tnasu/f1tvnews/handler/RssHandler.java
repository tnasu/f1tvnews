package jp.tnasu.f1tvnews.handler;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import jp.tnasu.f1tvnews.dto.HtmlContent;
import jp.tnasu.f1tvnews.model.HtmlDocument;

import com.sun.syndication.feed.synd.SyndContent;
import com.sun.syndication.feed.synd.SyndContentImpl;
import com.sun.syndication.feed.synd.SyndEntry;
import com.sun.syndication.feed.synd.SyndEntryImpl;
import com.sun.syndication.feed.synd.SyndFeed;
import com.sun.syndication.feed.synd.SyndFeedImpl;
import com.sun.syndication.io.FeedException;
import com.sun.syndication.io.SyndFeedOutput;

public class RssHandler {

	public static void writeRss(HttpServletResponse response, HtmlDocument htmlDocument) throws IOException, FeedException {
		SyndFeed feed = getFeed(htmlDocument);
		response.setContentType("application/xml; charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		Writer writer = response.getWriter();
		SyndFeedOutput output = new SyndFeedOutput();
		output.output(feed, writer);
	}

	private static SyndFeed getFeed(HtmlDocument htmlDocument) throws IOException, FeedException {
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

}
