package com.addlive.impl.video;

public interface VideoFrameReceiver {
    boolean canAcceptNewFrame(long j, int i, int i2);

    Object getInputSurface();

    void release();

    void reset();
}
