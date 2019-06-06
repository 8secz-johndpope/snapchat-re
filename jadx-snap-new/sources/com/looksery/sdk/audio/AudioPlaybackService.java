package com.looksery.sdk.audio;

public interface AudioPlaybackService {
    boolean isPlaying(String str);

    void play(String str, int i);

    void setVolume(float f, boolean z);

    void setVolume(String str, float f);

    void stop(String str, boolean z);

    void stopAll();
}
