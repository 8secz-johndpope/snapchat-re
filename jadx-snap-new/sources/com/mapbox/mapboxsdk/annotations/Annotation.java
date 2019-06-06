package com.mapbox.mapboxsdk.annotations;

import com.mapbox.mapboxsdk.maps.MapView;
import com.mapbox.mapboxsdk.maps.MapboxMap;

public abstract class Annotation implements Comparable<Annotation> {
    private long id = -1;
    protected MapView mapView;
    protected MapboxMap mapboxMap;

    protected Annotation() {
    }

    public int compareTo(Annotation annotation) {
        return this.id < annotation.getId() ? 1 : this.id > annotation.getId() ? -1 : 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof Annotation)) {
            if (this.id == ((Annotation) obj).getId()) {
                return true;
            }
        }
        return false;
    }

    public long getId() {
        return this.id;
    }

    /* Access modifiers changed, original: protected */
    public MapView getMapView() {
        return this.mapView;
    }

    /* Access modifiers changed, original: protected */
    public MapboxMap getMapboxMap() {
        return this.mapboxMap;
    }

    public int hashCode() {
        return (int) (getId() ^ (getId() >>> 32));
    }

    public void remove() {
        MapboxMap mapboxMap = this.mapboxMap;
        if (mapboxMap != null) {
            mapboxMap.removeAnnotation(this);
        }
    }

    public void setId(long j) {
        this.id = j;
    }

    public void setMapView(MapView mapView) {
        this.mapView = mapView;
    }

    public void setMapboxMap(MapboxMap mapboxMap) {
        this.mapboxMap = mapboxMap;
    }
}
