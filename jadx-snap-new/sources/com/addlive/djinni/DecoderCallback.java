package com.addlive.djinni;

import java.util.concurrent.atomic.AtomicBoolean;

public abstract class DecoderCallback {

    static final class CppProxy extends DecoderCallback {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed = new AtomicBoolean(false);
        private final long nativeRef;

        static {
            Class cls = DecoderCallback.class;
        }

        private CppProxy(long j) {
            if (j != 0) {
                this.nativeRef = j;
                return;
            }
            throw new RuntimeException("nativeRef is zero");
        }

        private native void nativeDestroy(long j);

        private native void native_onDecoderError(long j);

        private native void native_onFrameDecoded(long j, DecodedImage decodedImage);

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

        public final void onDecoderError() {
            native_onDecoderError(this.nativeRef);
        }

        public final void onFrameDecoded(DecodedImage decodedImage) {
            native_onFrameDecoded(this.nativeRef, decodedImage);
        }
    }

    public abstract void onDecoderError();

    public abstract void onFrameDecoded(DecodedImage decodedImage);
}
