package com.mapbox.services.android.telemetry.location;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import com.mapbox.services.android.telemetry.location.LocationEngine.Type;

class GoogleLocationEngineFactory implements LocationEngineSupplier {
    private final ClasspathChecker classpathChecker;

    GoogleLocationEngineFactory(ClasspathChecker classpathChecker) {
        this.classpathChecker = classpathChecker;
    }

    public boolean hasDependencyOnClasspath() {
        return false;
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
