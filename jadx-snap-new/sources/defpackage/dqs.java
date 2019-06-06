package defpackage;

import defpackage.gqr.a;

/* renamed from: dqs */
public final class dqs implements gqr {
    private final gqr a;

    public dqs(gqr gqr) {
        akcr.b(gqr, "delegate");
        this.a = gqr;
    }

    public final void a(gqt gqt, Throwable th, idd idd) {
        akcr.b(gqt, "severity");
        akcr.b(th, "throwable");
        akcr.b(idd, "attributedCallsite");
        a.a(this, gqt, th, idd);
    }

    public final void a(gqt gqt, Throwable th, idd idd, String str) {
        akcr.b(gqt, "severity");
        akcr.b(th, "throwable");
        akcr.b(idd, "attributedCallsite");
        akcr.b(str, "triggerId");
        this.a.a(gqt, th, idd, str);
    }
}
