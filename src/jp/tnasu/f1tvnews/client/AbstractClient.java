package jp.tnasu.f1tvnews.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

public class AbstractClient {

	static final Logger LOGGER = Logger.getLogger(AbstractClient.class.getName());

	public HttpURLConnection getDefault(String u) throws IOException {
		URL url = new URL(u);
		HttpURLConnection http = (HttpURLConnection) url.openConnection();
		http.setReadTimeout(10000);
		http.setConnectTimeout(10000);
		http.setDoInput(true);
		http.setDoOutput(true);
		http.setInstanceFollowRedirects(false);
		http.setRequestProperty("Host", url.getHost());
		return http;
	}

	public String getContent(HttpURLConnection http) throws UnsupportedEncodingException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(http.getInputStream(), "UTF-8"));
		StringBuilder sb = new StringBuilder();
		while (br.ready()) {
			sb.append(br.readLine().trim().replaceAll("　", " ").replaceAll("\t", " "));
		}
		return sb.toString();
	}

	public void debug(HttpURLConnection http) throws IOException {
		Map<String, List<String>> headers = http.getHeaderFields();
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
		// LOGGER.severe(new Date(http.getDate()).toString());
		LOGGER.severe(new Date(http.getLastModified()).toString());
		// LOGGER.severe(http.getContentType());
		// LOGGER.severe(http.getContentEncoding());
		LOGGER.severe(String.valueOf(http.getResponseCode()));
		LOGGER.severe(String.valueOf(http.getResponseMessage()));
	}

}
