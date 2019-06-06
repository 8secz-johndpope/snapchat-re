package defpackage;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

/* renamed from: dyw */
public final class dyw {
    private final aipn<ebf> a;
    private final dzb b;
    private final jwa c;
    private final adhk d;
    private final Supplier<dyv> e;
    private final gqr f;
    private final abss g;

    public dyw(aipn<ebf> aipn, dzb dzb, jwa jwa, abre abre, adhk adhk, gqr gqr, abss abss, dvm dvm) {
        this.a = aipn;
        this.b = dzb;
        this.c = jwa;
        this.d = adhk;
        this.f = gqr;
        this.g = abss;
        this.e = Suppliers.memoize(new -$$Lambda$dyw$d4Es9yeuar_bjM8cQ87CYPgARnw(this, abre, dvm));
    }

    private /* synthetic */ dyv a(abre abre, dvm dvm) {
        dpg.a();
        return new dyv(zgd.a("CameraFrameDispatcherThread"), this.c, this.a, this.b, dnz.a(), abre, this.d, this.f, this.g, dvm);
    }

    public final dyv a() {
        return (dyv) this.e.get();
    }
}
