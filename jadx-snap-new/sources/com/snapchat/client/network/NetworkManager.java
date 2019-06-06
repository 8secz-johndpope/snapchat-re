package com.snapchat.client.network;

import com.snapchat.client.network_types.HttpRequestAndInfo;
import com.snapchat.client.network_types.HttpRequestKey;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class NetworkManager {

    static final class CppProxy extends NetworkManager {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed = new AtomicBoolean(false);
        private final long nativeRef;

        static {
            Class cls = NetworkManager.class;
        }

        private CppProxy(long j) {
            if (j != 0) {
                this.nativeRef = j;
                return;
            }
            throw new RuntimeException("nativeRef is zero");
        }

        private native void nativeDestroy(long j);

        private native void native_cancel(long j, HttpRequestKey httpRequestKey);

        private native void native_submit(long j, ArrayList<HttpRequestAndInfo> arrayList);

        public final void cancel(HttpRequestKey httpRequestKey) {
            native_cancel(this.nativeRef, httpRequestKey);
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

        public final void submit(ArrayList<HttpRequestAndInfo> arrayList) {
            native_submit(this.nativeRef, arrayList);
        }
    }

    public abstract void cancel(HttpRequestKey httpRequestKey);

    public abstract void submit(ArrayList<HttpRequestAndInfo> arrayList);
}
