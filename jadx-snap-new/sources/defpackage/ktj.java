package defpackage;

import defpackage.lfu.a;

/* renamed from: ktj */
public final class ktj implements aiqc<a> {
    private final ajwy<a> a;
    private final ajwy<ckx> b;
    private final ajwy<zpo> c;
    private final ajwy<kvl> d;
    private final ajwy<gnk> e;

    public static a a(a aVar, ckx ckx, ajwy<zpo> ajwy, kvl kvl, gnk gnk) {
        return (a) aiqf.a(ksw.a(aVar, ckx, (ajwy) ajwy, kvl, gnk), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        ajwy ajwy = this.a;
        ajwy ajwy2 = this.b;
        return ktj.a((a) ajwy.get(), (ckx) ajwy2.get(), this.c, (kvl) this.d.get(), (gnk) this.e.get());
    }
}
