package com.snapchat.talkcorev3;

import com.addlive.djinni.ExternalVideoService;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class TalkCore {

    static final class CppProxy extends TalkCore {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed = new AtomicBoolean(false);
        private final long nativeRef;

        static {
            Class cls = TalkCore.class;
        }

        private CppProxy(long j) {
            if (j != 0) {
                this.nativeRef = j;
                return;
            }
            throw new RuntimeException("nativeRef is zero");
        }

        private native void nativeDestroy(long j);

        private native CognacSession native_createCognacSession(long j, String str, String str2);

        private native Session native_createSession(long j, String str, boolean z);

        private native void native_dispose(long j);

        private native PresenceService native_getPresenceService(long j);

        private native void native_injectNativeFrame(long j, long j2);

        private native void native_reachabilityChanged(long j, boolean z);

        private native void native_setProperty(long j, String str, String str2);

        public final CognacSession createCognacSession(String str, String str2) {
            return native_createCognacSession(this.nativeRef, str, str2);
        }

        public final Session createSession(String str, boolean z) {
            return native_createSession(this.nativeRef, str, z);
        }

        public final void destroy() {
            if (!this.destroyed.getAndSet(true)) {
                nativeDestroy(this.nativeRef);
            }
        }

        public final void dispose() {
            native_dispose(this.nativeRef);
        }

        /* Access modifiers changed, original: protected|final */
        public final void finalize() {
            destroy();
            super.finalize();
        }

        public final PresenceService getPresenceService() {
            return native_getPresenceService(this.nativeRef);
        }

        public final void injectNativeFrame(long j) {
            native_injectNativeFrame(this.nativeRef, j);
        }

        public final void reachabilityChanged(boolean z) {
            native_reachabilityChanged(this.nativeRef, z);
        }

        public final void setProperty(String str, String str2) {
            native_setProperty(this.nativeRef, str, str2);
        }
    }

    public static native TalkCore create(TalkCoreParameters talkCoreParameters, TalkCoreDelegate talkCoreDelegate, Logger logger, MetricsReporter metricsReporter, ExternalVideoService externalVideoService);

    public abstract CognacSession createCognacSession(String str, String str2);

    public abstract Session createSession(String str, boolean z);

    public abstract void dispose();

    public abstract PresenceService getPresenceService();

    public abstract void injectNativeFrame(long j);

    public abstract void reachabilityChanged(boolean z);

    public abstract void setProperty(String str, String str2);
}
