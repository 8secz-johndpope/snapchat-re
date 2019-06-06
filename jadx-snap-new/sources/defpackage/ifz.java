package defpackage;

import android.database.sqlite.SQLiteFullException;

/* renamed from: ifz */
public final class ifz implements igb {
    private final ajwl<Long> a;
    private final ihh b;

    public ifz(ihh ihh) {
        akcr.b(ihh, "clock");
        this.b = ihh;
        Object i = ajwl.i(Long.valueOf(0));
        akcr.a(i, "BehaviorSubject.createDefault(0L)");
        this.a = i;
    }

    private static boolean c(Throwable th) {
        return (th instanceof SQLiteFullException) || abmt.c(th);
    }

    public final ajdp<Long> a() {
        Object f = this.a.f();
        akcr.a(f, "noDiskExceptionPublisher.hide()");
        return f;
    }

    public final void a(Throwable th) {
        akcr.b(th, "throwable");
        this.a.a(Long.valueOf(this.b.c()));
    }

    public final boolean b(Throwable th) {
        akcr.b(th, "throwable");
        if (ifz.c(th)) {
            return true;
        }
        Object cause = th.getCause();
        return (cause == null || (akcr.a(cause, (Object) th) ^ 1) == 0 || !ifz.c(cause)) ? false : true;
    }
}
