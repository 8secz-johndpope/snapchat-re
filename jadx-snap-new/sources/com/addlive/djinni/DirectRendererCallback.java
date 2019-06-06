package com.addlive.djinni;

import java.util.concurrent.atomic.AtomicBoolean;

public abstract class DirectRendererCallback {

    static final class CppProxy extends DirectRendererCallback {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed = new AtomicBoolean(false);
        private final long nativeRef;

        static {
            Class cls = DirectRendererCallback.class;
        }

        private CppProxy(long j) {
            if (j != 0) {
                this.nativeRef = j;
                return;
            }
            throw new RuntimeException("nativeRef is zero");
        }

        private native void nativeDestroy(long j);

        private native void native_onFrame(long j, VideoFrame videoFrame);

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

        public final void onFrame(VideoFrame videoFrame) {
            native_onFrame(this.nativeRef, videoFrame);
        }
    }

    public abstract void onFrame(VideoFrame videoFrame);
}
