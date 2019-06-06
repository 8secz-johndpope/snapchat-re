package defpackage;

import defpackage.lxc.b;

/* renamed from: lww */
public final class lww implements aiqc<lxa> {
    private final ajwy<ajdp<lxc>> a;
    private final ajwy<lxb> b;
    private final ajwy<ajdu<b, b>> c;
    private final ajwy<zfw> d;

    public static lxa a(ajdp<lxc> ajdp, lxb lxb, ajdu<b, b> ajdu, zfw zfw) {
        akcr.b(ajdp, "ctaViewProvider");
        akcr.b(lxb, "ctaUseCase");
        akcr.b(ajdu, "viewModelTransformer");
        akcr.b(zfw, "qualifiedSchedulers");
        return (lxa) aiqf.a(new lxe(ajdp, lxb, ajdu, zfw), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return lww.a((ajdp) this.a.get(), (lxb) this.b.get(), (ajdu) this.c.get(), (zfw) this.d.get());
    }
}
