package com.addlive.djinni;

import java.util.concurrent.atomic.AtomicBoolean;

public abstract class ServiceListener {

    static final class CppProxy extends ServiceListener {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed = new AtomicBoolean(false);
        private final long nativeRef;

        static {
            Class cls = ServiceListener.class;
        }

        private CppProxy(long j) {
            if (j != 0) {
                this.nativeRef = j;
                return;
            }
            throw new RuntimeException("nativeRef is zero");
        }

        private native void nativeDestroy(long j);

        private native void native_onConnectionLost(long j, ConnectionLostEvent connectionLostEvent);

        private native void native_onMediaStreamEvent(long j, UserStateChangedEvent userStateChangedEvent);

        private native void native_onMediaTransportTypeChanged(long j, MediaTransportTypeChangedEvent mediaTransportTypeChangedEvent);

        private native void native_onMessage(long j, MessageEvent messageEvent);

        private native void native_onSessionReconnected(long j, SessionReconnectedEvent sessionReconnectedEvent);

        private native void native_onSpeechActivity(long j, SpeechActivityEvent speechActivityEvent);

        private native void native_onUserEvent(long j, UserStateChangedEvent userStateChangedEvent);

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

        public final void onConnectionLost(ConnectionLostEvent connectionLostEvent) {
            native_onConnectionLost(this.nativeRef, connectionLostEvent);
        }

        public final void onMediaStreamEvent(UserStateChangedEvent userStateChangedEvent) {
            native_onMediaStreamEvent(this.nativeRef, userStateChangedEvent);
        }

        public final void onMediaTransportTypeChanged(MediaTransportTypeChangedEvent mediaTransportTypeChangedEvent) {
            native_onMediaTransportTypeChanged(this.nativeRef, mediaTransportTypeChangedEvent);
        }

        public final void onMessage(MessageEvent messageEvent) {
            native_onMessage(this.nativeRef, messageEvent);
        }

        public final void onSessionReconnected(SessionReconnectedEvent sessionReconnectedEvent) {
            native_onSessionReconnected(this.nativeRef, sessionReconnectedEvent);
        }

        public final void onSpeechActivity(SpeechActivityEvent speechActivityEvent) {
            native_onSpeechActivity(this.nativeRef, speechActivityEvent);
        }

        public final void onUserEvent(UserStateChangedEvent userStateChangedEvent) {
            native_onUserEvent(this.nativeRef, userStateChangedEvent);
        }
    }

    public abstract void onConnectionLost(ConnectionLostEvent connectionLostEvent);

    public abstract void onMediaStreamEvent(UserStateChangedEvent userStateChangedEvent);

    public abstract void onMediaTransportTypeChanged(MediaTransportTypeChangedEvent mediaTransportTypeChangedEvent);

    public abstract void onMessage(MessageEvent messageEvent);

    public abstract void onSessionReconnected(SessionReconnectedEvent sessionReconnectedEvent);

    public abstract void onSpeechActivity(SpeechActivityEvent speechActivityEvent);

    public abstract void onUserEvent(UserStateChangedEvent userStateChangedEvent);
}
