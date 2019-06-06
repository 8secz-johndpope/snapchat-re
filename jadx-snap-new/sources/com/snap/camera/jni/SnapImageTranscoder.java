package com.snap.camera.jni;

import android.graphics.Bitmap;

public class SnapImageTranscoder {
    public static native Bitmap nativeDecodeJpegToBitmap(byte[] bArr, int i, Bitmap bitmap, int i2, boolean z, boolean z2);

    public static native byte[] nativeDecodeJpegToByteArray(byte[] bArr, int i, int[] iArr, float f, int i2, int i3, int i4, boolean z, boolean z2);

    public static native byte[] nativeEncodeBitmapToJpeg(Bitmap bitmap, int[] iArr, int i, float f, int i2, int i3);

    public static native int[] nativeReadJpegHeader(byte[] bArr, int i);
}
