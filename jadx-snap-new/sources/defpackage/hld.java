package defpackage;

import com.snap.core.db.api.DbClient;

/* renamed from: hld */
public final class hld implements aiqc<gyr> {
    private final ajwy<DbClient> a;
    private final ajwy<ihh> b;

    public static gyr a(DbClient dbClient, ihh ihh) {
        akcr.b(dbClient, "client");
        akcr.b(ihh, "clock");
        return (gyr) aiqf.a(new gyr(dbClient, ihh), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return hld.a((DbClient) this.a.get(), (ihh) this.b.get());
    }
}
