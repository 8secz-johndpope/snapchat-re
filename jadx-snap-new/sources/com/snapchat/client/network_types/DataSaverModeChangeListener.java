package com.snapchat.client.network_types;

import java.util.concurrent.atomic.AtomicBoolean;

public abstract class DataSaverModeChangeListener {

    static final class CppProxy extends DataSaverModeChangeListener {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed = new AtomicBoolean(false);
        private final long nativeRef;

        static {
            Class cls = DataSaverModeChangeListener.class;
        }

        private CppProxy(long j) {
            if (j != 0) {
                this.nativeRef = j;
                return;
            }
            throw new RuntimeException("nativeRef is zero");
        }

        private native void nativeDestroy(long j);

        private native void native_onDataSaverModeChanged(long j, boolean z);

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

        public final void onDataSaverModeChanged(boolean z) {
            native_onDataSaverModeChanged(this.nativeRef, z);
        }
    }

    public abstract void onDataSaverModeChanged(boolean z);
}
