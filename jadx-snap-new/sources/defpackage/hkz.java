package defpackage;

import com.snap.core.db.api.DbClient;

/* renamed from: hkz */
public final class hkz implements aiqc<gyn> {
    private final ajwy<DbClient> a;
    private final ajwy<ihh> b;

    public static gyn a(DbClient dbClient, ihh ihh) {
        akcr.b(dbClient, "client");
        akcr.b(ihh, "clock");
        return (gyn) aiqf.a(new gyn(dbClient, ihh), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return hkz.a((DbClient) this.a.get(), (ihh) this.b.get());
    }
}
