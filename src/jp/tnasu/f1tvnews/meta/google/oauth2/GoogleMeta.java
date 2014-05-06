package jp.tnasu.f1tvnews.meta.google.oauth2;

//@javax.annotation.Generated(value = { "slim3-gen", "@VERSION@" }, date = "2014-05-07 03:19:26")
/** */
public final class GoogleMeta extends org.slim3.datastore.ModelMeta<jp.tnasu.f1tvnews.model.google.oauth2.Google> {

    /** */
    public final org.slim3.datastore.StringAttributeMeta<jp.tnasu.f1tvnews.model.google.oauth2.Google> accessToken = new org.slim3.datastore.StringAttributeMeta<jp.tnasu.f1tvnews.model.google.oauth2.Google>(this, "accessToken", "accessToken");

    /** */
    public final org.slim3.datastore.StringAttributeMeta<jp.tnasu.f1tvnews.model.google.oauth2.Google> clientId = new org.slim3.datastore.StringAttributeMeta<jp.tnasu.f1tvnews.model.google.oauth2.Google>(this, "clientId", "clientId");

    /** */
    public final org.slim3.datastore.StringAttributeMeta<jp.tnasu.f1tvnews.model.google.oauth2.Google> error = new org.slim3.datastore.StringAttributeMeta<jp.tnasu.f1tvnews.model.google.oauth2.Google>(this, "error", "error");

    /** */
    public final org.slim3.datastore.StringAttributeMeta<jp.tnasu.f1tvnews.model.google.oauth2.Google> expiresIn = new org.slim3.datastore.StringAttributeMeta<jp.tnasu.f1tvnews.model.google.oauth2.Google>(this, "expiresIn", "expiresIn");

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<jp.tnasu.f1tvnews.model.google.oauth2.Google, com.google.appengine.api.datastore.Key> key = new org.slim3.datastore.CoreAttributeMeta<jp.tnasu.f1tvnews.model.google.oauth2.Google, com.google.appengine.api.datastore.Key>(this, "__key__", "key", com.google.appengine.api.datastore.Key.class);

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<jp.tnasu.f1tvnews.model.google.oauth2.Google, java.util.Date> published = new org.slim3.datastore.CoreAttributeMeta<jp.tnasu.f1tvnews.model.google.oauth2.Google, java.util.Date>(this, "published", "published", java.util.Date.class);

    /** */
    public final org.slim3.datastore.StringAttributeMeta<jp.tnasu.f1tvnews.model.google.oauth2.Google> refreshToken = new org.slim3.datastore.StringAttributeMeta<jp.tnasu.f1tvnews.model.google.oauth2.Google>(this, "refreshToken", "refreshToken");

    /** */
    public final org.slim3.datastore.StringAttributeMeta<jp.tnasu.f1tvnews.model.google.oauth2.Google> tokenType = new org.slim3.datastore.StringAttributeMeta<jp.tnasu.f1tvnews.model.google.oauth2.Google>(this, "tokenType", "tokenType");

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<jp.tnasu.f1tvnews.model.google.oauth2.Google, java.lang.Long> version = new org.slim3.datastore.CoreAttributeMeta<jp.tnasu.f1tvnews.model.google.oauth2.Google, java.lang.Long>(this, "version", "version", java.lang.Long.class);

    private static final GoogleMeta slim3_singleton = new GoogleMeta();

    /**
     * @return the singleton
     */
    public static GoogleMeta get() {
       return slim3_singleton;
    }

    /** */
    public GoogleMeta() {
        super("Google", jp.tnasu.f1tvnews.model.google.oauth2.Google.class);
    }

    @Override
    public jp.tnasu.f1tvnews.model.google.oauth2.Google entityToModel(com.google.appengine.api.datastore.Entity entity) {
        jp.tnasu.f1tvnews.model.google.oauth2.Google model = new jp.tnasu.f1tvnews.model.google.oauth2.Google();
        model.setAccessToken((java.lang.String) entity.getProperty("accessToken"));
        model.setClientId((java.lang.String) entity.getProperty("clientId"));
        model.setError((java.lang.String) entity.getProperty("error"));
        model.setExpiresIn((java.lang.String) entity.getProperty("expiresIn"));
        model.setKey(entity.getKey());
        model.setPublished((java.util.Date) entity.getProperty("published"));
        model.setRefreshToken((java.lang.String) entity.getProperty("refreshToken"));
        model.setTokenType((java.lang.String) entity.getProperty("tokenType"));
        model.setVersion((java.lang.Long) entity.getProperty("version"));
        return model;
    }

    @Override
    public com.google.appengine.api.datastore.Entity modelToEntity(java.lang.Object model) {
        jp.tnasu.f1tvnews.model.google.oauth2.Google m = (jp.tnasu.f1tvnews.model.google.oauth2.Google) model;
        com.google.appengine.api.datastore.Entity entity = null;
        if (m.getKey() != null) {
            entity = new com.google.appengine.api.datastore.Entity(m.getKey());
        } else {
            entity = new com.google.appengine.api.datastore.Entity(kind);
        }
        entity.setProperty("accessToken", m.getAccessToken());
        entity.setProperty("clientId", m.getClientId());
        entity.setProperty("error", m.getError());
        entity.setProperty("expiresIn", m.getExpiresIn());
        entity.setProperty("published", m.getPublished());
        entity.setProperty("refreshToken", m.getRefreshToken());
        entity.setProperty("tokenType", m.getTokenType());
        entity.setProperty("version", m.getVersion());
        entity.setProperty("slim3.schemaVersion", 1);
        return entity;
    }

    @Override
    protected com.google.appengine.api.datastore.Key getKey(Object model) {
        jp.tnasu.f1tvnews.model.google.oauth2.Google m = (jp.tnasu.f1tvnews.model.google.oauth2.Google) model;
        return m.getKey();
    }

    @Override
    protected void setKey(Object model, com.google.appengine.api.datastore.Key key) {
        validateKey(key);
        jp.tnasu.f1tvnews.model.google.oauth2.Google m = (jp.tnasu.f1tvnews.model.google.oauth2.Google) model;
        m.setKey(key);
    }

    @Override
    protected long getVersion(Object model) {
        jp.tnasu.f1tvnews.model.google.oauth2.Google m = (jp.tnasu.f1tvnews.model.google.oauth2.Google) model;
        return m.getVersion() != null ? m.getVersion().longValue() : 0L;
    }

    @Override
    protected void assignKeyToModelRefIfNecessary(com.google.appengine.api.datastore.AsyncDatastoreService ds, java.lang.Object model) {
    }

    @Override
    protected void incrementVersion(Object model) {
        jp.tnasu.f1tvnews.model.google.oauth2.Google m = (jp.tnasu.f1tvnews.model.google.oauth2.Google) model;
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
        jp.tnasu.f1tvnews.model.google.oauth2.Google m = (jp.tnasu.f1tvnews.model.google.oauth2.Google) model;
        writer.beginObject();
        org.slim3.datastore.json.Default encoder0 = new org.slim3.datastore.json.Default();
        if(m.getAccessToken() != null){
            writer.setNextPropertyName("access_token");
            encoder0.encode(writer, m.getAccessToken());
        }
        if(m.getClientId() != null){
            writer.setNextPropertyName("clientId");
            encoder0.encode(writer, m.getClientId());
        }
        if(m.getError() != null){
            writer.setNextPropertyName("error");
            encoder0.encode(writer, m.getError());
        }
        if(m.getExpiresIn() != null){
            writer.setNextPropertyName("expires_in");
            encoder0.encode(writer, m.getExpiresIn());
        }
        if(m.getKey() != null){
            writer.setNextPropertyName("key");
            encoder0.encode(writer, m.getKey());
        }
        if(m.getPublished() != null){
            writer.setNextPropertyName("published");
            encoder0.encode(writer, m.getPublished());
        }
        if(m.getRefreshToken() != null){
            writer.setNextPropertyName("refresh_token");
            encoder0.encode(writer, m.getRefreshToken());
        }
        if(m.getTokenType() != null){
            writer.setNextPropertyName("token_type");
            encoder0.encode(writer, m.getTokenType());
        }
        if(m.getVersion() != null){
            writer.setNextPropertyName("version");
            encoder0.encode(writer, m.getVersion());
        }
        writer.endObject();
    }

    @Override
    protected jp.tnasu.f1tvnews.model.google.oauth2.Google jsonToModel(org.slim3.datastore.json.JsonRootReader rootReader, int maxDepth, int currentDepth) {
        jp.tnasu.f1tvnews.model.google.oauth2.Google m = new jp.tnasu.f1tvnews.model.google.oauth2.Google();
        org.slim3.datastore.json.JsonReader reader = null;
        org.slim3.datastore.json.Default decoder0 = new org.slim3.datastore.json.Default();
        reader = rootReader.newObjectReader("access_token");
        m.setAccessToken(decoder0.decode(reader, m.getAccessToken()));
        reader = rootReader.newObjectReader("clientId");
        m.setClientId(decoder0.decode(reader, m.getClientId()));
        reader = rootReader.newObjectReader("error");
        m.setError(decoder0.decode(reader, m.getError()));
        reader = rootReader.newObjectReader("expires_in");
        m.setExpiresIn(decoder0.decode(reader, m.getExpiresIn()));
        reader = rootReader.newObjectReader("key");
        m.setKey(decoder0.decode(reader, m.getKey()));
        reader = rootReader.newObjectReader("published");
        m.setPublished(decoder0.decode(reader, m.getPublished()));
        reader = rootReader.newObjectReader("refresh_token");
        m.setRefreshToken(decoder0.decode(reader, m.getRefreshToken()));
        reader = rootReader.newObjectReader("token_type");
        m.setTokenType(decoder0.decode(reader, m.getTokenType()));
        reader = rootReader.newObjectReader("version");
        m.setVersion(decoder0.decode(reader, m.getVersion()));
        return m;
    }
}