package defpackage;

import com.snap.core.db.AllUpdatesProcessor;
import com.snap.core.db.api.DbTransaction;
import com.snap.core.db.api.SnapDb;

/* renamed from: hba */
public final class hba implements AllUpdatesProcessor {
    private final gxg a;

    public hba(gxg gxg) {
        akcr.b(gxg, "config");
        this.a = gxg;
    }

    public final void applyUpdates(aecy aecy, SnapDb snapDb, DbTransaction dbTransaction) {
        akcr.b(aecy, "updates");
        akcr.b(snapDb, "database");
        akcr.b(dbTransaction, "tx");
        aejo aejo = aecy.j;
        if (aejo != null) {
            gxg gxg = this.a;
            akcr.b(aejo, "discoverResponse");
            gxg.a.b().a((fth) gxi.VIDEO_CATALOG_ENDPOINT_KEY, aejo.c).a((fth) gxi.AD_VIDEO_URL_KEY, aejo.d).a((fth) gxi.CHANNEL_LIST_URL_KEY, aejo.a).a((fth) gxi.EDITION_LIST_URL_KEY, aejo.b).a((fth) gxi.VALIDATION_URL_KEY, aejo.e).b();
        }
    }
}
