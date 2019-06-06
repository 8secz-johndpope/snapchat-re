package org.chromium.base;

import java.lang.Thread.UncaughtExceptionHandler;
import org.chromium.base.annotations.CalledByNative;

public class JavaExceptionReporter implements UncaughtExceptionHandler {
    private final UncaughtExceptionHandler a;
    private final boolean b;
    private boolean c;

    static {
        JavaExceptionReporter.class.desiredAssertionStatus();
    }

    private JavaExceptionReporter(UncaughtExceptionHandler uncaughtExceptionHandler, boolean z) {
        this.a = uncaughtExceptionHandler;
        this.b = z;
    }

    @CalledByNative
    private static void installHandler(boolean z) {
        Thread.setDefaultUncaughtExceptionHandler(new JavaExceptionReporter(Thread.getDefaultUncaughtExceptionHandler(), z));
    }

    private static native void nativeReportJavaException(boolean z, Throwable th);

    private static native void nativeReportJavaStackTrace(String str);

    public void uncaughtException(Thread thread, Throwable th) {
        if (!this.c) {
            this.c = true;
            nativeReportJavaException(this.b, th);
        }
        UncaughtExceptionHandler uncaughtExceptionHandler = this.a;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }
}
