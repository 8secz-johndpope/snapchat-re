package com.looksery.sdk.media;

public interface VideoWriter {
    void finish();

    void prepare();

    void release();

    void render(int i, float[] fArr);
}
