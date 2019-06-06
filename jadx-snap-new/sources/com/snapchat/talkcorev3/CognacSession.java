package com.snapchat.talkcorev3;

import java.util.concurrent.atomic.AtomicBoolean;

public abstract class CognacSession {

    static final class CppProxy extends CognacSession {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed = new AtomicBoolean(false);
        private final long nativeRef;

        static {
            Class cls = CognacSession.class;
        }

        private CppProxy(long j) {
            if (j != 0) {
                this.nativeRef = j;
                return;
            }
            throw new RuntimeException("nativeRef is zero");
        }

        private native void nativeDestroy(long j);

        private native void native_activate(long j);

        private native void native_background(long j);

        private native void native_deactivate(long j);

        private native void native_dispose(long j);

        private native CognacSessionState native_getState(long j);

        private native boolean native_isConnected(long j);

        private native void native_processTypingActivity(long j, TypingActivity typingActivity);

        private native void native_sendMessage(long j, byte[] bArr);

        private native void native_setDelegate(long j, CognacSessionDelegate cognacSessionDelegate);

        private native void native_setPublishingAudio(long j, boolean z);

        private native void native_updateMuteStatus(long j, boolean z);

        public final void activate() {
            native_activate(this.nativeRef);
        }

        public final void background() {
            native_background(this.nativeRef);
        }

        public final void deactivate() {
            native_deactivate(this.nativeRef);
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

        public final CognacSessionState getState() {
            return native_getState(this.nativeRef);
        }

        public final boolean isConnected() {
            return native_isConnected(this.nativeRef);
        }

        public final void processTypingActivity(TypingActivity typingActivity) {
            native_processTypingActivity(this.nativeRef, typingActivity);
        }

        public final void sendMessage(byte[] bArr) {
            native_sendMessage(this.nativeRef, bArr);
        }

        public final void setDelegate(CognacSessionDelegate cognacSessionDelegate) {
            native_setDelegate(this.nativeRef, cognacSessionDelegate);
        }

        public final void setPublishingAudio(boolean z) {
            native_setPublishingAudio(this.nativeRef, z);
        }

        public final void updateMuteStatus(boolean z) {
            native_updateMuteStatus(this.nativeRef, z);
        }
    }

    public abstract void activate();

    public abstract void background();

    public abstract void deactivate();

    public abstract void dispose();

    public abstract CognacSessionState getState();

    public abstract boolean isConnected();

    public abstract void processTypingActivity(TypingActivity typingActivity);

    public abstract void sendMessage(byte[] bArr);

    public abstract void setDelegate(CognacSessionDelegate cognacSessionDelegate);

    public abstract void setPublishingAudio(boolean z);

    public abstract void updateMuteStatus(boolean z);
}
