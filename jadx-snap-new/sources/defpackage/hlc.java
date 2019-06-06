package defpackage;

import com.snap.core.db.api.DbClient;

/* renamed from: hlc */
public final class hlc implements aiqc<gyq> {
    private final ajwy<DbClient> a;
    private final ajwy<ihh> b;

    public static gyq a(DbClient dbClient, ihh ihh) {
        akcr.b(dbClient, "client");
        akcr.b(ihh, "clock");
        return (gyq) aiqf.a(new gyq(dbClient, ihh), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return hlc.a((DbClient) this.a.get(), (ihh) this.b.get());
    }
}
