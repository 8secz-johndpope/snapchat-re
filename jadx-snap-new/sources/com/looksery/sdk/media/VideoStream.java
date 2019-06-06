package com.looksery.sdk.media;

public interface VideoStream {
    int getHeight();

    int getPlayCount();

    float getVolume();

    int getWidth();

    boolean isReady();

    int nextExternalTextureFrame(float[] fArr);

    void pause();

    void prepare(boolean z, float f, float f2);

    void release();

    void resume();

    void setVolume(float f);
}
