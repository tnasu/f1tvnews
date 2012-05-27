package jp.tnasu.f1tvnews.client;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Logger;

public class F1bsfujiClient extends AbstractClient {

	static final Logger LOGGER = Logger.getLogger(F1bsfujiClient.class.getName());

	public static final String ENDPOINT = "http://www.bsfuji.tv/top/pub/f1.html";

	public HttpURLConnection getConnection(long lastModified) throws MalformedURLException, ProtocolException, IOException {
		HttpURLConnection con = getDefault(ENDPOINT);
		con.setRequestMethod("GET");
		con.setRequestProperty("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8");
		con.setRequestProperty("Accept-Charset", "Shift_JIS,utf-8;q=0.7,*;q=0.3");
		con.setRequestProperty("Accept-Encoding", "gzip,deflate,sdch");
		con.setRequestProperty("Accept-Language", "ja,en-US;q=0.8,en;q=0.6");
		con.setRequestProperty("Cache-Control", "max-age=0");
		con.setRequestProperty("Connection", "keep-alive");
		con.setRequestProperty("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_6_8) AppleWebKit/535.11 (KHTML, like Gecko) Chrome/17.0.963.79 Safari/535.11");
		if (lastModified != 0) {
			Date date = new Date(lastModified);
			SimpleDateFormat sdf = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z", Locale.ENGLISH);
			con.setRequestProperty("If-Modified-Since", sdf.format(date).replaceAll(" UTC", " GMT"));
		}
		con.connect();
		debug(con);
		return con;
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
		// LOGGER.severe(sb.toString());
		// LOGGER.severe(new Date(con.getDate()).toString());
		LOGGER.severe(new Date(con.getLastModified()).toString());
		// LOGGER.severe(con.getContentType());
		// LOGGER.severe(con.getContentEncoding());
		LOGGER.severe(String.valueOf(con.getResponseCode()));
	}

}
