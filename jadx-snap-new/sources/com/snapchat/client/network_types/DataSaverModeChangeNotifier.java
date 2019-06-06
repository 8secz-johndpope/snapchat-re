package com.snapchat.client.network_types;

import java.util.concurrent.atomic.AtomicBoolean;

public abstract class DataSaverModeChangeNotifier {

    static final class CppProxy extends DataSaverModeChangeNotifier {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed = new AtomicBoolean(false);
        private final long nativeRef;

        static {
            Class cls = DataSaverModeChangeNotifier.class;
        }

        private CppProxy(long j) {
            if (j != 0) {
                this.nativeRef = j;
                return;
            }
            throw new RuntimeException("nativeRef is zero");
        }

        private native void nativeDestroy(long j);

        private native void native_notifyListener(long j, boolean z);

        private native boolean native_registerListener(long j, DataSaverModeChangeListener dataSaverModeChangeListener);

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

        public final void notifyListener(boolean z) {
            native_notifyListener(this.nativeRef, z);
        }

        public final boolean registerListener(DataSaverModeChangeListener dataSaverModeChangeListener) {
            return native_registerListener(this.nativeRef, dataSaverModeChangeListener);
        }
    }

    public abstract void notifyListener(boolean z);

    public abstract boolean registerListener(DataSaverModeChangeListener dataSaverModeChangeListener);
}
