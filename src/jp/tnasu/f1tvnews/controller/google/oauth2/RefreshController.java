package jp.tnasu.f1tvnews.controller.google.oauth2;

import java.net.HttpURLConnection;

import jp.tnasu.f1tvnews.client.google.oauth2.GoogleClient;
import jp.tnasu.f1tvnews.handler.ErrorHandler;
import jp.tnasu.f1tvnews.meta.google.oauth2.GoogleMeta;
import jp.tnasu.f1tvnews.model.google.oauth2.Google;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;

public class RefreshController extends Controller {

	GoogleClient googleClient = new GoogleClient();
	
    @Override
    public Navigation run() throws Exception {
    	String refresh = asString("refresh");
		HttpURLConnection http = googleClient.getRefresh(refresh);
		String content = googleClient.getContent(http);
		try {
			Google google = GoogleMeta.get().jsonToModel(content);
			google.setRefreshToken(refresh);
			requestScope("google", google);
		} catch (Exception e) {
			ErrorHandler.writeErrorHtml(response, content);
			return null;
		}
        return forward("refresh.jsp");
    }

}