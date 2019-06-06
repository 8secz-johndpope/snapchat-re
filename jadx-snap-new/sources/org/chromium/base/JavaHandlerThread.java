package org.chromium.base;

import android.os.Build.VERSION;
import android.os.Handler;
import android.os.HandlerThread;
import java.lang.Thread.State;
import java.lang.Thread.UncaughtExceptionHandler;
import org.chromium.base.annotations.CalledByNative;

public class JavaHandlerThread {
    final HandlerThread a;
    Throwable b;

    static {
        JavaHandlerThread.class.desiredAssertionStatus();
    }

    private JavaHandlerThread(String str, int i) {
        this.a = new HandlerThread(str, i);
    }

    @CalledByNative
    private static JavaHandlerThread create(String str, int i) {
        return new JavaHandlerThread(str, i);
    }

    @CalledByNative
    private Throwable getUncaughtExceptionIfAny() {
        return this.b;
    }

    @CalledByNative
    private boolean isAlive() {
        return this.a.isAlive();
    }

    @CalledByNative
    private void joinThread() {
        Object obj = null;
        while (obj == null) {
            try {
                this.a.join();
                obj = 1;
            } catch (InterruptedException unused) {
            }
        }
    }

    @CalledByNative
    private void listenForUncaughtExceptionsForTesting() {
        this.a.setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
            public final void uncaughtException(Thread thread, Throwable th) {
                JavaHandlerThread.this.b = th;
            }
        });
    }

    @CalledByNative
    private void quitThreadSafely(final long j) {
        new Handler(this.a.getLooper()).post(new Runnable() {
            public final void run() {
                JavaHandlerThread.this.a.quit();
                JavaHandlerThread.this.nativeOnLooperStopped(j);
            }
        });
        if (VERSION.SDK_INT >= 18) {
            this.a.getLooper().quitSafely();
        }
    }

    @CalledByNative
    private void startAndInitialize(long j, long j2) {
        if ((this.a.getState() != State.NEW ? 1 : null) == null) {
            this.a.start();
        }
        final long j3 = j;
        final long j4 = j2;
        new Handler(this.a.getLooper()).post(new Runnable() {
            public final void run() {
                JavaHandlerThread.this.nativeInitializeThread(j3, j4);
            }
        });
    }

    public native void nativeInitializeThread(long j, long j2);

    public native void nativeOnLooperStopped(long j);
}
