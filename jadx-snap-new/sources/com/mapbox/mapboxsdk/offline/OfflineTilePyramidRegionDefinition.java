package com.mapbox.mapboxsdk.offline;

import com.mapbox.mapboxsdk.geometry.LatLngBounds;

public class OfflineTilePyramidRegionDefinition implements OfflineRegionDefinition {
    private LatLngBounds bounds;
    private double maxZoom;
    private double minZoom;
    private float pixelRatio;
    private String styleURL;

    public OfflineTilePyramidRegionDefinition(String str, LatLngBounds latLngBounds, double d, double d2, float f) {
        this.styleURL = str;
        this.bounds = latLngBounds;
        this.minZoom = d;
        this.maxZoom = d2;
        this.pixelRatio = f;
    }

    public LatLngBounds getBounds() {
        return this.bounds;
    }

    public double getMaxZoom() {
        return this.maxZoom;
    }

    public double getMinZoom() {
        return this.minZoom;
    }

    public float getPixelRatio() {
        return this.pixelRatio;
    }

    public String getStyleURL() {
        return this.styleURL;
    }
}
