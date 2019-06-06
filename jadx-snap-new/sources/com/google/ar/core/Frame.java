package com.google.ar.core;

import java.nio.FloatBuffer;
import java.util.ArrayList;

public class Frame {
    public final Session a;
    public long b;
    private final LightEstimate c;

    static {
        Frame.class.getSimpleName();
        ArrayList arrayList = new ArrayList();
        arrayList = new ArrayList();
    }

    protected Frame() {
        this.b = 0;
        this.a = null;
        this.b = 0;
        this.c = null;
    }

    Frame(Session session) {
        this.b = 0;
        this.a = session;
        this.b = nativeCreateFrame(session.a);
        this.c = new LightEstimate(session);
    }

    private native long nativeAcquireCameraImage(long j, long j2);

    private native long nativeAcquireImageMetadata(long j, long j2);

    private native long[] nativeAcquireUpdatedAnchors(long j, long j2);

    private static native long nativeCreateFrame(long j);

    private static native void nativeDestroyFrame(long j);

    private native void nativeGetLightEstimate(long j, long j2, long j3);

    private native boolean nativeHasDisplayGeometryChanged(long j, long j2);

    private native long[] nativeHitTest(long j, long j2, float f, float f2);

    private native void nativeTransformDisplayUvCoords(long j, long j2, FloatBuffer floatBuffer, FloatBuffer floatBuffer2);

    /* Access modifiers changed, original: protected */
    public void finalize() {
        long j = this.b;
        if (j != 0) {
            nativeDestroyFrame(j);
        }
        super.finalize();
    }

    public native long nativeAcquirePointCloud(long j, long j2);

    public native long[] nativeAcquireUpdatedTrackables(long j, long j2, int i);

    public native long nativeGetTimestamp(long j, long j2);
}
