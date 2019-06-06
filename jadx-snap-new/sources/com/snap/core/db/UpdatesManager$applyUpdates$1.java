package com.snap.core.db;

import com.snap.core.db.api.DbTransaction;
import com.snap.core.db.api.SnapDb;
import defpackage.abpm;
import defpackage.aecy;
import defpackage.ajxw;
import defpackage.akbl;
import defpackage.akcr;
import defpackage.akcs;

final class UpdatesManager$applyUpdates$1 extends akcs implements akbl<DbTransaction, ajxw> {
    final /* synthetic */ aecy $updates;
    final /* synthetic */ UpdatesManager this$0;

    UpdatesManager$applyUpdates$1(UpdatesManager updatesManager, aecy aecy) {
        this.this$0 = updatesManager;
        this.$updates = aecy;
        super(1);
    }

    public final void invoke(DbTransaction dbTransaction) {
        akcr.b(dbTransaction, "tx");
        Object obj = this.this$0.allUpdatesProcessors.get();
        akcr.a(obj, "allUpdatesProcessors.get()");
        for (AllUpdatesProcessor allUpdatesProcessor : (Iterable) obj) {
            akcr.a(abpm.a(allUpdatesProcessor.getClass()), "ClassUtils.getName(processor.javaClass)");
            aecy aecy = this.$updates;
            Object obj2 = this.this$0.snapDb.get();
            akcr.a(obj2, "snapDb.get()");
            allUpdatesProcessor.applyUpdates(aecy, (SnapDb) obj2, dbTransaction);
        }
    }
}
