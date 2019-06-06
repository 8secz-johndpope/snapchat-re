package com.google.ar.core;

public class Config {
    public Session a;
    public long b;

    public enum a {
        BLOCKING(0),
        LATEST_CAMERA_IMAGE(1);
        
        public final int nativeCode;

        private a(int i) {
            this.nativeCode = i;
        }
    }

    protected Config() {
        this.a = null;
        this.b = 0;
    }

    public Config(Session session) {
        this.a = session;
        this.b = nativeCreate(session.a);
    }

    private static native long nativeCreate(long j);

    private static native void nativeDestroy(long j);

    private native int nativeGetLightEstimationMode(long j, long j2);

    private native int nativeGetUpdateMode(long j, long j2);

    private native void nativeSetLightEstimationMode(long j, long j2, int i);

    /* Access modifiers changed, original: protected */
    public void finalize() {
        long j = this.b;
        if (j != 0) {
            nativeDestroy(j);
        }
        super.finalize();
    }

    public native int nativeGetPlaneFindingMode(long j, long j2);

    public native void nativeSetPlaneFindingMode(long j, long j2, int i);

    public native void nativeSetUpdateMode(long j, long j2, int i);
}
