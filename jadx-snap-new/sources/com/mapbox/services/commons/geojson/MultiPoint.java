package com.mapbox.services.commons.geojson;

import com.google.gson.GsonBuilder;
import com.mapbox.services.commons.geojson.custom.PositionDeserializer;
import com.mapbox.services.commons.geojson.custom.PositionSerializer;
import com.mapbox.services.commons.models.Position;
import java.util.ArrayList;
import java.util.List;

public class MultiPoint implements Geometry<List<Position>> {
    private List<Position> coordinates;
    private final String type = "MultiPoint";

    private MultiPoint(List<Position> list) {
        this.coordinates = list;
    }

    public static MultiPoint fromCoordinates(List<Position> list) {
        return new MultiPoint(list);
    }

    public static MultiPoint fromCoordinates(double[][] dArr) {
        List arrayList = new ArrayList(dArr.length);
        for (double[] fromCoordinates : dArr) {
            arrayList.add(Position.fromCoordinates(fromCoordinates));
        }
        return fromCoordinates(arrayList);
    }

    public static MultiPoint fromJson(String str) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(Position.class, new PositionDeserializer());
        return (MultiPoint) gsonBuilder.create().fromJson(str, MultiPoint.class);
    }

    public List<Position> getCoordinates() {
        return this.coordinates;
    }

    public String getType() {
        return "MultiPoint";
    }

    public void setCoordinates(List<Position> list) {
        this.coordinates = list;
    }

    public String toJson() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(Position.class, new PositionSerializer());
        return gsonBuilder.create().toJson((Object) this);
    }
}
