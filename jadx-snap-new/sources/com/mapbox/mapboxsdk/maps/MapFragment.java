package com.mapbox.mapboxsdk.maps;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.mapbox.mapboxsdk.utils.MapFragmentUtils;

public final class MapFragment extends Fragment {
    private MapView map;
    private OnMapReadyCallback onMapReadyCallback;

    public static MapFragment newInstance() {
        return new MapFragment();
    }

    public static MapFragment newInstance(MapboxMapOptions mapboxMapOptions) {
        MapFragment mapFragment = new MapFragment();
        mapFragment.setArguments(MapFragmentUtils.createFragmentArgs(mapboxMapOptions));
        return mapFragment;
    }

    public final void getMapAsync(OnMapReadyCallback onMapReadyCallback) {
        this.onMapReadyCallback = onMapReadyCallback;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        Context context = layoutInflater.getContext();
        MapView mapView = new MapView(context, MapFragmentUtils.resolveArgs(context, getArguments()));
        this.map = mapView;
        return mapView;
    }

    public final void onDestroyView() {
        super.onDestroyView();
        this.map.onDestroy();
    }

    public final void onLowMemory() {
        super.onLowMemory();
        this.map.onLowMemory();
    }

    public final void onPause() {
        super.onPause();
        this.map.onPause();
    }

    public final void onResume() {
        super.onResume();
        this.map.onResume();
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.map.onSaveInstanceState(bundle);
    }

    public final void onStart() {
        super.onStart();
        this.map.onStart();
        this.map.getMapAsync(this.onMapReadyCallback);
    }

    public final void onStop() {
        super.onStop();
        this.map.onStop();
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.map.onCreate(bundle);
    }
}
