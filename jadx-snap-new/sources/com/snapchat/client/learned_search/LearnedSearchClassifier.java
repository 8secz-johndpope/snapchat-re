package com.snapchat.client.learned_search;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class LearnedSearchClassifier {

    static final class CppProxy extends LearnedSearchClassifier {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed = new AtomicBoolean(false);
        private final long nativeRef;

        static {
            Class cls = LearnedSearchClassifier.class;
        }

        private CppProxy(long j) {
            if (j != 0) {
                this.nativeRef = j;
                return;
            }
            throw new RuntimeException("nativeRef is zero");
        }

        private native void nativeDestroy(long j);

        private native ArrayList<String> native_getAutocompleteSuggestions(long j, String str);

        private native boolean native_modelIsInitialized(long j);

        private native ArrayList<Integer> native_predict(long j, String str, int i);

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

        public final ArrayList<String> getAutocompleteSuggestions(String str) {
            return native_getAutocompleteSuggestions(this.nativeRef, str);
        }

        public final boolean modelIsInitialized() {
            return native_modelIsInitialized(this.nativeRef);
        }

        public final ArrayList<Integer> predict(String str, int i) {
            return native_predict(this.nativeRef, str, i);
        }
    }

    public static native LearnedSearchClassifier learnedSearchClassifierWithBuffer(ModelFileBuffer modelFileBuffer);

    public abstract ArrayList<String> getAutocompleteSuggestions(String str);

    public abstract boolean modelIsInitialized();

    public abstract ArrayList<Integer> predict(String str, int i);
}
