package com.mapbox.mapboxsdk.maps;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.mapbox.mapboxsdk.utils.MapFragmentUtils;
import defpackage.fv;

public class SupportMapFragment extends fv {
    private MapView map;
    private OnMapReadyCallback onMapReadyCallback;

    public static SupportMapFragment newInstance() {
        return new SupportMapFragment();
    }

    public static SupportMapFragment newInstance(MapboxMapOptions mapboxMapOptions) {
        SupportMapFragment supportMapFragment = new SupportMapFragment();
        supportMapFragment.setArguments(MapFragmentUtils.createFragmentArgs(mapboxMapOptions));
        return supportMapFragment;
    }

    public void getMapAsync(OnMapReadyCallback onMapReadyCallback) {
        this.onMapReadyCallback = onMapReadyCallback;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        Context context = layoutInflater.getContext();
        MapView mapView = new MapView(context, MapFragmentUtils.resolveArgs(context, getArguments()));
        this.map = mapView;
        return mapView;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.map.onDestroy();
    }

    public void onLowMemory() {
        super.onLowMemory();
        this.map.onLowMemory();
    }

    public void onPause() {
        super.onPause();
        this.map.onPause();
    }

    public void onResume() {
        super.onResume();
        this.map.onResume();
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.map.onSaveInstanceState(bundle);
    }

    public void onStart() {
        super.onStart();
        this.map.onStart();
        this.map.getMapAsync(this.onMapReadyCallback);
    }

    public void onStop() {
        super.onStop();
        this.map.onStop();
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.map.onCreate(bundle);
    }
}
