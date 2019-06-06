package com.looksery.sdk.audio;

public interface ScenariumAudioPlaybackService {
    void close(int i);

    void closeAll();

    float getDuration(int i);

    float getPosition(int i);

    float getVolume(int i);

    boolean isPlaying(int i);

    int open(String str, AudioTrackStateCallback audioTrackStateCallback);

    boolean pause(int i);

    boolean play(int i, int i2);

    boolean resume(int i);

    void setMasterVolume(float f, boolean z);

    boolean setPosition(int i, float f);

    void setVolume(int i, float f);

    void shutdownService();

    void startService();

    boolean stop(int i);
}
