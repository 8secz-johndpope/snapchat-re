package com.snap.core.db;

import defpackage.ajdx;
import defpackage.akbl;
import java.util.concurrent.Callable;

final class SnapSqlDelightDbManager$callInTransaction$1<V> implements Callable<T> {
    final /* synthetic */ akbl $consumer;
    final /* synthetic */ String $tag;
    final /* synthetic */ SnapSqlDelightDbManager this$0;

    SnapSqlDelightDbManager$callInTransaction$1(SnapSqlDelightDbManager snapSqlDelightDbManager, String str, akbl akbl) {
        this.this$0 = snapSqlDelightDbManager;
        this.$tag = str;
        this.$consumer = akbl;
    }

    public final ajdx<TValue> call() {
        return this.this$0.isDbScheduler() ? ajdx.b(this.this$0.callInTransactionImmediately(this.$tag, this.$consumer)) : this.this$0.scheduleCallInTransaction(this.$tag, this.$consumer);
    }
}
