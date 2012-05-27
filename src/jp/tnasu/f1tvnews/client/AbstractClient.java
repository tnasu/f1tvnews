package jp.tnasu.f1tvnews.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;

public class AbstractClient {

	public HttpURLConnection getDefault(String u) throws IOException {
		URL url = new URL(u);
		HttpURLConnection http = (HttpURLConnection) url.openConnection();
		http.setReadTimeout(3000);
		http.setConnectTimeout(3000);
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

}
