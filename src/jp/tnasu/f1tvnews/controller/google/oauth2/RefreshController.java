package jp.tnasu.f1tvnews.controller.google.oauth2;

import java.net.HttpURLConnection;
import java.util.Date;
import java.util.logging.Logger;

import jp.tnasu.f1tvnews.dao.google.oauth2.GoogleListDao;
import jp.tnasu.f1tvnews.handler.ErrorHandler;
import jp.tnasu.f1tvnews.meta.google.oauth2.GoogleMeta;
import jp.tnasu.f1tvnews.model.google.oauth2.Google;
import jp.tnasu.f1tvnews.model.google.oauth2.GoogleList;

import org.slim3.controller.Navigation;

import com.google.appengine.api.datastore.Key;

public class RefreshController extends AbstractOauth2Controller {

	static final Logger LOGGER = Logger.getLogger(RefreshController.class.getName());
	
	GoogleListDao googleListDao = new GoogleListDao();
	
    @Override
    public Navigation run() throws Exception {
		Navigation navigation = validate();
		if (navigation != null) {
			return navigation;
		}
    	String refresh = asString("refresh");
		HttpURLConnection http = googleClient.getRefresh(refresh);
		String content = googleClient.getContent(http);
		try {
			Google google = GoogleMeta.get().jsonToModel(content);
			google.setRefreshToken(refresh);
			google.setPublished(new Date());
			sessionScope("google", google);
			Key key = googleListDao.getKey();
			GoogleList googleList = googleListDao.get(key);
			googleListDao.addGoogle(google, googleList);
			googleListDao.put(googleList);
		} catch (Exception e) {
			ErrorHandler.writeErrorLogger(e, LOGGER);
			ErrorHandler.writeErrorHtml(response, content);
			return null;
		}
        return forward("refresh.jsp");
    }

}
