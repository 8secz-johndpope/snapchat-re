package com.google.ar.core;

import java.nio.ByteBuffer;

public class PointCloud {
    private final Session a;
    private long b;

    protected PointCloud() {
        this.b = 0;
        this.a = null;
        this.b = 0;
    }

    private native ByteBuffer nativeGetData(long j, long j2);

    private native long nativeGetTimestamp(long j, long j2);

    private native void nativeReleasePointCloud(long j);

    /* Access modifiers changed, original: protected */
    public void finalize() {
        super.finalize();
    }
}
