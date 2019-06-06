package com.snap.core.db;

import defpackage.ajcx;
import defpackage.ajhn;
import defpackage.ajvo;
import defpackage.akbl;
import java.util.concurrent.Callable;

final class SnapSqlDelightDbManager$runInTransaction$1<V> implements Callable<T> {
    final /* synthetic */ akbl $consumer;
    final /* synthetic */ String $tag;
    final /* synthetic */ SnapSqlDelightDbManager this$0;

    SnapSqlDelightDbManager$runInTransaction$1(SnapSqlDelightDbManager snapSqlDelightDbManager, String str, akbl akbl) {
        this.this$0 = snapSqlDelightDbManager;
        this.$tag = str;
        this.$consumer = akbl;
    }

    public final ajcx call() {
        if (!this.this$0.isDbScheduler()) {
            return this.this$0.scheduleRunInTransaction(this.$tag, this.$consumer);
        }
        SnapSqlDelightDbManager snapSqlDelightDbManager = this.this$0;
        snapSqlDelightDbManager.runInTransactionImmediately(this.$tag, snapSqlDelightDbManager.getSessionId(), this.$consumer);
        return ajvo.a(ajhn.a);
    }
}
