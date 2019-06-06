package com.snapchat.client.composer;

import java.util.concurrent.atomic.AtomicBoolean;

public abstract class DaemonClient {

    static final class CppProxy extends DaemonClient {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed = new AtomicBoolean(false);
        private final long nativeRef;

        static {
            Class cls = DaemonClient.class;
        }

        private CppProxy(long j) {
            if (j != 0) {
                this.nativeRef = j;
                return;
            }
            throw new RuntimeException("nativeRef is zero");
        }

        private native void nativeDestroy(long j);

        private native void native_closeClient(long j);

        private native void native_didReceiveData(long j, byte[] bArr);

        private native void native_sendConfiguration(long j, String str, String str2, Platform platform);

        private native void native_setDataSender(long j, DaemonClientDataSender daemonClientDataSender);

        public final void closeClient() {
            native_closeClient(this.nativeRef);
        }

        public final void destroy() {
            if (!this.destroyed.getAndSet(true)) {
                nativeDestroy(this.nativeRef);
            }
        }

        public final void didReceiveData(byte[] bArr) {
            native_didReceiveData(this.nativeRef, bArr);
        }

        /* Access modifiers changed, original: protected|final */
        public final void finalize() {
            destroy();
            super.finalize();
        }

        public final void sendConfiguration(String str, String str2, Platform platform) {
            native_sendConfiguration(this.nativeRef, str, str2, platform);
        }

        public final void setDataSender(DaemonClientDataSender daemonClientDataSender) {
            native_setDataSender(this.nativeRef, daemonClientDataSender);
        }
    }

    public abstract void closeClient();

    public abstract void didReceiveData(byte[] bArr);

    public abstract void sendConfiguration(String str, String str2, Platform platform);

    public abstract void setDataSender(DaemonClientDataSender daemonClientDataSender);
}
