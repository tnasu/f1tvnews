package jp.tnasu.f1tvnews.model;

import java.io.Serializable;
import java.util.Date;

import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.Text;

import org.slim3.datastore.Attribute;
import org.slim3.datastore.Model;

@Model(schemaVersion = 1)
public class HtmlContent implements Serializable {

	private long lastModified;
	private long nextModify;
	private Text html;
	private Text data;
	private String title;
	private String description;
	private String showtime;
	private Date qualifyStartTime;
	private Date qualifyEndTime;
	private Date raceStartTime;
	private Date raceEndTime;

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

	public Date getQualifyStartTime() {
		return qualifyStartTime;
	}

	public void setQualifyStartTime(Date qualifyStartTime) {
		this.qualifyStartTime = qualifyStartTime;
	}

	public Date getQualifyEndTime() {
		return qualifyEndTime;
	}

	public void setQualifyEndTime(Date qualifyEndTime) {
		this.qualifyEndTime = qualifyEndTime;
	}

	public Date getRaceStartTime() {
		return raceStartTime;
	}

	public void setRaceStartTime(Date raceStartTime) {
		this.raceStartTime = raceStartTime;
	}

	public Date getRaceEndTime() {
		return raceEndTime;
	}

	public void setRaceEndTime(Date raceEndTime) {
		this.raceEndTime = raceEndTime;
	}

	private static final long serialVersionUID = 1L;

	@Attribute(primaryKey = true)
	private Key key;

	@Attribute(version = true)
	private Long version;

	/**
	 * Returns the key.
	 * 
	 * @return the key
	 */
	public Key getKey() {
		return key;
	}

	/**
	 * Sets the key.
	 * 
	 * @param key
	 *            the key
	 */
	public void setKey(Key key) {
		this.key = key;
	}

	/**
	 * Returns the version.
	 * 
	 * @return the version
	 */
	public Long getVersion() {
		return version;
	}

	/**
	 * Sets the version.
	 * 
	 * @param version
	 *            the version
	 */
	public void setVersion(Long version) {
		this.version = version;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((key == null) ? 0 : key.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		HtmlContent other = (HtmlContent) obj;
		if (key == null) {
			if (other.key != null) {
				return false;
			}
		} else if (!key.equals(other.key)) {
			return false;
		}
		return true;
	}
}
