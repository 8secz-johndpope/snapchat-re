package com.looksery.sdk.audio;

interface AudioPlayer {
    public static final int INFINITY_LOOP_COUNT = 1073741824;

    boolean canHandle(AudioSampleInfo audioSampleInfo);

    boolean isLoaded(AudioSampleInfo audioSampleInfo);

    boolean isPlaying(AudioSampleInfo audioSampleInfo);

    boolean load(AudioSampleInfo audioSampleInfo);

    void play(AudioSampleInfo audioSampleInfo, int i, float f);

    void setVolume(AudioSampleInfo audioSampleInfo, float f);

    void stop(AudioSampleInfo audioSampleInfo, boolean z);

    void stopAll();
}
