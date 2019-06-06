package com.snapchat.client.network_types;

import java.util.concurrent.atomic.AtomicBoolean;

public abstract class RankerCallback {

    static final class CppProxy extends RankerCallback {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed = new AtomicBoolean(false);
        private final long nativeRef;

        static {
            Class cls = RankerCallback.class;
        }

        private CppProxy(long j) {
            if (j != 0) {
                this.nativeRef = j;
                return;
            }
            throw new RuntimeException("nativeRef is zero");
        }

        private native void nativeDestroy(long j);

        private native void native_onCanceled(long j, HttpRequestKey httpRequestKey);

        private native void native_onFailed(long j, HttpRequestKey httpRequestKey);

        private native void native_onSucceeded(long j, HttpRequestKey httpRequestKey);

        public final void destroy() {
            if (!this.destroyed.getAndSet(true)) {
                nativeDestroy(this.nativeRef);
            }
        }

        /* Access modifiers changed, original: protected|final */
        public final void finalize() {
            destroy();
            super.finalize();
        }

        public final void onCanceled(HttpRequestKey httpRequestKey) {
            native_onCanceled(this.nativeRef, httpRequestKey);
        }

        public final void onFailed(HttpRequestKey httpRequestKey) {
            native_onFailed(this.nativeRef, httpRequestKey);
        }

        public final void onSucceeded(HttpRequestKey httpRequestKey) {
            native_onSucceeded(this.nativeRef, httpRequestKey);
        }
    }

    public abstract void onCanceled(HttpRequestKey httpRequestKey);

    public abstract void onFailed(HttpRequestKey httpRequestKey);

    public abstract void onSucceeded(HttpRequestKey httpRequestKey);
}
