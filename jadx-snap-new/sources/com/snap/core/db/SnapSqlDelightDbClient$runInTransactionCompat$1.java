package com.snap.core.db;

import defpackage.ainf.a;
import defpackage.ajfb;
import defpackage.ajxw;
import defpackage.akbl;
import defpackage.akcr;
import defpackage.akcs;

final class SnapSqlDelightDbClient$runInTransactionCompat$1 extends akcs implements akbl<a, ajxw> {
    final /* synthetic */ ajfb $consumer;

    SnapSqlDelightDbClient$runInTransactionCompat$1(ajfb ajfb) {
        this.$consumer = ajfb;
        super(1);
    }

    public final void invoke(a aVar) {
        akcr.b(aVar, "tx");
        this.$consumer.accept(aVar);
    }
}
