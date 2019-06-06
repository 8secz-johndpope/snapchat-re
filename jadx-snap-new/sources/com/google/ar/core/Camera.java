package com.google.ar.core;

public class Camera {
    public final Session a;
    public long b;

    static {
        Class.class.getSimpleName();
    }

    protected Camera() {
        this.a = null;
        this.b = 0;
    }

    public Camera(Session session, Frame frame) {
        this.a = session;
        this.b = nativeAcquireCamera(session.a, frame.b);
    }

    private static native long nativeAcquireCamera(long j, long j2);

    private native Pose nativeDisplayOrientedPose(long j, long j2);

    private native Pose nativeGetPose(long j, long j2);

    private native int nativeGetTrackingState(long j, long j2);

    private native void nativeGetViewMatrix(long j, long j2, float[] fArr, int i);

    private static native void nativeReleaseCamera(long j);

    public boolean equals(Object obj) {
        return obj != null && obj.getClass() == getClass() && ((Camera) obj).b == this.b;
    }

    /* Access modifiers changed, original: protected */
    public void finalize() {
        long j = this.b;
        if (j != 0) {
            nativeReleaseCamera(j);
        }
        super.finalize();
    }

    public int hashCode() {
        return Long.valueOf(this.b).hashCode();
    }

    public native void nativeGetProjectionMatrix(long j, long j2, float[] fArr, int i, float f, float f2);
}
