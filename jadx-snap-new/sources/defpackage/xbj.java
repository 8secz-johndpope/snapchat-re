package defpackage;

/* renamed from: xbj */
public final class xbj implements aiqc<xjn> {
    private final ajwy<xbb> a;
    private final ajwy<xgk> b;
    private final ajwy<ajdw> c;

    public xbj(ajwy<xbb> ajwy, ajwy<xgk> ajwy2, ajwy<ajdw> ajwy3) {
        this.a = ajwy;
        this.b = ajwy2;
        this.c = ajwy3;
    }

    public final /* synthetic */ Object get() {
        ajwy ajwy = this.a;
        ajwy ajwy2 = this.b;
        ajdw ajdw = (ajdw) this.c.get();
        akcr.b(ajwy, "deviceManager");
        akcr.b(ajwy2, "eventObservables");
        akcr.b(ajdw, "scheduler");
        return (xjn) aiqf.a(new xjn(ajwy, ajwy2, ajdw), "Cannot return null from a non-@Nullable @Provides method");
    }
}
