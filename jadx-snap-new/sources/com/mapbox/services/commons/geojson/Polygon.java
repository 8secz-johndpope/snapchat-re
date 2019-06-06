package com.mapbox.services.commons.geojson;

import com.google.gson.GsonBuilder;
import com.mapbox.services.commons.geojson.custom.PositionDeserializer;
import com.mapbox.services.commons.geojson.custom.PositionSerializer;
import com.mapbox.services.commons.models.Position;
import java.util.ArrayList;
import java.util.List;

public class Polygon implements Geometry<List<List<Position>>> {
    private List<List<Position>> coordinates;
    private final String type = "Polygon";

    private Polygon(List<List<Position>> list) {
        this.coordinates = list;
    }

    public static Polygon fromCoordinates(List<List<Position>> list) {
        return new Polygon(list);
    }

    public static Polygon fromCoordinates(double[][][] dArr) {
        List arrayList = new ArrayList(dArr.length);
        for (int i = 0; i < dArr.length; i++) {
            ArrayList arrayList2 = new ArrayList(dArr[i].length);
            for (double[] fromCoordinates : dArr[i]) {
                arrayList2.add(Position.fromCoordinates(fromCoordinates));
            }
            arrayList.add(arrayList2);
        }
        return fromCoordinates(arrayList);
    }

    public static Polygon fromJson(String str) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(Position.class, new PositionDeserializer());
        return (Polygon) gsonBuilder.create().fromJson(str, Polygon.class);
    }

    public List<List<Position>> getCoordinates() {
        return this.coordinates;
    }

    public String getType() {
        return "Polygon";
    }

    public void setCoordinates(List<List<Position>> list) {
        this.coordinates = list;
    }

    public String toJson() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(Position.class, new PositionSerializer());
        return gsonBuilder.create().toJson((Object) this);
    }
}
