package com.snap.core.db;

import com.snap.core.db.api.DbTransaction;
import defpackage.ajfb;
import defpackage.ajxw;
import defpackage.akbl;
import defpackage.akcr;
import defpackage.akcs;

final class SqliteDbClient$runInTransactionCompat$1 extends akcs implements akbl<DbTransaction, ajxw> {
    final /* synthetic */ ajfb $consumer;

    SqliteDbClient$runInTransactionCompat$1(ajfb ajfb) {
        this.$consumer = ajfb;
        super(1);
    }

    public final void invoke(DbTransaction dbTransaction) {
        akcr.b(dbTransaction, "tx");
        this.$consumer.accept(dbTransaction);
    }
}
