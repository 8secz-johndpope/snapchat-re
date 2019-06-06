package defpackage;

/* renamed from: lwp */
public final class lwp implements aiqc<lwt> {
    private final ajwy<ajdp<mmt>> a;
    private final ajwy<ajfb<lwo>> b;

    public static lwt a(ajdp<mmt> ajdp, ajfb<lwo> ajfb) {
        akcr.b(ajdp, "lensCore");
        akcr.b(ajfb, "consumer");
        return (lwt) aiqf.a(new lwt(ajdp, ajfb), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return lwp.a((ajdp) this.a.get(), (ajfb) this.b.get());
    }
}
