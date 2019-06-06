package com.mapbox.services.commons.geojson.custom;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.mapbox.services.commons.geojson.Geometry;
import java.lang.reflect.Type;

public class GeometryDeserializer implements JsonDeserializer<Geometry> {
    public Geometry deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        try {
            return (Geometry) jsonDeserializationContext.deserialize(jsonElement, Class.forName("com.mapbox.services.commons.geojson.".concat(String.valueOf(jsonElement.getAsJsonObject().get("type").getAsString()))));
        } catch (ClassNotFoundException e) {
            throw new JsonParseException(e);
        }
    }
}
