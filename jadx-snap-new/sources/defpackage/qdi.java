package defpackage;

import com.snap.core.db.AllUpdatesProcessor;
import com.snap.core.db.api.DbTransaction;
import com.snap.core.db.api.SnapDb;

/* renamed from: qdi */
public final class qdi implements AllUpdatesProcessor {
    private final qvh a;

    public qdi(qvh qvh) {
        akcr.b(qvh, "store");
        this.a = qvh;
    }

    public final void applyUpdates(aecy aecy, SnapDb snapDb, DbTransaction dbTransaction) {
        akcr.b(aecy, "allUpdates");
        akcr.b(snapDb, "database");
        akcr.b(dbTransaction, "tx");
        aesz aesz = aecy.b;
        if (aesz != null) {
            this.a.a(aesz, dbTransaction);
        }
    }
}
