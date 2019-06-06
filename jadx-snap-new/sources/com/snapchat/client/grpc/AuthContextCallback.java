package com.snapchat.client.grpc;

import java.util.concurrent.atomic.AtomicBoolean;

public abstract class AuthContextCallback {

    static final class CppProxy extends AuthContextCallback {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed = new AtomicBoolean(false);
        private final long nativeRef;

        static {
            Class cls = AuthContextCallback.class;
        }

        private CppProxy(long j) {
            if (j != 0) {
                this.nativeRef = j;
                return;
            }
            throw new RuntimeException("nativeRef is zero");
        }

        private native void nativeDestroy(long j);

        private native void native_onComplete(long j, AuthContext authContext);

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

        public final void onComplete(AuthContext authContext) {
            native_onComplete(this.nativeRef, authContext);
        }
    }

    public abstract void onComplete(AuthContext authContext);
}
