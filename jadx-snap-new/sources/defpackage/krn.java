package defpackage;

import defpackage.kst.a;

/* renamed from: krn */
public final class krn extends kru {
    private final ksr d;

    public krn(ksr ksr, mhk mhk) {
        akcr.b(ksr, "lensAnalyticsReporter");
        akcr.b(mhk, "clock");
        super(ksr, mhk);
        this.d = ksr;
    }

    public final void a() {
        kro kro = this.a;
        if (kro != null) {
            this.a = null;
            kro.a.b();
            b(kro);
        }
    }

    public final void a(long j) {
        kro kro = this.a;
        if (kro != null) {
            a();
            a(kro.a(kro, null, 0, 0, 1 - j, null, null, false, null, null, 0, null, aabz.DOUBLE_TAP, false, 6135));
        }
    }

    public final void a(kro kro) {
        akcr.b(kro, "newLensSession");
        kro kro2 = this.a;
        if (!((kro2 != null ? kro2.a() : null) == null || (akcr.a(kro2.a(), kro.a()) ^ 1) == 0)) {
            a();
        }
        kro.a.c();
        this.a = kro;
    }

    public final void b() {
        kro kro = this.a;
        if (kro != null) {
            a(kro.a(kro, null, 0, 0, 0, null, null, false, null, null, 0, null, null, true, 4095));
        }
    }

    public final void b(kro kro) {
        akcr.b(kro, "session");
        this.d.b(a.a(kro));
    }

    public final void c() {
        kro kro = this.a;
        if (kro != null) {
            kro.H = false;
        }
    }
}
