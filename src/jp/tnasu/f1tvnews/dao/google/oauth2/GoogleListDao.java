package jp.tnasu.f1tvnews.dao.google.oauth2;

import java.util.ArrayList;
import java.util.List;

import jp.tnasu.f1tvnews.model.google.oauth2.Google;
import jp.tnasu.f1tvnews.model.google.oauth2.GoogleList;

import org.slim3.datastore.DaoBase;
import org.slim3.datastore.Datastore;
import org.slim3.datastore.EntityNotFoundRuntimeException;

import com.google.appengine.api.datastore.Key;

public class GoogleListDao extends DaoBase<GoogleList>{

	public Key getKey() {
		return Datastore.createKey(GoogleList.class, 1L);
	}
	
	@Override
	public GoogleList get(Key key) {
		GoogleList googleList = null;
		try {
			googleList = super.get(key);
		} catch (EntityNotFoundRuntimeException e) {
			googleList = new GoogleList();
			googleList.setGoogleList(new ArrayList<Google>());
			googleList.setKey(key);
		}
		return googleList;
	}

	public void addGoogle(Google google, Key key) {
		GoogleList googleList = get(key);
		addGoogle(google, googleList);
	}
	
	public void addGoogle(Google google, GoogleList googleList) {
		List<Google> googles = googleList.getGoogleList();
		boolean find = false;
		int index = 0;
		for (Google g : googles) {
			if (g.getClientId() != null && g.getClientId().equals(google.getClientId())) {
				find = true;
				break;
			}
			index++;
		}
		if (find) {
			googles.remove(index);
		}
		googles.add(google);
	}
	
}
