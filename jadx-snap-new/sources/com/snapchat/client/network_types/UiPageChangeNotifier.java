package com.snapchat.client.network_types;

import java.util.concurrent.atomic.AtomicBoolean;

public abstract class UiPageChangeNotifier {

    static final class CppProxy extends UiPageChangeNotifier {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed = new AtomicBoolean(false);
        private final long nativeRef;

        static {
            Class cls = UiPageChangeNotifier.class;
        }

        private CppProxy(long j) {
            if (j != 0) {
                this.nativeRef = j;
                return;
            }
            throw new RuntimeException("nativeRef is zero");
        }

        private native void nativeDestroy(long j);

        private native void native_notifyListener(long j, UIPageInfo uIPageInfo);

        private native UIPageInfo native_registerListener(long j, UiPageChangeListener uiPageChangeListener);

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

        public final void notifyListener(UIPageInfo uIPageInfo) {
            native_notifyListener(this.nativeRef, uIPageInfo);
        }

        public final UIPageInfo registerListener(UiPageChangeListener uiPageChangeListener) {
            return native_registerListener(this.nativeRef, uiPageChangeListener);
        }
    }

    public abstract void notifyListener(UIPageInfo uIPageInfo);

    public abstract UIPageInfo registerListener(UiPageChangeListener uiPageChangeListener);
}
