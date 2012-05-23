package jp.tnasu.f1tvnews.controller._admin.google.calendar;

import jp.tnasu.f1tvnews.dao._admin.google.calendar.GoogleCalendarDao;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;

import com.google.appengine.api.datastore.Key;

public class DeleteController extends Controller {

	GoogleCalendarDao googleCalendarDao = new GoogleCalendarDao();
	
    @Override
    public Navigation run() throws Exception {
    	Key key = googleCalendarDao.getKey();
    	googleCalendarDao.delete(key);
    	return redirect("");
    }
}
