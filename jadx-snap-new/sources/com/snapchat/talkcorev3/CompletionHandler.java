package com.snapchat.talkcorev3;

import java.util.concurrent.atomic.AtomicBoolean;

public abstract class CompletionHandler {

    static final class CppProxy extends CompletionHandler {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed = new AtomicBoolean(false);
        private final long nativeRef;

        static {
            Class cls = CompletionHandler.class;
        }

        private CppProxy(long j) {
            if (j != 0) {
                this.nativeRef = j;
                return;
            }
            throw new RuntimeException("nativeRef is zero");
        }

        private native void nativeDestroy(long j);

        private native void native_onCompletion(long j);

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

        public final void onCompletion() {
            native_onCompletion(this.nativeRef);
        }
    }

    public abstract void onCompletion();
}
