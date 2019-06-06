package defpackage;

/* renamed from: heb */
public final class heb implements aiqc<hmm> {
    private final ajwy<ftl> a;
    private final ajwy<gpu> b;
    private final ajwy<zfw> c;

    public static hmm a(ftl ftl, gpu gpu, zfw zfw) {
        akcr.b(ftl, "configurationProvider");
        akcr.b(gpu, "userSession");
        akcr.b(zfw, "schedulers");
        return (hmm) aiqf.a(new hmm(ftl, gpu, zfw), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return heb.a((ftl) this.a.get(), (gpu) this.b.get(), (zfw) this.c.get());
    }
}
