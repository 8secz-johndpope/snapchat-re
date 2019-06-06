package defpackage;

/* renamed from: mjs */
public final class mjs implements aiqc<mka> {
    private final ajwy<mof> a;
    private final ajwy<zfw> b;

    public static mka a(mof mof, zfw zfw) {
        akcr.b(mof, "resolverFactory");
        akcr.b(zfw, "qualifiedSchedulers");
        return (mka) aiqf.a(new mkl(mof, zfw), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return mjs.a((mof) this.a.get(), (zfw) this.b.get());
    }
}
