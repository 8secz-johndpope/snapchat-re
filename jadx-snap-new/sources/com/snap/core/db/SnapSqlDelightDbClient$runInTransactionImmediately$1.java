package com.snap.core.db;

import defpackage.ajxw;
import defpackage.akbk;
import defpackage.akbl;
import defpackage.akcs;

final class SnapSqlDelightDbClient$runInTransactionImmediately$1 extends akcs implements akbk<ajxw> {
    final /* synthetic */ akbl $consumer;
    final /* synthetic */ String $queryTag;
    final /* synthetic */ SnapSqlDelightDbClient this$0;

    SnapSqlDelightDbClient$runInTransactionImmediately$1(SnapSqlDelightDbClient snapSqlDelightDbClient, String str, akbl akbl) {
        this.this$0 = snapSqlDelightDbClient;
        this.$queryTag = str;
        this.$consumer = akbl;
        super(0);
    }

    public final void invoke() {
        this.this$0.dbManager.runInTransactionImmediately(this.$queryTag, this.this$0.dbManager.getSessionId(), this.$consumer);
    }
}
