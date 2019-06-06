package com.snapchat.talkcorev3;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class SessionDelegate {

    static final class CppProxy extends SessionDelegate {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed = new AtomicBoolean(false);
        private final long nativeRef;

        static {
            Class cls = SessionDelegate.class;
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

        private native void native_onCognacParticipantsChanged(long j);

        private native void native_onSpeechActivity(long j, ArrayList<SpeechActivity> arrayList);

        private native void native_onStateChanged(long j, Reason reason);

        private native void native_refreshAuth(long j, CompletionHandler completionHandler);

        private native void native_sendLocalState(long j, String str, CallAction callAction, Media media);

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

        public final void onCognacParticipantsChanged() {
            native_onCognacParticipantsChanged(this.nativeRef);
        }

        public final void onSpeechActivity(ArrayList<SpeechActivity> arrayList) {
            native_onSpeechActivity(this.nativeRef, arrayList);
        }

        public final void onStateChanged(Reason reason) {
            native_onStateChanged(this.nativeRef, reason);
        }

        public final void refreshAuth(CompletionHandler completionHandler) {
            native_refreshAuth(this.nativeRef, completionHandler);
        }

        public final void sendLocalState(String str, CallAction callAction, Media media) {
            native_sendLocalState(this.nativeRef, str, callAction, media);
        }
    }

    public abstract ConversationCtx getConversationCtx();

    public abstract void onCognacParticipantsChanged();

    public abstract void onSpeechActivity(ArrayList<SpeechActivity> arrayList);

    public abstract void onStateChanged(Reason reason);

    public abstract void refreshAuth(CompletionHandler completionHandler);

    public abstract void sendLocalState(String str, CallAction callAction, Media media);
}
