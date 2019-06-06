package defpackage;

import com.snap.core.db.AllUpdatesProcessor;
import com.snap.core.db.api.DbTransaction;
import com.snap.core.db.api.SnapDb;
import defpackage.tnj.a;

/* renamed from: wop */
public final class wop implements AllUpdatesProcessor {
    private final tnj a;

    public wop(tnj tnj) {
        akcr.b(tnj, "prefs");
        this.a = tnj;
    }

    public final void applyUpdates(aecy aecy, SnapDb snapDb, DbTransaction dbTransaction) {
        akcr.b(aecy, "updates");
        akcr.b(snapDb, "database");
        akcr.b(dbTransaction, "tx");
        a b = this.a.b();
        fth fth = woo.CONTACT_ME_CONFIG;
        Integer num = aecy.c.M;
        boolean z = true;
        wol wol = ((num != null && num.intValue() == 0) || num == null || num.intValue() != 1) ? wol.EVERYONE : wol.MY_FRIEND;
        b.a(fth, (Enum) wol);
        fth = woo.SEE_ME_IN_QUICK_ADD;
        Object obj = aecy.c;
        akcr.a(obj, "updates.updatesResponse");
        ahjw c = obj.c();
        if (c != null) {
            int i = woq.a[c.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    z = false;
                }
            }
        }
        b.a(fth, Boolean.valueOf(z));
        b.b();
    }
}
