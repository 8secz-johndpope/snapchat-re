package com.snapchat.mediaengine.mp4;

import android.media.MediaFormat;
import java.nio.ByteBuffer;

public final class JniFrameDecoder {
    static {
        System.loadLibrary("c++_shared");
        System.loadLibrary("libjpeg");
        System.loadLibrary("media-native");
    }

    public static native int compressJpeg(ByteBuffer byteBuffer, MediaFormat mediaFormat, int i, ByteBuffer byteBuffer2);
}
