package com.mapbox.mapboxsdk.maps;

import android.location.Location;
import android.os.Bundle;
import com.mapbox.mapboxsdk.camera.CameraPosition;
import com.mapbox.mapboxsdk.maps.MapboxMap.OnMyBearingTrackingModeChangeListener;
import com.mapbox.mapboxsdk.maps.MapboxMap.OnMyLocationChangeListener;
import com.mapbox.mapboxsdk.maps.MapboxMap.OnMyLocationTrackingModeChangeListener;
import com.mapbox.mapboxsdk.maps.widgets.MyLocationView;
import com.mapbox.services.android.telemetry.location.LocationEngine;

class MockTrackingSettings extends TrackingSettings {
    MockTrackingSettings(UiSettings uiSettings) {
        super(null, uiSettings, null, null);
    }

    public int getMyBearingTrackingMode() {
        return 0;
    }

    /* Access modifiers changed, original: 0000 */
    public Location getMyLocation() {
        return null;
    }

    public int getMyLocationTrackingMode() {
        return 0;
    }

    /* Access modifiers changed, original: 0000 */
    public MyLocationView getMyLocationView() {
        return null;
    }

    /* Access modifiers changed, original: 0000 */
    public void initialise(MapboxMapOptions mapboxMapOptions) {
    }

    public boolean isAllDismissTrackingOnGesture() {
        return false;
    }

    public boolean isBearingTrackingDisabled() {
        return true;
    }

    public boolean isCustomLocationSource() {
        return true;
    }

    public boolean isDismissBearingTrackingOnGesture() {
        return false;
    }

    public boolean isDismissLocationTrackingOnGesture() {
        return false;
    }

    public boolean isLocationChangeAnimationEnabled() {
        return false;
    }

    public boolean isLocationTrackingDisabled() {
        return true;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean isMyLocationEnabled() {
        return false;
    }

    public boolean isRotateGestureCurrentlyEnabled() {
        return this.uiSettings.isRotateGesturesEnabled();
    }

    public boolean isScrollGestureCurrentlyEnabled() {
        return this.uiSettings.isScrollGesturesEnabled();
    }

    /* Access modifiers changed, original: 0000 */
    public void onRestoreInstanceState(Bundle bundle) {
    }

    /* Access modifiers changed, original: 0000 */
    public void onSaveInstanceState(Bundle bundle) {
    }

    /* Access modifiers changed, original: 0000 */
    public void onStart() {
    }

    /* Access modifiers changed, original: 0000 */
    public void onStop() {
    }

    /* Access modifiers changed, original: 0000 */
    public void resetTrackingModesIfRequired(CameraPosition cameraPosition, CameraPosition cameraPosition2, boolean z) {
    }

    /* Access modifiers changed, original: 0000 */
    public void resetTrackingModesIfRequired(boolean z, boolean z2, boolean z3) {
    }

    public void setDismissAllTrackingOnGesture(boolean z) {
    }

    public void setDismissBearingTrackingOnGesture(boolean z) {
    }

    public void setDismissLocationTrackingOnGesture(boolean z) {
    }

    public void setLocationChangeAnimationEnabled(boolean z) {
    }

    /* Access modifiers changed, original: 0000 */
    public void setLocationSource(LocationEngine locationEngine) {
    }

    public void setMyBearingTrackingMode(int i) {
        super.setMyBearingTrackingMode(i);
    }

    /* Access modifiers changed, original: 0000 */
    public void setMyLocationEnabled(boolean z) {
    }

    public void setMyLocationTrackingMode(int i) {
    }

    /* Access modifiers changed, original: 0000 */
    public void setOnMyBearingTrackingModeChangeListener(OnMyBearingTrackingModeChangeListener onMyBearingTrackingModeChangeListener) {
    }

    /* Access modifiers changed, original: 0000 */
    public void setOnMyLocationChangeListener(OnMyLocationChangeListener onMyLocationChangeListener) {
    }

    /* Access modifiers changed, original: 0000 */
    public void setOnMyLocationTrackingModeChangeListener(OnMyLocationTrackingModeChangeListener onMyLocationTrackingModeChangeListener) {
    }

    /* Access modifiers changed, original: 0000 */
    public void update() {
    }
}
