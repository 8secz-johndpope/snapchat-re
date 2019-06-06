package defpackage;

import java.lang.Thread.UncaughtExceptionHandler;

/* renamed from: gpo */
public final class gpo implements gqg {
    private final boolean a;

    public final UncaughtExceptionHandler a(UncaughtExceptionHandler uncaughtExceptionHandler) {
        akcr.b(uncaughtExceptionHandler, "defaultExceptionHandler");
        return new gpn(uncaughtExceptionHandler);
    }

    public final boolean a() {
        return this.a;
    }
}
