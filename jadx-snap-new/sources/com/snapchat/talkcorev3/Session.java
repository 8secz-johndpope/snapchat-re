package com.snapchat.talkcorev3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class Session {

    static final class CppProxy extends Session {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed = new AtomicBoolean(false);
        private final long nativeRef;

        static {
            Class cls = Session.class;
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

        private native CallingManager native_getCallingManager(long j);

        private native HashMap<String, ArrayList<String>> native_getCognacParticipants(long j);

        private native ParticipantState native_getLocalState(long j);

        private native MetricsMetadataContainer native_getMetricsMetadataContainer(long j);

        private native SessionState native_getState(long j);

        private native void native_processTypingActivity(long j, TypingActivity typingActivity);

        private native void native_refreshParticipants(long j);

        private native void native_setDelegate(long j, SessionDelegate sessionDelegate);

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

        public final CallingManager getCallingManager() {
            return native_getCallingManager(this.nativeRef);
        }

        public final HashMap<String, ArrayList<String>> getCognacParticipants() {
            return native_getCognacParticipants(this.nativeRef);
        }

        public final ParticipantState getLocalState() {
            return native_getLocalState(this.nativeRef);
        }

        public final MetricsMetadataContainer getMetricsMetadataContainer() {
            return native_getMetricsMetadataContainer(this.nativeRef);
        }

        public final SessionState getState() {
            return native_getState(this.nativeRef);
        }

        public final void processTypingActivity(TypingActivity typingActivity) {
            native_processTypingActivity(this.nativeRef, typingActivity);
        }

        public final void refreshParticipants() {
            native_refreshParticipants(this.nativeRef);
        }

        public final void setDelegate(SessionDelegate sessionDelegate) {
            native_setDelegate(this.nativeRef, sessionDelegate);
        }
    }

    public abstract void activate();

    public abstract void background();

    public abstract void deactivate();

    public abstract void dispose();

    public abstract CallingManager getCallingManager();

    public abstract HashMap<String, ArrayList<String>> getCognacParticipants();

    public abstract ParticipantState getLocalState();

    public abstract MetricsMetadataContainer getMetricsMetadataContainer();

    public abstract SessionState getState();

    public abstract void processTypingActivity(TypingActivity typingActivity);

    public abstract void refreshParticipants();

    public abstract void setDelegate(SessionDelegate sessionDelegate);
}
