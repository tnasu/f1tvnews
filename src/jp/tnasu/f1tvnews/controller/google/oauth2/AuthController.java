package jp.tnasu.f1tvnews.controller.google.oauth2;

import jp.tnasu.f1tvnews.client.google.oauth2.GoogleClient;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;

public class AuthController extends Controller {

	GoogleClient googleClient = new GoogleClient();
	
	@Override
	public Navigation run() throws Exception {
		requestScope("authUrl", googleClient.getAuthUrlForInner());
		return forward("auth.jsp");
	}
	
}
