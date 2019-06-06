package com.snap.core.db.api;

import java.util.concurrent.Callable;

final class DbLogger$doLogging$1<V> implements Callable<T> {
    final /* synthetic */ long $runningTime;
    final /* synthetic */ String $statement;
    final /* synthetic */ String $transactionTag;
    final /* synthetic */ DbLogger this$0;

    DbLogger$doLogging$1(DbLogger dbLogger, String str, String str2, long j) {
        this.this$0 = dbLogger;
        this.$transactionTag = str;
        this.$statement = str2;
        this.$runningTime = j;
    }

    public final void call() {
        String str = this.$transactionTag;
        if (this.$statement != null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(':');
            stringBuilder.append(this.$statement);
            str = stringBuilder.toString();
        }
        this.this$0.reportToGraphene(this.$runningTime, str);
    }
}
