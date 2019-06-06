package com.snap.core.db;

import defpackage.akbk;
import defpackage.akcs;

final class SnapSqliteDatabaseDriver$executeQuery$1 extends akcs implements akbk<AndroidQuery> {
    final /* synthetic */ int $parameters;
    final /* synthetic */ String $sql;
    final /* synthetic */ SnapSqliteDatabaseDriver this$0;

    SnapSqliteDatabaseDriver$executeQuery$1(SnapSqliteDatabaseDriver snapSqliteDatabaseDriver, String str, int i) {
        this.this$0 = snapSqliteDatabaseDriver;
        this.$sql = str;
        this.$parameters = i;
        super(0);
    }

    public final AndroidQuery invoke() {
        return new AndroidQuery(this.$sql, this.this$0.database, this.$parameters);
    }
}
