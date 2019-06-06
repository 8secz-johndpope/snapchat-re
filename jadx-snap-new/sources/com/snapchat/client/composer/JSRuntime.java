package com.snapchat.client.composer;

import java.util.concurrent.atomic.AtomicBoolean;

public abstract class JSRuntime {

    static final class CppProxy extends JSRuntime {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed = new AtomicBoolean(false);
        private final long nativeRef;

        static {
            Class cls = JSRuntime.class;
        }

        private CppProxy(long j) {
            if (j != 0) {
                this.nativeRef = j;
                return;
            }
            throw new RuntimeException("nativeRef is zero");
        }

        private native void nativeDestroy(long j);

        private native JSModule native_getModule(long j, String str, String str2);

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

        public final JSModule getModule(String str, String str2) {
            return native_getModule(this.nativeRef, str, str2);
        }
    }

    public abstract JSModule getModule(String str, String str2);
}
