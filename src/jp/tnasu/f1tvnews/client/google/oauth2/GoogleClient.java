package jp.tnasu.f1tvnews.client.google.oauth2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.logging.Logger;

import jp.tnasu.f1tvnews.dao._admin.google.calendar.GoogleCalendarDao;
import jp.tnasu.f1tvnews.model._admin.google.calendar.GoogleCalendar;

import com.google.appengine.api.datastore.Key;

public class GoogleClient {

	static final Logger LOGGER = Logger.getLogger(GoogleClient.class.getName());
	
	public String CLIENT_ID;
	public String CLIENT_SECRET;
	public String CALLBACK;
	public static final String AUTH = "https://accounts.google.com/o/oauth2/auth";
	public static final String TOKEN = "https://accounts.google.com/o/oauth2/token";
	public static final String SCOPE = "https://www.googleapis.com/auth/calendar";

	GoogleCalendarDao googleCalendarDao = new GoogleCalendarDao();
	
	public GoogleClient() {
		Key key = googleCalendarDao.getKey();
		GoogleCalendar googleCalendar = googleCalendarDao.get(key);
    	CLIENT_ID = googleCalendar.getClientId();
    	CLIENT_SECRET = googleCalendar.getClientSecret();
    	CALLBACK = googleCalendar.getCallback();
	}
	
	public HttpURLConnection getDefault(String u) throws IOException {
		URL url = new URL(u);
		HttpURLConnection http = (HttpURLConnection) url.openConnection();
		http.setReadTimeout(1000);
		http.setConnectTimeout(1000);
		http.setDoInput(true);
		http.setDoOutput(true);
		http.setInstanceFollowRedirects(false);
		http.setRequestProperty("Host", url.getHost());
		http.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
		return http;
	}

	public HttpURLConnection getAuth() throws MalformedURLException, ProtocolException, IOException {
		HttpURLConnection http = getDefault(getAuthUrlForInner());
		http.setRequestMethod("GET");
		http.connect();
		return http;
	}

	public HttpURLConnection getToken(String code) throws MalformedURLException, ProtocolException, IOException {
		HttpURLConnection http = getDefault(TOKEN);
		http.setRequestMethod("POST");
		http.connect();
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(http.getOutputStream(), "UTF-8"));
		bw.write("code=" + code);
		bw.write("&");
		bw.write("client_id=" + CLIENT_ID);
		bw.write("&");
		bw.write("client_secret=" + CLIENT_SECRET);
		bw.write("&");
		bw.write("redirect_uri=" + CALLBACK);
		bw.write("&");
		bw.write("grant_type=authorization_code");
		bw.flush();
		bw.close();
		return http;
	}

	public HttpURLConnection getRefresh(String refresh) throws MalformedURLException, ProtocolException, IOException {
		HttpURLConnection http = getDefault(TOKEN);
		http.setRequestMethod("POST");
		http.connect();
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(http.getOutputStream(), "UTF-8"));
		bw.write("refresh_token=" + refresh);
		bw.write("&");
		bw.write("client_id=" + CLIENT_ID);
		bw.write("&");
		bw.write("client_secret=" + CLIENT_SECRET);
		bw.write("&");
		bw.write("grant_type=refresh_token");
		bw.flush();
		bw.close();
		return http;
	}

	public String getAuthUrl() throws UnsupportedEncodingException {
		return AUTH + 
				"?" + 
				"client_id=" + CLIENT_ID + 
				"&" + 
				"redirect_uri=" + URLEncoder.encode(CALLBACK, "UTF8") + 
				"&" + 
				"scope=" + URLEncoder.encode(SCOPE, "UTF8") + 
				"&" + 
				"response_type=code";
	}

	public String getAuthUrlForInner() throws UnsupportedEncodingException {
		return getAuthUrl() + 
				"&" + 
				"approval_prompt=force" + 
				"&" + 
				"access_type=offline";
	}
	
	public String getContent(HttpURLConnection http) throws UnsupportedEncodingException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(http.getInputStream(), "UTF-8"));
		StringBuilder sb = new StringBuilder();
		while (br.ready()) {
			sb.append(br.readLine());
		}
		return sb.toString();
	}
}
