package com.snap.core.db;

import defpackage.akbk;
import defpackage.akcr;
import defpackage.akcs;

final class SnapSqliteDatabaseDriver$execute$2 extends akcs implements akbk<AndroidPreparedStatement> {
    final /* synthetic */ String $sql;
    final /* synthetic */ SnapSqliteDatabaseDriver this$0;

    SnapSqliteDatabaseDriver$execute$2(SnapSqliteDatabaseDriver snapSqliteDatabaseDriver, String str) {
        this.this$0 = snapSqliteDatabaseDriver;
        this.$sql = str;
        super(0);
    }

    public final AndroidPreparedStatement invoke() {
        Object a = this.this$0.database.a(this.$sql);
        akcr.a(a, "database.compileStatement(sql)");
        return new AndroidPreparedStatement(a);
    }
}
