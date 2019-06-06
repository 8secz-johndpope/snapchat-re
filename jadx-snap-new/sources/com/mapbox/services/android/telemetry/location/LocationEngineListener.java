package com.mapbox.services.android.telemetry.location;

import android.location.Location;

public interface LocationEngineListener {
    void onConnected();

    void onLocationChanged(Location location);
}
