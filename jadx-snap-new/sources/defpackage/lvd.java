package defpackage;

import defpackage.lva.c;
import defpackage.lvi.b;

/* renamed from: lvd */
public final class lvd implements aiqc<lvg> {
    private final ajwy<zfw> a;
    private final ajwy<ajdp<lvi>> b;
    private final ajwy<lvh> c;
    private final ajwy<ajdu<b, b>> d;

    public static lvg a(zfw zfw, ajdp<lvi> ajdp, lvh lvh, ajdu<b, b> ajdu) {
        return (lvg) aiqf.a(c.a(zfw, (ajdp) ajdp, lvh, (ajdu) ajdu), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return lvd.a((zfw) this.a.get(), (ajdp) this.b.get(), (lvh) this.c.get(), (ajdu) this.d.get());
    }
}
