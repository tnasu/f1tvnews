package jp.tnasu.f1tvnews.dao._admin.google.calendar;

import jp.tnasu.f1tvnews.model._admin.google.calendar.GoogleCalendar;

import org.slim3.datastore.DaoBase;
import org.slim3.datastore.Datastore;
import org.slim3.datastore.EntityNotFoundRuntimeException;

import com.google.appengine.api.datastore.Key;

public class GoogleCalendarDao extends DaoBase<GoogleCalendar>{

	public Key getKey() {
		return Datastore.createKey(GoogleCalendar.class, 1L);
	}
	
	@Override
	public GoogleCalendar get(Key key) {
		GoogleCalendar googleCalendar = null;
		try {
			googleCalendar = super.get(key);
		} catch (EntityNotFoundRuntimeException e) {
			googleCalendar = new GoogleCalendar();
			googleCalendar.setKey(key);
		}
		return googleCalendar;
	}
	
}
