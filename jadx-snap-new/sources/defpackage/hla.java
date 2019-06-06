package defpackage;

import com.snap.core.db.api.DbClient;
import com.snap.core.db.api.SnapDb;

/* renamed from: hla */
public final class hla implements aiqc<DbClient> {
    private final ajwy<SnapDb> a;
    private final ajwy<ssl> b;

    public static DbClient a(SnapDb snapDb, ssl ssl) {
        akcr.b(snapDb, "snapDb");
        akcr.b(ssl, "feature");
        Object dbClient = snapDb.getDbClient((ide) ssl);
        akcr.a(dbClient, "snapDb.getDbClient(feature)");
        return (DbClient) aiqf.a(dbClient, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return hla.a((SnapDb) this.a.get(), (ssl) this.b.get());
    }
}
