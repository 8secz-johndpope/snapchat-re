package defpackage;

import defpackage.ksw.ae;

/* renamed from: ktv */
public final class ktv implements aiqc<akbl<mmt, mph>> {
    private final ajwy<llx> a;
    private final ajwy<zgb> b;

    public static akbl<mmt, mph> a(llx llx, zgb zgb) {
        akcr.b(llx, "snappablesMetadataProvider");
        akcr.b(zgb, "schedulersProvider");
        return (akbl) aiqf.a(new ae(llx, zgb), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return ktv.a((llx) this.a.get(), (zgb) this.b.get());
    }
}
