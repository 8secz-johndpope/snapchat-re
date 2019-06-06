package com.snapchat.client.network_types;

import java.util.concurrent.atomic.AtomicBoolean;

public abstract class HttpRequestBuilder {

    static final class CppProxy extends HttpRequestBuilder {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed = new AtomicBoolean(false);
        private final long nativeRef;

        static {
            Class cls = HttpRequestBuilder.class;
        }

        private CppProxy(long j) {
            if (j != 0) {
                this.nativeRef = j;
                return;
            }
            throw new RuntimeException("nativeRef is zero");
        }

        private native void nativeDestroy(long j);

        private native HttpRequestBuilder native_addHttpHeader(long j, String str, String str2);

        private native HttpRequest native_build(long j);

        private native HttpRequestBuilder native_setDeprecatedHttpRequestInfo(long j, DeprecatedHttpRequestInfo deprecatedHttpRequestInfo);

        private native HttpRequestBuilder native_setHttpMethod(long j, HttpMethod httpMethod);

        private native HttpRequestBuilder native_setUrl(long j, String str);

        public final HttpRequestBuilder addHttpHeader(String str, String str2) {
            return native_addHttpHeader(this.nativeRef, str, str2);
        }

        public final HttpRequest build() {
            return native_build(this.nativeRef);
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

        public final HttpRequestBuilder setDeprecatedHttpRequestInfo(DeprecatedHttpRequestInfo deprecatedHttpRequestInfo) {
            return native_setDeprecatedHttpRequestInfo(this.nativeRef, deprecatedHttpRequestInfo);
        }

        public final HttpRequestBuilder setHttpMethod(HttpMethod httpMethod) {
            return native_setHttpMethod(this.nativeRef, httpMethod);
        }

        public final HttpRequestBuilder setUrl(String str) {
            return native_setUrl(this.nativeRef, str);
        }
    }

    public static native HttpRequestBuilder create();

    public abstract HttpRequestBuilder addHttpHeader(String str, String str2);

    public abstract HttpRequest build();

    public abstract HttpRequestBuilder setDeprecatedHttpRequestInfo(DeprecatedHttpRequestInfo deprecatedHttpRequestInfo);

    public abstract HttpRequestBuilder setHttpMethod(HttpMethod httpMethod);

    public abstract HttpRequestBuilder setUrl(String str);
}
