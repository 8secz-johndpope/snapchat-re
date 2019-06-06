package com.addlive.djinni;

public abstract class ExternalDecoder {
    public abstract void decodeFrame(FrameData frameData);

    public abstract void stop();
}
