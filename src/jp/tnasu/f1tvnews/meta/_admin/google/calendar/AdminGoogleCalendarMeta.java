package jp.tnasu.f1tvnews.meta._admin.google.calendar;

//@javax.annotation.Generated(value = { "slim3-gen", "@VERSION@" }, date = "2014-05-07 03:19:27")
/** */
public final class AdminGoogleCalendarMeta extends org.slim3.datastore.ModelMeta<jp.tnasu.f1tvnews.model._admin.google.calendar.AdminGoogleCalendar> {

    /** */
    public final org.slim3.datastore.StringAttributeMeta<jp.tnasu.f1tvnews.model._admin.google.calendar.AdminGoogleCalendar> callback = new org.slim3.datastore.StringAttributeMeta<jp.tnasu.f1tvnews.model._admin.google.calendar.AdminGoogleCalendar>(this, "callback", "callback");

    /** */
    public final org.slim3.datastore.StringAttributeMeta<jp.tnasu.f1tvnews.model._admin.google.calendar.AdminGoogleCalendar> clientId = new org.slim3.datastore.StringAttributeMeta<jp.tnasu.f1tvnews.model._admin.google.calendar.AdminGoogleCalendar>(this, "clientId", "clientId");

    /** */
    public final org.slim3.datastore.StringAttributeMeta<jp.tnasu.f1tvnews.model._admin.google.calendar.AdminGoogleCalendar> clientSecret = new org.slim3.datastore.StringAttributeMeta<jp.tnasu.f1tvnews.model._admin.google.calendar.AdminGoogleCalendar>(this, "clientSecret", "clientSecret");

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<jp.tnasu.f1tvnews.model._admin.google.calendar.AdminGoogleCalendar, com.google.appengine.api.datastore.Key> key = new org.slim3.datastore.CoreAttributeMeta<jp.tnasu.f1tvnews.model._admin.google.calendar.AdminGoogleCalendar, com.google.appengine.api.datastore.Key>(this, "__key__", "key", com.google.appengine.api.datastore.Key.class);

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<jp.tnasu.f1tvnews.model._admin.google.calendar.AdminGoogleCalendar, java.lang.Long> version = new org.slim3.datastore.CoreAttributeMeta<jp.tnasu.f1tvnews.model._admin.google.calendar.AdminGoogleCalendar, java.lang.Long>(this, "version", "version", java.lang.Long.class);

    private static final AdminGoogleCalendarMeta slim3_singleton = new AdminGoogleCalendarMeta();

    /**
     * @return the singleton
     */
    public static AdminGoogleCalendarMeta get() {
       return slim3_singleton;
    }

    /** */
    public AdminGoogleCalendarMeta() {
        super("AdminGoogleCalendar", jp.tnasu.f1tvnews.model._admin.google.calendar.AdminGoogleCalendar.class);
    }

    @Override
    public jp.tnasu.f1tvnews.model._admin.google.calendar.AdminGoogleCalendar entityToModel(com.google.appengine.api.datastore.Entity entity) {
        jp.tnasu.f1tvnews.model._admin.google.calendar.AdminGoogleCalendar model = new jp.tnasu.f1tvnews.model._admin.google.calendar.AdminGoogleCalendar();
        model.setCallback((java.lang.String) entity.getProperty("callback"));
        model.setClientId((java.lang.String) entity.getProperty("clientId"));
        model.setClientSecret((java.lang.String) entity.getProperty("clientSecret"));
        model.setKey(entity.getKey());
        model.setVersion((java.lang.Long) entity.getProperty("version"));
        return model;
    }

    @Override
    public com.google.appengine.api.datastore.Entity modelToEntity(java.lang.Object model) {
        jp.tnasu.f1tvnews.model._admin.google.calendar.AdminGoogleCalendar m = (jp.tnasu.f1tvnews.model._admin.google.calendar.AdminGoogleCalendar) model;
        com.google.appengine.api.datastore.Entity entity = null;
        if (m.getKey() != null) {
            entity = new com.google.appengine.api.datastore.Entity(m.getKey());
        } else {
            entity = new com.google.appengine.api.datastore.Entity(kind);
        }
        entity.setProperty("callback", m.getCallback());
        entity.setProperty("clientId", m.getClientId());
        entity.setProperty("clientSecret", m.getClientSecret());
        entity.setProperty("version", m.getVersion());
        entity.setProperty("slim3.schemaVersion", 1);
        return entity;
    }

    @Override
    protected com.google.appengine.api.datastore.Key getKey(Object model) {
        jp.tnasu.f1tvnews.model._admin.google.calendar.AdminGoogleCalendar m = (jp.tnasu.f1tvnews.model._admin.google.calendar.AdminGoogleCalendar) model;
        return m.getKey();
    }

    @Override
    protected void setKey(Object model, com.google.appengine.api.datastore.Key key) {
        validateKey(key);
        jp.tnasu.f1tvnews.model._admin.google.calendar.AdminGoogleCalendar m = (jp.tnasu.f1tvnews.model._admin.google.calendar.AdminGoogleCalendar) model;
        m.setKey(key);
    }

    @Override
    protected long getVersion(Object model) {
        jp.tnasu.f1tvnews.model._admin.google.calendar.AdminGoogleCalendar m = (jp.tnasu.f1tvnews.model._admin.google.calendar.AdminGoogleCalendar) model;
        return m.getVersion() != null ? m.getVersion().longValue() : 0L;
    }

    @Override
    protected void assignKeyToModelRefIfNecessary(com.google.appengine.api.datastore.AsyncDatastoreService ds, java.lang.Object model) {
    }

    @Override
    protected void incrementVersion(Object model) {
        jp.tnasu.f1tvnews.model._admin.google.calendar.AdminGoogleCalendar m = (jp.tnasu.f1tvnews.model._admin.google.calendar.AdminGoogleCalendar) model;
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
        jp.tnasu.f1tvnews.model._admin.google.calendar.AdminGoogleCalendar m = (jp.tnasu.f1tvnews.model._admin.google.calendar.AdminGoogleCalendar) model;
        writer.beginObject();
        org.slim3.datastore.json.Default encoder0 = new org.slim3.datastore.json.Default();
        if(m.getCallback() != null){
            writer.setNextPropertyName("callback");
            encoder0.encode(writer, m.getCallback());
        }
        if(m.getClientId() != null){
            writer.setNextPropertyName("clientId");
            encoder0.encode(writer, m.getClientId());
        }
        if(m.getClientSecret() != null){
            writer.setNextPropertyName("clientSecret");
            encoder0.encode(writer, m.getClientSecret());
        }
        if(m.getKey() != null){
            writer.setNextPropertyName("key");
            encoder0.encode(writer, m.getKey());
        }
        if(m.getVersion() != null){
            writer.setNextPropertyName("version");
            encoder0.encode(writer, m.getVersion());
        }
        writer.endObject();
    }

    @Override
    protected jp.tnasu.f1tvnews.model._admin.google.calendar.AdminGoogleCalendar jsonToModel(org.slim3.datastore.json.JsonRootReader rootReader, int maxDepth, int currentDepth) {
        jp.tnasu.f1tvnews.model._admin.google.calendar.AdminGoogleCalendar m = new jp.tnasu.f1tvnews.model._admin.google.calendar.AdminGoogleCalendar();
        org.slim3.datastore.json.JsonReader reader = null;
        org.slim3.datastore.json.Default decoder0 = new org.slim3.datastore.json.Default();
        reader = rootReader.newObjectReader("callback");
        m.setCallback(decoder0.decode(reader, m.getCallback()));
        reader = rootReader.newObjectReader("clientId");
        m.setClientId(decoder0.decode(reader, m.getClientId()));
        reader = rootReader.newObjectReader("clientSecret");
        m.setClientSecret(decoder0.decode(reader, m.getClientSecret()));
        reader = rootReader.newObjectReader("key");
        m.setKey(decoder0.decode(reader, m.getKey()));
        reader = rootReader.newObjectReader("version");
        m.setVersion(decoder0.decode(reader, m.getVersion()));
        return m;
    }
}