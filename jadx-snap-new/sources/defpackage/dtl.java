package defpackage;

/* renamed from: dtl */
public final class dtl implements aiqc<aipn<?>> {
    private final ajwy<dpi> a;

    public static aipn<?> a(aipn<dpi> aipn) {
        akcr.b(aipn, "lazyInstance");
        dpi.a = aipn;
        return (aipn) aiqf.a(aipn, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return dtl.a(aiqb.b(this.a));
    }
}
