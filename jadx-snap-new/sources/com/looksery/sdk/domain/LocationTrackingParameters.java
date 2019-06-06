package com.looksery.sdk.domain;

import com.mapbox.mapboxsdk.constants.MapboxConstants;

public final class LocationTrackingParameters {
    private final float mDistanceFilterMeters;
    private final long mLocationUpdateIntervalMillis;

    public LocationTrackingParameters(long j, float f) {
        this.mLocationUpdateIntervalMillis = j;
        this.mDistanceFilterMeters = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            LocationTrackingParameters locationTrackingParameters = (LocationTrackingParameters) obj;
            return this.mLocationUpdateIntervalMillis != locationTrackingParameters.mLocationUpdateIntervalMillis && Float.compare(locationTrackingParameters.mDistanceFilterMeters, this.mDistanceFilterMeters) == 0;
        }
    }

    public final float getDistanceFilterMeters() {
        return this.mDistanceFilterMeters;
    }

    public final long getLocationUpdateIntervalMillis() {
        return this.mLocationUpdateIntervalMillis;
    }

    public final int hashCode() {
        long j = this.mLocationUpdateIntervalMillis;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        float f = this.mDistanceFilterMeters;
        return i + (f != MapboxConstants.MINIMUM_ZOOM ? Float.floatToIntBits(f) : 0);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("LocationTrackingParameters{mLocationUpdateIntervalMillis=");
        stringBuilder.append(this.mLocationUpdateIntervalMillis);
        stringBuilder.append(", mDistanceFilterMeters=");
        stringBuilder.append(this.mDistanceFilterMeters);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
