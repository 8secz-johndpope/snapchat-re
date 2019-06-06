package com.looksery.sdk;

import com.looksery.sdk.domain.CoreMemInfo;

public final class LSPerformanceMonitorWrapper implements NativeBridge {
    private final long mNativeSingleton;

    static class Holder {
        static final LSPerformanceMonitorWrapper INSTANCE = new LSPerformanceMonitorWrapper();

        private Holder() {
        }
    }

    private LSPerformanceMonitorWrapper() {
        LSNativeLibraryLoader.ensureAllAreLoaded();
        this.mNativeSingleton = nativeGetInstance();
    }

    public static LSPerformanceMonitorWrapper getInstance() {
        return Holder.INSTANCE;
    }

    private static native long nativeGetInstance();

    private native CoreMemInfo nativeGetMemInfo();

    private native void nativeReset();

    private native void nativeStart();

    private native void nativeStop();

    public final CoreMemInfo getMemInfo() {
        return nativeGetMemInfo();
    }

    public final long getNativeHandle() {
        return this.mNativeSingleton;
    }

    public final void reset() {
        nativeReset();
    }

    public final void start() {
        nativeStart();
    }

    public final void stop() {
        nativeStop();
    }
}
