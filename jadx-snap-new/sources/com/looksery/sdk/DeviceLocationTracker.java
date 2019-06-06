package com.looksery.sdk;

import android.location.Location;
import com.looksery.sdk.domain.LocationTrackingParameters;

public interface DeviceLocationTracker extends DeviceLocationProvider {
    public static final DeviceLocationTracker NOOP = new DeviceLocationTracker() {
        public Location getLocation() {
            return null;
        }

        public void start(LocationTrackingParameters locationTrackingParameters) {
        }

        public void stop() {
        }
    };

    void start(LocationTrackingParameters locationTrackingParameters);

    void stop();
}
