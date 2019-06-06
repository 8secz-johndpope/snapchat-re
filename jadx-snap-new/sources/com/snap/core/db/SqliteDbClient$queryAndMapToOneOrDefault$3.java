package com.snap.core.db;

import defpackage.ajdx;
import defpackage.ajeb;
import defpackage.ajfc;
import defpackage.akcr;
import defpackage.zfd;

final class SqliteDbClient$queryAndMapToOneOrDefault$3<T, R> implements ajfc<Throwable, ajeb<? extends T>> {
    final /* synthetic */ String $tag;
    final /* synthetic */ SqliteDbClient this$0;

    SqliteDbClient$queryAndMapToOneOrDefault$3(SqliteDbClient sqliteDbClient, String str) {
        this.this$0 = sqliteDbClient;
        this.$tag = str;
    }

    public final ajdx<T> apply(Throwable th) {
        akcr.b(th, "error");
        return ajdx.b((Throwable) new zfd(this.this$0.attributedFeature.callsite(this.$tag), th, null, 12));
    }
}
