package com.snap.core.db;

import defpackage.ajdp;
import defpackage.ajdt;
import defpackage.ajfc;
import defpackage.akcr;

final class SqliteDbClient$checkDbValid$1<T, R> implements ajfc<Throwable, ajdt<? extends T>> {
    final /* synthetic */ Object $defaultValue;
    final /* synthetic */ SqliteDbClient this$0;

    SqliteDbClient$checkDbValid$1(SqliteDbClient sqliteDbClient, Object obj) {
        this.this$0 = sqliteDbClient;
        this.$defaultValue = obj;
    }

    public final ajdt<? extends T> apply(Throwable th) {
        akcr.b(th, "t");
        return this.this$0.isValid() ? ajdp.b(th) : ajdp.b(this.$defaultValue);
    }
}
