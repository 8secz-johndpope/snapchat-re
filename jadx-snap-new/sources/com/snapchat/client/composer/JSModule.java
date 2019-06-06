package com.snapchat.client.composer;

import java.util.concurrent.atomic.AtomicBoolean;

public abstract class JSModule {

    static final class CppProxy extends JSModule {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed = new AtomicBoolean(false);
        private final long nativeRef;

        static {
            Class cls = JSModule.class;
        }

        private CppProxy(long j) {
            if (j != 0) {
                this.nativeRef = j;
                return;
            }
            throw new RuntimeException("nativeRef is zero");
        }

        private native void nativeDestroy(long j);

        private native void native_addUnloadObserver(long j, Object obj);

        private native Object native_getProperty(long j, String str);

        public final void addUnloadObserver(Object obj) {
            native_addUnloadObserver(this.nativeRef, obj);
        }

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

        public final Object getProperty(String str) {
            return native_getProperty(this.nativeRef, str);
        }
    }

    public abstract void addUnloadObserver(Object obj);

    public abstract Object getProperty(String str);
}
