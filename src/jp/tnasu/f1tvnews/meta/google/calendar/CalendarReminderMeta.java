package jp.tnasu.f1tvnews.meta.google.calendar;

//@javax.annotation.Generated(value = { "slim3-gen", "@VERSION@" }, date = "2014-02-04 00:13:13")
/** */
public final class CalendarReminderMeta extends org.slim3.datastore.ModelMeta<jp.tnasu.f1tvnews.model.google.calendar.CalendarReminder> {

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<jp.tnasu.f1tvnews.model.google.calendar.CalendarReminder, com.google.appengine.api.datastore.Key> key = new org.slim3.datastore.CoreAttributeMeta<jp.tnasu.f1tvnews.model.google.calendar.CalendarReminder, com.google.appengine.api.datastore.Key>(this, "__key__", "key", com.google.appengine.api.datastore.Key.class);

    /** */
    public final org.slim3.datastore.StringAttributeMeta<jp.tnasu.f1tvnews.model.google.calendar.CalendarReminder> method = new org.slim3.datastore.StringAttributeMeta<jp.tnasu.f1tvnews.model.google.calendar.CalendarReminder>(this, "method", "method");

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<jp.tnasu.f1tvnews.model.google.calendar.CalendarReminder, java.lang.Integer> minutes = new org.slim3.datastore.CoreAttributeMeta<jp.tnasu.f1tvnews.model.google.calendar.CalendarReminder, java.lang.Integer>(this, "minutes", "minutes", int.class);

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<jp.tnasu.f1tvnews.model.google.calendar.CalendarReminder, java.lang.Long> version = new org.slim3.datastore.CoreAttributeMeta<jp.tnasu.f1tvnews.model.google.calendar.CalendarReminder, java.lang.Long>(this, "version", "version", java.lang.Long.class);

    private static final CalendarReminderMeta slim3_singleton = new CalendarReminderMeta();

    /**
     * @return the singleton
     */
    public static CalendarReminderMeta get() {
       return slim3_singleton;
    }

    /** */
    public CalendarReminderMeta() {
        super("CalendarReminder", jp.tnasu.f1tvnews.model.google.calendar.CalendarReminder.class);
    }

    @Override
    public jp.tnasu.f1tvnews.model.google.calendar.CalendarReminder entityToModel(com.google.appengine.api.datastore.Entity entity) {
        jp.tnasu.f1tvnews.model.google.calendar.CalendarReminder model = new jp.tnasu.f1tvnews.model.google.calendar.CalendarReminder();
        model.setKey(entity.getKey());
        model.setMethod((java.lang.String) entity.getProperty("method"));
        model.setMinutes(longToPrimitiveInt((java.lang.Long) entity.getProperty("minutes")));
        model.setVersion((java.lang.Long) entity.getProperty("version"));
        return model;
    }

    @Override
    public com.google.appengine.api.datastore.Entity modelToEntity(java.lang.Object model) {
        jp.tnasu.f1tvnews.model.google.calendar.CalendarReminder m = (jp.tnasu.f1tvnews.model.google.calendar.CalendarReminder) model;
        com.google.appengine.api.datastore.Entity entity = null;
        if (m.getKey() != null) {
            entity = new com.google.appengine.api.datastore.Entity(m.getKey());
        } else {
            entity = new com.google.appengine.api.datastore.Entity(kind);
        }
        entity.setProperty("method", m.getMethod());
        entity.setProperty("minutes", m.getMinutes());
        entity.setProperty("version", m.getVersion());
        entity.setProperty("slim3.schemaVersion", 1);
        return entity;
    }

    @Override
    protected com.google.appengine.api.datastore.Key getKey(Object model) {
        jp.tnasu.f1tvnews.model.google.calendar.CalendarReminder m = (jp.tnasu.f1tvnews.model.google.calendar.CalendarReminder) model;
        return m.getKey();
    }

    @Override
    protected void setKey(Object model, com.google.appengine.api.datastore.Key key) {
        validateKey(key);
        jp.tnasu.f1tvnews.model.google.calendar.CalendarReminder m = (jp.tnasu.f1tvnews.model.google.calendar.CalendarReminder) model;
        m.setKey(key);
    }

    @Override
    protected long getVersion(Object model) {
        jp.tnasu.f1tvnews.model.google.calendar.CalendarReminder m = (jp.tnasu.f1tvnews.model.google.calendar.CalendarReminder) model;
        return m.getVersion() != null ? m.getVersion().longValue() : 0L;
    }

    @Override
    protected void assignKeyToModelRefIfNecessary(com.google.appengine.api.datastore.AsyncDatastoreService ds, java.lang.Object model) {
    }

    @Override
    protected void incrementVersion(Object model) {
        jp.tnasu.f1tvnews.model.google.calendar.CalendarReminder m = (jp.tnasu.f1tvnews.model.google.calendar.CalendarReminder) model;
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
        jp.tnasu.f1tvnews.model.google.calendar.CalendarReminder m = (jp.tnasu.f1tvnews.model.google.calendar.CalendarReminder) model;
        writer.beginObject();
        org.slim3.datastore.json.Default encoder0 = new org.slim3.datastore.json.Default();
        if(m.getKey() != null){
            writer.setNextPropertyName("key");
            encoder0.encode(writer, m.getKey());
        }
        if(m.getMethod() != null){
            writer.setNextPropertyName("method");
            encoder0.encode(writer, m.getMethod());
        }
        writer.setNextPropertyName("minutes");
        encoder0.encode(writer, m.getMinutes());
        if(m.getVersion() != null){
            writer.setNextPropertyName("version");
            encoder0.encode(writer, m.getVersion());
        }
        writer.endObject();
    }

    @Override
    protected jp.tnasu.f1tvnews.model.google.calendar.CalendarReminder jsonToModel(org.slim3.datastore.json.JsonRootReader rootReader, int maxDepth, int currentDepth) {
        jp.tnasu.f1tvnews.model.google.calendar.CalendarReminder m = new jp.tnasu.f1tvnews.model.google.calendar.CalendarReminder();
        org.slim3.datastore.json.JsonReader reader = null;
        org.slim3.datastore.json.Default decoder0 = new org.slim3.datastore.json.Default();
        reader = rootReader.newObjectReader("key");
        m.setKey(decoder0.decode(reader, m.getKey()));
        reader = rootReader.newObjectReader("method");
        m.setMethod(decoder0.decode(reader, m.getMethod()));
        reader = rootReader.newObjectReader("minutes");
        m.setMinutes(decoder0.decode(reader, m.getMinutes()));
        reader = rootReader.newObjectReader("version");
        m.setVersion(decoder0.decode(reader, m.getVersion()));
        return m;
    }
}