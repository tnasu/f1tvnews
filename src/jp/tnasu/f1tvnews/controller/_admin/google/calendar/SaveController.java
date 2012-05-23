package jp.tnasu.f1tvnews.controller._admin.google.calendar;

import jp.tnasu.f1tvnews.dao._admin.google.calendar.GoogleCalendarDao;
import jp.tnasu.f1tvnews.model._admin.google.calendar.GoogleCalendar;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;
import org.slim3.util.BeanUtil;

import com.google.appengine.api.datastore.Key;

public class SaveController extends Controller {

	GoogleCalendarDao googleCalendarDao = new GoogleCalendarDao();
    
	@Override
    public Navigation run() throws Exception {
    	GoogleCalendar googleCalendar = new GoogleCalendar();
    	BeanUtil.copy(request, googleCalendar);
    	Key key = googleCalendarDao.getKey();
    	googleCalendar.setKey(key);
    	googleCalendarDao.put(googleCalendar);
    	return redirect("");
    }
    
}
