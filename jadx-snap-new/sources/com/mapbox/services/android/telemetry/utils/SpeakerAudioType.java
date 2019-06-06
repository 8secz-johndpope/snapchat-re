package com.mapbox.services.android.telemetry.utils;

import android.content.Context;
import android.media.AudioManager;

class SpeakerAudioType implements AudioTypeResolver {
    private static final String SPEAKER = "speaker";
    private AudioTypeResolver chain;

    SpeakerAudioType() {
    }

    public void nextChain(AudioTypeResolver audioTypeResolver) {
        this.chain = audioTypeResolver;
    }

    public String obtainAudioType(Context context) {
        return ((AudioManager) context.getSystemService("audio")).isSpeakerphoneOn() ? SPEAKER : this.chain.obtainAudioType(context);
    }
}
