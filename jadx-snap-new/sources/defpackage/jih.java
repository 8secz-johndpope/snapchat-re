package defpackage;

import com.snap.core.db.AllUpdatesProcessor;
import com.snap.core.db.api.DbTransaction;
import com.snap.core.db.api.SnapDb;

/* renamed from: jih */
public final class jih implements AllUpdatesProcessor {
    private final gpb a;
    private final hyq b;

    public jih(gpb gpb, hyq hyq) {
        akcr.b(gpb, "userAuthStore");
        akcr.b(hyq, "fideliusManager");
        this.a = gpb;
        this.b = hyq;
    }

    public final void applyUpdates(aecy aecy, SnapDb snapDb, DbTransaction dbTransaction) {
        akcr.b(aecy, "updates");
        akcr.b(snapDb, "database");
        akcr.b(dbTransaction, "tx");
        afeq afeq = aecy.c;
        if (afeq != null) {
            String str = afeq.cd;
            if (str != null) {
                if ((((CharSequence) str).length() > 0 ? 1 : null) != null) {
                    this.b.a(str, this.a.b());
                }
            }
        }
    }
}
