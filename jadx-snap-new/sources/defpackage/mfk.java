package defpackage;

import defpackage.mfj.c;
import defpackage.mfu.b;

/* renamed from: mfk */
public final class mfk implements aiqc<mfq> {
    private final ajwy<ajdp<mfu>> a;
    private final ajwy<ajdu<b, b>> b;
    private final ajwy<mft> c;
    private final ajwy<zfw> d;

    public static mfq a(ajdp<mfu> ajdp, ajdu<b, b> ajdu, mft mft, zfw zfw) {
        return (mfq) aiqf.a(c.a(ajdp, ajdu, mft, zfw), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return mfk.a((ajdp) this.a.get(), (ajdu) this.b.get(), (mft) this.c.get(), (zfw) this.d.get());
    }
}
