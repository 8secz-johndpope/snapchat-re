package com.snap.core.db;

import defpackage.ajcx;
import defpackage.akbk;
import defpackage.akbl;
import defpackage.akcs;

final class SnapSqlDelightDbClient$runInTransaction$1 extends akcs implements akbk<ajcx> {
    final /* synthetic */ akbl $consumer;
    final /* synthetic */ String $queryTag;
    final /* synthetic */ SnapSqlDelightDbClient this$0;

    SnapSqlDelightDbClient$runInTransaction$1(SnapSqlDelightDbClient snapSqlDelightDbClient, String str, akbl akbl) {
        this.this$0 = snapSqlDelightDbClient;
        this.$queryTag = str;
        this.$consumer = akbl;
        super(0);
    }

    public final ajcx invoke() {
        return this.this$0.dbManager.runInTransaction(this.this$0.attributedFeature.callsite(this.$queryTag), this.$consumer);
    }
}
