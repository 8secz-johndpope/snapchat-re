package com.snap.previewtools.tracking;

import android.view.View;
import defpackage.ajdx;
import defpackage.iia;

public class ManyTargetTracker {
    private static final String TAG = "ManyTargetTracker";
    private static boolean areLibrariesLoaded = false;
    static final float kSCLagunaTrackingDistCoeffK1 = -0.033f;
    static final float kSCLagunaTrackingDistCoeffK2 = 6.3E-4f;
    static final float kSCLagunaTrackingFocalLengthMultiplier = 0.20284927f;
    private volatile boolean mTrackerReleased;
    private long nativeHandle;

    public ManyTargetTracker() {
        this((byte) 0);
    }

    private ManyTargetTracker(byte b) {
        this.mTrackerReleased = false;
    }

    private synchronized void b() {
        if (!areLibrariesLoaded) {
            try {
                System.loadLibrary("c++_shared");
                System.loadLibrary("opencv");
                System.loadLibrary("3dstickers");
                areLibrariesLoaded = true;
            } catch (SecurityException | UnsatisfiedLinkError unused) {
            }
        }
    }

    private /* synthetic */ ManyTargetTracker c() {
        b();
        initNative();
        return this;
    }

    private native TrackingTransformData getTransformNative(int i);

    private native void initNative();

    private native void releaseNative();

    private native void removeTargetNative(int i);

    private native void setCameraNative(float f, float f2, float f3, float f4, float f5);

    private native void setTargetNative(int i, int i2, int i3, int i4, int i5, int i6, int i7);

    private native int trackNative(int i, int i2, int i3, byte[] bArr);

    public final int a(int i, int i2, byte[] bArr) {
        return trackNative(1, i, i2, bArr);
    }

    public final ajdx<ManyTargetTracker> a() {
        return ajdx.c(new -$$Lambda$ManyTargetTracker$CMlRqGrK-nu7eDsvUI5dk59jVTs(this));
    }

    public final void a(int i) {
        removeTargetNative(i);
    }

    public final void a(int i, iia iia, View view, int i2) {
        float f = (float) i2;
        setTargetNative(i, iia.a(), iia.b(), (int) ((view.getX() + ((float) (view.getWidth() / 2))) / f), (int) ((view.getY() + ((float) (view.getHeight() / 2))) / f), (int) ((((float) view.getWidth()) * view.getScaleX()) / f), (int) ((((float) view.getHeight()) * view.getScaleY()) / f));
    }

    public final TrackingTransformData b(int i) {
        return getTransformNative(i);
    }
}
