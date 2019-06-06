package com.looksery.sdk.media;

public interface VideoCodecFactory {
    VideoStream createVideoStream(String str);

    VideoWriter createVideoWriter(String str, int i, int i2);
}
