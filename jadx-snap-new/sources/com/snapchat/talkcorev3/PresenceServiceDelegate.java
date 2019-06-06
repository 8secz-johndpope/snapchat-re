package com.snapchat.talkcorev3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class PresenceServiceDelegate {

    static final class CppProxy extends PresenceServiceDelegate {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed = new AtomicBoolean(false);
        private final long nativeRef;

        static {
            Class cls = PresenceServiceDelegate.class;
        }

        private CppProxy(long j) {
            if (j != 0) {
                this.nativeRef = j;
                return;
            }
            throw new RuntimeException("nativeRef is zero");
        }

        private native void nativeDestroy(long j);

        private native ArrayList<String> native_getParticipantUsernames(long j, String str);

        private native HashMap<String, String> native_getUserIdMap(long j, ArrayList<String> arrayList, String str);

        private native void native_notifyActiveConversationsChanged(long j);

        private native void native_sendPresenceMessage(long j, PresenceMessage presenceMessage);

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

        public final ArrayList<String> getParticipantUsernames(String str) {
            return native_getParticipantUsernames(this.nativeRef, str);
        }

        public final HashMap<String, String> getUserIdMap(ArrayList<String> arrayList, String str) {
            return native_getUserIdMap(this.nativeRef, arrayList, str);
        }

        public final void notifyActiveConversationsChanged() {
            native_notifyActiveConversationsChanged(this.nativeRef);
        }

        public final void sendPresenceMessage(PresenceMessage presenceMessage) {
            native_sendPresenceMessage(this.nativeRef, presenceMessage);
        }
    }

    public abstract ArrayList<String> getParticipantUsernames(String str);

    public abstract HashMap<String, String> getUserIdMap(ArrayList<String> arrayList, String str);

    public abstract void notifyActiveConversationsChanged();

    public abstract void sendPresenceMessage(PresenceMessage presenceMessage);
}
