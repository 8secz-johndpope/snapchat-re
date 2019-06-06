package com.mapbox.services.android.telemetry.navigation;

import android.location.Location;
import android.util.JsonToken;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;
import org.json.JSONArray;
import org.json.JSONObject;

public class NavigationLocation {
    private static final String ACCURACY = "horizontalAccuracy";
    private static final String ALTITUDE = "altitude";
    private static final String COURSE = "course";
    private static final String LATITUDE = "lat";
    private static final String LONGITUDE = "lng";
    private static final String SPEED = "speed";
    private static final String TIMESTAMP = "timestamp";
    private static final String UTC_TIME_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSSZ";

    private static String formatLocationTime(Location location) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(UTC_TIME_FORMAT, Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return simpleDateFormat.format(new Date(location.getTime()));
    }

    private JSONObject serializeToJson(Location location) {
        formatLocationTime(location);
        HashMap hashMap = new HashMap();
        hashMap.put("altitude", location.hasAltitude() ? Double.valueOf(location.getAltitude()) : JsonToken.NULL);
        hashMap.put("horizontalAccuracy", location.hasAccuracy() ? Float.valueOf(location.getAccuracy()) : JsonToken.NULL);
        hashMap.put(COURSE, location.hasBearing() ? Float.valueOf(location.getBearing()) : JsonToken.NULL);
        hashMap.put(SPEED, location.hasSpeed() ? Float.valueOf(location.getSpeed()) : JsonToken.NULL);
        hashMap.put("lat", Double.valueOf(location.getLatitude()));
        hashMap.put("lng", Double.valueOf(location.getLongitude()));
        hashMap.put("timestamp", formatLocationTime(location));
        return new JSONObject(hashMap);
    }

    public JSONArray getSerializedJson(Location[] locationArr) {
        JSONArray jSONArray = new JSONArray();
        for (Location serializeToJson : locationArr) {
            jSONArray.put(serializeToJson(serializeToJson));
        }
        return jSONArray;
    }
}
