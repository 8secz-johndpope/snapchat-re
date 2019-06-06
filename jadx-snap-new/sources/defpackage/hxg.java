package defpackage;

import com.snap.core.db.AllUpdatesProcessor;
import com.snap.core.db.api.DbTransaction;
import com.snap.core.db.api.SnapDb;
import java.util.Map;

/* renamed from: hxg */
public final class hxg implements AllUpdatesProcessor {
    private final hwy a;

    public hxg(hwy hwy) {
        akcr.b(hwy, "experimentConfiguration");
        this.a = hwy;
    }

    public final void applyUpdates(aecy aecy, SnapDb snapDb, DbTransaction dbTransaction) {
        akcr.b(aecy, "updates");
        akcr.b(snapDb, "database");
        akcr.b(dbTransaction, "tx");
        afeq afeq = aecy.c;
        if (afeq != null) {
            Map map = afeq.cl;
            if (map != null) {
                this.a.a(map, dbTransaction);
            }
        }
    }
}
