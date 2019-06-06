package defpackage;

/* renamed from: dtn */
public final class dtn implements aiqc<aipn<?>> {
    private final ajwy<dqo> a;

    public static aipn<?> a(aipn<dqo> aipn) {
        akcr.b(aipn, "lazyInstance");
        dqp.a = aipn;
        return (aipn) aiqf.a(aipn, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return dtn.a(aiqb.b(this.a));
    }
}
