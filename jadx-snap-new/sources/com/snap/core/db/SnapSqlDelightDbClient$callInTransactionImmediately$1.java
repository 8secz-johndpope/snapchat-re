package com.snap.core.db;

import defpackage.akbk;
import defpackage.akbl;
import defpackage.akcs;

final class SnapSqlDelightDbClient$callInTransactionImmediately$1 extends akcs implements akbk<T> {
    final /* synthetic */ akbl $consumer;
    final /* synthetic */ String $queryTag;
    final /* synthetic */ SnapSqlDelightDbClient this$0;

    SnapSqlDelightDbClient$callInTransactionImmediately$1(SnapSqlDelightDbClient snapSqlDelightDbClient, String str, akbl akbl) {
        this.this$0 = snapSqlDelightDbClient;
        this.$queryTag = str;
        this.$consumer = akbl;
        super(0);
    }

    public final T invoke() {
        return this.this$0.dbManager.callInTransactionImmediately(this.$queryTag, this.$consumer);
    }
}
