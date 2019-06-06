package defpackage;

import com.snap.core.db.api.SnapDb;
import defpackage.lni.a;
import defpackage.lni.d;

/* renamed from: kvb */
public final class kvb implements aiqc<a> {
    private final ajwy<gpb> a;
    private final ajwy<zgb> b;
    private final ajwy<SnapDb> c;

    public static a a(ajwy<gpb> ajwy, zgb zgb, ajwy<SnapDb> ajwy2) {
        akcr.b(ajwy, "userAuthStore");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(ajwy2, "snapDb");
        d dVar = new kuw.a.d(ajwy, zgb, ajwy2);
        akcr.b(dVar, "parentComponent");
        return (a) aiqf.a(new lng.a().a(dVar), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        ajwy ajwy = this.a;
        ajwy ajwy2 = this.b;
        return kvb.a(ajwy, (zgb) ajwy2.get(), this.c);
    }
}
