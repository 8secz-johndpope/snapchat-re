package com.snap.core.db;

import com.snap.core.db.api.SnapDb;
import defpackage.aecy;
import defpackage.aerc;
import defpackage.ajcx;
import defpackage.ajhn;
import defpackage.ajvo;
import defpackage.ajwy;
import defpackage.akcr;
import defpackage.idd;
import java.util.Set;

public final class UpdatesManager {
    private final ajwy<Set<AllUpdatesProcessor>> allUpdatesProcessors;
    private final ajwy<Set<LocDataUpdatesProcessor>> locDataUpdatesProcessors;
    private final ajwy<SnapDb> snapDb;

    public UpdatesManager(ajwy<SnapDb> ajwy, ajwy<Set<AllUpdatesProcessor>> ajwy2, ajwy<Set<LocDataUpdatesProcessor>> ajwy3) {
        akcr.b(ajwy, "snapDb");
        akcr.b(ajwy2, "allUpdatesProcessors");
        akcr.b(ajwy3, "locDataUpdatesProcessors");
        this.snapDb = ajwy;
        this.allUpdatesProcessors = ajwy2;
        this.locDataUpdatesProcessors = ajwy3;
    }

    public final ajcx applyUpdates(aecy aecy, idd idd) {
        akcr.b(aecy, "updates");
        akcr.b(idd, "callsite");
        if (aecy.c == null || !aecy.c.q.booleanValue()) {
            Object a = ajvo.a(ajhn.a);
            akcr.a(a, "Completable.complete()");
            return a;
        }
        return ((SnapDb) this.snapDb.get()).getDbClient(idd).runInTransaction("UpdatesManager:applyUpdates", new UpdatesManager$applyUpdates$1(this, aecy));
    }

    public final ajcx applyUpdates(aerc aerc, idd idd) {
        akcr.b(aerc, "updates");
        akcr.b(idd, "callsite");
        return ((SnapDb) this.snapDb.get()).getDbClient(idd).runInTransaction("UpdatesManager:applyUpdates:LocDataResponse", new UpdatesManager$applyUpdates$2(this, aerc));
    }
}
