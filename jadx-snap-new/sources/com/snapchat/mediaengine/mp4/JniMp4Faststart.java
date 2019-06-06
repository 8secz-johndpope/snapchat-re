package com.snapchat.mediaengine.mp4;

import android.util.Log;

public class JniMp4Faststart {
    static {
        try {
            System.loadLibrary("c++_shared");
            System.loadLibrary("libjpeg");
            System.loadLibrary("media-native");
        } catch (Throwable th) {
            Log.e("JniMp4Faststart", "Native library MediaEngineNative could not be loaded.", th);
        }
    }

    public static native int faststart(String str, String str2);
}
