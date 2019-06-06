package defpackage;

import com.snap.core.db.AllUpdatesProcessor;
import com.snap.core.db.api.DbTransaction;
import com.snap.core.db.api.SnapDb;

/* renamed from: xjj */
public final class xjj implements AllUpdatesProcessor {
    private final aipn<tnj> a;

    public xjj(aipn<tnj> aipn) {
        akcr.b(aipn, "preference");
        this.a = aipn;
    }

    public final void applyUpdates(aecy aecy, SnapDb snapDb, DbTransaction dbTransaction) {
        akcr.b(aecy, "updates");
        akcr.b(snapDb, "database");
        akcr.b(dbTransaction, "tx");
        afeq afeq = aecy.c;
        if (afeq != null) {
            String str = afeq.bx;
            if (str != null) {
                ((tnj) this.a.get()).b().a((fth) xjd.SPECTACLES_USER_ID, str).b();
            }
            Boolean bool = afeq.bz;
            if (bool != null) {
                ((tnj) this.a.get()).b().a((fth) xjd.HAS_USED_SPECTACLES, Boolean.valueOf(bool.booleanValue())).b();
            }
        }
    }
}
