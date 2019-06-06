package defpackage;

import java.lang.Thread.UncaughtExceptionHandler;

/* renamed from: jwy */
public final class jwy implements UncaughtExceptionHandler {
    private final ajwy<jwx> a;
    private final UncaughtExceptionHandler b;

    public jwy(ajwy<jwx> ajwy, UncaughtExceptionHandler uncaughtExceptionHandler) {
        akcr.b(ajwy, "recycledBitmapTracker");
        akcr.b(uncaughtExceptionHandler, "defaultExceptionHandler");
        this.a = ajwy;
        this.b = uncaughtExceptionHandler;
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        if (th != null && (th instanceof RuntimeException)) {
            String message = th.getMessage();
            if (message != null && akgb.b(message, "Canvas: trying to use a recycled bitmap ", false)) {
                if (message != null) {
                    message = message.substring(40);
                    akcr.a((Object) message, "(this as java.lang.String).substring(startIndex)");
                    if (((jwx) this.a.get()).a(message) != null) {
                        th = new ajeo(new jww(message, ((jwx) this.a.get()).a(message)), th);
                    }
                } else {
                    throw new ajxt("null cannot be cast to non-null type java.lang.String");
                }
            }
        }
        this.b.uncaughtException(thread, th);
    }
}
