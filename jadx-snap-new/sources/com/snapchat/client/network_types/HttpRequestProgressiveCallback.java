package com.snapchat.client.network_types;

import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class HttpRequestProgressiveCallback {

    static final class CppProxy extends HttpRequestProgressiveCallback {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed = new AtomicBoolean(false);
        private final long nativeRef;

        static {
            Class cls = HttpRequestProgressiveCallback.class;
        }

        private CppProxy(long j) {
            if (j != 0) {
                this.nativeRef = j;
                return;
            }
            throw new RuntimeException("nativeRef is zero");
        }

        private native void nativeDestroy(long j);

        private native void native_onCanceled(long j, HttpRequest httpRequest, UrlResponseInfo urlResponseInfo);

        private native void native_onFailed(long j, HttpRequest httpRequest, UrlResponseInfo urlResponseInfo, Error error);

        private native void native_onReadCompleted(long j, NetworkManagerNotifier networkManagerNotifier, HttpRequest httpRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer, long j2);

        private native void native_onResponseStarted(long j, HttpRequest httpRequest, UrlResponseInfo urlResponseInfo);

        private native void native_onSucceeded(long j, HttpRequest httpRequest, UrlResponseInfo urlResponseInfo);

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

        public final void onCanceled(HttpRequest httpRequest, UrlResponseInfo urlResponseInfo) {
            native_onCanceled(this.nativeRef, httpRequest, urlResponseInfo);
        }

        public final void onFailed(HttpRequest httpRequest, UrlResponseInfo urlResponseInfo, Error error) {
            native_onFailed(this.nativeRef, httpRequest, urlResponseInfo, error);
        }

        public final void onReadCompleted(NetworkManagerNotifier networkManagerNotifier, HttpRequest httpRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer, long j) {
            native_onReadCompleted(this.nativeRef, networkManagerNotifier, httpRequest, urlResponseInfo, byteBuffer, j);
        }

        public final void onResponseStarted(HttpRequest httpRequest, UrlResponseInfo urlResponseInfo) {
            native_onResponseStarted(this.nativeRef, httpRequest, urlResponseInfo);
        }

        public final void onSucceeded(HttpRequest httpRequest, UrlResponseInfo urlResponseInfo) {
            native_onSucceeded(this.nativeRef, httpRequest, urlResponseInfo);
        }
    }

    public abstract void onCanceled(HttpRequest httpRequest, UrlResponseInfo urlResponseInfo);

    public abstract void onFailed(HttpRequest httpRequest, UrlResponseInfo urlResponseInfo, Error error);

    public abstract void onReadCompleted(NetworkManagerNotifier networkManagerNotifier, HttpRequest httpRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer, long j);

    public abstract void onResponseStarted(HttpRequest httpRequest, UrlResponseInfo urlResponseInfo);

    public abstract void onSucceeded(HttpRequest httpRequest, UrlResponseInfo urlResponseInfo);
}
