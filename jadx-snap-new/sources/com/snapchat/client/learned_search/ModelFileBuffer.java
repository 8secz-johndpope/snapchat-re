package com.snapchat.client.learned_search;

import java.util.concurrent.atomic.AtomicBoolean;

public abstract class ModelFileBuffer {

    static final class CppProxy extends ModelFileBuffer {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed = new AtomicBoolean(false);
        private final long nativeRef;

        static {
            Class cls = ModelFileBuffer.class;
        }

        private CppProxy(long j) {
            if (j != 0) {
                this.nativeRef = j;
                return;
            }
            throw new RuntimeException("nativeRef is zero");
        }

        private native void nativeDestroy(long j);

        private native void native_dispose(long j);

        private native long native_getAddress(long j);

        private native long native_getSize(long j);

        private native boolean native_stateIsValid(long j);

        public final void destroy() {
            if (!this.destroyed.getAndSet(true)) {
                nativeDestroy(this.nativeRef);
            }
        }

        public final void dispose() {
            native_dispose(this.nativeRef);
        }

        /* Access modifiers changed, original: protected|final */
        public final void finalize() {
            destroy();
            super.finalize();
        }

        public final long getAddress() {
            return native_getAddress(this.nativeRef);
        }

        public final long getSize() {
            return native_getSize(this.nativeRef);
        }

        public final boolean stateIsValid() {
            return native_stateIsValid(this.nativeRef);
        }
    }

    public static native ModelFileBuffer modelFileBufferInstanceWithPath(String str);

    public abstract void dispose();

    public abstract long getAddress();

    public abstract long getSize();

    public abstract boolean stateIsValid();
}
