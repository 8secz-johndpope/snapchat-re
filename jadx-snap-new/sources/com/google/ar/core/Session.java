package com.google.ar.core;

import android.content.Context;

public class Session {
    public long a;
    private Context b;
    private final Object c;

    protected Session() {
        this.c = new Object();
        this.a = 0;
        this.b = null;
    }

    public Session(Context context) {
        this.c = new Object();
        System.loadLibrary("arcore_sdk_jni");
        this.b = context;
        this.a = nativeCreateSession(context.getApplicationContext());
    }

    private native long[] nativeAcquireAllAnchors(long j);

    private native long nativeCreateAnchor(long j, Pose pose);

    private static native long nativeCreateSession(Context context);

    private static native void nativeDestroySession(long j);

    private native void nativeUpdate(long j, long j2);

    public final Frame a() {
        Frame frame;
        synchronized (this.c) {
            frame = new Frame(this);
            nativeUpdate(this.a, frame.b);
        }
        return frame;
    }

    /* Access modifiers changed, original: protected */
    public void finalize() {
        long j = this.a;
        if (j != 0) {
            nativeDestroySession(j);
        }
        super.finalize();
    }

    public native long[] nativeAcquireAllTrackables(long j, int i);

    public native void nativeConfigure(long j, long j2);

    public native boolean nativeIsSupported(long j, long j2);

    public native void nativePause(long j);

    public native void nativeResume(long j);

    public native void nativeSetCameraTextureName(long j, int i);

    public native void nativeSetDisplayGeometry(long j, int i, int i2, int i3);
}
