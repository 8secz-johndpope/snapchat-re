package com.snapchat.client.learned_search;

import java.util.concurrent.atomic.AtomicBoolean;

public abstract class ModelCoordinator {

    static final class CppProxy extends ModelCoordinator {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed = new AtomicBoolean(false);
        private final long nativeRef;

        static {
            Class cls = ModelCoordinator.class;
        }

        private CppProxy(long j) {
            if (j != 0) {
                this.nativeRef = j;
                return;
            }
            throw new RuntimeException("nativeRef is zero");
        }

        private native void nativeDestroy(long j);

        private native ModelFileBuffer native_getModel(long j, String str);

        private native boolean native_updateLocalModel(long j, String str);

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

        public final ModelFileBuffer getModel(String str) {
            return native_getModel(this.nativeRef, str);
        }

        public final boolean updateLocalModel(String str) {
            return native_updateLocalModel(this.nativeRef, str);
        }
    }

    public static native ModelCoordinator modelCoordinatorInstance(ModelCacheExecutor modelCacheExecutor, ModelUpdateExecutor modelUpdateExecutor);

    public abstract ModelFileBuffer getModel(String str);

    public abstract boolean updateLocalModel(String str);
}
