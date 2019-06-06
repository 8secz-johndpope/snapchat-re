package com.snapcv.segmentation;

import com.mapbox.mapboxsdk.constants.MapboxConstants;
import defpackage.aime;
import defpackage.aimf;
import defpackage.aimg;
import defpackage.aimh;
import defpackage.aimi;
import java.nio.ByteBuffer;

public final class SegmentationWrapper {
    private final aimg nativeBridge;
    private final aimh segmentationConfiguration;
    private final aimi segmentedMask = new aimi();

    public SegmentationWrapper(aimh aimh) {
        this.segmentationConfiguration = aimh;
        checkNativeLibrariesLoaded();
        long nativeInit = nativeInit(aimh.a, aimh.b, false, false, aimh.c, false, aimh.d, aimh.e, 0, 0, 0);
        if (nativeInit != 0) {
            this.nativeBridge = new aimg(nativeInit, new Runnable() {
                public final void run() {
                    SegmentationWrapper.this.nativeRelease();
                }
            });
            return;
        }
        throw new aime("Native init failed.");
    }

    private static void checkNativeLibrariesLoaded() {
        if (!aimf.a()) {
            throw new aime("Native libraries aren't loaded.");
        }
    }

    private native ByteBuffer nativeGetMaskWithBuffer(ByteBuffer byteBuffer, int[] iArr, float[] fArr);

    private native long nativeInit(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, float f, float f2, int i, int i2, int i3);

    private native void nativeRelease();

    private native boolean nativeUpdateFrame(byte[] bArr, boolean z, int i, int i2, int i3);

    public final aimi getMask() {
        aimi aimi;
        synchronized (this.segmentedMask) {
            int[] iArr = new int[]{0, 0};
            float[] fArr = new float[]{MapboxConstants.MINIMUM_ZOOM};
            ByteBuffer nativeGetMaskWithBuffer = nativeGetMaskWithBuffer(this.segmentedMask.a, iArr, fArr);
            if (nativeGetMaskWithBuffer == null || iArr[0] <= 0 || iArr[1] <= 0) {
                throw new aime("Get mask failed. Get NULL mask buffer.");
            }
            this.segmentedMask.a = nativeGetMaskWithBuffer;
            aimi aimi2 = this.segmentedMask;
            int i = iArr[0];
            int i2 = iArr[1];
            aimi2.b = i;
            aimi2.c = i2;
            this.segmentedMask.d = fArr[0];
            aimi = this.segmentedMask;
        }
        return aimi;
    }

    public final long getNativeHandle() {
        return this.nativeBridge.b;
    }

    public final void release() {
        aimg aimg = this.nativeBridge;
        if (aimg.a.compareAndSet(false, true)) {
            aimg.c.run();
        }
        this.segmentedMask.a = null;
    }

    public final void updateFrame(byte[] bArr, int i, int i2, int i3, int i4) {
        if (i == 17 || i == 35) {
            boolean z = i == 17;
            synchronized (this.segmentedMask) {
                if (nativeUpdateFrame(bArr, z, i2, i3, i4)) {
                } else {
                    throw new aime(String.format("Update frame failed. width = %d height = %d imageFormat = %d rotation = %d", new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i), Integer.valueOf(i4)}));
                }
            }
            return;
        }
        throw new aime("Use invalid image format. Only support NV21 and YUV_420_888.");
    }
}
