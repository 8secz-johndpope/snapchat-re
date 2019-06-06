package defpackage;

import defpackage.kst.a;

/* renamed from: kru */
public class kru {
    public volatile kro a;
    public final ksr b;
    public final mhk c;

    public kru(ksr ksr, mhk mhk) {
        akcr.b(ksr, "lensAnalyticsReporter");
        akcr.b(mhk, "clock");
        this.b = ksr;
        this.c = mhk;
    }

    public void a() {
        kro kro = this.a;
        if (kro != null) {
            this.a = null;
            kro.a.b();
            kro.b.b();
            kro.c.b();
            b(kro);
        }
    }

    public void a(long j) {
        kro kro = this.a;
        if (kro != null) {
            kro.b.a();
        }
    }

    public void a(kro kro) {
        akcr.b(kro, "newLensSession");
        kro kro2 = this.a;
        if ((kro2 != null ? kro2.a() : null) != null) {
            if (!akcr.a(kro2.a(), kro.a())) {
                a();
            } else {
                return;
            }
        }
        kro.a.c();
        kro.b.c();
        this.a = kro;
    }

    public void b() {
        kro kro = this.a;
        if (kro != null) {
            kro.a.b();
            kro.c.c();
        }
    }

    public void b(kro kro) {
        akcr.b(kro, "session");
        this.b.a(a.a(kro));
    }

    public void c() {
        kro kro = this.a;
        if (kro != null) {
            kro.a.c();
            krt krt = kro.c;
            synchronized (krt.a) {
                krt.a.reset();
            }
        }
    }

    public final String d() {
        kro kro = this.a;
        return kro != null ? kro.a() : null;
    }
}
