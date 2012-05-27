package jp.tnasu.f1tvnews.controller.google.oauth2;

import org.slim3.controller.Navigation;

public class AuthController extends AbstractOauth2Controller {

	@Override
	public Navigation run() throws Exception {
		Navigation navigation = validate();
		if (navigation != null) {
			return navigation;
		}
		requestScope("authUrl", googleClient.getAuthUrlForInner());
		return forward("auth.jsp");
	}
	
}
