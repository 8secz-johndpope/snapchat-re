package defpackage;

import defpackage.kst.a;

/* renamed from: krs */
public final class krs extends kru {
    private final ksr d;

    public krs(ksr ksr, mhk mhk) {
        akcr.b(ksr, "lensAnalyticsReporter");
        akcr.b(mhk, "clock");
        super(ksr, mhk);
        this.d = ksr;
    }

    public final void b(kro kro) {
        akcr.b(kro, "session");
        this.d.c(a.a(kro));
    }
}
