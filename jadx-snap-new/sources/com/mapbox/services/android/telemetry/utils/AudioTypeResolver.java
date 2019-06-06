package com.mapbox.services.android.telemetry.utils;

import android.content.Context;

interface AudioTypeResolver {
    void nextChain(AudioTypeResolver audioTypeResolver);

    String obtainAudioType(Context context);
}
