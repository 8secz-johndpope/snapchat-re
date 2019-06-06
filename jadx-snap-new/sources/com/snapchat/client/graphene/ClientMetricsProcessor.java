package com.snapchat.client.graphene;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class ClientMetricsProcessor {

    static final class CppProxy extends ClientMetricsProcessor {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed = new AtomicBoolean(false);
        private final long nativeRef;

        static {
            Class cls = ClientMetricsProcessor.class;
        }

        private CppProxy(long j) {
            if (j != 0) {
                this.nativeRef = j;
                return;
            }
            throw new RuntimeException("nativeRef is zero");
        }

        private native void nativeDestroy(long j);

        private native long native_compact(long j);

        private native long native_enqueue(long j, int i, int i2, int i3, ArrayList<String> arrayList, long j2);

        private native MetricsPayload native_flush(long j);

        private native MetricsPayload native_flushWithContext(long j, FlushContext flushContext);

        public final long compact() {
            return native_compact(this.nativeRef);
        }

        public final void destroy() {
            if (!this.destroyed.getAndSet(true)) {
                nativeDestroy(this.nativeRef);
            }
        }

        public final long enqueue(int i, int i2, int i3, ArrayList<String> arrayList, long j) {
            return native_enqueue(this.nativeRef, i, i2, i3, arrayList, j);
        }

        /* Access modifiers changed, original: protected|final */
        public final void finalize() {
            destroy();
            super.finalize();
        }

        public final MetricsPayload flush() {
            return native_flush(this.nativeRef);
        }

        public final MetricsPayload flushWithContext(FlushContext flushContext) {
            return native_flushWithContext(this.nativeRef, flushContext);
        }
    }

    public static native ClientMetricsProcessor getInstance(StartupConfiguration startupConfiguration);

    public abstract long compact();

    public abstract long enqueue(int i, int i2, int i3, ArrayList<String> arrayList, long j);

    public abstract MetricsPayload flush();

    public abstract MetricsPayload flushWithContext(FlushContext flushContext);
}
