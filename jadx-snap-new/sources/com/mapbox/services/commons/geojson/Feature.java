package com.mapbox.services.commons.geojson;

import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mapbox.services.commons.geojson.custom.GeometryDeserializer;
import com.mapbox.services.commons.geojson.custom.PositionDeserializer;
import com.mapbox.services.commons.geojson.custom.PositionSerializer;
import com.mapbox.services.commons.models.Position;

public class Feature implements GeoJSON {
    private Geometry geometry;
    private String id;
    private JsonObject properties;
    private final String type = "Feature";

    protected Feature(Geometry geometry, JsonObject jsonObject, String str) {
        this.geometry = geometry;
        this.properties = jsonObject;
        this.id = str;
    }

    public static Feature fromGeometry(Geometry geometry) {
        return new Feature(geometry, new JsonObject(), null);
    }

    public static Feature fromGeometry(Geometry geometry, JsonObject jsonObject) {
        return new Feature(geometry, jsonObject, null);
    }

    public static Feature fromGeometry(Geometry geometry, JsonObject jsonObject, String str) {
        return new Feature(geometry, jsonObject, str);
    }

    public static Feature fromJson(String str) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(Position.class, new PositionDeserializer());
        gsonBuilder.registerTypeAdapter(Geometry.class, new GeometryDeserializer());
        return (Feature) gsonBuilder.create().fromJson(str, Feature.class);
    }

    public void addBooleanProperty(String str, Boolean bool) {
        getProperties().addProperty(str, bool);
    }

    public void addCharacterProperty(String str, Character ch) {
        getProperties().addProperty(str, ch);
    }

    public void addNumberProperty(String str, Number number) {
        getProperties().addProperty(str, number);
    }

    public void addProperty(String str, JsonElement jsonElement) {
        getProperties().add(str, jsonElement);
    }

    public void addStringProperty(String str, String str2) {
        getProperties().addProperty(str, str2);
    }

    public Boolean getBooleanProperty(String str) {
        return Boolean.valueOf(getProperties().get(str).getAsBoolean());
    }

    public Character getCharacterProperty(String str) {
        return Character.valueOf(getProperties().get(str).getAsCharacter());
    }

    public Geometry getGeometry() {
        return this.geometry;
    }

    public String getId() {
        return this.id;
    }

    public Number getNumberProperty(String str) {
        return getProperties().get(str).getAsNumber();
    }

    public JsonObject getProperties() {
        if (this.properties == null) {
            this.properties = new JsonObject();
        }
        return this.properties;
    }

    public JsonElement getProperty(String str) {
        return getProperties().get(str);
    }

    public String getStringProperty(String str) {
        return getProperties().get(str).getAsString();
    }

    public String getType() {
        return "Feature";
    }

    public boolean hasNonNullValueForProperty(String str) {
        return hasProperty(str) && !getProperty(str).isJsonNull();
    }

    public boolean hasProperty(String str) {
        return getProperties().has(str);
    }

    public JsonElement removeProperty(String str) {
        return getProperties().remove(str);
    }

    public void setGeometry(Geometry geometry) {
        this.geometry = geometry;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setProperties(JsonObject jsonObject) {
        this.properties = jsonObject;
    }

    public String toJson() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(Position.class, new PositionSerializer());
        return gsonBuilder.create().toJson((Object) this);
    }
}
