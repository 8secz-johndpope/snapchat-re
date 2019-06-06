package defpackage;

/* renamed from: dtq */
public final class dtq implements aiqc<aipn<?>> {
    private final ajwy<abss> a;

    public static aipn<?> a(aipn<abss> aipn) {
        akcr.b(aipn, "lazyInstance");
        abss.c = aipn;
        return (aipn) aiqf.a(aipn, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return dtq.a(aiqb.b(this.a));
    }
}
