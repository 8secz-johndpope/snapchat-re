package com.snap.core.db;

import defpackage.ajdp;
import defpackage.ajdt;
import defpackage.ajfc;
import defpackage.akcr;
import defpackage.zfd;
import java.util.List;

final class SqliteDbClient$queryAndMapToList$3<T, R> implements ajfc<Throwable, ajdt<? extends List<? extends T>>> {
    final /* synthetic */ String $tag;
    final /* synthetic */ SqliteDbClient this$0;

    SqliteDbClient$queryAndMapToList$3(SqliteDbClient sqliteDbClient, String str) {
        this.this$0 = sqliteDbClient;
        this.$tag = str;
    }

    public final ajdp<List<T>> apply(Throwable th) {
        akcr.b(th, "error");
        return ajdp.b((Throwable) new zfd(this.this$0.attributedFeature.callsite(this.$tag), th, null, 12));
    }
}
