package com.snap.core.db;

import android.content.Context;
import com.snap.core.db.api.SnapSqliteHelperKt;
import defpackage.ajev;
import defpackage.akcr;
import defpackage.pb;

final class SnapSqlDelightDbManager$reset$1 implements ajev {
    final /* synthetic */ Context $context;
    final /* synthetic */ ajev $run;
    final /* synthetic */ SnapSqlDelightDbManager this$0;

    SnapSqlDelightDbManager$reset$1(SnapSqlDelightDbManager snapSqlDelightDbManager, Context context, ajev ajev) {
        this.this$0 = snapSqlDelightDbManager;
        this.$context = context;
        this.$run = ajev;
    }

    public final void run() {
        synchronized (this.this$0) {
            if (this.this$0.getInitialized().compareAndSet(true, false)) {
                this.this$0.getSessionId().incrementAndGet();
                ((pb) this.this$0.openHelper.get()).d();
                Context context = this.$context;
                Object obj = this.this$0.openHelper.get();
                akcr.a(obj, "openHelper.get()");
                obj = ((pb) obj).a();
                akcr.a(obj, "openHelper.get().databaseName");
                SnapSqliteHelperKt.deleteDatabaseFile(context, obj);
            }
        }
        ajev ajev = this.$run;
        if (ajev != null) {
            ajev.run();
        }
    }
}
