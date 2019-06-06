package defpackage;

/* renamed from: lwx */
public final class lwx implements aiqc<lxb> {
    private final ajwy<ajdp<mmt>> a;
    private final ajwy<mwe> b;
    private final ajwy<lxh> c;
    private final ajwy<zfw> d;
    private final ajwy<kqf> e;

    public static lxb a(ajdp<mmt> ajdp, mwe mwe, lxh lxh, zfw zfw, kqf kqf) {
        akcr.b(ajdp, "lensCore");
        akcr.b(mwe, "lensRepository");
        akcr.b(lxh, "attachmentOpener");
        akcr.b(zfw, "qualifiedSchedulers");
        akcr.b(kqf, "analyticsEventHandler");
        return (lxb) aiqf.a(new lxf(ajdp, mwe, lxh, zfw, kqf), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return lwx.a((ajdp) this.a.get(), (mwe) this.b.get(), (lxh) this.c.get(), (zfw) this.d.get(), (kqf) this.e.get());
    }
}
