package com.addlive.djinni;

public abstract class ExternalVideoService {
    public abstract ExternalDecoder createDecoder(DecoderConfig decoderConfig, DecoderCallback decoderCallback);

    public abstract ExternalEncoder createEncoder(EncoderConfig encoderConfig, EncoderCallback encoderCallback);

    public abstract void notifyStartSoftwareEncoder();

    public abstract void notifyStopSoftwareEncoder();
}
