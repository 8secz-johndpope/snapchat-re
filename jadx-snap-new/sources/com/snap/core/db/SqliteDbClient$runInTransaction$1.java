package com.snap.core.db;

import defpackage.ajcx;
import defpackage.ajfb;
import defpackage.akbk;
import defpackage.akbl;
import defpackage.akcs;
import defpackage.idd;

final class SqliteDbClient$runInTransaction$1 extends akcs implements akbk<ajcx> {
    final /* synthetic */ akbl $consumer;
    final /* synthetic */ String $queryTag;
    final /* synthetic */ SqliteDbClient this$0;

    SqliteDbClient$runInTransaction$1(SqliteDbClient sqliteDbClient, String str, akbl akbl) {
        this.this$0 = sqliteDbClient;
        this.$queryTag = str;
        this.$consumer = akbl;
        super(0);
    }

    public final ajcx invoke() {
        SqliteDbManager access$getDbManager$p = this.this$0.dbManager;
        idd callsite = this.this$0.attributedFeature.callsite(this.$queryTag);
        akbl akbl = this.$consumer;
        if (akbl != null) {
            akbl = new SqliteDbClient$sam$io_reactivex_functions_Consumer$0(akbl);
        }
        return access$getDbManager$p.runInTransaction(callsite, (ajfb) akbl);
    }
}
