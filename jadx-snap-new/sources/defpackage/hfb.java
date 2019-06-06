package defpackage;

/* renamed from: hfb */
public final class hfb implements aiqc<hps> {
    private final ajwy<ftl> a;
    private final ajwy<zgb> b;

    public static hps a(ajwy<ftl> ajwy, zgb zgb) {
        akcr.b(ajwy, "configurationProvider");
        akcr.b(zgb, "schedulersProvider");
        return (hps) aiqf.a(new hps(ajwy, zgb), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return hfb.a(this.a, (zgb) this.b.get());
    }
}
