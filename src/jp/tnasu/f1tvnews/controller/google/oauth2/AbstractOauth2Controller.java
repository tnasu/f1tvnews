package jp.tnasu.f1tvnews.controller.google.oauth2;

import jp.tnasu.f1tvnews.client.google.oauth2.GoogleClient;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;

public abstract class AbstractOauth2Controller extends Controller {

	GoogleClient googleClient = new GoogleClient();

	public Navigation validate() {
		if (googleClient.isInitialize()) {
			return redirect("/_admin/google/calendar/");
		}
		return null;
	}
	
}
