package com.mapbox.services.commons.geojson;

import com.google.gson.GsonBuilder;
import com.mapbox.services.commons.geojson.custom.GeometryDeserializer;
import com.mapbox.services.commons.geojson.custom.PositionDeserializer;
import com.mapbox.services.commons.geojson.custom.PositionSerializer;
import com.mapbox.services.commons.models.Position;
import java.util.List;

public class GeometryCollection implements GeoJSON {
    private final List<Geometry> geometries;
    private final String type = "GeometryCollection";

    public GeometryCollection(List<Geometry> list) {
        this.geometries = list;
    }

    public static GeometryCollection fromGeometries(List<Geometry> list) {
        return new GeometryCollection(list);
    }

    public static GeometryCollection fromJson(String str) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(Position.class, new PositionDeserializer());
        gsonBuilder.registerTypeAdapter(Geometry.class, new GeometryDeserializer());
        return (GeometryCollection) gsonBuilder.create().fromJson(str, GeometryCollection.class);
    }

    public List<Geometry> getGeometries() {
        return this.geometries;
    }

    public String getType() {
        return "GeometryCollection";
    }

    public String toJson() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(Position.class, new PositionSerializer());
        return gsonBuilder.create().toJson((Object) this);
    }
}
