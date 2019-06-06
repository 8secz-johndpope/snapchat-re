package com.mapbox.mapboxsdk;

import android.graphics.Bitmap;

public class BitmapFactory {
    private static BitmapProvider sAlternativeProvider;

    public interface BitmapProvider {
        Bitmap decodeByteArray(byte[] bArr, int i, int i2);
    }

    public static Bitmap decodeByteArray(byte[] bArr, int i, int i2) {
        BitmapProvider bitmapProvider = sAlternativeProvider;
        return bitmapProvider != null ? bitmapProvider.decodeByteArray(bArr, i, i2) : defaultDecodeByteArray(bArr, i, i2);
    }

    public static Bitmap defaultDecodeByteArray(byte[] bArr, int i, int i2) {
        return android.graphics.BitmapFactory.decodeByteArray(bArr, i, i2);
    }

    public static void setAlternativeProvider(BitmapProvider bitmapProvider) {
        sAlternativeProvider = bitmapProvider;
    }
}
