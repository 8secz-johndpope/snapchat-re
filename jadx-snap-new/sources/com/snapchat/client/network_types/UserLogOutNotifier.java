package com.snapchat.client.network_types;

import java.util.concurrent.atomic.AtomicBoolean;

public abstract class UserLogOutNotifier {

    static final class CppProxy extends UserLogOutNotifier {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed = new AtomicBoolean(false);
        private final long nativeRef;

        static {
            Class cls = UserLogOutNotifier.class;
        }

        private CppProxy(long j) {
            if (j != 0) {
                this.nativeRef = j;
                return;
            }
            throw new RuntimeException("nativeRef is zero");
        }

        private native void nativeDestroy(long j);

        private native void native_notifyListener(long j);

        private native void native_registerListener(long j, UserLogOutListener userLogOutListener);

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

        public final void notifyListener() {
            native_notifyListener(this.nativeRef);
        }

        public final void registerListener(UserLogOutListener userLogOutListener) {
            native_registerListener(this.nativeRef, userLogOutListener);
        }
    }

    public abstract void notifyListener();

    public abstract void registerListener(UserLogOutListener userLogOutListener);
}
