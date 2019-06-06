package com.addlive.shared_state.djinni;

import com.snapchat.client.shims.DispatchQueue;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class Connection {

    static final class CppProxy extends Connection {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed = new AtomicBoolean(false);
        private final long nativeRef;

        static {
            Class cls = Connection.class;
        }

        private CppProxy(long j) {
            if (j != 0) {
                this.nativeRef = j;
                return;
            }
            throw new RuntimeException("nativeRef is zero");
        }

        private native void nativeDestroy(long j);

        private native void native_close(long j);

        private native void native_closeSync(long j);

        private native boolean native_isConnected(long j);

        private native void native_sendMessage(long j, String str);

        private native void native_setAuth(long j, Auth auth);

        private native void native_setState(long j, String str);

        public final void close() {
            native_close(this.nativeRef);
        }

        public final void closeSync() {
            native_closeSync(this.nativeRef);
        }

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

        public final boolean isConnected() {
            return native_isConnected(this.nativeRef);
        }

        public final void sendMessage(String str) {
            native_sendMessage(this.nativeRef, str);
        }

        public final void setAuth(Auth auth) {
            native_setAuth(this.nativeRef, auth);
        }

        public final void setState(String str) {
            native_setState(this.nativeRef, str);
        }
    }

    public static native Connection connectToSharedAR(Auth auth, String str, String str2, Delegate delegate, DispatchQueue dispatchQueue);

    public static native Connection connectToSharedARTest(long j, TestAuth testAuth, String str, String str2, Delegate delegate, DispatchQueue dispatchQueue);

    public abstract void close();

    public abstract void closeSync();

    public abstract boolean isConnected();

    public abstract void sendMessage(String str);

    public abstract void setAuth(Auth auth);

    public abstract void setState(String str);
}
