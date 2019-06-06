package com.google.ar.core;

public class LightEstimate {
    private final Session a;
    private long b;

    protected LightEstimate() {
        this.b = 0;
        this.a = null;
        this.b = 0;
    }

    LightEstimate(Session session) {
        this.b = 0;
        this.a = session;
        this.b = nativeCreateLightEstimate(session.a);
    }

    private static native long nativeCreateLightEstimate(long j);

    private static native void nativeDestroyLightEstimate(long j);

    private native void nativeGetColorCorrection(long j, long j2, float[] fArr, int i);

    private native float nativeGetPixelIntensity(long j, long j2);

    private native int nativeGetState(long j, long j2);

    /* Access modifiers changed, original: protected */
    public void finalize() {
        long j = this.b;
        if (j != 0) {
            nativeDestroyLightEstimate(j);
        }
        super.finalize();
    }
}
