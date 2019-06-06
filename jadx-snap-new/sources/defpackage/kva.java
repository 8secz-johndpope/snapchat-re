package defpackage;

import defpackage.kuw.a.c;
import defpackage.kws.a;
import defpackage.kws.d;

/* renamed from: kva */
public final class kva implements aiqc<a> {
    private final ajwy<zgb> a;
    private final ajwy<gfu> b;
    private final ajwy<iha> c;

    public static a a(zgb zgb, ajwy<gfu> ajwy, ajwy<iha> ajwy2) {
        akcr.b(zgb, "schedulersProvider");
        akcr.b(ajwy, "snapContentResolver");
        akcr.b(ajwy2, "serializationHelper");
        d cVar = new c(zgb, ajwy, ajwy2);
        akcr.b(cVar, "parentComponent");
        return (a) aiqf.a(new kwl.a().a(cVar).a((nay) nay.a.a).a((mok) mok.a.a).a((ddj) ddj.a.a), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        ajwy ajwy = this.a;
        return kva.a((zgb) ajwy.get(), this.b, this.c);
    }
}
