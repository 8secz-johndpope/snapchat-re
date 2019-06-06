package com.mapbox.services.commons.geojson;

import com.google.gson.GsonBuilder;
import com.mapbox.services.commons.geojson.custom.PositionDeserializer;
import com.mapbox.services.commons.geojson.custom.PositionSerializer;
import com.mapbox.services.commons.models.Position;
import java.util.ArrayList;
import java.util.List;

public class MultiPolygon implements Geometry<List<List<List<Position>>>> {
    private List<List<List<Position>>> coordinates;
    private final String type = "MultiPolygon";

    private MultiPolygon(List<List<List<Position>>> list) {
        this.coordinates = list;
    }

    public static MultiPolygon fromCoordinates(List<List<List<Position>>> list) {
        return new MultiPolygon(list);
    }

    public static MultiPolygon fromCoordinates(double[][][][] dArr) {
        List arrayList = new ArrayList(dArr.length);
        for (int i = 0; i < dArr.length; i++) {
            ArrayList arrayList2 = new ArrayList(dArr[i].length);
            for (int i2 = 0; i2 < dArr[i].length; i2++) {
                ArrayList arrayList3 = new ArrayList(dArr[i][i2].length);
                for (double[] fromCoordinates : dArr[i][i2]) {
                    arrayList3.add(Position.fromCoordinates(fromCoordinates));
                }
                arrayList2.add(arrayList3);
            }
            arrayList.add(arrayList2);
        }
        return fromCoordinates(arrayList);
    }

    public static MultiPolygon fromJson(String str) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(Position.class, new PositionDeserializer());
        return (MultiPolygon) gsonBuilder.create().fromJson(str, MultiPolygon.class);
    }

    public List<List<List<Position>>> getCoordinates() {
        return this.coordinates;
    }

    public String getType() {
        return "MultiPolygon";
    }

    public void setCoordinates(List<List<List<Position>>> list) {
        this.coordinates = list;
    }

    public String toJson() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(Position.class, new PositionSerializer());
        return gsonBuilder.create().toJson((Object) this);
    }
}
