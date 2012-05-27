package jp.tnasu.f1tvnews.model.google.calendar;

import java.io.Serializable;
import java.util.List;

import org.slim3.datastore.Attribute;
import org.slim3.datastore.Model;
import org.slim3.datastore.json.Json;

import com.google.appengine.api.datastore.Key;

@Model(schemaVersion = 1)
public class Calendar implements Serializable {

	@Json(alias = "kind")
	private String kindstr;
	@Json(alias = "etag")
	private String etag;
	@Json(alias = "id")
	private String id;
	@Json(alias = "summary")
	private String summary;
	@Json(alias = "description")
	private String description;
	@Json(alias = "location")
	private String location;
	@Json(alias = "timeZone")
	private String timeZone;
	@Json(alias = "summaryOverride")
	private String summaryOverride;
	@Json(alias = "colorId")
	private String colorId;
	@Json(alias = "hidden")
	private boolean hidden;
	@Json(alias = "selected")
	private boolean selected;
	@Json(alias = "accessRole")
	private String accessRole;
	@Json(alias = "defaultReminders")
	private String defaultReminders;
	@Attribute(lob = true)
	private List<CalendarReminder> defaultReminderList;

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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getTimeZone() {
		return timeZone;
	}

	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}

	public String getSummaryOverride() {
		return summaryOverride;
	}

	public void setSummaryOverride(String summaryOverride) {
		this.summaryOverride = summaryOverride;
	}

	public String getColorId() {
		return colorId;
	}

	public void setColorId(String colorId) {
		this.colorId = colorId;
	}

	public boolean isHidden() {
		return hidden;
	}

	public void setHidden(boolean hidden) {
		this.hidden = hidden;
	}

	public boolean isSelected() {
		return selected;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}

	public String getAccessRole() {
		return accessRole;
	}

	public void setAccessRole(String accessRole) {
		this.accessRole = accessRole;
	}

	public String getDefaultReminders() {
		return defaultReminders;
	}

	public void setDefaultReminders(String defaultReminders) {
		this.defaultReminders = defaultReminders;
	}

	public List<CalendarReminder> getDefaultReminderList() {
		return defaultReminderList;
	}

	public void setDefaultReminderList(List<CalendarReminder> defaultReminderList) {
		this.defaultReminderList = defaultReminderList;
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
		Calendar other = (Calendar) obj;
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
