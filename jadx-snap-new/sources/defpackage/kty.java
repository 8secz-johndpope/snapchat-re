package defpackage;

import defpackage.ksw.ah;

/* renamed from: kty */
public final class kty implements aiqc<akbl<mmt, mph>> {
    private final ajwy<gcy> a;
    private final ajwy<zgb> b;

    public static akbl<mmt, mph> a(ajwy<gcy> ajwy, zgb zgb) {
        akcr.b(ajwy, "fsnServiceFactory");
        akcr.b(zgb, "schedulersProvider");
        return (akbl) aiqf.a(new ah(ajwy, zgb), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return kty.a(this.a, (zgb) this.b.get());
    }
}
