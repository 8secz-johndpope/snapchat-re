package com.snap.core.db;

import defpackage.akbl;
import java.util.concurrent.Callable;

final class SnapSqlDelightDbManager$scheduleCallInTransaction$1<V> implements Callable<T> {
    final /* synthetic */ akbl $consumer;
    final /* synthetic */ String $tag;
    final /* synthetic */ SnapSqlDelightDbManager this$0;

    SnapSqlDelightDbManager$scheduleCallInTransaction$1(SnapSqlDelightDbManager snapSqlDelightDbManager, String str, akbl akbl) {
        this.this$0 = snapSqlDelightDbManager;
        this.$tag = str;
        this.$consumer = akbl;
    }

    public final TValue call() {
        return this.this$0.callInTransactionImmediately(this.$tag, this.$consumer);
    }
}
