package jp.tnasu.f1tvnews.meta.google.calendar;

//@javax.annotation.Generated(value = { "slim3-gen", "@VERSION@" }, date = "2014-05-07 03:19:27")
/** */
public final class CalendarMeta extends org.slim3.datastore.ModelMeta<jp.tnasu.f1tvnews.model.google.calendar.Calendar> {

    /** */
    public final org.slim3.datastore.StringAttributeMeta<jp.tnasu.f1tvnews.model.google.calendar.Calendar> accessRole = new org.slim3.datastore.StringAttributeMeta<jp.tnasu.f1tvnews.model.google.calendar.Calendar>(this, "accessRole", "accessRole");

    /** */
    public final org.slim3.datastore.StringAttributeMeta<jp.tnasu.f1tvnews.model.google.calendar.Calendar> colorId = new org.slim3.datastore.StringAttributeMeta<jp.tnasu.f1tvnews.model.google.calendar.Calendar>(this, "colorId", "colorId");

    /** */
    public final org.slim3.datastore.StringAttributeMeta<jp.tnasu.f1tvnews.model.google.calendar.Calendar> defaultReminders = new org.slim3.datastore.StringAttributeMeta<jp.tnasu.f1tvnews.model.google.calendar.Calendar>(this, "defaultReminders", "defaultReminders");

    /** */
    public final org.slim3.datastore.StringAttributeMeta<jp.tnasu.f1tvnews.model.google.calendar.Calendar> description = new org.slim3.datastore.StringAttributeMeta<jp.tnasu.f1tvnews.model.google.calendar.Calendar>(this, "description", "description");

    /** */
    public final org.slim3.datastore.StringAttributeMeta<jp.tnasu.f1tvnews.model.google.calendar.Calendar> etag = new org.slim3.datastore.StringAttributeMeta<jp.tnasu.f1tvnews.model.google.calendar.Calendar>(this, "etag", "etag");

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<jp.tnasu.f1tvnews.model.google.calendar.Calendar, java.lang.Boolean> hidden = new org.slim3.datastore.CoreAttributeMeta<jp.tnasu.f1tvnews.model.google.calendar.Calendar, java.lang.Boolean>(this, "hidden", "hidden", boolean.class);

    /** */
    public final org.slim3.datastore.StringAttributeMeta<jp.tnasu.f1tvnews.model.google.calendar.Calendar> id = new org.slim3.datastore.StringAttributeMeta<jp.tnasu.f1tvnews.model.google.calendar.Calendar>(this, "id", "id");

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<jp.tnasu.f1tvnews.model.google.calendar.Calendar, com.google.appengine.api.datastore.Key> key = new org.slim3.datastore.CoreAttributeMeta<jp.tnasu.f1tvnews.model.google.calendar.Calendar, com.google.appengine.api.datastore.Key>(this, "__key__", "key", com.google.appengine.api.datastore.Key.class);

    /** */
    public final org.slim3.datastore.StringAttributeMeta<jp.tnasu.f1tvnews.model.google.calendar.Calendar> kindstr = new org.slim3.datastore.StringAttributeMeta<jp.tnasu.f1tvnews.model.google.calendar.Calendar>(this, "kindstr", "kindstr");

    /** */
    public final org.slim3.datastore.StringAttributeMeta<jp.tnasu.f1tvnews.model.google.calendar.Calendar> location = new org.slim3.datastore.StringAttributeMeta<jp.tnasu.f1tvnews.model.google.calendar.Calendar>(this, "location", "location");

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<jp.tnasu.f1tvnews.model.google.calendar.Calendar, java.lang.Boolean> selected = new org.slim3.datastore.CoreAttributeMeta<jp.tnasu.f1tvnews.model.google.calendar.Calendar, java.lang.Boolean>(this, "selected", "selected", boolean.class);

    /** */
    public final org.slim3.datastore.StringAttributeMeta<jp.tnasu.f1tvnews.model.google.calendar.Calendar> summary = new org.slim3.datastore.StringAttributeMeta<jp.tnasu.f1tvnews.model.google.calendar.Calendar>(this, "summary", "summary");

    /** */
    public final org.slim3.datastore.StringAttributeMeta<jp.tnasu.f1tvnews.model.google.calendar.Calendar> summaryOverride = new org.slim3.datastore.StringAttributeMeta<jp.tnasu.f1tvnews.model.google.calendar.Calendar>(this, "summaryOverride", "summaryOverride");

    /** */
    public final org.slim3.datastore.StringAttributeMeta<jp.tnasu.f1tvnews.model.google.calendar.Calendar> timeZone = new org.slim3.datastore.StringAttributeMeta<jp.tnasu.f1tvnews.model.google.calendar.Calendar>(this, "timeZone", "timeZone");

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<jp.tnasu.f1tvnews.model.google.calendar.Calendar, java.lang.Long> version = new org.slim3.datastore.CoreAttributeMeta<jp.tnasu.f1tvnews.model.google.calendar.Calendar, java.lang.Long>(this, "version", "version", java.lang.Long.class);

    private static final CalendarMeta slim3_singleton = new CalendarMeta();

    /**
     * @return the singleton
     */
    public static CalendarMeta get() {
       return slim3_singleton;
    }

    /** */
    public CalendarMeta() {
        super("Calendar", jp.tnasu.f1tvnews.model.google.calendar.Calendar.class);
    }

    @Override
    public jp.tnasu.f1tvnews.model.google.calendar.Calendar entityToModel(com.google.appengine.api.datastore.Entity entity) {
        jp.tnasu.f1tvnews.model.google.calendar.Calendar model = new jp.tnasu.f1tvnews.model.google.calendar.Calendar();
        model.setAccessRole((java.lang.String) entity.getProperty("accessRole"));
        model.setColorId((java.lang.String) entity.getProperty("colorId"));
        java.util.List<jp.tnasu.f1tvnews.model.google.calendar.CalendarReminder> _defaultReminderList = blobToSerializable((com.google.appengine.api.datastore.Blob) entity.getProperty("defaultReminderList"));
        model.setDefaultReminderList(_defaultReminderList);
        model.setDefaultReminders((java.lang.String) entity.getProperty("defaultReminders"));
        model.setDescription((java.lang.String) entity.getProperty("description"));
        model.setEtag((java.lang.String) entity.getProperty("etag"));
        model.setHidden(booleanToPrimitiveBoolean((java.lang.Boolean) entity.getProperty("hidden")));
        model.setId((java.lang.String) entity.getProperty("id"));
        model.setKey(entity.getKey());
        model.setKindstr((java.lang.String) entity.getProperty("kindstr"));
        model.setLocation((java.lang.String) entity.getProperty("location"));
        model.setSelected(booleanToPrimitiveBoolean((java.lang.Boolean) entity.getProperty("selected")));
        model.setSummary((java.lang.String) entity.getProperty("summary"));
        model.setSummaryOverride((java.lang.String) entity.getProperty("summaryOverride"));
        model.setTimeZone((java.lang.String) entity.getProperty("timeZone"));
        model.setVersion((java.lang.Long) entity.getProperty("version"));
        return model;
    }

    @Override
    public com.google.appengine.api.datastore.Entity modelToEntity(java.lang.Object model) {
        jp.tnasu.f1tvnews.model.google.calendar.Calendar m = (jp.tnasu.f1tvnews.model.google.calendar.Calendar) model;
        com.google.appengine.api.datastore.Entity entity = null;
        if (m.getKey() != null) {
            entity = new com.google.appengine.api.datastore.Entity(m.getKey());
        } else {
            entity = new com.google.appengine.api.datastore.Entity(kind);
        }
        entity.setProperty("accessRole", m.getAccessRole());
        entity.setProperty("colorId", m.getColorId());
        entity.setUnindexedProperty("defaultReminderList", serializableToBlob(m.getDefaultReminderList()));
        entity.setProperty("defaultReminders", m.getDefaultReminders());
        entity.setProperty("description", m.getDescription());
        entity.setProperty("etag", m.getEtag());
        entity.setProperty("hidden", m.isHidden());
        entity.setProperty("id", m.getId());
        entity.setProperty("kindstr", m.getKindstr());
        entity.setProperty("location", m.getLocation());
        entity.setProperty("selected", m.isSelected());
        entity.setProperty("summary", m.getSummary());
        entity.setProperty("summaryOverride", m.getSummaryOverride());
        entity.setProperty("timeZone", m.getTimeZone());
        entity.setProperty("version", m.getVersion());
        entity.setProperty("slim3.schemaVersion", 1);
        return entity;
    }

    @Override
    protected com.google.appengine.api.datastore.Key getKey(Object model) {
        jp.tnasu.f1tvnews.model.google.calendar.Calendar m = (jp.tnasu.f1tvnews.model.google.calendar.Calendar) model;
        return m.getKey();
    }

    @Override
    protected void setKey(Object model, com.google.appengine.api.datastore.Key key) {
        validateKey(key);
        jp.tnasu.f1tvnews.model.google.calendar.Calendar m = (jp.tnasu.f1tvnews.model.google.calendar.Calendar) model;
        m.setKey(key);
    }

    @Override
    protected long getVersion(Object model) {
        jp.tnasu.f1tvnews.model.google.calendar.Calendar m = (jp.tnasu.f1tvnews.model.google.calendar.Calendar) model;
        return m.getVersion() != null ? m.getVersion().longValue() : 0L;
    }

    @Override
    protected void assignKeyToModelRefIfNecessary(com.google.appengine.api.datastore.AsyncDatastoreService ds, java.lang.Object model) {
    }

    @Override
    protected void incrementVersion(Object model) {
        jp.tnasu.f1tvnews.model.google.calendar.Calendar m = (jp.tnasu.f1tvnews.model.google.calendar.Calendar) model;
        long version = m.getVersion() != null ? m.getVersion().longValue() : 0L;
        m.setVersion(Long.valueOf(version + 1L));
    }

    @Override
    protected void prePut(Object model) {
    }

    @Override
    protected void postGet(Object model) {
    }

    @Override
    public String getSchemaVersionName() {
        return "slim3.schemaVersion";
    }

    @Override
    public String getClassHierarchyListName() {
        return "slim3.classHierarchyList";
    }

    @Override
    protected boolean isCipherProperty(String propertyName) {
        return false;
    }

    @Override
    protected void modelToJson(org.slim3.datastore.json.JsonWriter writer, java.lang.Object model, int maxDepth, int currentDepth) {
        jp.tnasu.f1tvnews.model.google.calendar.Calendar m = (jp.tnasu.f1tvnews.model.google.calendar.Calendar) model;
        writer.beginObject();
        org.slim3.datastore.json.Default encoder0 = new org.slim3.datastore.json.Default();
        if(m.getAccessRole() != null){
            writer.setNextPropertyName("accessRole");
            encoder0.encode(writer, m.getAccessRole());
        }
        if(m.getColorId() != null){
            writer.setNextPropertyName("colorId");
            encoder0.encode(writer, m.getColorId());
        }
        if(m.getDefaultReminderList() != null){
            writer.setNextPropertyName("defaultReminderList");
            // jp.tnasu.f1tvnews.model.google.calendar.CalendarReminder is not supported.
        }
        if(m.getDefaultReminders() != null){
            writer.setNextPropertyName("defaultReminders");
            encoder0.encode(writer, m.getDefaultReminders());
        }
        if(m.getDescription() != null){
            writer.setNextPropertyName("description");
            encoder0.encode(writer, m.getDescription());
        }
        if(m.getEtag() != null){
            writer.setNextPropertyName("etag");
            encoder0.encode(writer, m.getEtag());
        }
        writer.setNextPropertyName("hidden");
        encoder0.encode(writer, m.isHidden());
        if(m.getId() != null){
            writer.setNextPropertyName("id");
            encoder0.encode(writer, m.getId());
        }
        if(m.getKey() != null){
            writer.setNextPropertyName("key");
            encoder0.encode(writer, m.getKey());
        }
        if(m.getKindstr() != null){
            writer.setNextPropertyName("kind");
            encoder0.encode(writer, m.getKindstr());
        }
        if(m.getLocation() != null){
            writer.setNextPropertyName("location");
            encoder0.encode(writer, m.getLocation());
        }
        writer.setNextPropertyName("selected");
        encoder0.encode(writer, m.isSelected());
        if(m.getSummary() != null){
            writer.setNextPropertyName("summary");
            encoder0.encode(writer, m.getSummary());
        }
        if(m.getSummaryOverride() != null){
            writer.setNextPropertyName("summaryOverride");
            encoder0.encode(writer, m.getSummaryOverride());
        }
        if(m.getTimeZone() != null){
            writer.setNextPropertyName("timeZone");
            encoder0.encode(writer, m.getTimeZone());
        }
        if(m.getVersion() != null){
            writer.setNextPropertyName("version");
            encoder0.encode(writer, m.getVersion());
        }
        writer.endObject();
    }

    @Override
    protected jp.tnasu.f1tvnews.model.google.calendar.Calendar jsonToModel(org.slim3.datastore.json.JsonRootReader rootReader, int maxDepth, int currentDepth) {
        jp.tnasu.f1tvnews.model.google.calendar.Calendar m = new jp.tnasu.f1tvnews.model.google.calendar.Calendar();
        org.slim3.datastore.json.JsonReader reader = null;
        org.slim3.datastore.json.Default decoder0 = new org.slim3.datastore.json.Default();
        reader = rootReader.newObjectReader("accessRole");
        m.setAccessRole(decoder0.decode(reader, m.getAccessRole()));
        reader = rootReader.newObjectReader("colorId");
        m.setColorId(decoder0.decode(reader, m.getColorId()));
        reader = rootReader.newObjectReader("defaultReminderList");
        reader = rootReader.newObjectReader("defaultReminders");
        m.setDefaultReminders(decoder0.decode(reader, m.getDefaultReminders()));
        reader = rootReader.newObjectReader("description");
        m.setDescription(decoder0.decode(reader, m.getDescription()));
        reader = rootReader.newObjectReader("etag");
        m.setEtag(decoder0.decode(reader, m.getEtag()));
        reader = rootReader.newObjectReader("hidden");
        m.setHidden(decoder0.decode(reader, m.isHidden()));
        reader = rootReader.newObjectReader("id");
        m.setId(decoder0.decode(reader, m.getId()));
        reader = rootReader.newObjectReader("key");
        m.setKey(decoder0.decode(reader, m.getKey()));
        reader = rootReader.newObjectReader("kind");
        m.setKindstr(decoder0.decode(reader, m.getKindstr()));
        reader = rootReader.newObjectReader("location");
        m.setLocation(decoder0.decode(reader, m.getLocation()));
        reader = rootReader.newObjectReader("selected");
        m.setSelected(decoder0.decode(reader, m.isSelected()));
        reader = rootReader.newObjectReader("summary");
        m.setSummary(decoder0.decode(reader, m.getSummary()));
        reader = rootReader.newObjectReader("summaryOverride");
        m.setSummaryOverride(decoder0.decode(reader, m.getSummaryOverride()));
        reader = rootReader.newObjectReader("timeZone");
        m.setTimeZone(decoder0.decode(reader, m.getTimeZone()));
        reader = rootReader.newObjectReader("version");
        m.setVersion(decoder0.decode(reader, m.getVersion()));
        return m;
    }
}