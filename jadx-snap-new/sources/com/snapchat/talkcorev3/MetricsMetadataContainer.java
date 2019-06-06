package com.snapchat.talkcorev3;

import java.util.concurrent.atomic.AtomicBoolean;

public abstract class MetricsMetadataContainer {

    static final class CppProxy extends MetricsMetadataContainer {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed = new AtomicBoolean(false);
        private final long nativeRef;

        static {
            Class cls = MetricsMetadataContainer.class;
        }

        private CppProxy(long j) {
            if (j != 0) {
                this.nativeRef = j;
                return;
            }
            throw new RuntimeException("nativeRef is zero");
        }

        private native void nativeDestroy(long j);

        private native void native_chatSent(long j);

        private native void native_elmActivated(long j);

        private native void native_imageSent(long j);

        private native void native_lensActivated(long j);

        private native void native_lensChanged(long j);

        private native void native_lensDeactivated(long j);

        private native void native_setChatSource(long j, int i);

        private native void native_setCorrespondentId(long j, String str);

        private native void native_setFeedCellViewPosition(long j, int i);

        private native void native_stickerSent(long j);

        public final void chatSent() {
            native_chatSent(this.nativeRef);
        }

        public final void destroy() {
            if (!this.destroyed.getAndSet(true)) {
                nativeDestroy(this.nativeRef);
            }
        }

        public final void elmActivated() {
            native_elmActivated(this.nativeRef);
        }

        /* Access modifiers changed, original: protected|final */
        public final void finalize() {
            destroy();
            super.finalize();
        }

        public final void imageSent() {
            native_imageSent(this.nativeRef);
        }

        public final void lensActivated() {
            native_lensActivated(this.nativeRef);
        }

        public final void lensChanged() {
            native_lensChanged(this.nativeRef);
        }

        public final void lensDeactivated() {
            native_lensDeactivated(this.nativeRef);
        }

        public final void setChatSource(int i) {
            native_setChatSource(this.nativeRef, i);
        }

        public final void setCorrespondentId(String str) {
            native_setCorrespondentId(this.nativeRef, str);
        }

        public final void setFeedCellViewPosition(int i) {
            native_setFeedCellViewPosition(this.nativeRef, i);
        }

        public final void stickerSent() {
            native_stickerSent(this.nativeRef);
        }
    }

    public abstract void chatSent();

    public abstract void elmActivated();

    public abstract void imageSent();

    public abstract void lensActivated();

    public abstract void lensChanged();

    public abstract void lensDeactivated();

    public abstract void setChatSource(int i);

    public abstract void setCorrespondentId(String str);

    public abstract void setFeedCellViewPosition(int i);

    public abstract void stickerSent();
}
