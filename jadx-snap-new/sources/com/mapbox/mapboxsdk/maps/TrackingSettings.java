package com.mapbox.mapboxsdk.maps;

import android.graphics.PointF;
import android.location.Location;
import android.os.Bundle;
import com.mapbox.mapboxsdk.Mapbox;
import com.mapbox.mapboxsdk.camera.CameraPosition;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.mapbox.mapboxsdk.maps.MapboxMap.OnMyBearingTrackingModeChangeListener;
import com.mapbox.mapboxsdk.maps.MapboxMap.OnMyLocationChangeListener;
import com.mapbox.mapboxsdk.maps.MapboxMap.OnMyLocationTrackingModeChangeListener;
import com.mapbox.mapboxsdk.maps.widgets.MyLocationView;
import com.mapbox.services.android.telemetry.location.LocationEngine;
import com.mapbox.services.android.telemetry.location.LocationEngineListener;
import com.mapbox.services.android.telemetry.permissions.PermissionsManager;
import defpackage.alsj;

public class TrackingSettings {
    private boolean dismissBearingTrackingOnGesture = true;
    private boolean dismissLocationTrackingOnGesture = true;
    private final FocalPointChangeListener focalPointChangedListener;
    private boolean isCustomLocationSource;
    private boolean locationChangeAnimationEnabled = true;
    private LocationEngine locationSource;
    private boolean myLocationEnabled;
    private LocationEngineListener myLocationListener;
    private final MyLocationView myLocationView;
    private OnMyBearingTrackingModeChangeListener onMyBearingTrackingModeChangeListener;
    private OnMyLocationTrackingModeChangeListener onMyLocationTrackingModeChangeListener;
    protected final UiSettings uiSettings;
    private final CameraZoomInvalidator zoomInvalidator;

    interface CameraZoomInvalidator {
        void zoomTo(double d);
    }

    TrackingSettings(MyLocationView myLocationView, UiSettings uiSettings, FocalPointChangeListener focalPointChangeListener, CameraZoomInvalidator cameraZoomInvalidator) {
        this.myLocationView = myLocationView;
        this.focalPointChangedListener = focalPointChangeListener;
        this.uiSettings = uiSettings;
        this.zoomInvalidator = cameraZoomInvalidator;
    }

    private void setMyLocationEnabled(boolean z, boolean z2) {
        if (PermissionsManager.areLocationPermissionsGranted(this.myLocationView.getContext())) {
            this.myLocationEnabled = z;
            this.isCustomLocationSource = z2;
            this.myLocationView.setEnabled(z, z2);
            return;
        }
        alsj.d("Could not activate user location tracking: user did not accept the permission or permissions were not requested.", new Object[0]);
    }

    public int getMyBearingTrackingMode() {
        return this.myLocationView.getMyBearingTrackingMode();
    }

    /* Access modifiers changed, original: 0000 */
    public Location getMyLocation() {
        return this.myLocationView.getLocation();
    }

    public int getMyLocationTrackingMode() {
        return this.myLocationView.getMyLocationTrackingMode();
    }

    /* Access modifiers changed, original: 0000 */
    public MyLocationView getMyLocationView() {
        return this.myLocationView;
    }

    /* Access modifiers changed, original: 0000 */
    public void initialise(MapboxMapOptions mapboxMapOptions) {
        this.locationSource = Mapbox.getLocationSource();
        setMyLocationEnabled(mapboxMapOptions.getLocationEnabled());
    }

    public boolean isAllDismissTrackingOnGesture() {
        return this.dismissLocationTrackingOnGesture && this.dismissBearingTrackingOnGesture;
    }

    public boolean isBearingTrackingDisabled() {
        return this.myLocationView.getMyBearingTrackingMode() == 0;
    }

    public boolean isCustomLocationSource() {
        return this.isCustomLocationSource;
    }

    public boolean isDismissBearingTrackingOnGesture() {
        return this.dismissBearingTrackingOnGesture;
    }

    public boolean isDismissLocationTrackingOnGesture() {
        return this.dismissLocationTrackingOnGesture;
    }

    public boolean isLocationChangeAnimationEnabled() {
        return this.locationChangeAnimationEnabled;
    }

    public boolean isLocationTrackingDisabled() {
        return this.myLocationView.getMyLocationTrackingMode() == 0;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean isMyLocationEnabled() {
        return this.myLocationEnabled;
    }

    public boolean isRotateGestureCurrentlyEnabled() {
        return this.uiSettings.isRotateGesturesEnabled() && (this.dismissBearingTrackingOnGesture || this.myLocationView.getMyBearingTrackingMode() == 0 || this.myLocationView.getMyLocationTrackingMode() == 0);
    }

    public boolean isScrollGestureCurrentlyEnabled() {
        return this.uiSettings.isScrollGesturesEnabled() && (this.dismissLocationTrackingOnGesture || this.myLocationView.getMyLocationTrackingMode() == 0);
    }

    /* Access modifiers changed, original: 0000 */
    public void onRestoreInstanceState(Bundle bundle) {
        try {
            setMyLocationEnabled(bundle.getBoolean(MapboxConstants.STATE_MY_LOCATION_ENABLED), bundle.getBoolean(MapboxConstants.STATE_USING_CUSTOM_LOCATION_SOURCE));
        } catch (SecurityException unused) {
        }
        setMyLocationTrackingMode(bundle.getInt(MapboxConstants.STATE_MY_LOCATION_TRACKING_MODE, 0));
        setMyBearingTrackingMode(bundle.getInt(MapboxConstants.STATE_MY_BEARING_TRACKING_MODE, 0));
        setDismissLocationTrackingOnGesture(bundle.getBoolean(MapboxConstants.STATE_MY_LOCATION_TRACKING_DISMISS, true));
        setDismissBearingTrackingOnGesture(bundle.getBoolean(MapboxConstants.STATE_MY_BEARING_TRACKING_DISMISS, true));
        setLocationChangeAnimationEnabled(bundle.getBoolean(MapboxConstants.STATE_LOCATION_CHANGE_ANIMATION_ENABLED, true));
    }

    /* Access modifiers changed, original: 0000 */
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putInt(MapboxConstants.STATE_MY_LOCATION_TRACKING_MODE, getMyLocationTrackingMode());
        bundle.putInt(MapboxConstants.STATE_MY_BEARING_TRACKING_MODE, getMyBearingTrackingMode());
        bundle.putBoolean(MapboxConstants.STATE_MY_LOCATION_TRACKING_DISMISS, isDismissLocationTrackingOnGesture());
        bundle.putBoolean(MapboxConstants.STATE_MY_BEARING_TRACKING_DISMISS, isDismissBearingTrackingOnGesture());
        bundle.putBoolean(MapboxConstants.STATE_MY_LOCATION_ENABLED, isMyLocationEnabled());
        bundle.putBoolean(MapboxConstants.STATE_LOCATION_CHANGE_ANIMATION_ENABLED, isLocationChangeAnimationEnabled());
        bundle.putBoolean(MapboxConstants.STATE_USING_CUSTOM_LOCATION_SOURCE, isCustomLocationSource());
    }

    /* Access modifiers changed, original: 0000 */
    public void onStart() {
        this.myLocationView.onStart();
    }

    /* Access modifiers changed, original: 0000 */
    public void onStop() {
        this.myLocationView.onStop();
    }

    /* Access modifiers changed, original: 0000 */
    public void resetTrackingModesIfRequired(CameraPosition cameraPosition, CameraPosition cameraPosition2, boolean z) {
        if (cameraPosition.target != null) {
            resetTrackingModesIfRequired(cameraPosition.target.equals(cameraPosition2.target) ^ 1, false, z);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void resetTrackingModesIfRequired(boolean z, boolean z2, boolean z3) {
        if (z && !isLocationTrackingDisabled() && isDismissLocationTrackingOnGesture() && !z3) {
            setMyLocationTrackingMode(0);
        }
        if (z2 && !isBearingTrackingDisabled() && isDismissBearingTrackingOnGesture()) {
            setMyBearingTrackingMode(0);
        }
    }

    public void setDismissAllTrackingOnGesture(boolean z) {
        this.dismissLocationTrackingOnGesture = z;
        this.dismissBearingTrackingOnGesture = z;
    }

    public void setDismissBearingTrackingOnGesture(boolean z) {
        this.dismissBearingTrackingOnGesture = z;
    }

    public void setDismissLocationTrackingOnGesture(boolean z) {
        this.dismissLocationTrackingOnGesture = z;
    }

    public void setLocationChangeAnimationEnabled(boolean z) {
        this.locationChangeAnimationEnabled = z;
        this.myLocationView.setLocationChangeAnimationEnabled(z);
    }

    /* Access modifiers changed, original: 0000 */
    public void setLocationSource(LocationEngine locationEngine) {
        LocationEngine locationEngine2 = this.locationSource;
        if (locationEngine2 == null || !locationEngine2.equals(locationEngine)) {
            this.isCustomLocationSource = locationEngine != null;
            if (locationEngine == null) {
                locationEngine = Mapbox.getLocationSource();
            }
            this.locationSource = locationEngine;
            this.myLocationView.setLocationSource(locationEngine);
        }
    }

    public void setMyBearingTrackingMode(int i) {
        this.myLocationView.setMyBearingTrackingMode(i);
        OnMyBearingTrackingModeChangeListener onMyBearingTrackingModeChangeListener = this.onMyBearingTrackingModeChangeListener;
        if (onMyBearingTrackingModeChangeListener != null) {
            onMyBearingTrackingModeChangeListener.onMyBearingTrackingModeChange(i);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void setMyLocationEnabled(boolean z) {
        setMyLocationEnabled(z, isCustomLocationSource());
    }

    public void setMyLocationTrackingMode(int i) {
        FocalPointChangeListener focalPointChangeListener;
        PointF center;
        this.myLocationView.setLocationChangeAnimationEnabled(isLocationChangeAnimationEnabled());
        this.myLocationView.setMyLocationTrackingMode(i);
        if (i == 4) {
            this.zoomInvalidator.zoomTo(2.0d);
            focalPointChangeListener = this.focalPointChangedListener;
            center = this.myLocationView.getCenter();
        } else {
            focalPointChangeListener = this.focalPointChangedListener;
            center = null;
        }
        focalPointChangeListener.onFocalPointChanged(center);
        OnMyLocationTrackingModeChangeListener onMyLocationTrackingModeChangeListener = this.onMyLocationTrackingModeChangeListener;
        if (onMyLocationTrackingModeChangeListener != null) {
            onMyLocationTrackingModeChangeListener.onMyLocationTrackingModeChange(i);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void setOnMyBearingTrackingModeChangeListener(OnMyBearingTrackingModeChangeListener onMyBearingTrackingModeChangeListener) {
        this.onMyBearingTrackingModeChangeListener = onMyBearingTrackingModeChangeListener;
    }

    /* Access modifiers changed, original: 0000 */
    public void setOnMyLocationChangeListener(final OnMyLocationChangeListener onMyLocationChangeListener) {
        if (onMyLocationChangeListener != null) {
            this.myLocationListener = new LocationEngineListener() {
                public void onConnected() {
                }

                public void onLocationChanged(Location location) {
                    OnMyLocationChangeListener onMyLocationChangeListener = onMyLocationChangeListener;
                    if (onMyLocationChangeListener != null) {
                        onMyLocationChangeListener.onMyLocationChange(location);
                    }
                }
            };
            this.locationSource.addLocationEngineListener(this.myLocationListener);
            return;
        }
        this.locationSource.removeLocationEngineListener(this.myLocationListener);
        this.myLocationListener = null;
    }

    /* Access modifiers changed, original: 0000 */
    public void setOnMyLocationTrackingModeChangeListener(OnMyLocationTrackingModeChangeListener onMyLocationTrackingModeChangeListener) {
        this.onMyLocationTrackingModeChangeListener = onMyLocationTrackingModeChangeListener;
    }

    /* Access modifiers changed, original: 0000 */
    public void update() {
        if (this.myLocationView.isEnabled()) {
            this.myLocationView.update();
        }
    }
}
