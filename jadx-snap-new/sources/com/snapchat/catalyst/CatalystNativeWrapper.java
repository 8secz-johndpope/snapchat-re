package com.snapchat.catalyst;

import defpackage.acbs;
import java.util.concurrent.atomic.AtomicBoolean;

public class CatalystNativeWrapper {
    private static final String TAG = "catalyst";
    private long catalystNativeHandle = 0;
    private final AtomicBoolean mNativeReleased = new AtomicBoolean();
    private final Runnable mReleaser = new Runnable() {
        public final void run() {
            CatalystNativeWrapper.this.nativeRelease();
        }
    };

    public CatalystNativeWrapper() {
        if (acbs.a()) {
            nativeInit();
            return;
        }
        throw new IllegalStateException("Native libraries CatalystWrapper aren't loaded.");
    }

    private native void nativeEnableCatalystSgemmTune(boolean z);

    private native void nativeInit();

    private native void nativeRelease();

    private native void nativeSetCatalystConfig(String str);

    private native void nativeSetCatalystConfigPath(String str);

    public void enableCatalystSgemmTune(boolean z) {
        nativeEnableCatalystSgemmTune(z);
    }

    public void release() {
        if (this.mNativeReleased.compareAndSet(false, true)) {
            this.mReleaser.run();
        }
    }

    public void setCatalystConfig(String str) {
        nativeSetCatalystConfig(str);
    }

    public void setCatalystConfigPath(String str) {
        nativeSetCatalystConfigPath(str);
    }
}
