package jp.tnasu.f1tvnews.meta.google.oauth2;

//@javax.annotation.Generated(value = { "slim3-gen", "@VERSION@" }, date = "2014-05-07 03:19:26")
/** */
public final class GoogleListMeta extends org.slim3.datastore.ModelMeta<jp.tnasu.f1tvnews.model.google.oauth2.GoogleList> {

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<jp.tnasu.f1tvnews.model.google.oauth2.GoogleList, com.google.appengine.api.datastore.Key> key = new org.slim3.datastore.CoreAttributeMeta<jp.tnasu.f1tvnews.model.google.oauth2.GoogleList, com.google.appengine.api.datastore.Key>(this, "__key__", "key", com.google.appengine.api.datastore.Key.class);

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<jp.tnasu.f1tvnews.model.google.oauth2.GoogleList, java.lang.Long> version = new org.slim3.datastore.CoreAttributeMeta<jp.tnasu.f1tvnews.model.google.oauth2.GoogleList, java.lang.Long>(this, "version", "version", java.lang.Long.class);

    private static final GoogleListMeta slim3_singleton = new GoogleListMeta();

    /**
     * @return the singleton
     */
    public static GoogleListMeta get() {
       return slim3_singleton;
    }

    /** */
    public GoogleListMeta() {
        super("GoogleList", jp.tnasu.f1tvnews.model.google.oauth2.GoogleList.class);
    }

    @Override
    public jp.tnasu.f1tvnews.model.google.oauth2.GoogleList entityToModel(com.google.appengine.api.datastore.Entity entity) {
        jp.tnasu.f1tvnews.model.google.oauth2.GoogleList model = new jp.tnasu.f1tvnews.model.google.oauth2.GoogleList();
        java.util.List<jp.tnasu.f1tvnews.model.google.oauth2.Google> _googleList = blobToSerializable((com.google.appengine.api.datastore.Blob) entity.getProperty("googleList"));
        model.setGoogleList(_googleList);
        model.setKey(entity.getKey());
        model.setVersion((java.lang.Long) entity.getProperty("version"));
        return model;
    }

    @Override
    public com.google.appengine.api.datastore.Entity modelToEntity(java.lang.Object model) {
        jp.tnasu.f1tvnews.model.google.oauth2.GoogleList m = (jp.tnasu.f1tvnews.model.google.oauth2.GoogleList) model;
        com.google.appengine.api.datastore.Entity entity = null;
        if (m.getKey() != null) {
            entity = new com.google.appengine.api.datastore.Entity(m.getKey());
        } else {
            entity = new com.google.appengine.api.datastore.Entity(kind);
        }
        entity.setUnindexedProperty("googleList", serializableToBlob(m.getGoogleList()));
        entity.setProperty("version", m.getVersion());
        entity.setProperty("slim3.schemaVersion", 1);
        return entity;
    }

    @Override
    protected com.google.appengine.api.datastore.Key getKey(Object model) {
        jp.tnasu.f1tvnews.model.google.oauth2.GoogleList m = (jp.tnasu.f1tvnews.model.google.oauth2.GoogleList) model;
        return m.getKey();
    }

    @Override
    protected void setKey(Object model, com.google.appengine.api.datastore.Key key) {
        validateKey(key);
        jp.tnasu.f1tvnews.model.google.oauth2.GoogleList m = (jp.tnasu.f1tvnews.model.google.oauth2.GoogleList) model;
        m.setKey(key);
    }

    @Override
    protected long getVersion(Object model) {
        jp.tnasu.f1tvnews.model.google.oauth2.GoogleList m = (jp.tnasu.f1tvnews.model.google.oauth2.GoogleList) model;
        return m.getVersion() != null ? m.getVersion().longValue() : 0L;
    }

    @Override
    protected void assignKeyToModelRefIfNecessary(com.google.appengine.api.datastore.AsyncDatastoreService ds, java.lang.Object model) {
    }

    @Override
    protected void incrementVersion(Object model) {
        jp.tnasu.f1tvnews.model.google.oauth2.GoogleList m = (jp.tnasu.f1tvnews.model.google.oauth2.GoogleList) model;
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
        jp.tnasu.f1tvnews.model.google.oauth2.GoogleList m = (jp.tnasu.f1tvnews.model.google.oauth2.GoogleList) model;
        writer.beginObject();
        org.slim3.datastore.json.Default encoder0 = new org.slim3.datastore.json.Default();
        if(m.getGoogleList() != null){
            writer.setNextPropertyName("googleList");
            // jp.tnasu.f1tvnews.model.google.oauth2.Google is not supported.
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
    protected jp.tnasu.f1tvnews.model.google.oauth2.GoogleList jsonToModel(org.slim3.datastore.json.JsonRootReader rootReader, int maxDepth, int currentDepth) {
        jp.tnasu.f1tvnews.model.google.oauth2.GoogleList m = new jp.tnasu.f1tvnews.model.google.oauth2.GoogleList();
        org.slim3.datastore.json.JsonReader reader = null;
        org.slim3.datastore.json.Default decoder0 = new org.slim3.datastore.json.Default();
        reader = rootReader.newObjectReader("googleList");
        reader = rootReader.newObjectReader("key");
        m.setKey(decoder0.decode(reader, m.getKey()));
        reader = rootReader.newObjectReader("version");
        m.setVersion(decoder0.decode(reader, m.getVersion()));
        return m;
    }
}