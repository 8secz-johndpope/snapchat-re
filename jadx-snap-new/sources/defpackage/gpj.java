package defpackage;

import java.lang.Thread.UncaughtExceptionHandler;

/* renamed from: gpj */
public final class gpj implements UncaughtExceptionHandler {
    private final UncaughtExceptionHandler a;

    public gpj(UncaughtExceptionHandler uncaughtExceptionHandler) {
        akcr.b(uncaughtExceptionHandler, "defaultExceptionHandler");
        this.a = uncaughtExceptionHandler;
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        idd a = zgf.a();
        if (a == null || th == null) {
            this.a.uncaughtException(thread, th);
            return;
        }
        String concat;
        idd idd = (idd) zgd.a.get();
        Long l = null;
        if ((th instanceof ajet) && (th.getCause() instanceof StackOverflowError) && idd != null) {
            concat = " stackOverflowAttribution=".concat(String.valueOf(idd));
        } else {
            concat = null;
        }
        UncaughtExceptionHandler uncaughtExceptionHandler = this.a;
        if (thread != null) {
            l = Long.valueOf(thread.getId());
        }
        uncaughtExceptionHandler.uncaughtException(thread, new zfd(a, th, concat, l));
    }
}
