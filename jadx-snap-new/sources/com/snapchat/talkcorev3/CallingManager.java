package com.snapchat.talkcorev3;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class CallingManager {

    static final class CppProxy extends CallingManager {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed = new AtomicBoolean(false);
        private final long nativeRef;

        static {
            Class cls = CallingManager.class;
        }

        private CppProxy(long j) {
            if (j != 0) {
                this.nativeRef = j;
                return;
            }
            throw new RuntimeException("nativeRef is zero");
        }

        private native void nativeDestroy(long j);

        private native void native_applyRemoteState(long j, String str, String str2, boolean z);

        private native void native_dismissCall(long j);

        private native ArrayList<String> native_getPublishersForNotification(long j, String str);

        private native NotificationAction native_processNotification(long j, String str, String str2, boolean z);

        private native NotificationReplacementType native_processRingingTimeout(long j, String str);

        private native void native_startCall(long j, Media media);

        private native void native_updateMuteStatus(long j, boolean z);

        private native void native_updatePublishedMedia(long j, Media media);

        public final void applyRemoteState(String str, String str2, boolean z) {
            native_applyRemoteState(this.nativeRef, str, str2, z);
        }

        public final void destroy() {
            if (!this.destroyed.getAndSet(true)) {
                nativeDestroy(this.nativeRef);
            }
        }

        public final void dismissCall() {
            native_dismissCall(this.nativeRef);
        }

        /* Access modifiers changed, original: protected|final */
        public final void finalize() {
            destroy();
            super.finalize();
        }

        public final ArrayList<String> getPublishersForNotification(String str) {
            return native_getPublishersForNotification(this.nativeRef, str);
        }

        public final NotificationAction processNotification(String str, String str2, boolean z) {
            return native_processNotification(this.nativeRef, str, str2, z);
        }

        public final NotificationReplacementType processRingingTimeout(String str) {
            return native_processRingingTimeout(this.nativeRef, str);
        }

        public final void startCall(Media media) {
            native_startCall(this.nativeRef, media);
        }

        public final void updateMuteStatus(boolean z) {
            native_updateMuteStatus(this.nativeRef, z);
        }

        public final void updatePublishedMedia(Media media) {
            native_updatePublishedMedia(this.nativeRef, media);
        }
    }

    public abstract void applyRemoteState(String str, String str2, boolean z);

    public abstract void dismissCall();

    public abstract ArrayList<String> getPublishersForNotification(String str);

    public abstract NotificationAction processNotification(String str, String str2, boolean z);

    public abstract NotificationReplacementType processRingingTimeout(String str);

    public abstract void startCall(Media media);

    public abstract void updateMuteStatus(boolean z);

    public abstract void updatePublishedMedia(Media media);
}
