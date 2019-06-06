package com.snap.core.db;

import defpackage.ainf.a;
import defpackage.ajxw;
import defpackage.akbl;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akdd.e;

final class SnapSqlDelightDbManager$callInTransactionImmediately$wrapper$1 extends akcs implements akbl<a, ajxw> {
    final /* synthetic */ akbl $consumer;
    final /* synthetic */ e $value;

    SnapSqlDelightDbManager$callInTransactionImmediately$wrapper$1(e eVar, akbl akbl) {
        this.$value = eVar;
        this.$consumer = akbl;
        super(1);
    }

    public final void invoke(a aVar) {
        akcr.b(aVar, "transaction");
        this.$value.a = this.$consumer.invoke(aVar);
    }
}
