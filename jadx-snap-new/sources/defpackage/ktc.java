package defpackage;

import defpackage.ksw.g;

/* renamed from: ktc */
public final class ktc implements aiqc<akbl<mmt, mph>> {
    private final ajwy<addk> a;
    private final ajwy<iha> b;
    private final ajwy<gvl> c;
    private final ajwy<zgb> d;

    public static akbl<mmt, mph> a(ajwy<addk> ajwy, ajwy<iha> ajwy2, ajwy<gvl> ajwy3, zgb zgb) {
        akcr.b(ajwy, "eggHuntProvider");
        akcr.b(ajwy2, "serializationHelperProvider");
        akcr.b(ajwy3, "deepLinkDispatcherProvider");
        akcr.b(zgb, "schedulersProvider");
        return (akbl) aiqf.a(new g(ajwy, ajwy2, ajwy3, zgb.a(kus.b, "EggHuntUriDataHandler")), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return ktc.a(this.a, this.b, this.c, (zgb) this.d.get());
    }
}
