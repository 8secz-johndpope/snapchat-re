package defpackage;

/* renamed from: lqt */
public final class lqt implements aiqc<lqv> {
    private final ajwy<Boolean> a;
    private final ajwy<ajdp<mmt>> b;
    private final ajwy<ajdp<lqf>> c;

    public static lqv a(boolean z, ajdp<mmt> ajdp, ajdp<lqf> ajdp2) {
        return (lqv) aiqf.a(z ? new lqq(ajdp) : new lqy(ajdp, ajdp2), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return lqt.a(((Boolean) this.a.get()).booleanValue(), (ajdp) this.b.get(), (ajdp) this.c.get());
    }
}
