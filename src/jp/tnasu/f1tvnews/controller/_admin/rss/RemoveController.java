package jp.tnasu.f1tvnews.controller._admin.rss;

import java.util.logging.Logger;

import jp.tnasu.f1tvnews.dao.HtmlDocumentDao;
import jp.tnasu.f1tvnews.model.HtmlDocument;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;

import com.google.appengine.api.datastore.Key;

public class RemoveController extends Controller {

	static final Logger LOGGER = Logger.getLogger(RemoveController.class.getName());
	HtmlDocumentDao htmlDocumentDao = new HtmlDocumentDao();

	@Override
	public Navigation run() throws Exception {
		String htmlContentIdx = requestScope("htmlContentIdx");
		int index = -1;
		try {
			index = Integer.valueOf(htmlContentIdx);
			Key key = htmlDocumentDao.getKey();
			HtmlDocument htmlDocument = htmlDocumentDao.get(key);
			if (htmlDocument != null && htmlDocument.getHtmlContentList() != null) {
				htmlDocument.getHtmlContentList().remove(index);
				htmlDocumentDao.put(htmlDocument);
			}
		} catch (Exception e) {
			LOGGER.severe(e.getLocalizedMessage());
		}
		return redirect("/_admin/rss/");
	}
}
