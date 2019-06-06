package com.google.ar.core;

public class Anchor {
    private final Session a = null;
    private long b = 0;

    protected Anchor() {
    }

    private native void nativeDetach(long j, long j2);

    private native Pose nativeGetPose(long j, long j2);

    private native int nativeGetTrackingState(long j, long j2);

    private static native void nativeReleaseAnchor(long j);

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
