package com.snap.core.db;

import defpackage.ajdx;
import defpackage.akbk;
import defpackage.akbl;
import defpackage.akcr;
import defpackage.akcs;

final class SqliteDbClient$callInTransaction$1 extends akcs implements akbk<ajdx<T>> {
    final /* synthetic */ akbl $consumer;
    final /* synthetic */ String $queryTag;
    final /* synthetic */ SqliteDbClient this$0;

    SqliteDbClient$callInTransaction$1(SqliteDbClient sqliteDbClient, String str, akbl akbl) {
        this.this$0 = sqliteDbClient;
        this.$queryTag = str;
        this.$consumer = akbl;
        super(0);
    }

    public final ajdx<T> invoke() {
        Object callInTransaction = this.this$0.dbManager.callInTransaction(this.this$0.attributedFeature.callsite(this.$queryTag), this.$consumer);
        akcr.a(callInTransaction, "dbManager.callInTransact…site(queryTag), consumer)");
        return callInTransaction;
    }
}
