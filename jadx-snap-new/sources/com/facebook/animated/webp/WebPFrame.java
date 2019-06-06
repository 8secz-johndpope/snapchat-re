package com.facebook.animated.webp;

import android.graphics.Bitmap;
import defpackage.aue;
import defpackage.ayf;

public class WebPFrame implements ayf {
    @aue
    private long mNativeContext;

    @aue
    WebPFrame(long j) {
        this.mNativeContext = j;
    }

    private native void nativeFinalize();

    private native int nativeGetDurationMs();

    private native boolean nativeRenderFrame(int i, int i2, Bitmap bitmap);

    public final void a() {
        nativeDispose();
    }

    public final void a(int i, int i2, Bitmap bitmap) {
        if (!nativeRenderFrame(i, i2, bitmap)) {
            bitmap.eraseColor(0);
        }
    }

    public final int b() {
        return nativeGetWidth();
    }

    public final int c() {
        return nativeGetHeight();
    }

    public final int d() {
        return nativeGetXOffset();
    }

    public final int e() {
        return nativeGetYOffset();
    }

    public final boolean f() {
        return nativeShouldDisposeToBackgroundColor();
    }

    /* Access modifiers changed, original: protected */
    public void finalize() {
        nativeFinalize();
    }

    public final boolean g() {
        return nativeIsBlendWithPreviousFrame();
    }

    public native void nativeDispose();

    public native int nativeGetHeight();

    public native int nativeGetWidth();

    public native int nativeGetXOffset();

    public native int nativeGetYOffset();

    public native boolean nativeIsBlendWithPreviousFrame();

    public native boolean nativeShouldDisposeToBackgroundColor();
}
