package defpackage;

/* renamed from: lwf */
public final class lwf implements aiqc<lwi> {
    private final ajwy<ajdp<lwk>> a;
    private final ajwy<lwj> b;
    private final ajwy<zfw> c;

    public static lwi a(ajdp<lwk> ajdp, lwj lwj, zfw zfw) {
        akcr.b(ajdp, "viewProvider");
        akcr.b(lwj, "useCase");
        akcr.b(zfw, "qualifiedSchedulers");
        return (lwi) aiqf.a(new lwm(ajdp, lwj, zfw), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return lwf.a((ajdp) this.a.get(), (lwj) this.b.get(), (zfw) this.c.get());
    }
}
