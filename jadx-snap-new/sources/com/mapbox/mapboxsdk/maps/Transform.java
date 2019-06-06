package com.mapbox.mapboxsdk.maps;

import android.graphics.PointF;
import com.mapbox.mapboxsdk.annotations.MarkerViewManager;
import com.mapbox.mapboxsdk.camera.CameraPosition;
import com.mapbox.mapboxsdk.camera.CameraUpdate;
import com.mapbox.mapboxsdk.camera.CameraUpdateFactory;
import com.mapbox.mapboxsdk.maps.MapView.OnMapChangedListener;
import com.mapbox.mapboxsdk.maps.MapboxMap.CancelableCallback;
import com.mapbox.mapboxsdk.maps.MapboxMap.OnCameraChangeListener;
import com.mapbox.mapboxsdk.maps.widgets.MyLocationView;
import defpackage.alsj;
import defpackage.cgi;

public final class Transform implements OnMapChangedListener {
    private CancelableCallback cameraCancelableCallback;
    private CameraChangeDispatcher cameraChangeDispatcher;
    private CameraPosition cameraPosition;
    private long ignoreUntil = 0;
    private final NativeMapView mapView;
    private final MarkerViewManager markerViewManager;
    private final MyLocationView myLocationView;
    private OnCameraChangeListener onCameraChangeListener;
    private final TrackingSettings trackingSettings;

    Transform(NativeMapView nativeMapView, MarkerViewManager markerViewManager, TrackingSettings trackingSettings, CameraChangeDispatcher cameraChangeDispatcher) {
        this.mapView = nativeMapView;
        this.markerViewManager = markerViewManager;
        this.trackingSettings = trackingSettings;
        this.myLocationView = trackingSettings.getMyLocationView();
        this.cameraChangeDispatcher = cameraChangeDispatcher;
    }

    private boolean isComponentUpdateRequired(CameraPosition cameraPosition) {
        CameraPosition cameraPosition2 = this.cameraPosition;
        return (cameraPosition2 == null || (cameraPosition2.tilt == cameraPosition.tilt && this.cameraPosition.bearing == cameraPosition.bearing)) ? false : true;
    }

    private boolean isValidCameraPosition(CameraPosition cameraPosition) {
        return (cameraPosition == null || cameraPosition.equals(this.cameraPosition)) ? false : true;
    }

    /* Access modifiers changed, original: final */
    public final void animateCamera(MapboxMap mapboxMap, CameraUpdate cameraUpdate, int i, CancelableCallback cancelableCallback) {
        CameraPosition cameraPosition = cameraUpdate.getCameraPosition(mapboxMap);
        if (isValidCameraPosition(cameraPosition)) {
            this.trackingSettings.resetTrackingModesIfRequired(this.cameraPosition, cameraPosition, false);
            cancelTransitions();
            this.cameraChangeDispatcher.onCameraMoveStarted(3);
            if (cancelableCallback != null) {
                this.cameraCancelableCallback = cancelableCallback;
            }
            this.mapView.addOnMapChangedListener(this);
            this.mapView.flyTo(cameraPosition.bearing, cameraPosition.target, (long) i, cameraPosition.tilt, cameraPosition.zoom);
        }
    }

    /* Access modifiers changed, original: final */
    public final void cancelTransitions() {
        this.cameraChangeDispatcher.onCameraMoveCanceled();
        if (this.cameraCancelableCallback != null) {
            this.cameraChangeDispatcher.onCameraIdle();
            this.cameraCancelableCallback.onCancel();
            this.cameraCancelableCallback = null;
        }
        this.mapView.cancelTransitions();
    }

    /* Access modifiers changed, original: final */
    public final void easeCamera(MapboxMap mapboxMap, CameraUpdate cameraUpdate, int i, boolean z, CancelableCallback cancelableCallback, boolean z2) {
        CancelableCallback cancelableCallback2 = cancelableCallback;
        MapboxMap mapboxMap2 = mapboxMap;
        CameraPosition cameraPosition = cameraUpdate.getCameraPosition(mapboxMap);
        if (isValidCameraPosition(cameraPosition)) {
            this.trackingSettings.resetTrackingModesIfRequired(this.cameraPosition, cameraPosition, z2);
            cancelTransitions();
            this.cameraChangeDispatcher.onCameraMoveStarted(3);
            if (cancelableCallback2 != null) {
                this.cameraCancelableCallback = cancelableCallback2;
            }
            this.mapView.addOnMapChangedListener(this);
            this.mapView.easeTo(cameraPosition.bearing, cameraPosition.target, (long) i, cameraPosition.tilt, cameraPosition.zoom, z);
        }
    }

    /* Access modifiers changed, original: final */
    public final double getBearing() {
        double d = -this.mapView.getBearing();
        while (d > 360.0d) {
            d -= 360.0d;
        }
        while (d < 0.0d) {
            d += 360.0d;
        }
        return d;
    }

    public final CameraPosition getCameraPosition() {
        if (this.cameraPosition == null) {
            this.cameraPosition = invalidateCameraPosition();
        }
        return this.cameraPosition;
    }

    /* Access modifiers changed, original: final */
    public final cgi getCenterCoordinate() {
        return this.mapView.getLatLng();
    }

    /* Access modifiers changed, original: final */
    public final cgi getLatLng() {
        return this.mapView.getLatLng();
    }

    /* Access modifiers changed, original: final */
    public final double getMaxZoom() {
        return this.mapView.getMaxZoom();
    }

    /* Access modifiers changed, original: final */
    public final double getMinZoom() {
        return this.mapView.getMinZoom();
    }

    /* Access modifiers changed, original: final */
    public final double getRawBearing() {
        return this.mapView.getBearing();
    }

    /* Access modifiers changed, original: final */
    public final double getTilt() {
        return this.mapView.getPitch();
    }

    /* Access modifiers changed, original: final */
    public final double getZoom() {
        CameraPosition cameraPosition = this.cameraPosition;
        return cameraPosition != null ? cameraPosition.zoom : 0.0d;
    }

    /* Access modifiers changed, original: final */
    public final void ignoreUntil(long j) {
        this.ignoreUntil = j;
    }

    /* Access modifiers changed, original: final */
    public final void initialise(MapboxMap mapboxMap, MapboxMapOptions mapboxMapOptions) {
        CameraPosition camera = mapboxMapOptions.getCamera();
        if (!(camera == null || camera.equals(CameraPosition.DEFAULT))) {
            moveCamera(mapboxMap, CameraUpdateFactory.newCameraPosition(camera), null);
        }
        setMinZoom(mapboxMapOptions.getMinZoomPreference());
        setMaxZoom(mapboxMapOptions.getMaxZoomPreference());
    }

    /* Access modifiers changed, original: final */
    public final CameraPosition invalidateCameraPosition() {
        NativeMapView nativeMapView = this.mapView;
        if (nativeMapView != null) {
            CameraPosition cameraPosition = nativeMapView.getCameraPosition();
            CameraPosition cameraPosition2 = this.cameraPosition;
            if (!(cameraPosition2 == null || cameraPosition2.equals(cameraPosition))) {
                this.cameraChangeDispatcher.onCameraMove();
            }
            if (isComponentUpdateRequired(cameraPosition)) {
                updateCameraPosition(cameraPosition);
            }
            this.cameraPosition = cameraPosition;
            OnCameraChangeListener onCameraChangeListener = this.onCameraChangeListener;
            if (onCameraChangeListener != null) {
                onCameraChangeListener.onCameraChange(this.cameraPosition);
            }
        }
        return this.cameraPosition;
    }

    /* Access modifiers changed, original: final */
    public final void moveBy(double d, double d2, long j) {
        if (System.currentTimeMillis() >= this.ignoreUntil) {
            if (j > 0) {
                this.mapView.addOnMapChangedListener(new OnMapChangedListener() {
                    public void onMapChanged(int i) {
                        if (i == 4) {
                            Transform.this.mapView.removeOnMapChangedListener(this);
                            Transform.this.cameraChangeDispatcher.onCameraIdle();
                        }
                    }
                });
            }
            this.mapView.moveBy(d, d2, j);
        }
    }

    /* Access modifiers changed, original: final */
    public final void moveCamera(MapboxMap mapboxMap, CameraUpdate cameraUpdate, CancelableCallback cancelableCallback) {
        CameraPosition cameraPosition = cameraUpdate.getCameraPosition(mapboxMap);
        try {
            if (isValidCameraPosition(cameraPosition)) {
                this.trackingSettings.resetTrackingModesIfRequired(this.cameraPosition, cameraPosition, false);
                cancelTransitions();
                this.cameraChangeDispatcher.onCameraMoveStarted(3);
                this.mapView.jumpTo(cameraPosition.bearing, cameraPosition.target, cameraPosition.tilt, cameraPosition.zoom);
                if (cancelableCallback != null) {
                    cancelableCallback.onFinish();
                }
                this.cameraChangeDispatcher.onCameraIdle();
            }
        } catch (Error e) {
            mapboxMap.onInvalidCameraPositionRequested(e, cameraPosition, cameraUpdate);
        }
    }

    public final void onMapChanged(int i) {
        if (i == 4) {
            updateCameraPosition(invalidateCameraPosition());
            CancelableCallback cancelableCallback = this.cameraCancelableCallback;
            if (cancelableCallback != null) {
                cancelableCallback.onFinish();
                this.cameraCancelableCallback = null;
            }
            this.cameraChangeDispatcher.onCameraIdle();
            this.mapView.removeOnMapChangedListener(this);
        }
    }

    /* Access modifiers changed, original: final */
    public final void resetNorth() {
        cancelTransitions();
        this.mapView.resetNorth();
    }

    /* Access modifiers changed, original: final */
    public final void setBearing(double d) {
        MyLocationView myLocationView = this.myLocationView;
        if (myLocationView != null) {
            myLocationView.setBearing(d);
        }
        this.mapView.setBearing(d);
    }

    /* Access modifiers changed, original: final */
    public final void setBearing(double d, float f, float f2) {
        MyLocationView myLocationView = this.myLocationView;
        if (myLocationView != null) {
            myLocationView.setBearing(d);
        }
        this.mapView.setBearing(d, (double) f, (double) f2);
    }

    /* Access modifiers changed, original: final */
    public final void setBearing(double d, float f, float f2, long j) {
        MyLocationView myLocationView = this.myLocationView;
        double d2;
        if (myLocationView != null) {
            d2 = d;
            myLocationView.setBearing(d);
        } else {
            d2 = d;
        }
        this.mapView.setBearing(d, (double) f, (double) f2, j);
    }

    /* Access modifiers changed, original: final */
    public final void setCenterCoordinate(cgi cgi) {
        this.mapView.setLatLng(cgi);
    }

    /* Access modifiers changed, original: final */
    public final void setGestureInProgress(boolean z) {
        this.mapView.setGestureInProgress(z);
        if (!z) {
            invalidateCameraPosition();
        }
    }

    /* Access modifiers changed, original: final */
    public final void setMaxZoom(double d) {
        if (d < 0.0d || d > 20.0d) {
            alsj.d("Not setting maxZoomPreference, value is in unsupported range: ".concat(String.valueOf(d)), new Object[0]);
            return;
        }
        this.mapView.setMaxZoom(d);
    }

    /* Access modifiers changed, original: final */
    public final void setMinZoom(double d) {
        if (d < 0.0d || d > 20.0d) {
            alsj.d("Not setting minZoomPreference, value is in unsupported range: ".concat(String.valueOf(d)), new Object[0]);
            return;
        }
        this.mapView.setMinZoom(d);
    }

    /* Access modifiers changed, original: final */
    public final void setOnCameraChangeListener(OnCameraChangeListener onCameraChangeListener) {
        this.onCameraChangeListener = onCameraChangeListener;
    }

    /* Access modifiers changed, original: final */
    public final void setTilt(Double d) {
        MyLocationView myLocationView = this.myLocationView;
        if (myLocationView != null) {
            myLocationView.setTilt(d.doubleValue());
        }
        this.markerViewManager.setTilt(d.floatValue());
        this.mapView.setPitch(d.doubleValue(), 0);
    }

    /* Access modifiers changed, original: final */
    public final void setZoom(double d, PointF pointF) {
        setZoom(d, pointF, 0);
    }

    /* Access modifiers changed, original: final */
    public final void setZoom(double d, PointF pointF, long j) {
        this.mapView.addOnMapChangedListener(new OnMapChangedListener() {
            public void onMapChanged(int i) {
                if (i == 4) {
                    Transform.this.cameraChangeDispatcher.onCameraIdle();
                    Transform.this.mapView.removeOnMapChangedListener(this);
                }
            }
        });
        this.mapView.setZoom(d, pointF, j);
    }

    /* Access modifiers changed, original: final */
    public final void updateCameraPosition(CameraPosition cameraPosition) {
        MyLocationView myLocationView = this.myLocationView;
        if (myLocationView != null) {
            myLocationView.setCameraPosition(cameraPosition);
        }
        this.markerViewManager.setTilt((float) cameraPosition.tilt);
    }

    /* Access modifiers changed, original: final */
    public final void zoom(boolean z, PointF pointF) {
        if (System.currentTimeMillis() >= this.ignoreUntil) {
            cancelTransitions();
            CameraPosition invalidateCameraPosition = invalidateCameraPosition();
            if (invalidateCameraPosition != null) {
                double d = invalidateCameraPosition.zoom;
                double d2 = (double) (z ? 1 : -1);
                Double.isNaN(d2);
                setZoom((double) ((int) Math.round(d + d2)), pointF, 300);
                return;
            }
            this.cameraChangeDispatcher.onCameraIdle();
        }
    }

    /* Access modifiers changed, original: final */
    public final void zoomBy(double d, float f, float f2) {
        zoomBy(d, f, f2, 0);
    }

    /* Access modifiers changed, original: final */
    public final void zoomBy(double d, float f, float f2, long j) {
        if (System.currentTimeMillis() >= this.ignoreUntil) {
            NativeMapView nativeMapView = this.mapView;
            float f3 = f;
            nativeMapView.setZoom(nativeMapView.getZoom() + d, new PointF(f, f2), j);
        }
    }
}
