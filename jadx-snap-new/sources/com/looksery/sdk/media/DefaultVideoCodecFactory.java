package com.looksery.sdk.media;

public final class DefaultVideoCodecFactory implements VideoCodecFactory {
    private final VideoStreamFactory mVideoStreamFactory;
    private final VideoWriterFactory mVideoWriterFactory;

    public DefaultVideoCodecFactory(VideoWriterFactory videoWriterFactory, VideoStreamFactory videoStreamFactory) {
        this.mVideoWriterFactory = videoWriterFactory;
        this.mVideoStreamFactory = videoStreamFactory;
    }

    public final VideoStream createVideoStream(String str) {
        return this.mVideoStreamFactory.createVideoStream(str);
    }

    public final VideoWriter createVideoWriter(String str, int i, int i2) {
        return this.mVideoWriterFactory.createVideoWriter(str, i, i2);
    }
}
