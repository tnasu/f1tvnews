package jp.tnasu.f1tvnews.meta.google.calendar;

//@javax.annotation.Generated(value = { "slim3-gen", "@VERSION@" }, date = "2014-05-07 03:19:26")
/** */
public final class GoogleCalendarDtoMeta extends org.slim3.datastore.ModelMeta<jp.tnasu.f1tvnews.model.google.calendar.GoogleCalendarDto> {

    /** */
    public final org.slim3.datastore.CoreUnindexedAttributeMeta<jp.tnasu.f1tvnews.model.google.calendar.GoogleCalendarDto, java.lang.String[]> calendarList = new org.slim3.datastore.CoreUnindexedAttributeMeta<jp.tnasu.f1tvnews.model.google.calendar.GoogleCalendarDto, java.lang.String[]>(this, "calendarList", "calendarList", java.lang.String[].class);

    /** */
    public final org.slim3.datastore.UnindexedAttributeMeta<jp.tnasu.f1tvnews.model.google.calendar.GoogleCalendarDto, jp.tnasu.f1tvnews.model.google.oauth2.Google> google = new org.slim3.datastore.UnindexedAttributeMeta<jp.tnasu.f1tvnews.model.google.calendar.GoogleCalendarDto, jp.tnasu.f1tvnews.model.google.oauth2.Google>(this, "google", "google", jp.tnasu.f1tvnews.model.google.oauth2.Google.class);

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<jp.tnasu.f1tvnews.model.google.calendar.GoogleCalendarDto, com.google.appengine.api.datastore.Key> key = new org.slim3.datastore.CoreAttributeMeta<jp.tnasu.f1tvnews.model.google.calendar.GoogleCalendarDto, com.google.appengine.api.datastore.Key>(this, "__key__", "key", com.google.appengine.api.datastore.Key.class);

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<jp.tnasu.f1tvnews.model.google.calendar.GoogleCalendarDto, java.lang.Long> version = new org.slim3.datastore.CoreAttributeMeta<jp.tnasu.f1tvnews.model.google.calendar.GoogleCalendarDto, java.lang.Long>(this, "version", "version", java.lang.Long.class);

    private static final GoogleCalendarDtoMeta slim3_singleton = new GoogleCalendarDtoMeta();

    /**
     * @return the singleton
     */
    public static GoogleCalendarDtoMeta get() {
       return slim3_singleton;
    }

    /** */
    public GoogleCalendarDtoMeta() {
        super("GoogleCalendarDto", jp.tnasu.f1tvnews.model.google.calendar.GoogleCalendarDto.class);
    }

    @Override
    public jp.tnasu.f1tvnews.model.google.calendar.GoogleCalendarDto entityToModel(com.google.appengine.api.datastore.Entity entity) {
        jp.tnasu.f1tvnews.model.google.calendar.GoogleCalendarDto model = new jp.tnasu.f1tvnews.model.google.calendar.GoogleCalendarDto();
        java.lang.String[] _calendarList = blobToSerializable((com.google.appengine.api.datastore.Blob) entity.getProperty("calendarList"));
        model.setCalendarList(_calendarList);
        jp.tnasu.f1tvnews.model.google.oauth2.Google _google = blobToSerializable((com.google.appengine.api.datastore.Blob) entity.getProperty("google"));
        model.setGoogle(_google);
        model.setKey(entity.getKey());
        model.setVersion((java.lang.Long) entity.getProperty("version"));
        return model;
    }

    @Override
    public com.google.appengine.api.datastore.Entity modelToEntity(java.lang.Object model) {
        jp.tnasu.f1tvnews.model.google.calendar.GoogleCalendarDto m = (jp.tnasu.f1tvnews.model.google.calendar.GoogleCalendarDto) model;
        com.google.appengine.api.datastore.Entity entity = null;
        if (m.getKey() != null) {
            entity = new com.google.appengine.api.datastore.Entity(m.getKey());
        } else {
            entity = new com.google.appengine.api.datastore.Entity(kind);
        }
        entity.setUnindexedProperty("calendarList", serializableToBlob(m.getCalendarList()));
        entity.setUnindexedProperty("google", serializableToBlob(m.getGoogle()));
        entity.setProperty("version", m.getVersion());
        entity.setProperty("slim3.schemaVersion", 1);
        return entity;
    }

    @Override
    protected com.google.appengine.api.datastore.Key getKey(Object model) {
        jp.tnasu.f1tvnews.model.google.calendar.GoogleCalendarDto m = (jp.tnasu.f1tvnews.model.google.calendar.GoogleCalendarDto) model;
        return m.getKey();
    }

    @Override
    protected void setKey(Object model, com.google.appengine.api.datastore.Key key) {
        validateKey(key);
        jp.tnasu.f1tvnews.model.google.calendar.GoogleCalendarDto m = (jp.tnasu.f1tvnews.model.google.calendar.GoogleCalendarDto) model;
        m.setKey(key);
    }

    @Override
    protected long getVersion(Object model) {
        jp.tnasu.f1tvnews.model.google.calendar.GoogleCalendarDto m = (jp.tnasu.f1tvnews.model.google.calendar.GoogleCalendarDto) model;
        return m.getVersion() != null ? m.getVersion().longValue() : 0L;
    }

    @Override
    protected void assignKeyToModelRefIfNecessary(com.google.appengine.api.datastore.AsyncDatastoreService ds, java.lang.Object model) {
    }

    @Override
    protected void incrementVersion(Object model) {
        jp.tnasu.f1tvnews.model.google.calendar.GoogleCalendarDto m = (jp.tnasu.f1tvnews.model.google.calendar.GoogleCalendarDto) model;
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
        jp.tnasu.f1tvnews.model.google.calendar.GoogleCalendarDto m = (jp.tnasu.f1tvnews.model.google.calendar.GoogleCalendarDto) model;
        writer.beginObject();
        org.slim3.datastore.json.Default encoder0 = new org.slim3.datastore.json.Default();
        if(m.getCalendarList() != null){
            writer.setNextPropertyName("calendarList");
            // java.lang.String[](java.lang.String[]) is not supported.
        }
        if(m.getGoogle() != null){
            writer.setNextPropertyName("google");
            encoder0.encode(writer, m.getGoogle());
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
    protected jp.tnasu.f1tvnews.model.google.calendar.GoogleCalendarDto jsonToModel(org.slim3.datastore.json.JsonRootReader rootReader, int maxDepth, int currentDepth) {
        jp.tnasu.f1tvnews.model.google.calendar.GoogleCalendarDto m = new jp.tnasu.f1tvnews.model.google.calendar.GoogleCalendarDto();
        org.slim3.datastore.json.JsonReader reader = null;
        org.slim3.datastore.json.Default decoder0 = new org.slim3.datastore.json.Default();
        reader = rootReader.newObjectReader("calendarList");
        // java.lang.String[](java.lang.String[]) is not supported.
        reader = rootReader.newObjectReader("google");
        m.setGoogle(decoder0.decode(reader, m.getGoogle(), jp.tnasu.f1tvnews.model.google.oauth2.Google.class));
        reader = rootReader.newObjectReader("key");
        m.setKey(decoder0.decode(reader, m.getKey()));
        reader = rootReader.newObjectReader("version");
        m.setVersion(decoder0.decode(reader, m.getVersion()));
        return m;
    }
}