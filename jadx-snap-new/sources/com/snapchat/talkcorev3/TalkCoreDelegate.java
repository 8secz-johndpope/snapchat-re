package com.snapchat.talkcorev3;

import java.util.concurrent.atomic.AtomicBoolean;

public abstract class TalkCoreDelegate {

    static final class CppProxy extends TalkCoreDelegate {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed = new AtomicBoolean(false);
        private final long nativeRef;

        static {
            Class cls = TalkCoreDelegate.class;
        }

        private CppProxy(long j) {
            if (j != 0) {
                this.nativeRef = j;
                return;
            }
            throw new RuntimeException("nativeRef is zero");
        }

        private native void nativeDestroy(long j);

        private native void native_postDelayedInMainThread(long j, AsyncTask asyncTask, long j2);

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

        public final void postDelayedInMainThread(AsyncTask asyncTask, long j) {
            native_postDelayedInMainThread(this.nativeRef, asyncTask, j);
        }
    }

    public abstract void postDelayedInMainThread(AsyncTask asyncTask, long j);
}
