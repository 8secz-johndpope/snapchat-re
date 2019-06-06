package com.snap.core.db;

import defpackage.aimz.c;
import defpackage.ainx;
import defpackage.ajdp;
import defpackage.akbk;
import defpackage.akcr;
import defpackage.akcs;

final class SqliteDbClient$createQuery$1 extends akcs implements akbk<ajdp<c>> {
    final /* synthetic */ ainx $statement;
    final /* synthetic */ SqliteDbClient this$0;

    SqliteDbClient$createQuery$1(SqliteDbClient sqliteDbClient, ainx ainx) {
        this.this$0 = sqliteDbClient;
        this.$statement = ainx;
        super(0);
    }

    public final ajdp<c> invoke() {
        SqliteDbClient sqliteDbClient = this.this$0;
        Object tables = this.$statement.getTables();
        akcr.a(tables, "statement.tables");
        return sqliteDbClient.createQuery(tables, this.$statement);
    }
}
