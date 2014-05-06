package jp.tnasu.f1tvnews.meta.google.calendar;

//@javax.annotation.Generated(value = { "slim3-gen", "@VERSION@" }, date = "2014-05-07 03:19:26")
/** */
public final class EventDateMeta extends org.slim3.datastore.ModelMeta<jp.tnasu.f1tvnews.model.google.calendar.EventDate> {

    /** */
    public final org.slim3.datastore.StringAttributeMeta<jp.tnasu.f1tvnews.model.google.calendar.EventDate> date = new org.slim3.datastore.StringAttributeMeta<jp.tnasu.f1tvnews.model.google.calendar.EventDate>(this, "date", "date");

    /** */
    public final org.slim3.datastore.StringAttributeMeta<jp.tnasu.f1tvnews.model.google.calendar.EventDate> dateTime = new org.slim3.datastore.StringAttributeMeta<jp.tnasu.f1tvnews.model.google.calendar.EventDate>(this, "dateTime", "dateTime");

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<jp.tnasu.f1tvnews.model.google.calendar.EventDate, com.google.appengine.api.datastore.Key> key = new org.slim3.datastore.CoreAttributeMeta<jp.tnasu.f1tvnews.model.google.calendar.EventDate, com.google.appengine.api.datastore.Key>(this, "__key__", "key", com.google.appengine.api.datastore.Key.class);

    /** */
    public final org.slim3.datastore.StringAttributeMeta<jp.tnasu.f1tvnews.model.google.calendar.EventDate> timeZone = new org.slim3.datastore.StringAttributeMeta<jp.tnasu.f1tvnews.model.google.calendar.EventDate>(this, "timeZone", "timeZone");

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<jp.tnasu.f1tvnews.model.google.calendar.EventDate, java.lang.Long> version = new org.slim3.datastore.CoreAttributeMeta<jp.tnasu.f1tvnews.model.google.calendar.EventDate, java.lang.Long>(this, "version", "version", java.lang.Long.class);

    private static final EventDateMeta slim3_singleton = new EventDateMeta();

    /**
     * @return the singleton
     */
    public static EventDateMeta get() {
       return slim3_singleton;
    }

    /** */
    public EventDateMeta() {
        super("EventDate", jp.tnasu.f1tvnews.model.google.calendar.EventDate.class);
    }

    @Override
    public jp.tnasu.f1tvnews.model.google.calendar.EventDate entityToModel(com.google.appengine.api.datastore.Entity entity) {
        jp.tnasu.f1tvnews.model.google.calendar.EventDate model = new jp.tnasu.f1tvnews.model.google.calendar.EventDate();
        model.setDate((java.lang.String) entity.getProperty("date"));
        model.setDateTime((java.lang.String) entity.getProperty("dateTime"));
        model.setKey(entity.getKey());
        model.setTimeZone((java.lang.String) entity.getProperty("timeZone"));
        model.setVersion((java.lang.Long) entity.getProperty("version"));
        return model;
    }

    @Override
    public com.google.appengine.api.datastore.Entity modelToEntity(java.lang.Object model) {
        jp.tnasu.f1tvnews.model.google.calendar.EventDate m = (jp.tnasu.f1tvnews.model.google.calendar.EventDate) model;
        com.google.appengine.api.datastore.Entity entity = null;
        if (m.getKey() != null) {
            entity = new com.google.appengine.api.datastore.Entity(m.getKey());
        } else {
            entity = new com.google.appengine.api.datastore.Entity(kind);
        }
        entity.setProperty("date", m.getDate());
        entity.setProperty("dateTime", m.getDateTime());
        entity.setProperty("timeZone", m.getTimeZone());
        entity.setProperty("version", m.getVersion());
        entity.setProperty("slim3.schemaVersion", 1);
        return entity;
    }

    @Override
    protected com.google.appengine.api.datastore.Key getKey(Object model) {
        jp.tnasu.f1tvnews.model.google.calendar.EventDate m = (jp.tnasu.f1tvnews.model.google.calendar.EventDate) model;
        return m.getKey();
    }

    @Override
    protected void setKey(Object model, com.google.appengine.api.datastore.Key key) {
        validateKey(key);
        jp.tnasu.f1tvnews.model.google.calendar.EventDate m = (jp.tnasu.f1tvnews.model.google.calendar.EventDate) model;
        m.setKey(key);
    }

    @Override
    protected long getVersion(Object model) {
        jp.tnasu.f1tvnews.model.google.calendar.EventDate m = (jp.tnasu.f1tvnews.model.google.calendar.EventDate) model;
        return m.getVersion() != null ? m.getVersion().longValue() : 0L;
    }

    @Override
    protected void assignKeyToModelRefIfNecessary(com.google.appengine.api.datastore.AsyncDatastoreService ds, java.lang.Object model) {
    }

    @Override
    protected void incrementVersion(Object model) {
        jp.tnasu.f1tvnews.model.google.calendar.EventDate m = (jp.tnasu.f1tvnews.model.google.calendar.EventDate) model;
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
        jp.tnasu.f1tvnews.model.google.calendar.EventDate m = (jp.tnasu.f1tvnews.model.google.calendar.EventDate) model;
        writer.beginObject();
        org.slim3.datastore.json.Default encoder0 = new org.slim3.datastore.json.Default();
        if(m.getDate() != null){
            writer.setNextPropertyName("date");
            encoder0.encode(writer, m.getDate());
        }
        if(m.getDateTime() != null){
            writer.setNextPropertyName("dateTime");
            encoder0.encode(writer, m.getDateTime());
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
    protected jp.tnasu.f1tvnews.model.google.calendar.EventDate jsonToModel(org.slim3.datastore.json.JsonRootReader rootReader, int maxDepth, int currentDepth) {
        jp.tnasu.f1tvnews.model.google.calendar.EventDate m = new jp.tnasu.f1tvnews.model.google.calendar.EventDate();
        org.slim3.datastore.json.JsonReader reader = null;
        org.slim3.datastore.json.Default decoder0 = new org.slim3.datastore.json.Default();
        reader = rootReader.newObjectReader("date");
        m.setDate(decoder0.decode(reader, m.getDate()));
        reader = rootReader.newObjectReader("dateTime");
        m.setDateTime(decoder0.decode(reader, m.getDateTime()));
        reader = rootReader.newObjectReader("timeZone");
        m.setTimeZone(decoder0.decode(reader, m.getTimeZone()));
        reader = rootReader.newObjectReader("version");
        m.setVersion(decoder0.decode(reader, m.getVersion()));
        return m;
    }
}