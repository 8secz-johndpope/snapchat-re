package com.snapchat.talkcorev3;

import java.util.concurrent.atomic.AtomicBoolean;

public abstract class CognacSessionDelegate {

    static final class CppProxy extends CognacSessionDelegate {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed = new AtomicBoolean(false);
        private final long nativeRef;

        static {
            Class cls = CognacSessionDelegate.class;
        }

        private CppProxy(long j) {
            if (j != 0) {
                this.nativeRef = j;
                return;
            }
            throw new RuntimeException("nativeRef is zero");
        }

        private native void nativeDestroy(long j);

        private native ConversationCtx native_getConversationCtx(long j);

        private native void native_onConnectivityChanged(long j);

        private native void native_onMessage(long j, String str, byte[] bArr);

        private native void native_onStateChanged(long j);

        private native void native_refreshAuth(long j, CompletionHandler completionHandler);

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

        public final ConversationCtx getConversationCtx() {
            return native_getConversationCtx(this.nativeRef);
        }

        public final void onConnectivityChanged() {
            native_onConnectivityChanged(this.nativeRef);
        }

        public final void onMessage(String str, byte[] bArr) {
            native_onMessage(this.nativeRef, str, bArr);
        }

        public final void onStateChanged() {
            native_onStateChanged(this.nativeRef);
        }

        public final void refreshAuth(CompletionHandler completionHandler) {
            native_refreshAuth(this.nativeRef, completionHandler);
        }
    }

    public abstract ConversationCtx getConversationCtx();

    public abstract void onConnectivityChanged();

    public abstract void onMessage(String str, byte[] bArr);

    public abstract void onStateChanged();

    public abstract void refreshAuth(CompletionHandler completionHandler);
}
