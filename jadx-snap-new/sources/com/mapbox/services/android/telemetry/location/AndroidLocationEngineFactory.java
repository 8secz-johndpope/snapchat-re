package com.mapbox.services.android.telemetry.location;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import com.mapbox.services.android.telemetry.location.LocationEngine.Type;

class AndroidLocationEngineFactory implements LocationEngineSupplier {
    AndroidLocationEngineFactory() {
    }

    public boolean hasDependencyOnClasspath() {
        return true;
    }

    public LocationEngine supply(Context context) {
        return new LocationEngine() {
            public void activate() {
            }

            public void deactivate() {
            }

            @SuppressLint({"MissingPermission"})
            public Location getLastLocation() {
                return null;
            }

            public boolean isConnected() {
                return false;
            }

            public Type obtainType() {
                return Type.MOCK;
            }

            public void removeLocationUpdates() {
            }

            public void requestLocationUpdates() {
            }
        };
    }
}
