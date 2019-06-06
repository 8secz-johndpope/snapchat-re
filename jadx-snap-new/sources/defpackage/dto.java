package defpackage;

/* renamed from: dto */
public final class dto implements aiqc<aipn<?>> {
    private final ajwy<dqt> a;

    public static aipn<?> a(aipn<dqt> aipn) {
        akcr.b(aipn, "lazyInstance");
        dqt.a = aipn;
        return (aipn) aiqf.a(aipn, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return dto.a(aiqb.b(this.a));
    }
}
