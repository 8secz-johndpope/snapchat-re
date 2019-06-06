package defpackage;

/* renamed from: dsc */
public final class dsc implements aiqc<dnv> {
    private final ajwy<ajws<ebj>> a;
    private final ajwy<ajws<ebo>> b;
    private final ajwy<achb<zjm, zjk>> c;
    private final ajwy<zgb> d;
    private final ajwy<dnu> e;

    public static dnv a(ajws<ebj> ajws, ajws<ebo> ajws2, ajwy<achb<zjm, zjk>> ajwy, zgb zgb, dnu dnu) {
        akcr.b(ajws, "captureStartEventSubject");
        akcr.b(ajws2, "mediaCreationEventSubject");
        akcr.b(ajwy, "navigationHost");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(dnu, "stackedCameraConfigProvider");
        return (dnv) aiqf.a(new epk(ajws, ajws2, ajwy, zgb, dnu), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        ajwy ajwy = this.a;
        ajwy ajwy2 = this.b;
        return dsc.a((ajws) ajwy.get(), (ajws) ajwy2.get(), this.c, (zgb) this.d.get(), (dnu) this.e.get());
    }
}
