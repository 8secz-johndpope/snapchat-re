package defpackage;

/* renamed from: lpn */
public final class lpn implements aiqc<lqh> {
    private final ajwy<lqh> a;
    private final ajwy<ajdp<mmt>> b;
    private final ajwy<mwe> c;
    private final ajwy<miw> d;
    private final ajwy<kqf> e;
    private final ajwy<zgb> f;
    private final ajwy<ide> g;

    public static lqh a(lqh lqh, ajdp<mmt> ajdp, mwe mwe, miw miw, kqf kqf, zgb zgb, ide ide) {
        Object lqh2;
        akcr.b(ajdp, "lensCore");
        akcr.b(mwe, "lensRepository");
        akcr.b(miw, "configurationRepository");
        akcr.b(kqf, "analyticsEventHandler");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(ide, "attributedFeature");
        if (lqh2 == null) {
            lqh2 = new lqk(ajdp, mwe, miw, zgb.a(ide.callsite("DefaultCameraUseCase")), kqf);
        }
        return (lqh) aiqf.a(lqh2, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return lpn.a((lqh) this.a.get(), (ajdp) this.b.get(), (mwe) this.c.get(), (miw) this.d.get(), (kqf) this.e.get(), (zgb) this.f.get(), (ide) this.g.get());
    }
}
