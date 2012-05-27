package jp.tnasu.f1tvnews.controller.google.calendar;

import jp.tnasu.f1tvnews.model.google.oauth2.Google;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;

public abstract class AbstractCalendarController extends Controller {

	public Navigation validate() {
    	Google google = sessionScope("google");
    	if (google == null) {
    		return redirect("/google/oauth2/");
    	}
    	return null;
	}
	
}
