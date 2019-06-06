package com.snap.core.db;

import defpackage.ajxw;
import defpackage.akbk;
import defpackage.akcs;

final class SqliteDbClient$execute$1 extends akcs implements akbk<ajxw> {
    final /* synthetic */ String $sql;
    final /* synthetic */ SqliteDbClient this$0;

    SqliteDbClient$execute$1(SqliteDbClient sqliteDbClient, String str) {
        this.this$0 = sqliteDbClient;
        this.$sql = str;
        super(0);
    }

    public final void invoke() {
        this.this$0.getBriteDb().a(this.$sql);
    }
}
