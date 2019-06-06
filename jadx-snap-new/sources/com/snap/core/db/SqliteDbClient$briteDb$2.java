package com.snap.core.db;

import defpackage.aimv;
import defpackage.akbk;
import defpackage.akcs;

final class SqliteDbClient$briteDb$2 extends akcs implements akbk<aimv> {
    final /* synthetic */ SqliteDbClient this$0;

    SqliteDbClient$briteDb$2(SqliteDbClient sqliteDbClient) {
        this.this$0 = sqliteDbClient;
        super(0);
    }

    public final aimv invoke() {
        return this.this$0.dbManager.getBriteDatabase();
    }
}
