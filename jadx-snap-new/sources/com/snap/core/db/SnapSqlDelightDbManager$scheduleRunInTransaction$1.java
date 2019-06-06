package com.snap.core.db;

import defpackage.ajev;
import defpackage.akbl;

final class SnapSqlDelightDbManager$scheduleRunInTransaction$1 implements ajev {
    final /* synthetic */ akbl $consumer;
    final /* synthetic */ int $sessionId;
    final /* synthetic */ String $tag;
    final /* synthetic */ SnapSqlDelightDbManager this$0;

    SnapSqlDelightDbManager$scheduleRunInTransaction$1(SnapSqlDelightDbManager snapSqlDelightDbManager, String str, int i, akbl akbl) {
        this.this$0 = snapSqlDelightDbManager;
        this.$tag = str;
        this.$sessionId = i;
        this.$consumer = akbl;
    }

    public final void run() {
        this.this$0.runInTransactionImmediately(this.$tag, this.$sessionId, this.$consumer);
    }
}
