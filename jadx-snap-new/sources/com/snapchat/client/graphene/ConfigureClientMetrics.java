package com.snapchat.client.graphene;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class ConfigureClientMetrics {

    static final class CppProxy extends ConfigureClientMetrics {
        private final AtomicBoolean destroyed = new AtomicBoolean(false);
        private final long nativeRef;

        private CppProxy(long j) {
            if (j != 0) {
                this.nativeRef = j;
                return;
            }
            throw new RuntimeException("nativeRef is zero");
        }

        private native void nativeDestroy(long j);

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

    public static native ArrayList<ArrayList<String>> allClientMetrics();

    public static native ArrayList<String> allClientPartitions(int i);
}
