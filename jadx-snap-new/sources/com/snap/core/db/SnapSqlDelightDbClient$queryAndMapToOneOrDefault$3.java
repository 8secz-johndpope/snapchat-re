package com.snap.core.db;

import defpackage.ajdx;
import defpackage.ajeb;
import defpackage.ajfc;
import defpackage.akcr;
import defpackage.zfd;

final class SnapSqlDelightDbClient$queryAndMapToOneOrDefault$3<T, R> implements ajfc<Throwable, ajeb<? extends T>> {
    final /* synthetic */ String $tag;
    final /* synthetic */ SnapSqlDelightDbClient this$0;

    SnapSqlDelightDbClient$queryAndMapToOneOrDefault$3(SnapSqlDelightDbClient snapSqlDelightDbClient, String str) {
        this.this$0 = snapSqlDelightDbClient;
        this.$tag = str;
    }

    public final ajdx<T> apply(Throwable th) {
        akcr.b(th, "error");
        return ajdx.b((Throwable) new zfd(this.this$0.attributedFeature.callsite(this.$tag), th, null, 12));
    }
}
