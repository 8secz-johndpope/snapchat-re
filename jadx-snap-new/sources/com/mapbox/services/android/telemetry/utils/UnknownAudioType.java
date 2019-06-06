package com.mapbox.services.android.telemetry.utils;

import android.content.Context;

class UnknownAudioType implements AudioTypeResolver {
    private static final String UNKNOWN = "unknown";

    UnknownAudioType() {
    }

    public void nextChain(AudioTypeResolver audioTypeResolver) {
    }

    public String obtainAudioType(Context context) {
        return UNKNOWN;
    }
}
