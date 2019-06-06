package com.google.ar.core;

class TrackableBase {
    private long a = 0;
    private Session b = null;

    TrackableBase() {
    }

    private native long nativeCreateAnchor(long j, long j2, Pose pose);

    private native long[] nativeGetAnchors(long j, long j2);

    private native int nativeGetTrackingState(long j, long j2);

    private static native int nativeGetType(long j, long j2);

    private static native void nativeReleaseTrackable(long j);

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
