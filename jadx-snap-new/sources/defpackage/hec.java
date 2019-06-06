package defpackage;

/* renamed from: hec */
public final class hec implements aiqc<hhu> {
    private final ajwy<hrd> a;
    private final ajwy<hbw> b;

    public static hhu a(hrd hrd, hbw hbw) {
        akcr.b(hrd, "impl");
        akcr.b(hbw, "interactionStore");
        return (hhu) aiqf.a(new hhg(ajzt.a((Object[]) new hhu[]{hrd, hbw})), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return hec.a((hrd) this.a.get(), (hbw) this.b.get());
    }
}
