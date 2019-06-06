package com.looksery.sdk.io;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.io.InputStream;

class CompressedLensResolver implements ResourceResolver {
    CompressedLensResolver() {
    }

    private native String nativeGetZPrefix();

    private native int nativeOpenResourceFd(String str);

    public String getScheme() {
        return nativeGetZPrefix().split(":")[0];
    }

    public InputStream openResource(Uri uri) {
        throw new IOException("Rewindable streams are not supported for ".concat(String.valueOf(uri)));
    }

    public AssetFileDescriptor openResourceFd(Uri uri) {
        return new AssetFileDescriptor(ParcelFileDescriptor.adoptFd(nativeOpenResourceFd(uri.toString())), 0, -1);
    }
}
