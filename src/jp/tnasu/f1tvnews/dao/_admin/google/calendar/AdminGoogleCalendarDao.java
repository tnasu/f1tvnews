package jp.tnasu.f1tvnews.dao._admin.google.calendar;

import jp.tnasu.f1tvnews.model._admin.google.calendar.AdminGoogleCalendar;

import org.slim3.datastore.DaoBase;
import org.slim3.datastore.Datastore;
import org.slim3.datastore.EntityNotFoundRuntimeException;

import com.google.appengine.api.datastore.Key;

public class AdminGoogleCalendarDao extends DaoBase<AdminGoogleCalendar>{

	public Key getKey() {
		return Datastore.createKey(AdminGoogleCalendar.class, 1L);
	}
	
	@Override
	public AdminGoogleCalendar get(Key key) {
		AdminGoogleCalendar adminGoogleCalendar = null;
		try {
			adminGoogleCalendar = super.get(key);
		} catch (EntityNotFoundRuntimeException e) {
			adminGoogleCalendar = new AdminGoogleCalendar();
			adminGoogleCalendar.setKey(key);
		}
		return adminGoogleCalendar;
	}
	
}
