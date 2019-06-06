package defpackage;

import com.snap.core.db.api.DbClient;

/* renamed from: hlb */
public final class hlb implements aiqc<gyo> {
    private final ajwy<DbClient> a;
    private final ajwy<ihh> b;

    public static gyo a(DbClient dbClient, ihh ihh) {
        akcr.b(dbClient, "client");
        akcr.b(ihh, "clock");
        return (gyo) aiqf.a(new gyo(dbClient, ihh), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return hlb.a((DbClient) this.a.get(), (ihh) this.b.get());
    }
}
