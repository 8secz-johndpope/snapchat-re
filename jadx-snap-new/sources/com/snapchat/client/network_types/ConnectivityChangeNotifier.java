package com.snapchat.client.network_types;

import java.util.concurrent.atomic.AtomicBoolean;

public abstract class ConnectivityChangeNotifier {

    static final class CppProxy extends ConnectivityChangeNotifier {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed = new AtomicBoolean(false);
        private final long nativeRef;

        static {
            Class cls = ConnectivityChangeNotifier.class;
        }

        private CppProxy(long j) {
            if (j != 0) {
                this.nativeRef = j;
                return;
            }
            throw new RuntimeException("nativeRef is zero");
        }

        private native void nativeDestroy(long j);

        private native void native_notifyListener(long j, Connectivity connectivity);

        private native Connectivity native_registerListener(long j, ConnectivityChangeListener connectivityChangeListener);

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

        public final void notifyListener(Connectivity connectivity) {
            native_notifyListener(this.nativeRef, connectivity);
        }

        public final Connectivity registerListener(ConnectivityChangeListener connectivityChangeListener) {
            return native_registerListener(this.nativeRef, connectivityChangeListener);
        }
    }

    public abstract void notifyListener(Connectivity connectivity);

    public abstract Connectivity registerListener(ConnectivityChangeListener connectivityChangeListener);
}
