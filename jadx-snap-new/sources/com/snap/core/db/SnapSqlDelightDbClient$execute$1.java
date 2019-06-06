package com.snap.core.db;

import defpackage.ajxw;
import defpackage.akbk;
import defpackage.akcs;

final class SnapSqlDelightDbClient$execute$1 extends akcs implements akbk<ajxw> {
    final /* synthetic */ String $sql;
    final /* synthetic */ SnapSqlDelightDbClient this$0;

    SnapSqlDelightDbClient$execute$1(SnapSqlDelightDbClient snapSqlDelightDbClient, String str) {
        this.this$0 = snapSqlDelightDbClient;
        this.$sql = str;
        super(0);
    }

    public final void invoke() {
        this.this$0.dbManager.getWritableDatabase().c(this.$sql);
    }
}
