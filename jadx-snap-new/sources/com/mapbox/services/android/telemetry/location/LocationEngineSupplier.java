package com.mapbox.services.android.telemetry.location;

import android.content.Context;

interface LocationEngineSupplier {
    boolean hasDependencyOnClasspath();

    LocationEngine supply(Context context);
}
