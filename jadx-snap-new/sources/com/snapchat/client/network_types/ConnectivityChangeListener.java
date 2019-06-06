package com.snapchat.client.network_types;

import java.util.concurrent.atomic.AtomicBoolean;

public abstract class ConnectivityChangeListener {

    static final class CppProxy extends ConnectivityChangeListener {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed = new AtomicBoolean(false);
        private final long nativeRef;

        static {
            Class cls = ConnectivityChangeListener.class;
        }

        private CppProxy(long j) {
            if (j != 0) {
                this.nativeRef = j;
                return;
            }
            throw new RuntimeException("nativeRef is zero");
        }

        private native void nativeDestroy(long j);

        private native void native_onConnectivityChanged(long j, Connectivity connectivity);

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

        public final void onConnectivityChanged(Connectivity connectivity) {
            native_onConnectivityChanged(this.nativeRef, connectivity);
        }
    }

    public abstract void onConnectivityChanged(Connectivity connectivity);
}
