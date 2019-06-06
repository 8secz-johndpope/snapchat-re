package com.mapbox.services.android.telemetry.utils;

import android.content.Context;
import android.media.AudioManager;

class HeadphonesAudioType implements AudioTypeResolver {
    private static final String HEADPHONES = "headphones";
    private AudioTypeResolver chain;

    HeadphonesAudioType() {
    }

    public void nextChain(AudioTypeResolver audioTypeResolver) {
        this.chain = audioTypeResolver;
    }

    public String obtainAudioType(Context context) {
        return ((AudioManager) context.getSystemService("audio")).isWiredHeadsetOn() ? HEADPHONES : this.chain.obtainAudioType(context);
    }
}
