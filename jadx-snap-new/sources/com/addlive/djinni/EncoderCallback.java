package com.addlive.djinni;

import java.util.concurrent.atomic.AtomicBoolean;

public abstract class EncoderCallback {

    static final class CppProxy extends EncoderCallback {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed = new AtomicBoolean(false);
        private final long nativeRef;

        static {
            Class cls = EncoderCallback.class;
        }

        private CppProxy(long j) {
            if (j != 0) {
                this.nativeRef = j;
                return;
            }
            throw new RuntimeException("nativeRef is zero");
        }

        private native void nativeDestroy(long j);

        private native void native_onFrameEncoded(long j, FrameData frameData);

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

        public final void onFrameEncoded(FrameData frameData) {
            native_onFrameEncoded(this.nativeRef, frameData);
        }
    }

    public abstract void onFrameEncoded(FrameData frameData);
}
