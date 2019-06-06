package defpackage;

/* renamed from: dsx */
public final class dsx implements aiqc<dod> {
    private final ajwy<dug> a;
    private final ajwy<ilv> b;
    private final ajwy<ihh> c;
    private final ajwy<zgb> d;

    public static dod a(dug dug, ilv ilv, ihh ihh, zgb zgb) {
        akcr.b(dug, "cameraTelemetry");
        akcr.b(ilv, "graphene");
        akcr.b(ihh, "clock");
        akcr.b(zgb, "schedulersProvider");
        return (dod) aiqf.a(new emr(dug, ilv, ihh, zgb), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return dsx.a((dug) this.a.get(), (ilv) this.b.get(), (ihh) this.c.get(), (zgb) this.d.get());
    }
}
