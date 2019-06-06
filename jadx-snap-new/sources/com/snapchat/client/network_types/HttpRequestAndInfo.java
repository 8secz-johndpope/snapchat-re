package com.snapchat.client.network_types;

import java.util.concurrent.atomic.AtomicBoolean;

public abstract class HttpRequestAndInfo {

    static final class CppProxy extends HttpRequestAndInfo {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed = new AtomicBoolean(false);
        private final long nativeRef;

        static {
            Class cls = HttpRequestAndInfo.class;
        }

        private CppProxy(long j) {
            if (j != 0) {
                this.nativeRef = j;
                return;
            }
            throw new RuntimeException("nativeRef is zero");
        }

        private native void nativeDestroy(long j);

        private native Executor native_getExecutor(long j);

        private native HttpRequest native_getHttpRequest(long j);

        private native HttpRequestCallback native_getHttpRequestCallback(long j);

        private native HttpRequestProgressiveCallback native_getHttpRequestProgressiveCallback(long j);

        private native RankerCallback native_getRankerCallback(long j);

        private native RankingSignals native_getRankingSignals(long j);

        private native UploadDataProvider native_getUploadDataProvider(long j);

        private native void native_updateRankerCallback(long j, RankerCallback rankerCallback);

        private native void native_updateRankingSignals(long j, RankingSignals rankingSignals);

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

        public final Executor getExecutor() {
            return native_getExecutor(this.nativeRef);
        }

        public final HttpRequest getHttpRequest() {
            return native_getHttpRequest(this.nativeRef);
        }

        public final HttpRequestCallback getHttpRequestCallback() {
            return native_getHttpRequestCallback(this.nativeRef);
        }

        public final HttpRequestProgressiveCallback getHttpRequestProgressiveCallback() {
            return native_getHttpRequestProgressiveCallback(this.nativeRef);
        }

        public final RankerCallback getRankerCallback() {
            return native_getRankerCallback(this.nativeRef);
        }

        public final RankingSignals getRankingSignals() {
            return native_getRankingSignals(this.nativeRef);
        }

        public final UploadDataProvider getUploadDataProvider() {
            return native_getUploadDataProvider(this.nativeRef);
        }

        public final void updateRankerCallback(RankerCallback rankerCallback) {
            native_updateRankerCallback(this.nativeRef, rankerCallback);
        }

        public final void updateRankingSignals(RankingSignals rankingSignals) {
            native_updateRankingSignals(this.nativeRef, rankingSignals);
        }
    }

    public abstract Executor getExecutor();

    public abstract HttpRequest getHttpRequest();

    public abstract HttpRequestCallback getHttpRequestCallback();

    public abstract HttpRequestProgressiveCallback getHttpRequestProgressiveCallback();

    public abstract RankerCallback getRankerCallback();

    public abstract RankingSignals getRankingSignals();

    public abstract UploadDataProvider getUploadDataProvider();

    public abstract void updateRankerCallback(RankerCallback rankerCallback);

    public abstract void updateRankingSignals(RankingSignals rankingSignals);
}
