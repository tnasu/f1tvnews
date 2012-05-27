package jp.tnasu.f1tvnews.controller.google.calendar;

import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.Map;

import jp.tnasu.f1tvnews.client.google.calendar.GoogleCalendarClient;
import jp.tnasu.f1tvnews.dao.google.calendar.GoogleCalendarDtoMapDao;
import jp.tnasu.f1tvnews.dao.google.oauth2.GoogleListDao;
import jp.tnasu.f1tvnews.meta.google.calendar.CalendarListMeta;
import jp.tnasu.f1tvnews.meta.google.calendar.CalendarMeta;
import jp.tnasu.f1tvnews.model.google.calendar.Calendar;
import jp.tnasu.f1tvnews.model.google.calendar.CalendarList;
import jp.tnasu.f1tvnews.model.google.calendar.GoogleCalendarDto;
import jp.tnasu.f1tvnews.model.google.calendar.GoogleCalendarDtoMap;
import jp.tnasu.f1tvnews.model.google.oauth2.Google;

import org.slim3.controller.Navigation;

import com.google.appengine.api.datastore.Key;

public class IndexController extends AbstractCalendarController {

	GoogleListDao googleListDao = new GoogleListDao();
	GoogleCalendarDtoMapDao googleCalendarDtoMapDao = new GoogleCalendarDtoMapDao();
	GoogleCalendarClient googleCalendarClient = new GoogleCalendarClient();

	@Override
	public Navigation run() throws Exception {
		Navigation navigation = validate();
		if (navigation != null) {
			return navigation;
		}
		Google google = sessionScope("google");
		HttpURLConnection http = googleCalendarClient.getCalendarList(google);
		String content = googleCalendarClient.getContent(http);
		CalendarList calendarList = CalendarListMeta.get().jsonToModel(content, 3);
		Map<String, Calendar> itemMap = new HashMap<String, Calendar>();
		if (calendarList.getItems() != null) {
			Calendar[] calendars = CalendarMeta.get().jsonToModels(calendarList.getItems());
			for (Calendar calendar : calendars) {
				calendar.setSelected(false);
				itemMap.put(calendar.getId(), calendar);
			}
			calendarList.setItemMap(itemMap);
		}
		Key key = googleCalendarDtoMapDao.getKey();
		GoogleCalendarDtoMap googleCalendarDtoMap = googleCalendarDtoMapDao.get(key);
		GoogleCalendarDto googleCalendarDto = googleCalendarDtoMap.getGoogleCalendarMap().get(google.getRefreshToken());
		if (googleCalendarDto != null) {
			for (String calendarId : googleCalendarDto.getCalendarList()) {
				Calendar calendar = itemMap.get(calendarId);
				calendar.setSelected(true);
			}
		}
		requestScope("calendarList", calendarList);
		return forward("index.jsp");
	}
}
