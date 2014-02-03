package jp.tnasu.f1tvnews.meta.google.calendar;

//@javax.annotation.Generated(value = { "slim3-gen", "@VERSION@" }, date = "2014-02-04 00:13:13")
/** */
public final class CalendarListMeta extends org.slim3.datastore.ModelMeta<jp.tnasu.f1tvnews.model.google.calendar.CalendarList> {

    /** */
    public final org.slim3.datastore.StringAttributeMeta<jp.tnasu.f1tvnews.model.google.calendar.CalendarList> etag = new org.slim3.datastore.StringAttributeMeta<jp.tnasu.f1tvnews.model.google.calendar.CalendarList>(this, "etag", "etag");

    /** */
    public final org.slim3.datastore.UnindexedAttributeMeta<jp.tnasu.f1tvnews.model.google.calendar.CalendarList, java.util.Map<java.lang.String,jp.tnasu.f1tvnews.model.google.calendar.Calendar>> itemMap = new org.slim3.datastore.UnindexedAttributeMeta<jp.tnasu.f1tvnews.model.google.calendar.CalendarList, java.util.Map<java.lang.String,jp.tnasu.f1tvnews.model.google.calendar.Calendar>>(this, "itemMap", "itemMap", java.util.Map.class);

    /** */
    public final org.slim3.datastore.StringAttributeMeta<jp.tnasu.f1tvnews.model.google.calendar.CalendarList> items = new org.slim3.datastore.StringAttributeMeta<jp.tnasu.f1tvnews.model.google.calendar.CalendarList>(this, "items", "items");

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<jp.tnasu.f1tvnews.model.google.calendar.CalendarList, com.google.appengine.api.datastore.Key> key = new org.slim3.datastore.CoreAttributeMeta<jp.tnasu.f1tvnews.model.google.calendar.CalendarList, com.google.appengine.api.datastore.Key>(this, "__key__", "key", com.google.appengine.api.datastore.Key.class);

    /** */
    public final org.slim3.datastore.StringAttributeMeta<jp.tnasu.f1tvnews.model.google.calendar.CalendarList> kindstr = new org.slim3.datastore.StringAttributeMeta<jp.tnasu.f1tvnews.model.google.calendar.CalendarList>(this, "kindstr", "kindstr");

    /** */
    public final org.slim3.datastore.StringAttributeMeta<jp.tnasu.f1tvnews.model.google.calendar.CalendarList> nextPageToken = new org.slim3.datastore.StringAttributeMeta<jp.tnasu.f1tvnews.model.google.calendar.CalendarList>(this, "nextPageToken", "nextPageToken");

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<jp.tnasu.f1tvnews.model.google.calendar.CalendarList, java.lang.Long> version = new org.slim3.datastore.CoreAttributeMeta<jp.tnasu.f1tvnews.model.google.calendar.CalendarList, java.lang.Long>(this, "version", "version", java.lang.Long.class);

    private static final CalendarListMeta slim3_singleton = new CalendarListMeta();

    /**
     * @return the singleton
     */
    public static CalendarListMeta get() {
       return slim3_singleton;
    }

    /** */
    public CalendarListMeta() {
        super("CalendarList", jp.tnasu.f1tvnews.model.google.calendar.CalendarList.class);
    }

    @Override
    public jp.tnasu.f1tvnews.model.google.calendar.CalendarList entityToModel(com.google.appengine.api.datastore.Entity entity) {
        jp.tnasu.f1tvnews.model.google.calendar.CalendarList model = new jp.tnasu.f1tvnews.model.google.calendar.CalendarList();
        model.setEtag((java.lang.String) entity.getProperty("etag"));
        java.util.Map<java.lang.String,jp.tnasu.f1tvnews.model.google.calendar.Calendar> _itemMap = blobToSerializable((com.google.appengine.api.datastore.Blob) entity.getProperty("itemMap"));
        model.setItemMap(_itemMap);
        model.setItems((java.lang.String) entity.getProperty("items"));
        model.setKey(entity.getKey());
        model.setKindstr((java.lang.String) entity.getProperty("kindstr"));
        model.setNextPageToken((java.lang.String) entity.getProperty("nextPageToken"));
        model.setVersion((java.lang.Long) entity.getProperty("version"));
        return model;
    }

    @Override
    public com.google.appengine.api.datastore.Entity modelToEntity(java.lang.Object model) {
        jp.tnasu.f1tvnews.model.google.calendar.CalendarList m = (jp.tnasu.f1tvnews.model.google.calendar.CalendarList) model;
        com.google.appengine.api.datastore.Entity entity = null;
        if (m.getKey() != null) {
            entity = new com.google.appengine.api.datastore.Entity(m.getKey());
        } else {
            entity = new com.google.appengine.api.datastore.Entity(kind);
        }
        entity.setProperty("etag", m.getEtag());
        entity.setUnindexedProperty("itemMap", serializableToBlob(m.getItemMap()));
        entity.setProperty("items", m.getItems());
        entity.setProperty("kindstr", m.getKindstr());
        entity.setProperty("nextPageToken", m.getNextPageToken());
        entity.setProperty("version", m.getVersion());
        entity.setProperty("slim3.schemaVersion", 1);
        return entity;
    }

    @Override
    protected com.google.appengine.api.datastore.Key getKey(Object model) {
        jp.tnasu.f1tvnews.model.google.calendar.CalendarList m = (jp.tnasu.f1tvnews.model.google.calendar.CalendarList) model;
        return m.getKey();
    }

    @Override
    protected void setKey(Object model, com.google.appengine.api.datastore.Key key) {
        validateKey(key);
        jp.tnasu.f1tvnews.model.google.calendar.CalendarList m = (jp.tnasu.f1tvnews.model.google.calendar.CalendarList) model;
        m.setKey(key);
    }

    @Override
    protected long getVersion(Object model) {
        jp.tnasu.f1tvnews.model.google.calendar.CalendarList m = (jp.tnasu.f1tvnews.model.google.calendar.CalendarList) model;
        return m.getVersion() != null ? m.getVersion().longValue() : 0L;
    }

    @Override
    protected void assignKeyToModelRefIfNecessary(com.google.appengine.api.datastore.AsyncDatastoreService ds, java.lang.Object model) {
    }

    @Override
    protected void incrementVersion(Object model) {
        jp.tnasu.f1tvnews.model.google.calendar.CalendarList m = (jp.tnasu.f1tvnews.model.google.calendar.CalendarList) model;
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
        jp.tnasu.f1tvnews.model.google.calendar.CalendarList m = (jp.tnasu.f1tvnews.model.google.calendar.CalendarList) model;
        writer.beginObject();
        org.slim3.datastore.json.Default encoder0 = new org.slim3.datastore.json.Default();
        if(m.getEtag() != null){
            writer.setNextPropertyName("etag");
            encoder0.encode(writer, m.getEtag());
        }
        if(m.getItemMap() != null){
            writer.setNextPropertyName("itemMap");
            encoder0.encode(writer, m.getItemMap());
        }
        if(m.getItems() != null){
            writer.setNextPropertyName("items");
            encoder0.encode(writer, m.getItems());
        }
        if(m.getKey() != null){
            writer.setNextPropertyName("key");
            encoder0.encode(writer, m.getKey());
        }
        if(m.getKindstr() != null){
            writer.setNextPropertyName("kind");
            encoder0.encode(writer, m.getKindstr());
        }
        if(m.getNextPageToken() != null){
            writer.setNextPropertyName("nextPageToken");
            encoder0.encode(writer, m.getNextPageToken());
        }
        if(m.getVersion() != null){
            writer.setNextPropertyName("version");
            encoder0.encode(writer, m.getVersion());
        }
        writer.endObject();
    }

    @Override
    protected jp.tnasu.f1tvnews.model.google.calendar.CalendarList jsonToModel(org.slim3.datastore.json.JsonRootReader rootReader, int maxDepth, int currentDepth) {
        jp.tnasu.f1tvnews.model.google.calendar.CalendarList m = new jp.tnasu.f1tvnews.model.google.calendar.CalendarList();
        org.slim3.datastore.json.JsonReader reader = null;
        org.slim3.datastore.json.Default decoder0 = new org.slim3.datastore.json.Default();
        reader = rootReader.newObjectReader("etag");
        m.setEtag(decoder0.decode(reader, m.getEtag()));
        reader = rootReader.newObjectReader("itemMap");
        m.setItemMap(decoder0.decode(reader, m.getItemMap(), java.util.Map.class));
        reader = rootReader.newObjectReader("items");
        m.setItems(decoder0.decode(reader, m.getItems()));
        reader = rootReader.newObjectReader("key");
        m.setKey(decoder0.decode(reader, m.getKey()));
        reader = rootReader.newObjectReader("kind");
        m.setKindstr(decoder0.decode(reader, m.getKindstr()));
        reader = rootReader.newObjectReader("nextPageToken");
        m.setNextPageToken(decoder0.decode(reader, m.getNextPageToken()));
        reader = rootReader.newObjectReader("version");
        m.setVersion(decoder0.decode(reader, m.getVersion()));
        return m;
    }
}