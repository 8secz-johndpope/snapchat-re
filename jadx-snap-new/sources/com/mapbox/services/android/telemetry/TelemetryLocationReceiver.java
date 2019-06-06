package com.mapbox.services.android.telemetry;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.location.Location;

public class TelemetryLocationReceiver extends BroadcastReceiver {
    public static final String INTENT_STRING = "com.mapbox.services.android.telemetry.location.TelemetryLocationReceiver";

    public void onReceive(Context context, Intent intent) {
        if (intent != null && intent.getExtras() != null) {
            Location location = (Location) intent.getExtras().get(MapboxEvent.TYPE_LOCATION);
            if (location != null) {
                MapboxTelemetry.getInstance().addLocationEvent(location);
            }
        }
    }
}
