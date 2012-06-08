package jp.tnasu.f1tvnews.controller._admin.google.calendar;

import jp.tnasu.f1tvnews.dao._admin.google.calendar.AdminGoogleCalendarDao;
import jp.tnasu.f1tvnews.model._admin.google.calendar.AdminGoogleCalendar;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;

import com.google.appengine.api.datastore.Key;

public class IndexController extends Controller {

	AdminGoogleCalendarDao adminGoogleCalendarDao = new AdminGoogleCalendarDao();
	
	@Override
	public Navigation run() throws Exception {
		Key key = adminGoogleCalendarDao.getKey();
		AdminGoogleCalendar adminGoogleCalendar = adminGoogleCalendarDao.get(key);
		requestScope("adminGoogleCalendar", adminGoogleCalendar);
		return forward("index.jsp");
	}

}
