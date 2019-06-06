package defpackage;

import defpackage.ltr.b;

/* renamed from: ltl */
public final class ltl implements aiqc<ltp> {
    private final ajwy<ajdp<ltr>> a;
    private final ajwy<ltq> b;
    private final ajwy<ajdu<b, b>> c;
    private final ajwy<zfw> d;

    public static ltp a(ajdp<ltr> ajdp, ltq ltq, ajdu<b, b> ajdu, zfw zfw) {
        akcr.b(ajdp, "viewProvider");
        akcr.b(ltq, "useCase");
        akcr.b(ajdu, "viewModelTransformer");
        akcr.b(zfw, "qualifiedSchedulers");
        return (ltp) aiqf.a(new ltt(ajdp, ltq, ajdu, zfw), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return ltl.a((ajdp) this.a.get(), (ltq) this.b.get(), (ajdu) this.c.get(), (zfw) this.d.get());
    }
}
