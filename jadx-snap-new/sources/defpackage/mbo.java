package defpackage;

import defpackage.mbn.c;
import defpackage.mbw.a;

/* renamed from: mbo */
public final class mbo implements aiqc<mbt> {
    private final ajwy<ajdp<mbw>> a;
    private final ajwy<mbv> b;
    private final ajwy<ajdu<a, a>> c;
    private final ajwy<zfw> d;

    public static mbt a(ajdp<mbw> ajdp, mbv mbv, ajdu<a, a> ajdu, zfw zfw) {
        return (mbt) aiqf.a(c.a(ajdp, mbv, ajdu, zfw), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return mbo.a((ajdp) this.a.get(), (mbv) this.b.get(), (ajdu) this.c.get(), (zfw) this.d.get());
    }
}
