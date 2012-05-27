package jp.tnasu.f1tvnews.dao;

import java.util.ArrayList;
import java.util.logging.Logger;

import jp.tnasu.f1tvnews.handler.ErrorHandler;
import jp.tnasu.f1tvnews.model.HtmlContent;
import jp.tnasu.f1tvnews.model.HtmlDocument;

import org.slim3.datastore.DaoBase;
import org.slim3.datastore.Datastore;
import org.slim3.datastore.EntityNotFoundRuntimeException;
import org.slim3.util.WrapRuntimeException;

import com.google.appengine.api.datastore.Key;

public class HtmlDocumentDao extends DaoBase<HtmlDocument>{

	static final Logger LOGGER = Logger.getLogger(HtmlDocumentDao.class.getName());
	
	public Key getKey() {
		return Datastore.createKey(HtmlDocument.class, 1L);
	}

	@Override
	public HtmlDocument get(Key key) {
		try {
			return super.get(key);
		} catch (EntityNotFoundRuntimeException e) {
			ErrorHandler.writeErrorLogger(e, LOGGER);
			HtmlDocument htmlDocument = new HtmlDocument();
			htmlDocument.setHtmlContentList(new ArrayList<HtmlContent>());
			htmlDocument.setKey(key);
			return htmlDocument;
		} catch (WrapRuntimeException e) {
			ErrorHandler.writeErrorLogger(e, LOGGER);
			HtmlDocument htmlDocument = new HtmlDocument();
			htmlDocument.setHtmlContentList(new ArrayList<HtmlContent>());
			htmlDocument.setKey(key);
			return htmlDocument;
		}
	}

}
