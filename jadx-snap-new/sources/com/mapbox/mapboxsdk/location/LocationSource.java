package com.mapbox.mapboxsdk.location;

import android.content.Context;
import android.location.Location;
import com.mapbox.services.android.telemetry.location.LocationEngine;
import com.mapbox.services.android.telemetry.location.LocationEngine.Type;

public class LocationSource extends LocationEngine {
    private Context context;

    public LocationSource(Context context) {
        this.context = context.getApplicationContext();
    }

    public void activate() {
    }

    public void deactivate() {
    }

    public Location getLastLocation() {
        return null;
    }

    public boolean isConnected() {
        return true;
    }

    public Type obtainType() {
        return Type.MOCK;
    }

    public void removeLocationUpdates() {
    }

    public void requestLocationUpdates() {
    }
}
