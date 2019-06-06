package com.snapchat.client.content_resolution;

import com.snapchat.client.graphene.ClientMetricsProcessor;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class ContentObjectResolver {

    static final class CppProxy extends ContentObjectResolver {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed = new AtomicBoolean(false);
        private final long nativeRef;

        static {
            Class cls = ContentObjectResolver.class;
        }

        private CppProxy(long j) {
            if (j != 0) {
                this.nativeRef = j;
                return;
            }
            throw new RuntimeException("nativeRef is zero");
        }

        private native void nativeDestroy(long j);

        private native byte[] native_resolveSerializedContentObjectWithMediaBundle(long j, byte[] bArr);

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

        public final byte[] resolveSerializedContentObjectWithMediaBundle(byte[] bArr) {
            return native_resolveSerializedContentObjectWithMediaBundle(this.nativeRef, bArr);
        }
    }

    public static native ContentObjectResolver create(ClientMetricsProcessor clientMetricsProcessor);

    public static native ContentObjectResolver createWithProvider(MossRankedMediaVariantsProviderCallback mossRankedMediaVariantsProviderCallback, ClientMetricsProcessor clientMetricsProcessor);

    public abstract byte[] resolveSerializedContentObjectWithMediaBundle(byte[] bArr);
}
