package com.looksery.sdk;

import android.net.Uri;

public class LensConverters {
    private LensConverters() {
    }

    private static native boolean nativeZstdToLz4(String str, String str2);

    private static native byte[] nativeZstdToLz4(byte[] bArr);

    public static boolean zstdToLz4(Uri uri, Uri uri2) {
        return nativeZstdToLz4(uri.toString(), uri2.toString());
    }

    public static byte[] zstdToLz4(byte[] bArr) {
        return nativeZstdToLz4(bArr);
    }
}
