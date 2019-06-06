package com.snap.core.db;

import com.snap.core.db.api.DbTransaction;
import com.snap.core.db.api.SnapDb;
import defpackage.abpm;
import defpackage.aerc;
import defpackage.ajxw;
import defpackage.akbl;
import defpackage.akcr;
import defpackage.akcs;

final class UpdatesManager$applyUpdates$2 extends akcs implements akbl<DbTransaction, ajxw> {
    final /* synthetic */ aerc $updates;
    final /* synthetic */ UpdatesManager this$0;

    UpdatesManager$applyUpdates$2(UpdatesManager updatesManager, aerc aerc) {
        this.this$0 = updatesManager;
        this.$updates = aerc;
        super(1);
    }

    public final void invoke(DbTransaction dbTransaction) {
        akcr.b(dbTransaction, "tx");
        Object obj = this.this$0.locDataUpdatesProcessors.get();
        akcr.a(obj, "locDataUpdatesProcessors.get()");
        for (LocDataUpdatesProcessor locDataUpdatesProcessor : (Iterable) obj) {
            akcr.a(abpm.a(locDataUpdatesProcessor.getClass()), "ClassUtils.getName(processor.javaClass)");
            aerc aerc = this.$updates;
            Object obj2 = this.this$0.snapDb.get();
            akcr.a(obj2, "snapDb.get()");
            locDataUpdatesProcessor.applyUpdates(aerc, (SnapDb) obj2, dbTransaction);
        }
    }
}
