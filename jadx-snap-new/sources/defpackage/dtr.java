package defpackage;

/* renamed from: dtr */
public final class dtr implements aiqc<aipn<?>> {
    private final ajwy<abtn> a;

    public static aipn<?> a(aipn<abtn> aipn) {
        akcr.b(aipn, "lazyInstance");
        dqq.a = aipn;
        return (aipn) aiqf.a(aipn, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return dtr.a(aiqb.b(this.a));
    }
}
