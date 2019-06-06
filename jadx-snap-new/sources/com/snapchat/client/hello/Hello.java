package com.snapchat.client.hello;

import com.snapchat.client.shims.Logger;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class Hello {

    static final class CppProxy extends Hello {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed = new AtomicBoolean(false);
        private final long nativeRef;

        static {
            Class cls = Hello.class;
        }

        private CppProxy(long j) {
            if (j != 0) {
                this.nativeRef = j;
                return;
            }
            throw new RuntimeException("nativeRef is zero");
        }

        private native void nativeDestroy(long j);

        private native void native_hello(long j, String str, long j2);

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

        public final void hello(String str, long j) {
            native_hello(this.nativeRef, str, j);
        }
    }

    public static native Hello getInstance(Logger logger);

    public abstract void hello(String str, long j);
}
