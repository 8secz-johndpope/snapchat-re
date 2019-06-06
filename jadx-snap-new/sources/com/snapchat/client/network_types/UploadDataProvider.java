package com.snapchat.client.network_types;

import com.snapchat.client.shims.DataProvider;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class UploadDataProvider {

    static final class CppProxy extends UploadDataProvider {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed = new AtomicBoolean(false);
        private final long nativeRef;

        static {
            Class cls = UploadDataProvider.class;
        }

        private CppProxy(long j) {
            if (j != 0) {
                this.nativeRef = j;
                return;
            }
            throw new RuntimeException("nativeRef is zero");
        }

        private native void nativeDestroy(long j);

        private native DataProvider native_data(long j);

        public final DataProvider data() {
            return native_data(this.nativeRef);
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
    }

    public abstract DataProvider data();
}
