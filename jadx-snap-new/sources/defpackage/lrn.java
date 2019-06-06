package defpackage;

import defpackage.lrj.b;

/* renamed from: lrn */
public final class lrn implements aiqc<lsa> {
    private final ajwy<Boolean> a;
    private final ajwy<Boolean> b;
    private final ajwy<mwe> c;
    private final ajwy<ide> d;
    private final ajwy<zgb> e;
    private final ajwy<ajdp<lqf>> f;
    private final ajwy<ajdp<mmt>> g;
    private final ajwy<kqf> h;
    private final ajwy<ajdp<Double>> i;
    private final ajwy<lsw> j;

    public static lsa a(boolean z, boolean z2, mwe mwe, ide ide, zgb zgb, ajdp<lqf> ajdp, ajdp<mmt> ajdp2, kqf kqf, ajdp<Double> ajdp3, lsw lsw) {
        return (lsa) aiqf.a(b.a(z, z2, mwe, ide, zgb, ajdp, ajdp2, kqf, ajdp3, lsw), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return lrn.a(((Boolean) this.a.get()).booleanValue(), ((Boolean) this.b.get()).booleanValue(), (mwe) this.c.get(), (ide) this.d.get(), (zgb) this.e.get(), (ajdp) this.f.get(), (ajdp) this.g.get(), (kqf) this.h.get(), (ajdp) this.i.get(), (lsw) this.j.get());
    }
}
