package jp.tnasu.f1tvnews.dao.google.calendar;

import java.util.HashMap;
import java.util.Map;

import jp.tnasu.f1tvnews.model.google.calendar.GoogleCalendarDto;
import jp.tnasu.f1tvnews.model.google.calendar.GoogleCalendarDtoMap;

import org.slim3.datastore.DaoBase;
import org.slim3.datastore.Datastore;
import org.slim3.datastore.EntityNotFoundRuntimeException;

import com.google.appengine.api.datastore.Key;

public class GoogleCalendarDtoMapDao extends DaoBase<GoogleCalendarDtoMap>{

	public Key getKey() {
		return Datastore.createKey(GoogleCalendarDtoMap.class, 1L);
	}
	
	@Override
	public GoogleCalendarDtoMap get(Key key) {
		GoogleCalendarDtoMap googleCalendarDtoMap = null;
		try {
			googleCalendarDtoMap = super.get(key);
		} catch (EntityNotFoundRuntimeException e) {
			googleCalendarDtoMap = new GoogleCalendarDtoMap();
			googleCalendarDtoMap.setGoogleCalendarMap(new HashMap<String, GoogleCalendarDto>());
			googleCalendarDtoMap.setKey(key);
		}
		return googleCalendarDtoMap;
	}
	
	public void putGoogleCalendarDto(GoogleCalendarDto googleCalendarDto, Key key) {
		GoogleCalendarDtoMap googleCalendarDtoMap = get(key);
		putGoogleCalendarDto(googleCalendarDto, googleCalendarDtoMap);
	}
	
	public void putGoogleCalendarDto(GoogleCalendarDto googleCalendarDto, GoogleCalendarDtoMap googleCalendarDtoMap) {
		removeGoogleCalendarDto(googleCalendarDtoMap);
		Map<String, GoogleCalendarDto> googleCalendarDtos = googleCalendarDtoMap.getGoogleCalendarMap();
		googleCalendarDtos.put(googleCalendarDto.getGoogle().getClientId(), googleCalendarDto);
	}
	
	public void removeGoogleCalendarDto(GoogleCalendarDtoMap googleCalendarDtoMap) {
		Map<String, GoogleCalendarDto> googleCalendarDtos = googleCalendarDtoMap.getGoogleCalendarMap();
		googleCalendarDtos.clear();
	}
	
}
