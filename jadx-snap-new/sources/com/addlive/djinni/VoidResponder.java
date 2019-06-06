package com.addlive.djinni;

import java.util.concurrent.atomic.AtomicBoolean;

public abstract class VoidResponder {

    static final class CppProxy extends VoidResponder {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed = new AtomicBoolean(false);
        private final long nativeRef;

        static {
            Class cls = VoidResponder.class;
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

        private native void native_onError(long j, int i, String str);

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

        public final void onError(int i, String str) {
            native_onError(this.nativeRef, i, str);
        }
    }

    public abstract void onCompletion();

    public abstract void onError(int i, String str);
}
