package com.snapchat.client.content_resolution;

import java.util.concurrent.atomic.AtomicBoolean;

public abstract class MossRankedMediaVariantsProviderCallback {

    static final class CppProxy extends MossRankedMediaVariantsProviderCallback {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed = new AtomicBoolean(false);
        private final long nativeRef;

        static {
            Class cls = MossRankedMediaVariantsProviderCallback.class;
        }

        private CppProxy(long j) {
            if (j != 0) {
                this.nativeRef = j;
                return;
            }
            throw new RuntimeException("nativeRef is zero");
        }

        private native void nativeDestroy(long j);

        private native byte[] native_getRankedMediaVariants(long j, String str);

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

        public final byte[] getRankedMediaVariants(String str) {
            return native_getRankedMediaVariants(this.nativeRef, str);
        }
    }

    public abstract byte[] getRankedMediaVariants(String str);
}
