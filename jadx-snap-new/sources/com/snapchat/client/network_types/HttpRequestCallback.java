package com.snapchat.client.network_types;

import com.snapchat.client.shims.DataProvider;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class HttpRequestCallback {

    static final class CppProxy extends HttpRequestCallback {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed = new AtomicBoolean(false);
        private final long nativeRef;

        static {
            Class cls = HttpRequestCallback.class;
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

        private native void native_onReadCompleted(long j, HttpRequest httpRequest, UrlResponseInfo urlResponseInfo);

        private native void native_onResponseStarted(long j, HttpRequest httpRequest, UrlResponseInfo urlResponseInfo);

        private native void native_onSucceeded(long j, HttpRequest httpRequest, UrlResponseInfo urlResponseInfo, DataProvider dataProvider, long j2);

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

        public final void onReadCompleted(HttpRequest httpRequest, UrlResponseInfo urlResponseInfo) {
            native_onReadCompleted(this.nativeRef, httpRequest, urlResponseInfo);
        }

        public final void onResponseStarted(HttpRequest httpRequest, UrlResponseInfo urlResponseInfo) {
            native_onResponseStarted(this.nativeRef, httpRequest, urlResponseInfo);
        }

        public final void onSucceeded(HttpRequest httpRequest, UrlResponseInfo urlResponseInfo, DataProvider dataProvider, long j) {
            native_onSucceeded(this.nativeRef, httpRequest, urlResponseInfo, dataProvider, j);
        }
    }

    public abstract void onCanceled(HttpRequest httpRequest, UrlResponseInfo urlResponseInfo);

    public abstract void onFailed(HttpRequest httpRequest, UrlResponseInfo urlResponseInfo, Error error);

    public abstract void onReadCompleted(HttpRequest httpRequest, UrlResponseInfo urlResponseInfo);

    public abstract void onResponseStarted(HttpRequest httpRequest, UrlResponseInfo urlResponseInfo);

    public abstract void onSucceeded(HttpRequest httpRequest, UrlResponseInfo urlResponseInfo, DataProvider dataProvider, long j);
}
