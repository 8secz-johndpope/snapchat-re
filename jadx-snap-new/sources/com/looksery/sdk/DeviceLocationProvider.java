package com.looksery.sdk;

import android.location.Location;

public interface DeviceLocationProvider {
    public static final DeviceLocationProvider NOOP = new DeviceLocationProvider() {
        public Location getLocation() {
            return null;
        }
    };

    public static final class Factory {
        private Factory() {
            throw new AssertionError("No instances");
        }

        public static DeviceLocationProvider from(final Location location) {
            return new DeviceLocationProvider() {
                public Location getLocation() {
                    return location;
                }
            };
        }
    }

    Location getLocation();
}
