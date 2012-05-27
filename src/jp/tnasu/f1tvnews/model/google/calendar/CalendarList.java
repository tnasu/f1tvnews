package jp.tnasu.f1tvnews.model.google.calendar;

import java.io.Serializable;
import java.util.Map;

import org.slim3.datastore.Attribute;
import org.slim3.datastore.Model;
import org.slim3.datastore.json.Json;

import com.google.appengine.api.datastore.Key;

@Model(schemaVersion = 1)
public class CalendarList implements Serializable {

	@Json(alias = "kind")
	private String kindstr;
	@Json(alias = "etag")
	private String etag;
	@Json(alias = "nextPageToken")
	private String nextPageToken;
	@Json(alias = "items")
	private String items;
	@Attribute(lob = true)
	private Map<String, Calendar> itemMap;

	public String getKindstr() {
		return kindstr;
	}

	public void setKindstr(String kindstr) {
		this.kindstr = kindstr;
	}

	public String getEtag() {
		return etag;
	}

	public void setEtag(String etag) {
		this.etag = etag;
	}

	public String getNextPageToken() {
		return nextPageToken;
	}

	public void setNextPageToken(String nextPageToken) {
		this.nextPageToken = nextPageToken;
	}

	public String getItems() {
		return items;
	}

	public void setItems(String items) {
		this.items = items;
	}

	public Map<String, Calendar> getItemMap() {
		return itemMap;
	}

	public void setItemMap(Map<String, Calendar> itemMap) {
		this.itemMap = itemMap;
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
		CalendarList other = (CalendarList) obj;
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
