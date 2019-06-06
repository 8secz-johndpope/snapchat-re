package com.google.ar.core;

public class HitResult {
    private final Session a = null;
    private long b = 0;

    protected HitResult() {
    }

    private native long nativeAcquireTrackable(long j, long j2);

    private native long nativeCreateAnchor(long j, long j2);

    private static native void nativeDestroyHitResult(long j);

    private native float nativeGetDistance(long j, long j2);

    private native Pose nativeGetPose(long j, long j2);

    public boolean equals(Object obj) {
        return obj != null && obj.getClass() == getClass();
    }

    /* Access modifiers changed, original: protected */
    public void finalize() {
        super.finalize();
    }

    public int hashCode() {
        return Long.valueOf(0).hashCode();
    }
}
