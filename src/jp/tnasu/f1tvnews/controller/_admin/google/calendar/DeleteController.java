package jp.tnasu.f1tvnews.controller._admin.google.calendar;

import jp.tnasu.f1tvnews.dao._admin.google.calendar.AdminGoogleCalendarDao;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;

import com.google.appengine.api.datastore.Key;

public class DeleteController extends Controller {

	AdminGoogleCalendarDao adminGoogleCalendarDao = new AdminGoogleCalendarDao();
	
    @Override
    public Navigation run() throws Exception {
    	Key key = adminGoogleCalendarDao.getKey();
    	adminGoogleCalendarDao.delete(key);
    	return redirect("/_admin/google/calendar/");
    }
    
}
