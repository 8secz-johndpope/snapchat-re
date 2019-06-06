package defpackage;

import com.google.common.base.Supplier;

/* renamed from: kpq */
public final class kpq implements aiqc<kre> {
    private final ajwy<Supplier<dib>> a;
    private final ajwy<zfw> b;
    private final ajwy<ajei> c;

    public static kre a(Supplier<dib> supplier, zfw zfw, ajei ajei) {
        akcr.b(supplier, "blizzardEventLogger");
        akcr.b(zfw, "qualifiedSchedulers");
        akcr.b(ajei, "compositeDisposable");
        return (kre) aiqf.a(new kre(supplier, zfw, ajei), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return kpq.a((Supplier) this.a.get(), (zfw) this.b.get(), (ajei) this.c.get());
    }
}
