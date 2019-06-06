package com.mapbox.services.commons.geojson;

import com.google.gson.GsonBuilder;
import com.mapbox.services.commons.geojson.custom.PositionDeserializer;
import com.mapbox.services.commons.geojson.custom.PositionSerializer;
import com.mapbox.services.commons.models.Position;
import com.mapbox.services.commons.utils.PolylineUtils;
import java.util.ArrayList;
import java.util.List;

public class LineString implements Geometry<List<Position>> {
    private List<Position> coordinates;
    private final String type = "LineString";

    private LineString(List<Position> list) {
        this.coordinates = list;
    }

    public static LineString fromCoordinates(List<Position> list) {
        return new LineString(list);
    }

    public static LineString fromCoordinates(double[][] dArr) {
        List arrayList = new ArrayList(dArr.length);
        for (double[] fromCoordinates : dArr) {
            arrayList.add(Position.fromCoordinates(fromCoordinates));
        }
        return fromCoordinates(arrayList);
    }

    public static LineString fromJson(String str) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(Position.class, new PositionDeserializer());
        return (LineString) gsonBuilder.create().fromJson(str, LineString.class);
    }

    public static LineString fromPolyline(String str, int i) {
        return new LineString(PolylineUtils.decode(str, i));
    }

    public List<Position> getCoordinates() {
        return this.coordinates;
    }

    public String getType() {
        return "LineString";
    }

    public void setCoordinates(List<Position> list) {
        this.coordinates = list;
    }

    public String toJson() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(Position.class, new PositionSerializer());
        return gsonBuilder.create().toJson((Object) this);
    }

    public String toPolyline(int i) {
        return PolylineUtils.encode(getCoordinates(), i);
    }
}
