package com.snap.core.db;

import defpackage.aimv;
import defpackage.ajdx;
import defpackage.akbk;
import defpackage.akcs;
import java.util.concurrent.Callable;

final class SqliteDbClient$briteDbSingle$2 extends akcs implements akbk<ajdx<aimv>> {
    final /* synthetic */ SqliteDbClient this$0;

    /* renamed from: com.snap.core.db.SqliteDbClient$briteDbSingle$2$1 */
    static final class AnonymousClass1<V> implements Callable<T> {
        final /* synthetic */ SqliteDbClient$briteDbSingle$2 this$0;

        AnonymousClass1(SqliteDbClient$briteDbSingle$2 sqliteDbClient$briteDbSingle$2) {
            this.this$0 = sqliteDbClient$briteDbSingle$2;
        }

        public final aimv call() {
            return this.this$0.this$0.getBriteDb();
        }
    }

    SqliteDbClient$briteDbSingle$2(SqliteDbClient sqliteDbClient) {
        this.this$0 = sqliteDbClient;
        super(0);
    }

    public final ajdx<aimv> invoke() {
        return ajdx.c((Callable) new AnonymousClass1(this)).b(this.this$0.dbManager.queriesScheduler()).a();
    }
}
