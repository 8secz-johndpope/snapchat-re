package com.mapbox.mapboxsdk.annotations;

import com.mapbox.mapboxsdk.maps.MapboxMap;

public final class Polyline extends BasePointCollection {
    private int color = -16777216;
    private float width = 10.0f;

    Polyline() {
    }

    public final int getColor() {
        return this.color;
    }

    public final float getWidth() {
        return this.width;
    }

    public final void setColor(int i) {
        this.color = i;
        update();
    }

    public final void setWidth(float f) {
        this.width = f;
        update();
    }

    /* Access modifiers changed, original: final */
    public final void update() {
        MapboxMap mapboxMap = getMapboxMap();
        if (mapboxMap != null) {
            mapboxMap.updatePolyline(this);
        }
    }
}
