package jp.tnasu.f1tvnews.model;

import java.io.Serializable;

import com.google.appengine.api.datastore.Text;

public class HtmlContent implements Serializable {

	private static final long serialVersionUID = 9144197727094121787L;

	private long lastModified;
	private long nextModify;
	private Text html;
	private Text data;
	private String title;
	private String description;
	private String showtime;

	public long getLastModified() {
		return lastModified;
	}

	public void setLastModified(long lastModified) {
		this.lastModified = lastModified;
	}

	public long getNextModify() {
		return nextModify;
	}

	public void setNextModify(long nextModify) {
		this.nextModify = nextModify;
	}

	public Text getHtml() {
		return html;
	}

	public void setHtml(Text html) {
		this.html = html;
	}

	public Text getData() {
		return data;
	}

	public void setData(Text data) {
		this.data = data;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getShowtime() {
		return showtime;
	}

	public void setShowtime(String showtime) {
		this.showtime = showtime;
	}
	
}
