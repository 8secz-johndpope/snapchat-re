package defpackage;

/* renamed from: gax */
public final class gax implements aiqc<gpi> {
    private final ajwy<zfo> a;
    private final ajwy<gph> b;
    private final ajwy<ablk> c;

    public static gpi a(aipn<zfo> aipn, aipn<gph> aipn2, ajwy<ablk> ajwy) {
        String str = "cpuStatsLogger";
        akcr.b(aipn, str);
        akcr.b(aipn2, "cpuEventReporter");
        akcr.b(ajwy, "perfMonitorConfig");
        akcr.b(aipn, str);
        zgd.d.set(aipn);
        return (gpi) aiqf.a(new gpi(aipn, aipn2, ajwy), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        ajwy ajwy = this.a;
        ajwy ajwy2 = this.b;
        return gax.a(aiqb.b(ajwy), aiqb.b(ajwy2), this.c);
    }
}
