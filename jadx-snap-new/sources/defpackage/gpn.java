package defpackage;

import java.lang.Thread.UncaughtExceptionHandler;

/* renamed from: gpn */
public final class gpn implements UncaughtExceptionHandler {
    private final UncaughtExceptionHandler a;

    /* renamed from: gpn$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static {
        a aVar = new a();
    }

    public gpn(UncaughtExceptionHandler uncaughtExceptionHandler) {
        akcr.b(uncaughtExceptionHandler, "defaultExceptionHandler");
        this.a = uncaughtExceptionHandler;
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        if (th instanceof InternalError) {
            if (akcr.a((Object) "Thread starting during runtime shutdown", th.getMessage())) {
                return;
            }
        }
        this.a.uncaughtException(thread, th);
    }
}
