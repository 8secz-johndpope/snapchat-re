package com.snapchat.client.content_resolution;

import com.snapchat.client.graphene.ClientMetricsProcessor;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class ContentDescriptorResolver {

    static final class CppProxy extends ContentDescriptorResolver {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed = new AtomicBoolean(false);
        private final long nativeRef;

        static {
            Class cls = ContentDescriptorResolver.class;
        }

        private CppProxy(long j) {
            if (j != 0) {
                this.nativeRef = j;
                return;
            }
            throw new RuntimeException("nativeRef is zero");
        }

        private native void nativeDestroy(long j);

        private native ArrayList<String> native_resolveSerializedContentDescriptor(long j, byte[] bArr, byte[] bArr2);

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

        public final ArrayList<String> resolveSerializedContentDescriptor(byte[] bArr, byte[] bArr2) {
            return native_resolveSerializedContentDescriptor(this.nativeRef, bArr, bArr2);
        }
    }

    public static native ContentDescriptorResolver create(BoltNetworkRulesProviderCallback boltNetworkRulesProviderCallback, ClientMetricsProcessor clientMetricsProcessor);

    public abstract ArrayList<String> resolveSerializedContentDescriptor(byte[] bArr, byte[] bArr2);
}
