package defpackage;

import com.google.common.base.Optional;

/* renamed from: kpb */
public final class kpb implements aiqc<kpc> {
    private final ajwy<kos> a;
    private final ajwy<kpi> b;
    private final ajwy<koy> c;
    private final ajwy<zgb> d;
    private final ajwy<Optional<aipn<kpd>>> e;
    private final ajwy<ilv> f;
    private final ajwy<dib> g;

    public static kpc a(kos kos, kpi kpi, koy koy, zgb zgb, Optional<aipn<kpd>> optional, aipn<ilv> aipn, aipn<dib> aipn2) {
        return (kpc) aiqf.a(koz.a(kos, kpi, koy, optional, aipn, aipn2), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return kpb.a((kos) this.a.get(), (kpi) this.b.get(), (koy) this.c.get(), (zgb) this.d.get(), (Optional) this.e.get(), aiqb.b(this.f), aiqb.b(this.g));
    }
}
