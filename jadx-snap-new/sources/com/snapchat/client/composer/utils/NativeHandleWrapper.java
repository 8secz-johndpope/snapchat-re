package com.snapchat.client.composer.utils;

import java.util.concurrent.atomic.AtomicLong;

public abstract class NativeHandleWrapper {
    private final AtomicLong mNativeHandle;

    public NativeHandleWrapper(long j) {
        this.mNativeHandle = new AtomicLong(j);
    }

    public void destroy() {
        long andSet = this.mNativeHandle.getAndSet(0);
        if (andSet != 0) {
            destroyHandle(andSet);
        }
    }

    public abstract void destroyHandle(long j);

    /* Access modifiers changed, original: protected */
    public void finalize() {
        destroy();
        super.finalize();
    }

    public long getNativeHandle() {
        return this.mNativeHandle.get();
    }
}
