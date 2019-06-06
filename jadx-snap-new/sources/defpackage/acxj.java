package defpackage;

import defpackage.acut.a;

/* renamed from: acxj */
public final class acxj {
    public final acut a;
    public final actz b;
    private final acuq c;

    public acxj(adcl adcl, aczv aczv, actz actz, ajei ajei, jwe jwe, adbv adbv) {
        this.a = new acut(adcl, aczv, actz, ajei, jwe, adbv);
        this.c = new acuq(actz, adbv);
        this.b = actz;
    }

    public final void a() {
        acut acut = this.a;
        acut.d.b();
        acut.d.a();
        acuq acuq = this.c;
        acuq.c.b();
        acuq.c.a();
    }

    public final void a(acur acur, String str) {
        this.c.a(acur, str);
    }

    public final void a(acuu acuu) {
        acut acut = this.a;
        if (!(acuu.j() == null || acuu.j().a())) {
            acuu.a(null);
        }
        if (acuu.j() == null) {
            acxn acxn;
            aljy aljy = acuu.k().a;
            if (aljy.f == null || aljy.f.length <= 0) {
                acxn = null;
            } else {
                adbt adbt = new adbt(aljy.f[0], acut.b);
                acxn = acut.d.a(adbt.a);
                if (acxn == null) {
                    String str = adbt.a;
                    if (acut.c.a(str)) {
                        acut.e.a(adbt.b, str, new a(adbt, acut));
                    }
                }
            }
            if (acxn != null) {
                acuu.a(acxn);
            }
        }
    }

    public final boolean a(acur acur) {
        return this.c.a(acur);
    }
}
