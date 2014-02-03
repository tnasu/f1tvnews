package jp.tnasu.f1tvnews.meta.google.calendar;

//@javax.annotation.Generated(value = { "slim3-gen", "@VERSION@" }, date = "2013-01-08 01:01:23")
/** */
public final class ErrorMeta extends org.slim3.datastore.ModelMeta<jp.tnasu.f1tvnews.model.google.calendar.Error> {

    /** */
    public final org.slim3.datastore.StringAttributeMeta<jp.tnasu.f1tvnews.model.google.calendar.Error> code = new org.slim3.datastore.StringAttributeMeta<jp.tnasu.f1tvnews.model.google.calendar.Error>(this, "code", "code");

    /** */
    public final org.slim3.datastore.StringAttributeMeta<jp.tnasu.f1tvnews.model.google.calendar.Error> errors = new org.slim3.datastore.StringAttributeMeta<jp.tnasu.f1tvnews.model.google.calendar.Error>(this, "errors", "errors");

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<jp.tnasu.f1tvnews.model.google.calendar.Error, com.google.appengine.api.datastore.Key> key = new org.slim3.datastore.CoreAttributeMeta<jp.tnasu.f1tvnews.model.google.calendar.Error, com.google.appengine.api.datastore.Key>(this, "__key__", "key", com.google.appengine.api.datastore.Key.class);

    /** */
    public final org.slim3.datastore.StringAttributeMeta<jp.tnasu.f1tvnews.model.google.calendar.Error> message = new org.slim3.datastore.StringAttributeMeta<jp.tnasu.f1tvnews.model.google.calendar.Error>(this, "message", "message");

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<jp.tnasu.f1tvnews.model.google.calendar.Error, java.lang.Long> version = new org.slim3.datastore.CoreAttributeMeta<jp.tnasu.f1tvnews.model.google.calendar.Error, java.lang.Long>(this, "version", "version", java.lang.Long.class);

    private static final ErrorMeta slim3_singleton = new ErrorMeta();

    /**
     * @return the singleton
     */
    public static ErrorMeta get() {
       return slim3_singleton;
    }

    /** */
    public ErrorMeta() {
        super("Error", jp.tnasu.f1tvnews.model.google.calendar.Error.class);
    }

    @Override
    public jp.tnasu.f1tvnews.model.google.calendar.Error entityToModel(com.google.appengine.api.datastore.Entity entity) {
        jp.tnasu.f1tvnews.model.google.calendar.Error model = new jp.tnasu.f1tvnews.model.google.calendar.Error();
        model.setCode((java.lang.String) entity.getProperty("code"));
        java.util.List<jp.tnasu.f1tvnews.model.google.calendar.ErrorDetail> _errorList = blobToSerializable((com.google.appengine.api.datastore.Blob) entity.getProperty("errorList"));
        model.setErrorList(_errorList);
        model.setErrors((java.lang.String) entity.getProperty("errors"));
        model.setKey(entity.getKey());
        model.setMessage((java.lang.String) entity.getProperty("message"));
        model.setVersion((java.lang.Long) entity.getProperty("version"));
        return model;
    }

    @Override
    public com.google.appengine.api.datastore.Entity modelToEntity(java.lang.Object model) {
        jp.tnasu.f1tvnews.model.google.calendar.Error m = (jp.tnasu.f1tvnews.model.google.calendar.Error) model;
        com.google.appengine.api.datastore.Entity entity = null;
        if (m.getKey() != null) {
            entity = new com.google.appengine.api.datastore.Entity(m.getKey());
        } else {
            entity = new com.google.appengine.api.datastore.Entity(kind);
        }
        entity.setProperty("code", m.getCode());
        entity.setUnindexedProperty("errorList", serializableToBlob(m.getErrorList()));
        entity.setProperty("errors", m.getErrors());
        entity.setProperty("message", m.getMessage());
        entity.setProperty("version", m.getVersion());
        entity.setProperty("slim3.schemaVersion", 1);
        return entity;
    }

    @Override
    protected com.google.appengine.api.datastore.Key getKey(Object model) {
        jp.tnasu.f1tvnews.model.google.calendar.Error m = (jp.tnasu.f1tvnews.model.google.calendar.Error) model;
        return m.getKey();
    }

    @Override
    protected void setKey(Object model, com.google.appengine.api.datastore.Key key) {
        validateKey(key);
        jp.tnasu.f1tvnews.model.google.calendar.Error m = (jp.tnasu.f1tvnews.model.google.calendar.Error) model;
        m.setKey(key);
    }

    @Override
    protected long getVersion(Object model) {
        jp.tnasu.f1tvnews.model.google.calendar.Error m = (jp.tnasu.f1tvnews.model.google.calendar.Error) model;
        return m.getVersion() != null ? m.getVersion().longValue() : 0L;
    }

    @Override
    protected void assignKeyToModelRefIfNecessary(com.google.appengine.api.datastore.AsyncDatastoreService ds, java.lang.Object model) {
    }

    @Override
    protected void incrementVersion(Object model) {
        jp.tnasu.f1tvnews.model.google.calendar.Error m = (jp.tnasu.f1tvnews.model.google.calendar.Error) model;
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
        jp.tnasu.f1tvnews.model.google.calendar.Error m = (jp.tnasu.f1tvnews.model.google.calendar.Error) model;
        writer.beginObject();
        org.slim3.datastore.json.Default encoder0 = new org.slim3.datastore.json.Default();
        if(m.getCode() != null){
            writer.setNextPropertyName("code");
            encoder0.encode(writer, m.getCode());
        }
        if(m.getErrorList() != null){
            writer.setNextPropertyName("errorList");
            // jp.tnasu.f1tvnews.model.google.calendar.ErrorDetail is not supported.
        }
        if(m.getErrors() != null){
            writer.setNextPropertyName("errors");
            encoder0.encode(writer, m.getErrors());
        }
        if(m.getKey() != null){
            writer.setNextPropertyName("key");
            encoder0.encode(writer, m.getKey());
        }
        if(m.getMessage() != null){
            writer.setNextPropertyName("message");
            encoder0.encode(writer, m.getMessage());
        }
        if(m.getVersion() != null){
            writer.setNextPropertyName("version");
            encoder0.encode(writer, m.getVersion());
        }
        writer.endObject();
    }

    @Override
    protected jp.tnasu.f1tvnews.model.google.calendar.Error jsonToModel(org.slim3.datastore.json.JsonRootReader rootReader, int maxDepth, int currentDepth) {
        jp.tnasu.f1tvnews.model.google.calendar.Error m = new jp.tnasu.f1tvnews.model.google.calendar.Error();
        org.slim3.datastore.json.JsonReader reader = null;
        org.slim3.datastore.json.Default decoder0 = new org.slim3.datastore.json.Default();
        reader = rootReader.newObjectReader("code");
        m.setCode(decoder0.decode(reader, m.getCode()));
        reader = rootReader.newObjectReader("errorList");
        reader = rootReader.newObjectReader("errors");
        m.setErrors(decoder0.decode(reader, m.getErrors()));
        reader = rootReader.newObjectReader("key");
        m.setKey(decoder0.decode(reader, m.getKey()));
        reader = rootReader.newObjectReader("message");
        m.setMessage(decoder0.decode(reader, m.getMessage()));
        reader = rootReader.newObjectReader("version");
        m.setVersion(decoder0.decode(reader, m.getVersion()));
        return m;
    }
}