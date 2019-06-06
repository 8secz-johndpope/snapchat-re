package com.snapchat.client.shims;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class Logger {

    static final class CppProxy extends Logger {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed = new AtomicBoolean(false);
        private final long nativeRef;

        static {
            Class cls = Logger.class;
        }

        private CppProxy(long j) {
            if (j != 0) {
                this.nativeRef = j;
                return;
            }
            throw new RuntimeException("nativeRef is zero");
        }

        private native void nativeDestroy(long j);

        private native void native_log(long j, LogLevel logLevel, LogContext logContext, String str, String str2);

        private native void native_logTimedEvent(long j, String str, long j2, HashMap<String, String> hashMap);

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

        public final void log(LogLevel logLevel, LogContext logContext, String str, String str2) {
            native_log(this.nativeRef, logLevel, logContext, str, str2);
        }

        public final void logTimedEvent(String str, long j, HashMap<String, String> hashMap) {
            native_logTimedEvent(this.nativeRef, str, j, hashMap);
        }
    }

    public abstract void log(LogLevel logLevel, LogContext logContext, String str, String str2);

    public abstract void logTimedEvent(String str, long j, HashMap<String, String> hashMap);
}
