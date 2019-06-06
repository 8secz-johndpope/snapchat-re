package defpackage;

import defpackage.mvc.c;

/* renamed from: mvi */
public final class mvi implements aiqc<mvv> {
    private final ajwy<ide> a;
    private final ajwy<zgb> b;
    private final ajwy<mvr> c;
    private final ajwy<mwc> d;
    private final ajwy<mok<? super moc>> e;
    private final ajwy<ajdp<muo>> f;
    private final ajwy<Boolean> g;

    public static mvv a(ide ide, zgb zgb, mvr mvr, mwc mwc, mok<? super moc> mok, ajdp<muo> ajdp, boolean z) {
        return (mvv) aiqf.a(c.a(ide, zgb, mvr, mwc, mok, ajdp, z), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return mvi.a((ide) this.a.get(), (zgb) this.b.get(), (mvr) this.c.get(), (mwc) this.d.get(), (mok) this.e.get(), (ajdp) this.f.get(), ((Boolean) this.g.get()).booleanValue());
    }
}
