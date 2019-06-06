package com.snap.core.db;

import defpackage.aimv;
import defpackage.ajxw;
import defpackage.akbk;
import defpackage.akcs;
import java.util.Arrays;

final class SqliteDbClient$executeAndTrigger$1 extends akcs implements akbk<ajxw> {
    final /* synthetic */ Object[] $args;
    final /* synthetic */ String $sql;
    final /* synthetic */ String $table;
    final /* synthetic */ SqliteDbClient this$0;

    SqliteDbClient$executeAndTrigger$1(SqliteDbClient sqliteDbClient, String str, String str2, Object[] objArr) {
        this.this$0 = sqliteDbClient;
        this.$table = str;
        this.$sql = str2;
        this.$args = objArr;
        super(0);
    }

    public final void invoke() {
        aimv access$getBriteDb$p = this.this$0.getBriteDb();
        String str = this.$table;
        String str2 = this.$sql;
        Object[] objArr = this.$args;
        access$getBriteDb$p.a(str, str2, Arrays.copyOf(objArr, objArr.length));
    }
}
