package defpackage;

/* renamed from: ltn */
public final class ltn implements aiqc<ltq> {
    private final ajwy<miw> a;
    private final ajwy<ajdp<mmt>> b;
    private final ajwy<lth> c;

    public static ltq a(miw miw, ajdp<mmt> ajdp, lth lth) {
        akcr.b(miw, "configurationRepository");
        akcr.b(ajdp, "lensCore");
        akcr.b(lth, "bitmojiLensInteractor");
        return (ltq) aiqf.a(new ltw(ajdp, lth), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return ltn.a((miw) this.a.get(), (ajdp) this.b.get(), (lth) this.c.get());
    }
}
