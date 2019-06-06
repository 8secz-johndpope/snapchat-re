package com.mapbox.mapboxsdk.annotations;

import android.view.View;
import com.mapbox.mapboxsdk.R;
import com.mapbox.mapboxsdk.geometry.LatLng;
import com.mapbox.mapboxsdk.maps.MapView;
import com.mapbox.mapboxsdk.maps.MapboxMap;
import com.mapbox.mapboxsdk.maps.MapboxMap.InfoWindowAdapter;

public class Marker extends Annotation {
    private Icon icon;
    private String iconId;
    private InfoWindow infoWindow;
    private boolean infoWindowShown;
    private LatLng position;
    private int rightOffsetPixels;
    private String snippet;
    private String title;
    private int topOffsetPixels;

    Marker() {
    }

    public Marker(BaseMarkerOptions baseMarkerOptions) {
        this(baseMarkerOptions.position, baseMarkerOptions.icon, baseMarkerOptions.title, baseMarkerOptions.snippet);
    }

    Marker(BaseMarkerViewOptions baseMarkerViewOptions) {
        this(baseMarkerViewOptions.position, baseMarkerViewOptions.icon, baseMarkerViewOptions.title, baseMarkerViewOptions.snippet);
    }

    Marker(LatLng latLng, Icon icon, String str, String str2) {
        this.position = latLng;
        this.title = str;
        this.snippet = str2;
        setIcon(icon);
    }

    private InfoWindow getInfoWindow(MapView mapView) {
        if (this.infoWindow == null && mapView.getContext() != null) {
            this.infoWindow = new InfoWindow(mapView, R.layout.mapbox_infowindow_content, getMapboxMap());
        }
        return this.infoWindow;
    }

    private void refreshInfoWindowContent() {
        if (isInfoWindowShown() && this.mapView != null && this.mapboxMap != null && this.mapboxMap.getInfoWindowAdapter() == null) {
            InfoWindow infoWindow = getInfoWindow(this.mapView);
            if (this.mapView.getContext() != null) {
                infoWindow.adaptDefaultMarker(this, this.mapboxMap, this.mapView);
            }
            MapboxMap mapboxMap = getMapboxMap();
            if (mapboxMap != null) {
                mapboxMap.updateMarker(this);
            }
            infoWindow.update();
        }
    }

    private InfoWindow showInfoWindow(InfoWindow infoWindow, MapView mapView) {
        infoWindow.open(mapView, this, getPosition(), this.rightOffsetPixels, this.topOffsetPixels);
        this.infoWindowShown = true;
        return infoWindow;
    }

    public Icon getIcon() {
        return this.icon;
    }

    public InfoWindow getInfoWindow() {
        return this.infoWindow;
    }

    public LatLng getPosition() {
        return this.position;
    }

    public String getSnippet() {
        return this.snippet;
    }

    public String getTitle() {
        return this.title;
    }

    public void hideInfoWindow() {
        InfoWindow infoWindow = this.infoWindow;
        if (infoWindow != null) {
            infoWindow.close();
        }
        this.infoWindowShown = false;
    }

    public boolean isInfoWindowShown() {
        return this.infoWindowShown;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
        this.iconId = icon != null ? icon.getId() : null;
        MapboxMap mapboxMap = getMapboxMap();
        if (mapboxMap != null) {
            mapboxMap.updateMarker(this);
        }
    }

    public void setPosition(LatLng latLng) {
        this.position = latLng;
        MapboxMap mapboxMap = getMapboxMap();
        if (mapboxMap != null) {
            mapboxMap.updateMarker(this);
        }
    }

    public void setRightOffsetPixels(int i) {
        this.rightOffsetPixels = i;
    }

    public void setSnippet(String str) {
        this.snippet = str;
        refreshInfoWindowContent();
    }

    public void setTitle(String str) {
        this.title = str;
        refreshInfoWindowContent();
    }

    public void setTopOffsetPixels(int i) {
        this.topOffsetPixels = i;
    }

    public InfoWindow showInfoWindow(MapboxMap mapboxMap, MapView mapView) {
        setMapboxMap(mapboxMap);
        setMapView(mapView);
        InfoWindowAdapter infoWindowAdapter = getMapboxMap().getInfoWindowAdapter();
        if (infoWindowAdapter != null) {
            View infoWindow = infoWindowAdapter.getInfoWindow(this);
            if (infoWindow != null) {
                this.infoWindow = new InfoWindow(infoWindow, mapboxMap);
                showInfoWindow(this.infoWindow, mapView);
                return this.infoWindow;
            }
        }
        InfoWindow infoWindow2 = getInfoWindow(mapView);
        if (mapView.getContext() != null) {
            infoWindow2.adaptDefaultMarker(this, mapboxMap, mapView);
        }
        return showInfoWindow(infoWindow2, mapView);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Marker [position[");
        stringBuilder.append(getPosition());
        stringBuilder.append("]]");
        return stringBuilder.toString();
    }
}
