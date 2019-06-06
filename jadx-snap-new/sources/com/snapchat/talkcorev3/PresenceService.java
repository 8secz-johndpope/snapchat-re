package com.snapchat.talkcorev3;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class PresenceService {

    static final class CppProxy extends PresenceService {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed = new AtomicBoolean(false);
        private final long nativeRef;

        static {
            Class cls = PresenceService.class;
        }

        private CppProxy(long j) {
            if (j != 0) {
                this.nativeRef = j;
                return;
            }
            throw new RuntimeException("nativeRef is zero");
        }

        private native void nativeDestroy(long j);

        private native HashMap<String, ActiveConversationInfo> native_getActiveConversations(long j);

        private native void native_processChatConnectivityStatusChange(long j, boolean z);

        private native void native_processChatMessage(long j, ChatMessage chatMessage);

        private native void native_setDelegate(long j, PresenceServiceDelegate presenceServiceDelegate);

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

        public final HashMap<String, ActiveConversationInfo> getActiveConversations() {
            return native_getActiveConversations(this.nativeRef);
        }

        public final void processChatConnectivityStatusChange(boolean z) {
            native_processChatConnectivityStatusChange(this.nativeRef, z);
        }

        public final void processChatMessage(ChatMessage chatMessage) {
            native_processChatMessage(this.nativeRef, chatMessage);
        }

        public final void setDelegate(PresenceServiceDelegate presenceServiceDelegate) {
            native_setDelegate(this.nativeRef, presenceServiceDelegate);
        }
    }

    public abstract HashMap<String, ActiveConversationInfo> getActiveConversations();

    public abstract void processChatConnectivityStatusChange(boolean z);

    public abstract void processChatMessage(ChatMessage chatMessage);

    public abstract void setDelegate(PresenceServiceDelegate presenceServiceDelegate);
}
