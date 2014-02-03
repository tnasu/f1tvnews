package jp.tnasu.f1tvnews.meta.google.calendar;

//@javax.annotation.Generated(value = { "slim3-gen", "@VERSION@" }, date = "2014-02-04 00:09:55")
/** */
public final class EventMeta extends org.slim3.datastore.ModelMeta<jp.tnasu.f1tvnews.model.google.calendar.Event> {

    /** */
    public final org.slim3.datastore.StringAttributeMeta<jp.tnasu.f1tvnews.model.google.calendar.Event> attendees = new org.slim3.datastore.StringAttributeMeta<jp.tnasu.f1tvnews.model.google.calendar.Event>(this, "attendees", "attendees");

    /** */
    public final org.slim3.datastore.StringAttributeMeta<jp.tnasu.f1tvnews.model.google.calendar.Event> colorId = new org.slim3.datastore.StringAttributeMeta<jp.tnasu.f1tvnews.model.google.calendar.Event>(this, "colorId", "colorId");

    /** */
    public final org.slim3.datastore.StringAttributeMeta<jp.tnasu.f1tvnews.model.google.calendar.Event> description = new org.slim3.datastore.StringAttributeMeta<jp.tnasu.f1tvnews.model.google.calendar.Event>(this, "description", "description");

    /** */
    public final org.slim3.datastore.ModelRefAttributeMeta<jp.tnasu.f1tvnews.model.google.calendar.Event, org.slim3.datastore.ModelRef<jp.tnasu.f1tvnews.model.google.calendar.EventDate>, jp.tnasu.f1tvnews.model.google.calendar.EventDate> end = new org.slim3.datastore.ModelRefAttributeMeta<jp.tnasu.f1tvnews.model.google.calendar.Event, org.slim3.datastore.ModelRef<jp.tnasu.f1tvnews.model.google.calendar.EventDate>, jp.tnasu.f1tvnews.model.google.calendar.EventDate>(this, "end", "end", org.slim3.datastore.ModelRef.class, jp.tnasu.f1tvnews.model.google.calendar.EventDate.class);

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<jp.tnasu.f1tvnews.model.google.calendar.Event, com.google.appengine.api.datastore.Key> key = new org.slim3.datastore.CoreAttributeMeta<jp.tnasu.f1tvnews.model.google.calendar.Event, com.google.appengine.api.datastore.Key>(this, "__key__", "key", com.google.appengine.api.datastore.Key.class);

    /** */
    public final org.slim3.datastore.StringAttributeMeta<jp.tnasu.f1tvnews.model.google.calendar.Event> location = new org.slim3.datastore.StringAttributeMeta<jp.tnasu.f1tvnews.model.google.calendar.Event>(this, "location", "location");

    /** */
    public final org.slim3.datastore.StringAttributeMeta<jp.tnasu.f1tvnews.model.google.calendar.Event> reminders = new org.slim3.datastore.StringAttributeMeta<jp.tnasu.f1tvnews.model.google.calendar.Event>(this, "reminders", "reminders");

    /** */
    public final org.slim3.datastore.ModelRefAttributeMeta<jp.tnasu.f1tvnews.model.google.calendar.Event, org.slim3.datastore.ModelRef<jp.tnasu.f1tvnews.model.google.calendar.EventDate>, jp.tnasu.f1tvnews.model.google.calendar.EventDate> start = new org.slim3.datastore.ModelRefAttributeMeta<jp.tnasu.f1tvnews.model.google.calendar.Event, org.slim3.datastore.ModelRef<jp.tnasu.f1tvnews.model.google.calendar.EventDate>, jp.tnasu.f1tvnews.model.google.calendar.EventDate>(this, "start", "start", org.slim3.datastore.ModelRef.class, jp.tnasu.f1tvnews.model.google.calendar.EventDate.class);

    /** */
    public final org.slim3.datastore.StringAttributeMeta<jp.tnasu.f1tvnews.model.google.calendar.Event> summary = new org.slim3.datastore.StringAttributeMeta<jp.tnasu.f1tvnews.model.google.calendar.Event>(this, "summary", "summary");

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<jp.tnasu.f1tvnews.model.google.calendar.Event, java.lang.Long> version = new org.slim3.datastore.CoreAttributeMeta<jp.tnasu.f1tvnews.model.google.calendar.Event, java.lang.Long>(this, "version", "version", java.lang.Long.class);

    private static final EventMeta slim3_singleton = new EventMeta();

    /**
     * @return the singleton
     */
    public static EventMeta get() {
       return slim3_singleton;
    }

    /** */
    public EventMeta() {
        super("Event", jp.tnasu.f1tvnews.model.google.calendar.Event.class);
    }

    @Override
    public jp.tnasu.f1tvnews.model.google.calendar.Event entityToModel(com.google.appengine.api.datastore.Entity entity) {
        jp.tnasu.f1tvnews.model.google.calendar.Event model = new jp.tnasu.f1tvnews.model.google.calendar.Event();
        model.setAttendees((java.lang.String) entity.getProperty("attendees"));
        model.setColorId((java.lang.String) entity.getProperty("colorId"));
        model.setDescription((java.lang.String) entity.getProperty("description"));
        if (model.getEnd() == null) {
            throw new NullPointerException("The property(end) is null.");
        }
        model.getEnd().setKey((com.google.appengine.api.datastore.Key) entity.getProperty("end"));
        model.setKey(entity.getKey());
        model.setLocation((java.lang.String) entity.getProperty("location"));
        model.setReminders((java.lang.String) entity.getProperty("reminders"));
        if (model.getStart() == null) {
            throw new NullPointerException("The property(start) is null.");
        }
        model.getStart().setKey((com.google.appengine.api.datastore.Key) entity.getProperty("start"));
        model.setSummary((java.lang.String) entity.getProperty("summary"));
        model.setVersion((java.lang.Long) entity.getProperty("version"));
        return model;
    }

    @Override
    public com.google.appengine.api.datastore.Entity modelToEntity(java.lang.Object model) {
        jp.tnasu.f1tvnews.model.google.calendar.Event m = (jp.tnasu.f1tvnews.model.google.calendar.Event) model;
        com.google.appengine.api.datastore.Entity entity = null;
        if (m.getKey() != null) {
            entity = new com.google.appengine.api.datastore.Entity(m.getKey());
        } else {
            entity = new com.google.appengine.api.datastore.Entity(kind);
        }
        entity.setProperty("attendees", m.getAttendees());
        entity.setProperty("colorId", m.getColorId());
        entity.setProperty("description", m.getDescription());
        if (m.getEnd() == null) {
            throw new NullPointerException("The property(end) must not be null.");
        }
        entity.setProperty("end", m.getEnd().getKey());
        entity.setProperty("location", m.getLocation());
        entity.setProperty("reminders", m.getReminders());
        if (m.getStart() == null) {
            throw new NullPointerException("The property(start) must not be null.");
        }
        entity.setProperty("start", m.getStart().getKey());
        entity.setProperty("summary", m.getSummary());
        entity.setProperty("version", m.getVersion());
        entity.setProperty("slim3.schemaVersion", 1);
        return entity;
    }

    @Override
    protected com.google.appengine.api.datastore.Key getKey(Object model) {
        jp.tnasu.f1tvnews.model.google.calendar.Event m = (jp.tnasu.f1tvnews.model.google.calendar.Event) model;
        return m.getKey();
    }

    @Override
    protected void setKey(Object model, com.google.appengine.api.datastore.Key key) {
        validateKey(key);
        jp.tnasu.f1tvnews.model.google.calendar.Event m = (jp.tnasu.f1tvnews.model.google.calendar.Event) model;
        m.setKey(key);
    }

    @Override
    protected long getVersion(Object model) {
        jp.tnasu.f1tvnews.model.google.calendar.Event m = (jp.tnasu.f1tvnews.model.google.calendar.Event) model;
        return m.getVersion() != null ? m.getVersion().longValue() : 0L;
    }

    @Override
    protected void assignKeyToModelRefIfNecessary(com.google.appengine.api.datastore.AsyncDatastoreService ds, java.lang.Object model) {
        jp.tnasu.f1tvnews.model.google.calendar.Event m = (jp.tnasu.f1tvnews.model.google.calendar.Event) model;
        if (m.getEnd() == null) {
            throw new NullPointerException("The property(end) must not be null.");
        }
        m.getEnd().assignKeyIfNecessary(ds);
        if (m.getStart() == null) {
            throw new NullPointerException("The property(start) must not be null.");
        }
        m.getStart().assignKeyIfNecessary(ds);
    }

    @Override
    protected void incrementVersion(Object model) {
        jp.tnasu.f1tvnews.model.google.calendar.Event m = (jp.tnasu.f1tvnews.model.google.calendar.Event) model;
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
        jp.tnasu.f1tvnews.model.google.calendar.Event m = (jp.tnasu.f1tvnews.model.google.calendar.Event) model;
        writer.beginObject();
        org.slim3.datastore.json.Default encoder0 = new org.slim3.datastore.json.Default();
        if(m.getAttendees() != null){
            writer.setNextPropertyName("attendees");
            encoder0.encode(writer, m.getAttendees());
        }
        if(m.getColorId() != null){
            writer.setNextPropertyName("colorId");
            encoder0.encode(writer, m.getColorId());
        }
        if(m.getDescription() != null){
            writer.setNextPropertyName("description");
            encoder0.encode(writer, m.getDescription());
        }
        org.slim3.datastore.json.Expanded encoder1 = new org.slim3.datastore.json.Expanded();
        if(m.getEnd() != null && m.getEnd().getKey() != null){
            writer.setNextPropertyName("end");
            encoder1.encode(writer, m.getEnd(), maxDepth, currentDepth);
        }
        if(m.getKey() != null){
            writer.setNextPropertyName("key");
            encoder0.encode(writer, m.getKey());
        }
        if(m.getLocation() != null){
            writer.setNextPropertyName("location");
            encoder0.encode(writer, m.getLocation());
        }
        if(m.getReminders() != null){
            writer.setNextPropertyName("reminders");
            encoder0.encode(writer, m.getReminders());
        }
        if(m.getStart() != null && m.getStart().getKey() != null){
            writer.setNextPropertyName("start");
            encoder1.encode(writer, m.getStart(), maxDepth, currentDepth);
        }
        if(m.getSummary() != null){
            writer.setNextPropertyName("summary");
            encoder0.encode(writer, m.getSummary());
        }
        if(m.getVersion() != null){
            writer.setNextPropertyName("version");
            encoder0.encode(writer, m.getVersion());
        }
        writer.endObject();
    }

    @Override
    protected jp.tnasu.f1tvnews.model.google.calendar.Event jsonToModel(org.slim3.datastore.json.JsonRootReader rootReader, int maxDepth, int currentDepth) {
        jp.tnasu.f1tvnews.model.google.calendar.Event m = new jp.tnasu.f1tvnews.model.google.calendar.Event();
        org.slim3.datastore.json.JsonReader reader = null;
        org.slim3.datastore.json.Default decoder0 = new org.slim3.datastore.json.Default();
        reader = rootReader.newObjectReader("attendees");
        m.setAttendees(decoder0.decode(reader, m.getAttendees()));
        reader = rootReader.newObjectReader("colorId");
        m.setColorId(decoder0.decode(reader, m.getColorId()));
        reader = rootReader.newObjectReader("description");
        m.setDescription(decoder0.decode(reader, m.getDescription()));
        reader = rootReader.newObjectReader("end");
        org.slim3.datastore.json.Expanded decoder1 = new org.slim3.datastore.json.Expanded();
        decoder1.decode(reader, m.getEnd(), maxDepth, currentDepth);
        reader = rootReader.newObjectReader("key");
        m.setKey(decoder0.decode(reader, m.getKey()));
        reader = rootReader.newObjectReader("location");
        m.setLocation(decoder0.decode(reader, m.getLocation()));
        reader = rootReader.newObjectReader("reminders");
        m.setReminders(decoder0.decode(reader, m.getReminders()));
        reader = rootReader.newObjectReader("start");
        decoder1.decode(reader, m.getStart(), maxDepth, currentDepth);
        reader = rootReader.newObjectReader("summary");
        m.setSummary(decoder0.decode(reader, m.getSummary()));
        reader = rootReader.newObjectReader("version");
        m.setVersion(decoder0.decode(reader, m.getVersion()));
        return m;
    }
}