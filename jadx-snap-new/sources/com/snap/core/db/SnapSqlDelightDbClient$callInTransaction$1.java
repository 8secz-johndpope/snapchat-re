package com.snap.core.db;

import defpackage.ajdx;
import defpackage.akbk;
import defpackage.akbl;
import defpackage.akcs;

final class SnapSqlDelightDbClient$callInTransaction$1 extends akcs implements akbk<ajdx<T>> {
    final /* synthetic */ akbl $consumer;
    final /* synthetic */ String $queryTag;
    final /* synthetic */ SnapSqlDelightDbClient this$0;

    SnapSqlDelightDbClient$callInTransaction$1(SnapSqlDelightDbClient snapSqlDelightDbClient, String str, akbl akbl) {
        this.this$0 = snapSqlDelightDbClient;
        this.$queryTag = str;
        this.$consumer = akbl;
        super(0);
    }

    public final ajdx<T> invoke() {
        return this.this$0.dbManager.callInTransaction(this.this$0.attributedFeature.callsite(this.$queryTag), this.$consumer);
    }
}
