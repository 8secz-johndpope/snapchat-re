package com.looksery.sdk;

import java.util.concurrent.atomic.AtomicBoolean;

final class SafeNativeBridge implements NativeBridge {
    private final long mNativeHandle;
    private final AtomicBoolean mNativeReleased = new AtomicBoolean();
    private final Runnable mNativeReleaser;

    SafeNativeBridge(long j, Runnable runnable) {
        this.mNativeHandle = j;
        this.mNativeReleaser = runnable;
    }

    public final long getNativeHandle() {
        return this.mNativeHandle;
    }

    public final void release() {
        if (this.mNativeReleased.compareAndSet(false, true)) {
            this.mNativeReleaser.run();
        }
    }
}
