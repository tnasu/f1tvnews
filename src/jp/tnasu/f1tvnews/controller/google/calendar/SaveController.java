package jp.tnasu.f1tvnews.controller.google.calendar;

import jp.tnasu.f1tvnews.dao.google.calendar.GoogleCalendarDtoMapDao;
import jp.tnasu.f1tvnews.model.google.calendar.GoogleCalendarDto;
import jp.tnasu.f1tvnews.model.google.calendar.GoogleCalendarDtoMap;
import jp.tnasu.f1tvnews.model.google.oauth2.Google;

import org.slim3.controller.Navigation;

import com.google.appengine.api.datastore.Key;

public class SaveController extends AbstractCalendarController {

	GoogleCalendarDtoMapDao googleCalendarDtoMapDao = new GoogleCalendarDtoMapDao();

    @Override
    public Navigation run() throws Exception {
		Navigation navigation = validate();
		if (navigation != null) {
			return navigation;
		}
    	Google google = sessionScope("google");
    	String[] calendarIds = paramValues("calendarIds"); 
    	GoogleCalendarDto googleCalendarDto = new GoogleCalendarDto();
    	googleCalendarDto.setGoogle(google);
    	googleCalendarDto.setCalendarList(calendarIds);
    	Key key = googleCalendarDtoMapDao.getKey();
    	GoogleCalendarDtoMap googleCalendarDtoMap = googleCalendarDtoMapDao.get(key);
    	googleCalendarDtoMapDao.putGoogleCalendarDto(googleCalendarDto, googleCalendarDtoMap);
    	googleCalendarDtoMapDao.put(googleCalendarDtoMap);
    	return redirect("");
    }
}
