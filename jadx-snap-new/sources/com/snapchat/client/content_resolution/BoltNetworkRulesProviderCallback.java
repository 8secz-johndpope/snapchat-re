package com.snapchat.client.content_resolution;

import java.util.concurrent.atomic.AtomicBoolean;

public abstract class BoltNetworkRulesProviderCallback {

    static final class CppProxy extends BoltNetworkRulesProviderCallback {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed = new AtomicBoolean(false);
        private final long nativeRef;

        static {
            Class cls = BoltNetworkRulesProviderCallback.class;
        }

        private CppProxy(long j) {
            if (j != 0) {
                this.nativeRef = j;
                return;
            }
            throw new RuntimeException("nativeRef is zero");
        }

        private native void nativeDestroy(long j);

        private native byte[] native_getNetworkRules(long j);

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

        public final byte[] getNetworkRules() {
            return native_getNetworkRules(this.nativeRef);
        }
    }

    public abstract byte[] getNetworkRules();
}
