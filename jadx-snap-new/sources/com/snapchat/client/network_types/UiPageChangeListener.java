package com.snapchat.client.network_types;

import java.util.concurrent.atomic.AtomicBoolean;

public abstract class UiPageChangeListener {

    static final class CppProxy extends UiPageChangeListener {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed = new AtomicBoolean(false);
        private final long nativeRef;

        static {
            Class cls = UiPageChangeListener.class;
        }

        private CppProxy(long j) {
            if (j != 0) {
                this.nativeRef = j;
                return;
            }
            throw new RuntimeException("nativeRef is zero");
        }

        private native void nativeDestroy(long j);

        private native void native_onUiPageChanged(long j, UIPageInfo uIPageInfo);

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

        public final void onUiPageChanged(UIPageInfo uIPageInfo) {
            native_onUiPageChanged(this.nativeRef, uIPageInfo);
        }
    }

    public abstract void onUiPageChanged(UIPageInfo uIPageInfo);
}
