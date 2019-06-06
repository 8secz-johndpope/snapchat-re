package defpackage;

import defpackage.lxc.b;

/* renamed from: lwz */
public final class lwz implements aiqc<ajdu<b, b>> {
    private final ajwy<ajdp<Boolean>> a;
    private final ajwy<ajdp<lqf>> b;
    private final ajwy<zfw> c;

    public static ajdu<b, b> a(ajdp<Boolean> ajdp, ajdp<lqf> ajdp2, zfw zfw) {
        akcr.b(ajdp, "hideWhen");
        akcr.b(ajdp2, "cameraLifecycle");
        akcr.b(zfw, "qualifiedSchedulers");
        return (ajdu) aiqf.a(new lwu(ajdp, ajdp2, zfw), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return lwz.a((ajdp) this.a.get(), (ajdp) this.b.get(), (zfw) this.c.get());
    }
}
