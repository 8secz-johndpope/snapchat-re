package com.mapbox.mapboxsdk.maps;

import android.location.Location;
import com.mapbox.services.android.telemetry.MapboxEvent;
import java.util.Hashtable;

class MapboxEventWrapper {
    MapboxEventWrapper() {
    }

    static Hashtable<String, Object> buildMapClickEvent(Location location, String str, Transform transform) {
        try {
            return MapboxEvent.buildMapClickEvent(location, str, transform.getZoom());
        } catch (NullPointerException unused) {
            return null;
        }
    }

    static Hashtable<String, Object> buildMapDragEndEvent(Location location, Transform transform) {
        try {
            return MapboxEvent.buildMapDragEndEvent(location, transform.getZoom());
        } catch (NullPointerException unused) {
            return null;
        }
    }

    static Hashtable<String, Object> buildMapLoadEvent() {
        return MapboxEvent.buildMapLoadEvent();
    }
}
