package defpackage;

import com.google.common.base.Optional;

/* renamed from: ebc */
public final class ebc {
    public final dpf a;
    public final dny b;
    public final adnp c;
    public final ihh d;
    public final kpc e;
    private final dqo f;

    public ebc(dqo dqo, dpf dpf, dny dny, adnp adnp, ihh ihh, kpc kpc) {
        this.f = dqo;
        this.a = dpf;
        this.b = dny;
        this.c = adnp;
        this.d = ihh;
        this.e = kpc;
    }

    private boolean b() {
        return this.a.B() && this.a.Z();
    }

    public final boolean a() {
        Optional D = this.a.D();
        return D.isPresent() ? ((Boolean) D.get()).booleanValue() : b();
    }
}
