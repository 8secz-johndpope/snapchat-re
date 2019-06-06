package com.mapbox.mapboxsdk.camera;

import com.mapbox.mapboxsdk.maps.MapboxMap;

public interface CameraUpdate {
    CameraPosition getCameraPosition(MapboxMap mapboxMap);
}
