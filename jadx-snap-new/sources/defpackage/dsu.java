package defpackage;

/* renamed from: dsu */
public final class dsu implements aiqc<ablb> {
    private final ajwy<abla> a;
    private final ajwy<abqo> b;
    private final ajwy<ablc> c;

    public static ablb a(abla abla, abqo abqo, aipn<ablc> aipn) {
        akcr.b(abla, "reporter");
        akcr.b(abqo, "clock");
        akcr.b(aipn, "userActionCollector");
        return (ablb) aiqf.a(new ablb(abla, abqo, aipn), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return dsu.a((abla) this.a.get(), (abqo) this.b.get(), aiqb.b(this.c));
    }
}
