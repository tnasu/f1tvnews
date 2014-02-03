package jp.tnasu.f1tvnews.meta;

//@javax.annotation.Generated(value = { "slim3-gen", "@VERSION@" }, date = "2013-01-08 01:01:23")
/** */
public final class HtmlContentMeta extends org.slim3.datastore.ModelMeta<jp.tnasu.f1tvnews.model.HtmlContent> {

    /** */
    public final org.slim3.datastore.UnindexedAttributeMeta<jp.tnasu.f1tvnews.model.HtmlContent, com.google.appengine.api.datastore.Text> data = new org.slim3.datastore.UnindexedAttributeMeta<jp.tnasu.f1tvnews.model.HtmlContent, com.google.appengine.api.datastore.Text>(this, "data", "data", com.google.appengine.api.datastore.Text.class);

    /** */
    public final org.slim3.datastore.StringAttributeMeta<jp.tnasu.f1tvnews.model.HtmlContent> description = new org.slim3.datastore.StringAttributeMeta<jp.tnasu.f1tvnews.model.HtmlContent>(this, "description", "description");

    /** */
    public final org.slim3.datastore.UnindexedAttributeMeta<jp.tnasu.f1tvnews.model.HtmlContent, com.google.appengine.api.datastore.Text> html = new org.slim3.datastore.UnindexedAttributeMeta<jp.tnasu.f1tvnews.model.HtmlContent, com.google.appengine.api.datastore.Text>(this, "html", "html", com.google.appengine.api.datastore.Text.class);

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<jp.tnasu.f1tvnews.model.HtmlContent, com.google.appengine.api.datastore.Key> key = new org.slim3.datastore.CoreAttributeMeta<jp.tnasu.f1tvnews.model.HtmlContent, com.google.appengine.api.datastore.Key>(this, "__key__", "key", com.google.appengine.api.datastore.Key.class);

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<jp.tnasu.f1tvnews.model.HtmlContent, java.lang.Long> lastModified = new org.slim3.datastore.CoreAttributeMeta<jp.tnasu.f1tvnews.model.HtmlContent, java.lang.Long>(this, "lastModified", "lastModified", long.class);

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<jp.tnasu.f1tvnews.model.HtmlContent, java.lang.Long> nextModify = new org.slim3.datastore.CoreAttributeMeta<jp.tnasu.f1tvnews.model.HtmlContent, java.lang.Long>(this, "nextModify", "nextModify", long.class);

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<jp.tnasu.f1tvnews.model.HtmlContent, java.util.Date> qualifyEndTime = new org.slim3.datastore.CoreAttributeMeta<jp.tnasu.f1tvnews.model.HtmlContent, java.util.Date>(this, "qualifyEndTime", "qualifyEndTime", java.util.Date.class);

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<jp.tnasu.f1tvnews.model.HtmlContent, java.util.Date> qualifyStartTime = new org.slim3.datastore.CoreAttributeMeta<jp.tnasu.f1tvnews.model.HtmlContent, java.util.Date>(this, "qualifyStartTime", "qualifyStartTime", java.util.Date.class);

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<jp.tnasu.f1tvnews.model.HtmlContent, java.util.Date> raceEndTime = new org.slim3.datastore.CoreAttributeMeta<jp.tnasu.f1tvnews.model.HtmlContent, java.util.Date>(this, "raceEndTime", "raceEndTime", java.util.Date.class);

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<jp.tnasu.f1tvnews.model.HtmlContent, java.util.Date> raceStartTime = new org.slim3.datastore.CoreAttributeMeta<jp.tnasu.f1tvnews.model.HtmlContent, java.util.Date>(this, "raceStartTime", "raceStartTime", java.util.Date.class);

    /** */
    public final org.slim3.datastore.StringAttributeMeta<jp.tnasu.f1tvnews.model.HtmlContent> showtime = new org.slim3.datastore.StringAttributeMeta<jp.tnasu.f1tvnews.model.HtmlContent>(this, "showtime", "showtime");

    /** */
    public final org.slim3.datastore.StringAttributeMeta<jp.tnasu.f1tvnews.model.HtmlContent> title = new org.slim3.datastore.StringAttributeMeta<jp.tnasu.f1tvnews.model.HtmlContent>(this, "title", "title");

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<jp.tnasu.f1tvnews.model.HtmlContent, java.lang.Long> version = new org.slim3.datastore.CoreAttributeMeta<jp.tnasu.f1tvnews.model.HtmlContent, java.lang.Long>(this, "version", "version", java.lang.Long.class);

    private static final HtmlContentMeta slim3_singleton = new HtmlContentMeta();

    /**
     * @return the singleton
     */
    public static HtmlContentMeta get() {
       return slim3_singleton;
    }

    /** */
    public HtmlContentMeta() {
        super("HtmlContent", jp.tnasu.f1tvnews.model.HtmlContent.class);
    }

    @Override
    public jp.tnasu.f1tvnews.model.HtmlContent entityToModel(com.google.appengine.api.datastore.Entity entity) {
        jp.tnasu.f1tvnews.model.HtmlContent model = new jp.tnasu.f1tvnews.model.HtmlContent();
        model.setData((com.google.appengine.api.datastore.Text) entity.getProperty("data"));
        model.setDescription((java.lang.String) entity.getProperty("description"));
        model.setHtml((com.google.appengine.api.datastore.Text) entity.getProperty("html"));
        model.setKey(entity.getKey());
        model.setLastModified(longToPrimitiveLong((java.lang.Long) entity.getProperty("lastModified")));
        model.setNextModify(longToPrimitiveLong((java.lang.Long) entity.getProperty("nextModify")));
        model.setQualifyEndTime((java.util.Date) entity.getProperty("qualifyEndTime"));
        model.setQualifyStartTime((java.util.Date) entity.getProperty("qualifyStartTime"));
        model.setRaceEndTime((java.util.Date) entity.getProperty("raceEndTime"));
        model.setRaceStartTime((java.util.Date) entity.getProperty("raceStartTime"));
        model.setShowtime((java.lang.String) entity.getProperty("showtime"));
        model.setTitle((java.lang.String) entity.getProperty("title"));
        model.setVersion((java.lang.Long) entity.getProperty("version"));
        return model;
    }

    @Override
    public com.google.appengine.api.datastore.Entity modelToEntity(java.lang.Object model) {
        jp.tnasu.f1tvnews.model.HtmlContent m = (jp.tnasu.f1tvnews.model.HtmlContent) model;
        com.google.appengine.api.datastore.Entity entity = null;
        if (m.getKey() != null) {
            entity = new com.google.appengine.api.datastore.Entity(m.getKey());
        } else {
            entity = new com.google.appengine.api.datastore.Entity(kind);
        }
        entity.setUnindexedProperty("data", m.getData());
        entity.setProperty("description", m.getDescription());
        entity.setUnindexedProperty("html", m.getHtml());
        entity.setProperty("lastModified", m.getLastModified());
        entity.setProperty("nextModify", m.getNextModify());
        entity.setProperty("qualifyEndTime", m.getQualifyEndTime());
        entity.setProperty("qualifyStartTime", m.getQualifyStartTime());
        entity.setProperty("raceEndTime", m.getRaceEndTime());
        entity.setProperty("raceStartTime", m.getRaceStartTime());
        entity.setProperty("showtime", m.getShowtime());
        entity.setProperty("title", m.getTitle());
        entity.setProperty("version", m.getVersion());
        entity.setProperty("slim3.schemaVersion", 1);
        return entity;
    }

    @Override
    protected com.google.appengine.api.datastore.Key getKey(Object model) {
        jp.tnasu.f1tvnews.model.HtmlContent m = (jp.tnasu.f1tvnews.model.HtmlContent) model;
        return m.getKey();
    }

    @Override
    protected void setKey(Object model, com.google.appengine.api.datastore.Key key) {
        validateKey(key);
        jp.tnasu.f1tvnews.model.HtmlContent m = (jp.tnasu.f1tvnews.model.HtmlContent) model;
        m.setKey(key);
    }

    @Override
    protected long getVersion(Object model) {
        jp.tnasu.f1tvnews.model.HtmlContent m = (jp.tnasu.f1tvnews.model.HtmlContent) model;
        return m.getVersion() != null ? m.getVersion().longValue() : 0L;
    }

    @Override
    protected void assignKeyToModelRefIfNecessary(com.google.appengine.api.datastore.AsyncDatastoreService ds, java.lang.Object model) {
    }

    @Override
    protected void incrementVersion(Object model) {
        jp.tnasu.f1tvnews.model.HtmlContent m = (jp.tnasu.f1tvnews.model.HtmlContent) model;
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
        jp.tnasu.f1tvnews.model.HtmlContent m = (jp.tnasu.f1tvnews.model.HtmlContent) model;
        writer.beginObject();
        org.slim3.datastore.json.Default encoder0 = new org.slim3.datastore.json.Default();
        if(m.getData() != null && m.getData().getValue() != null){
            writer.setNextPropertyName("data");
            encoder0.encode(writer, m.getData());
        }
        if(m.getDescription() != null){
            writer.setNextPropertyName("description");
            encoder0.encode(writer, m.getDescription());
        }
        if(m.getHtml() != null && m.getHtml().getValue() != null){
            writer.setNextPropertyName("html");
            encoder0.encode(writer, m.getHtml());
        }
        if(m.getKey() != null){
            writer.setNextPropertyName("key");
            encoder0.encode(writer, m.getKey());
        }
        writer.setNextPropertyName("lastModified");
        encoder0.encode(writer, m.getLastModified());
        writer.setNextPropertyName("nextModify");
        encoder0.encode(writer, m.getNextModify());
        if(m.getQualifyEndTime() != null){
            writer.setNextPropertyName("qualifyEndTime");
            encoder0.encode(writer, m.getQualifyEndTime());
        }
        if(m.getQualifyStartTime() != null){
            writer.setNextPropertyName("qualifyStartTime");
            encoder0.encode(writer, m.getQualifyStartTime());
        }
        if(m.getRaceEndTime() != null){
            writer.setNextPropertyName("raceEndTime");
            encoder0.encode(writer, m.getRaceEndTime());
        }
        if(m.getRaceStartTime() != null){
            writer.setNextPropertyName("raceStartTime");
            encoder0.encode(writer, m.getRaceStartTime());
        }
        if(m.getShowtime() != null){
            writer.setNextPropertyName("showtime");
            encoder0.encode(writer, m.getShowtime());
        }
        if(m.getTitle() != null){
            writer.setNextPropertyName("title");
            encoder0.encode(writer, m.getTitle());
        }
        if(m.getVersion() != null){
            writer.setNextPropertyName("version");
            encoder0.encode(writer, m.getVersion());
        }
        writer.endObject();
    }

    @Override
    protected jp.tnasu.f1tvnews.model.HtmlContent jsonToModel(org.slim3.datastore.json.JsonRootReader rootReader, int maxDepth, int currentDepth) {
        jp.tnasu.f1tvnews.model.HtmlContent m = new jp.tnasu.f1tvnews.model.HtmlContent();
        org.slim3.datastore.json.JsonReader reader = null;
        org.slim3.datastore.json.Default decoder0 = new org.slim3.datastore.json.Default();
        reader = rootReader.newObjectReader("data");
        m.setData(decoder0.decode(reader, m.getData()));
        reader = rootReader.newObjectReader("description");
        m.setDescription(decoder0.decode(reader, m.getDescription()));
        reader = rootReader.newObjectReader("html");
        m.setHtml(decoder0.decode(reader, m.getHtml()));
        reader = rootReader.newObjectReader("key");
        m.setKey(decoder0.decode(reader, m.getKey()));
        reader = rootReader.newObjectReader("lastModified");
        m.setLastModified(decoder0.decode(reader, m.getLastModified()));
        reader = rootReader.newObjectReader("nextModify");
        m.setNextModify(decoder0.decode(reader, m.getNextModify()));
        reader = rootReader.newObjectReader("qualifyEndTime");
        m.setQualifyEndTime(decoder0.decode(reader, m.getQualifyEndTime()));
        reader = rootReader.newObjectReader("qualifyStartTime");
        m.setQualifyStartTime(decoder0.decode(reader, m.getQualifyStartTime()));
        reader = rootReader.newObjectReader("raceEndTime");
        m.setRaceEndTime(decoder0.decode(reader, m.getRaceEndTime()));
        reader = rootReader.newObjectReader("raceStartTime");
        m.setRaceStartTime(decoder0.decode(reader, m.getRaceStartTime()));
        reader = rootReader.newObjectReader("showtime");
        m.setShowtime(decoder0.decode(reader, m.getShowtime()));
        reader = rootReader.newObjectReader("title");
        m.setTitle(decoder0.decode(reader, m.getTitle()));
        reader = rootReader.newObjectReader("version");
        m.setVersion(decoder0.decode(reader, m.getVersion()));
        return m;
    }
}