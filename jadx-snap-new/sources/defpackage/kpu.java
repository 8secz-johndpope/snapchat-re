package defpackage;

import com.google.common.base.Supplier;

/* renamed from: kpu */
public final class kpu implements aiqc<kss> {
    private final ajwy<Supplier<iha>> a;
    private final ajwy<zfw> b;
    private final ajwy<ajei> c;
    private final ajwy<ajws<kqr>> d;

    public static kss a(Supplier<iha> supplier, zfw zfw, ajei ajei, ajws<kqr> ajws) {
        akcr.b(supplier, "serializationHelper");
        akcr.b(zfw, "qualifiedSchedulers");
        akcr.b(ajei, "compositeDisposable");
        akcr.b(ajws, "subject");
        return (kss) aiqf.a(new kso(supplier, zfw, ajei, ajws), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return kpu.a((Supplier) this.a.get(), (zfw) this.b.get(), (ajei) this.c.get(), (ajws) this.d.get());
    }
}
