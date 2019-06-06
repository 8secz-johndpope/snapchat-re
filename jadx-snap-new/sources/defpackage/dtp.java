package defpackage;

/* renamed from: dtp */
public final class dtp implements aiqc<aipn<?>> {
    private final ajwy<ablx> a;

    public static aipn<?> a(aipn<ablx> aipn) {
        akcr.b(aipn, "lazyInstance");
        ablx.a = aipn;
        return (aipn) aiqf.a(aipn, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return dtp.a(aiqb.b(this.a));
    }
}
