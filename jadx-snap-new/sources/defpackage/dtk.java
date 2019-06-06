package defpackage;

/* renamed from: dtk */
public final class dtk implements aiqc<aipn<?>> {
    private final ajwy<dpf> a;

    public static aipn<?> a(aipn<dpf> aipn) {
        akcr.b(aipn, "lazyInstance");
        dpg.a = aipn;
        return (aipn) aiqf.a(aipn, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return dtk.a(aiqb.b(this.a));
    }
}
