package com.mapbox.services.commons.geojson;

import com.google.gson.GsonBuilder;
import com.mapbox.services.commons.geojson.custom.PositionDeserializer;
import com.mapbox.services.commons.geojson.custom.PositionSerializer;
import com.mapbox.services.commons.models.Position;
import java.util.ArrayList;
import java.util.List;

public class MultiLineString implements Geometry<List<List<Position>>> {
    private List<List<Position>> coordinates;
    private final String type = "MultiLineString";

    private MultiLineString(List<List<Position>> list) {
        this.coordinates = list;
    }

    public static MultiLineString fromCoordinates(List<List<Position>> list) {
        return new MultiLineString(list);
    }

    public static MultiLineString fromCoordinates(double[][][] dArr) {
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

    public static MultiLineString fromJson(String str) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(Position.class, new PositionDeserializer());
        return (MultiLineString) gsonBuilder.create().fromJson(str, MultiLineString.class);
    }

    public List<List<Position>> getCoordinates() {
        return this.coordinates;
    }

    public String getType() {
        return "MultiLineString";
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
