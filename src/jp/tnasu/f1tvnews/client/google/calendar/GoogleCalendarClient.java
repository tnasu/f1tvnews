package jp.tnasu.f1tvnews.client.google.calendar;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;

import jp.tnasu.f1tvnews.client.AbstractClient;
import jp.tnasu.f1tvnews.client.google.oauth2.GoogleClient;
import jp.tnasu.f1tvnews.meta.google.calendar.EventMeta;
import jp.tnasu.f1tvnews.meta.google.oauth2.GoogleMeta;
import jp.tnasu.f1tvnews.model.google.calendar.Event;
import jp.tnasu.f1tvnews.model.google.calendar.EventDate;
import jp.tnasu.f1tvnews.model.google.oauth2.Google;

import org.slim3.datastore.Datastore;

public class GoogleCalendarClient extends AbstractClient {

	public static final String BASE = "https://www.googleapis.com/calendar/v3";
	public static final String LIST = BASE + "/users/me/calendarList";
	public static final String INSERT = BASE + "/calendars/%s/events";

	GoogleClient googleClient = new GoogleClient();

	public HttpURLConnection getCalendarList(Google google) throws IOException {
		google = refresh(google.getRefreshToken());
		HttpURLConnection http = super.getDefault(LIST);
		http.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
		http.setRequestProperty("Authorization", google.getTokenType() + " " + google.getAccessToken());
		http.setRequestMethod("GET");
		http.connect();
		return http;
	}

	public HttpURLConnection getEventInsert(Google google, Event event, String calendarId) throws IOException {
		google = refresh(google.getRefreshToken());
		HttpURLConnection http = super.getDefault(String.format(INSERT, URLEncoder.encode(calendarId, "UTF-8")));
		http.setRequestProperty("Content-Type", "application/json");
		http.setRequestProperty("Authorization", google.getTokenType() + " " + google.getAccessToken());
		http.setRequestMethod("POST");
		http.connect();
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(http.getOutputStream(), "UTF-8"));
		bw.write(EventMeta.get().modelToJson(event, 2));
		bw.flush();
		bw.close();
		return http;
	}

	private Google refresh(String refresh) throws MalformedURLException, ProtocolException, IOException {
		HttpURLConnection http = googleClient.getRefresh(refresh);
		String content = googleClient.getContent(http);
		Google google = GoogleMeta.get().jsonToModel(content);
		google.setRefreshToken(refresh);
		google.setPublished(new Date());
		return google;
	}

	public Event getEvent(String summary, Date startDate, Date endDate) {
		EventDate start = new EventDate();
		start.setKey(Datastore.createKey(EventDate.class, "start"));
		start.setDateTime(getFormatDate(startDate));
		EventDate end = new EventDate();
		end.setKey(Datastore.createKey(EventDate.class, "end"));
		end.setDateTime(getFormatDate(endDate));
		Event event = new Event();
		event.setSummary(summary);
		event.getStart().setModel(start);
		event.getEnd().setModel(end);
		return event;
	}

	private String getFormatDate(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
		String d = sdf.format(date);
		return d.substring(0, d.length() -2) + ":" +d.substring(d.length() -2);
	}

}
