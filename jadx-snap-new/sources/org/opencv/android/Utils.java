package org.opencv.android;

import android.graphics.Bitmap;
import org.opencv.core.Mat;

public class Utils {
    public static void bitmapToMat(Bitmap bitmap, Mat mat) {
        bitmapToMat(bitmap, mat, false);
    }

    public static void bitmapToMat(Bitmap bitmap, Mat mat, boolean z) {
        if (bitmap == null) {
            throw new IllegalArgumentException("bmp == null");
        } else if (mat != null) {
            nBitmapToMat2(bitmap, mat.nativeObj, z);
        } else {
            throw new IllegalArgumentException("mat == null");
        }
    }

    public static void matToBitmap(Mat mat, Bitmap bitmap) {
        matToBitmap(mat, bitmap, false);
    }

    public static void matToBitmap(Mat mat, Bitmap bitmap, boolean z) {
        if (mat == null) {
            throw new IllegalArgumentException("mat == null");
        } else if (bitmap != null) {
            nMatToBitmap2(mat.nativeObj, bitmap, z);
        } else {
            throw new IllegalArgumentException("bmp == null");
        }
    }

    private static native void nBitmapToMat2(Bitmap bitmap, long j, boolean z);

    private static native void nMatToBitmap2(long j, Bitmap bitmap, boolean z);
}
