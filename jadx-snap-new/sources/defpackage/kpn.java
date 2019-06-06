package defpackage;

import com.google.common.base.Supplier;

/* renamed from: kpn */
public final class kpn implements aiqc<kqu> {
    private final ajwy<cko> a;
    private final ajwy<Supplier<ckx>> b;
    private final ajwy<miw> c;
    private final ajwy<Supplier<iib>> d;
    private final ajwy<zfw> e;
    private final ajwy<ajei> f;

    public static kqu a(cko cko, Supplier<ckx> supplier, miw miw, Supplier<iib> supplier2, zfw zfw, ajei ajei) {
        akcr.b(cko, "adTrackerApi");
        akcr.b(supplier, "swipeToLensSource");
        akcr.b(miw, "configurationRepository");
        akcr.b(supplier2, "screenParameterProvider");
        akcr.b(zfw, "qualifiedSchedulers");
        akcr.b(ajei, "compositeDisposable");
        return (kqu) aiqf.a(new kqv(cko, supplier, miw, supplier2, ajei, zfw.f()), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return kpn.a((cko) this.a.get(), (Supplier) this.b.get(), (miw) this.c.get(), (Supplier) this.d.get(), (zfw) this.e.get(), (ajei) this.f.get());
    }
}
