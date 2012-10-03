package jp.tnasu.f1tvnews.controller._admin.rss;

import java.util.logging.Logger;

import jp.tnasu.f1tvnews.dao.HtmlDocumentDao;
import jp.tnasu.f1tvnews.model.HtmlDocument;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;

import com.google.appengine.api.datastore.Key;

public class IndexController extends Controller {

	static final Logger LOGGER = Logger.getLogger(IndexController.class.getName());
	HtmlDocumentDao htmlDocumentDao = new HtmlDocumentDao();

	@Override
	public Navigation run() throws Exception {
		Key key = htmlDocumentDao.getKey();
		HtmlDocument htmlDocument = htmlDocumentDao.get(key);
		requestScope("htmlDocument", htmlDocument);
		return forward("index.jsp");
	}

}
