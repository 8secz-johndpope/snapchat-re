package com.mapbox.services.android.telemetry.utils;

import android.content.Context;
import android.media.AudioManager;

class BluetoothAudioType implements AudioTypeResolver {
    private static final String BLUETOOTH = "bluetooth";
    private AudioTypeResolver chain;

    BluetoothAudioType() {
    }

    public void nextChain(AudioTypeResolver audioTypeResolver) {
        this.chain = audioTypeResolver;
    }

    public String obtainAudioType(Context context) {
        return ((AudioManager) context.getSystemService("audio")).isBluetoothScoOn() ? BLUETOOTH : this.chain.obtainAudioType(context);
    }
}
