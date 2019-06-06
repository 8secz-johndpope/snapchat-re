package defpackage;

/* renamed from: gat */
public final class gat implements aiqc<rzd<ryz>> {
    private final ajwy<rzl<ryz>> a;
    private final ajwy<glt> b;
    private final ajwy<glh> c;

    public static rzd<ryz> a(rzl<ryz> rzl, ajwy<glt> ajwy, glh glh) {
        Object rzl2;
        if (glh.a()) {
            rzl2 = (rzd) ajwy.get();
        }
        return (rzd) aiqf.a(rzl2, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        ajwy ajwy = this.a;
        return gat.a((rzl) ajwy.get(), this.b, (glh) this.c.get());
    }
}
