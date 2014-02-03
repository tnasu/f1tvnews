package jp.tnasu.f1tvnews.meta.google.calendar;

//@javax.annotation.Generated(value = { "slim3-gen", "@VERSION@" }, date = "2014-02-04 00:13:13")
/** */
public final class ErrorDetailMeta extends org.slim3.datastore.ModelMeta<jp.tnasu.f1tvnews.model.google.calendar.ErrorDetail> {

    /** */
    public final org.slim3.datastore.StringAttributeMeta<jp.tnasu.f1tvnews.model.google.calendar.ErrorDetail> domain = new org.slim3.datastore.StringAttributeMeta<jp.tnasu.f1tvnews.model.google.calendar.ErrorDetail>(this, "domain", "domain");

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<jp.tnasu.f1tvnews.model.google.calendar.ErrorDetail, com.google.appengine.api.datastore.Key> key = new org.slim3.datastore.CoreAttributeMeta<jp.tnasu.f1tvnews.model.google.calendar.ErrorDetail, com.google.appengine.api.datastore.Key>(this, "__key__", "key", com.google.appengine.api.datastore.Key.class);

    /** */
    public final org.slim3.datastore.StringAttributeMeta<jp.tnasu.f1tvnews.model.google.calendar.ErrorDetail> location = new org.slim3.datastore.StringAttributeMeta<jp.tnasu.f1tvnews.model.google.calendar.ErrorDetail>(this, "location", "location");

    /** */
    public final org.slim3.datastore.StringAttributeMeta<jp.tnasu.f1tvnews.model.google.calendar.ErrorDetail> locationType = new org.slim3.datastore.StringAttributeMeta<jp.tnasu.f1tvnews.model.google.calendar.ErrorDetail>(this, "locationType", "locationType");

    /** */
    public final org.slim3.datastore.StringAttributeMeta<jp.tnasu.f1tvnews.model.google.calendar.ErrorDetail> message = new org.slim3.datastore.StringAttributeMeta<jp.tnasu.f1tvnews.model.google.calendar.ErrorDetail>(this, "message", "message");

    /** */
    public final org.slim3.datastore.StringAttributeMeta<jp.tnasu.f1tvnews.model.google.calendar.ErrorDetail> reason = new org.slim3.datastore.StringAttributeMeta<jp.tnasu.f1tvnews.model.google.calendar.ErrorDetail>(this, "reason", "reason");

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<jp.tnasu.f1tvnews.model.google.calendar.ErrorDetail, java.lang.Long> version = new org.slim3.datastore.CoreAttributeMeta<jp.tnasu.f1tvnews.model.google.calendar.ErrorDetail, java.lang.Long>(this, "version", "version", java.lang.Long.class);

    private static final ErrorDetailMeta slim3_singleton = new ErrorDetailMeta();

    /**
     * @return the singleton
     */
    public static ErrorDetailMeta get() {
       return slim3_singleton;
    }

    /** */
    public ErrorDetailMeta() {
        super("ErrorDetail", jp.tnasu.f1tvnews.model.google.calendar.ErrorDetail.class);
    }

    @Override
    public jp.tnasu.f1tvnews.model.google.calendar.ErrorDetail entityToModel(com.google.appengine.api.datastore.Entity entity) {
        jp.tnasu.f1tvnews.model.google.calendar.ErrorDetail model = new jp.tnasu.f1tvnews.model.google.calendar.ErrorDetail();
        model.setDomain((java.lang.String) entity.getProperty("domain"));
        model.setKey(entity.getKey());
        model.setLocation((java.lang.String) entity.getProperty("location"));
        model.setLocationType((java.lang.String) entity.getProperty("locationType"));
        model.setMessage((java.lang.String) entity.getProperty("message"));
        model.setReason((java.lang.String) entity.getProperty("reason"));
        model.setVersion((java.lang.Long) entity.getProperty("version"));
        return model;
    }

    @Override
    public com.google.appengine.api.datastore.Entity modelToEntity(java.lang.Object model) {
        jp.tnasu.f1tvnews.model.google.calendar.ErrorDetail m = (jp.tnasu.f1tvnews.model.google.calendar.ErrorDetail) model;
        com.google.appengine.api.datastore.Entity entity = null;
        if (m.getKey() != null) {
            entity = new com.google.appengine.api.datastore.Entity(m.getKey());
        } else {
            entity = new com.google.appengine.api.datastore.Entity(kind);
        }
        entity.setProperty("domain", m.getDomain());
        entity.setProperty("location", m.getLocation());
        entity.setProperty("locationType", m.getLocationType());
        entity.setProperty("message", m.getMessage());
        entity.setProperty("reason", m.getReason());
        entity.setProperty("version", m.getVersion());
        entity.setProperty("slim3.schemaVersion", 1);
        return entity;
    }

    @Override
    protected com.google.appengine.api.datastore.Key getKey(Object model) {
        jp.tnasu.f1tvnews.model.google.calendar.ErrorDetail m = (jp.tnasu.f1tvnews.model.google.calendar.ErrorDetail) model;
        return m.getKey();
    }

    @Override
    protected void setKey(Object model, com.google.appengine.api.datastore.Key key) {
        validateKey(key);
        jp.tnasu.f1tvnews.model.google.calendar.ErrorDetail m = (jp.tnasu.f1tvnews.model.google.calendar.ErrorDetail) model;
        m.setKey(key);
    }

    @Override
    protected long getVersion(Object model) {
        jp.tnasu.f1tvnews.model.google.calendar.ErrorDetail m = (jp.tnasu.f1tvnews.model.google.calendar.ErrorDetail) model;
        return m.getVersion() != null ? m.getVersion().longValue() : 0L;
    }

    @Override
    protected void assignKeyToModelRefIfNecessary(com.google.appengine.api.datastore.AsyncDatastoreService ds, java.lang.Object model) {
    }

    @Override
    protected void incrementVersion(Object model) {
        jp.tnasu.f1tvnews.model.google.calendar.ErrorDetail m = (jp.tnasu.f1tvnews.model.google.calendar.ErrorDetail) model;
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
        jp.tnasu.f1tvnews.model.google.calendar.ErrorDetail m = (jp.tnasu.f1tvnews.model.google.calendar.ErrorDetail) model;
        writer.beginObject();
        org.slim3.datastore.json.Default encoder0 = new org.slim3.datastore.json.Default();
        if(m.getDomain() != null){
            writer.setNextPropertyName("domain");
            encoder0.encode(writer, m.getDomain());
        }
        if(m.getKey() != null){
            writer.setNextPropertyName("key");
            encoder0.encode(writer, m.getKey());
        }
        if(m.getLocation() != null){
            writer.setNextPropertyName("location");
            encoder0.encode(writer, m.getLocation());
        }
        if(m.getLocationType() != null){
            writer.setNextPropertyName("locationType");
            encoder0.encode(writer, m.getLocationType());
        }
        if(m.getMessage() != null){
            writer.setNextPropertyName("message");
            encoder0.encode(writer, m.getMessage());
        }
        if(m.getReason() != null){
            writer.setNextPropertyName("reason");
            encoder0.encode(writer, m.getReason());
        }
        if(m.getVersion() != null){
            writer.setNextPropertyName("version");
            encoder0.encode(writer, m.getVersion());
        }
        writer.endObject();
    }

    @Override
    protected jp.tnasu.f1tvnews.model.google.calendar.ErrorDetail jsonToModel(org.slim3.datastore.json.JsonRootReader rootReader, int maxDepth, int currentDepth) {
        jp.tnasu.f1tvnews.model.google.calendar.ErrorDetail m = new jp.tnasu.f1tvnews.model.google.calendar.ErrorDetail();
        org.slim3.datastore.json.JsonReader reader = null;
        org.slim3.datastore.json.Default decoder0 = new org.slim3.datastore.json.Default();
        reader = rootReader.newObjectReader("domain");
        m.setDomain(decoder0.decode(reader, m.getDomain()));
        reader = rootReader.newObjectReader("key");
        m.setKey(decoder0.decode(reader, m.getKey()));
        reader = rootReader.newObjectReader("location");
        m.setLocation(decoder0.decode(reader, m.getLocation()));
        reader = rootReader.newObjectReader("locationType");
        m.setLocationType(decoder0.decode(reader, m.getLocationType()));
        reader = rootReader.newObjectReader("message");
        m.setMessage(decoder0.decode(reader, m.getMessage()));
        reader = rootReader.newObjectReader("reason");
        m.setReason(decoder0.decode(reader, m.getReason()));
        reader = rootReader.newObjectReader("version");
        m.setVersion(decoder0.decode(reader, m.getVersion()));
        return m;
    }
}