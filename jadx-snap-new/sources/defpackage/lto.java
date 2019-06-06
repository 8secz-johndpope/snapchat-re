package defpackage;

import defpackage.ltr.b;

/* renamed from: lto */
public final class lto implements aiqc<ajdu<b, b>> {
    private final ajwy<ajdp<mih>> a;
    private final ajwy<ajdp<Boolean>> b;
    private final ajwy<ajdp<lqf>> c;
    private final ajwy<zfw> d;

    public static ajdu<b, b> a(ajdp<mih> ajdp, ajdp<Boolean> ajdp2, ajdp<lqf> ajdp3, zfw zfw) {
        akcr.b(ajdp, "windowRect");
        akcr.b(ajdp2, "hideWhen");
        akcr.b(ajdp3, "cameraLifecycle");
        akcr.b(zfw, "qualifiedSchedulers");
        return (ajdu) aiqf.a(mic.a(new ltj(ajdp2, ajdp3, zfw), mic.a((ajdp) ajdp)), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return lto.a((ajdp) this.a.get(), (ajdp) this.b.get(), (ajdp) this.c.get(), (zfw) this.d.get());
    }
}
