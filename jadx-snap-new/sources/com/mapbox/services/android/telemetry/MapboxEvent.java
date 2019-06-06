package com.mapbox.services.android.telemetry;

import android.location.Location;
import com.mapbox.services.android.telemetry.utils.TelemetryUtils;
import java.io.Serializable;
import java.util.Hashtable;

public class MapboxEvent implements Serializable {
    public static final String GESTURE_DOUBLETAP = "DoubleTap";
    public static final String GESTURE_PAN_START = "Pan";
    public static final String GESTURE_PINCH_START = "Pinch";
    public static final String GESTURE_PITCH_START = "Pitch";
    public static final String GESTURE_QUICK_ZOOM = "QuickZoom";
    public static final String GESTURE_ROTATION_START = "Rotation";
    public static final String GESTURE_SINGLETAP = "SingleTap";
    public static final String GESTURE_TWO_FINGER_SINGLETAP = "TwoFingerTap";
    public static final String KEY_ACCESSIBILITY_FONT_SCALE = "accessibilityFontScale";
    public static final String KEY_ALTITUDE = "altitude";
    public static final String KEY_APPLICATION_STATE = "applicationState";
    public static final String KEY_BATTERY_LEVEL = "batteryLevel";
    public static final String KEY_CARRIER = "carrier";
    public static final String KEY_CELLULAR_NETWORK_TYPE = "cellularNetworkType";
    public static final String KEY_CREATED = "created";
    public static final String KEY_ENABLED_TELEMETRY = "enabled.telemetry";
    public static final String KEY_EVENT = "event";
    public static final String KEY_GESTURE_ID = "gesture";
    public static final String KEY_HORIZONTAL_ACCURACY = "horizontalAccuracy";
    public static final String KEY_LATITUDE = "lat";
    public static final String KEY_LONGITUDE = "lng";
    public static final String KEY_MODEL = "model";
    public static final String KEY_OPERATING_SYSTEM = "operatingSystem";
    public static final String KEY_ORIENTATION = "orientation";
    public static final String KEY_PLUGGED_IN = "pluggedIn";
    public static final String KEY_RESOLUTION = "resolution";
    public static final String KEY_SDK_IDENTIFIER = "sdkIdentifier";
    public static final String KEY_SDK_VERSION = "sdkVersion";
    public static final String KEY_SESSION_ID = "sessionId";
    public static final String KEY_SOURCE = "source";
    public static final String KEY_USER_ID = "userId";
    public static final String KEY_WIFI = "wifi";
    public static final String KEY_ZOOM = "zoom";
    public static final String MAPBOX_EVENTS_BASE_URL = "https://snap.events.mapbox.com";
    public static final String MAPBOX_EVENTS_CN_BASE_URL = "https://events.mapbox.cn";
    public static final String SOURCE_MAPBOX = "mapbox";
    public static final String TYPE_LOCATION = "location";
    public static final String TYPE_MAP_CLICK = "map.click";
    public static final String TYPE_MAP_DRAG_END = "map.dragend";
    public static final String TYPE_MAP_LOAD = "map.load";
    public static final String TYPE_TURNSTILE = "appUserTurnstile";

    public static Hashtable<String, Object> buildMapClickEvent(Location location, String str, double d) {
        if (Double.isNaN(location.getLatitude()) || Double.isNaN(location.getLongitude()) || Double.isInfinite(location.getLatitude()) || Double.isInfinite(location.getLongitude())) {
            return null;
        }
        Hashtable hashtable = new Hashtable();
        hashtable.put("event", TYPE_MAP_CLICK);
        hashtable.put("created", TelemetryUtils.generateCreateDate(location));
        hashtable.put(KEY_GESTURE_ID, str);
        hashtable.put("lat", Double.valueOf(location.getLatitude()));
        hashtable.put("lng", Double.valueOf(location.getLongitude()));
        hashtable.put(KEY_ZOOM, Double.valueOf(d));
        return hashtable;
    }

    public static Hashtable<String, Object> buildMapDragEndEvent(Location location, double d) {
        if (Double.isNaN(location.getLatitude()) || Double.isNaN(location.getLongitude()) || Double.isInfinite(location.getLatitude()) || Double.isInfinite(location.getLongitude())) {
            return null;
        }
        Hashtable hashtable = new Hashtable();
        hashtable.put("event", TYPE_MAP_DRAG_END);
        hashtable.put("created", TelemetryUtils.generateCreateDate(location));
        hashtable.put("lat", Double.valueOf(location.getLatitude()));
        hashtable.put("lng", Double.valueOf(location.getLongitude()));
        hashtable.put(KEY_ZOOM, Double.valueOf(d));
        return hashtable;
    }

    public static Hashtable<String, Object> buildMapLoadEvent() {
        Hashtable hashtable = new Hashtable();
        hashtable.put("event", TYPE_MAP_LOAD);
        hashtable.put("created", TelemetryUtils.generateCreateDate(null));
        return hashtable;
    }
}
