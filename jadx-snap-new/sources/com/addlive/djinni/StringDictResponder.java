package com.addlive.djinni;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class StringDictResponder {

    static final class CppProxy extends StringDictResponder {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed = new AtomicBoolean(false);
        private final long nativeRef;

        static {
            Class cls = StringDictResponder.class;
        }

        private CppProxy(long j) {
            if (j != 0) {
                this.nativeRef = j;
                return;
            }
            throw new RuntimeException("nativeRef is zero");
        }

        private native void nativeDestroy(long j);

        private native void native_onCompletion(long j, HashMap<String, String> hashMap);

        private native void native_onError(long j, int i, String str);

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

        public final void onCompletion(HashMap<String, String> hashMap) {
            native_onCompletion(this.nativeRef, hashMap);
        }

        public final void onError(int i, String str) {
            native_onError(this.nativeRef, i, str);
        }
    }

    public abstract void onCompletion(HashMap<String, String> hashMap);

    public abstract void onError(int i, String str);
}
