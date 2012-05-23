package jp.tnasu.f1tvnews.controller._admin.google.calendar;

import jp.tnasu.f1tvnews.dao._admin.google.calendar.GoogleCalendarDao;
import jp.tnasu.f1tvnews.model._admin.google.calendar.GoogleCalendar;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;

import com.google.appengine.api.datastore.Key;

public class IndexController extends Controller {

	GoogleCalendarDao googleCalendarDao = new GoogleCalendarDao();
	
	@Override
	public Navigation run() throws Exception {
		Key key = googleCalendarDao.getKey();
		GoogleCalendar googleCalendar = googleCalendarDao.get(key);
		requestScope("googleCalendar", googleCalendar);
		return forward("index.jsp");
	}

}
