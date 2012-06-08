package jp.tnasu.f1tvnews.controller._admin.google.calendar;

import jp.tnasu.f1tvnews.dao._admin.google.calendar.AdminGoogleCalendarDao;
import jp.tnasu.f1tvnews.model._admin.google.calendar.AdminGoogleCalendar;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;
import org.slim3.util.BeanUtil;

import com.google.appengine.api.datastore.Key;

public class SaveController extends Controller {

	AdminGoogleCalendarDao adminGoogleCalendarDao = new AdminGoogleCalendarDao();
    
	@Override
    public Navigation run() throws Exception {
    	AdminGoogleCalendar adminGoogleCalendar = new AdminGoogleCalendar();
    	BeanUtil.copy(request, adminGoogleCalendar);
    	Key key = adminGoogleCalendarDao.getKey();
    	adminGoogleCalendar.setKey(key);
    	adminGoogleCalendarDao.put(adminGoogleCalendar);
    	return redirect("");
    }
    
}
