package com.snap.core.db;

import defpackage.ainw;
import defpackage.ainx;
import defpackage.ajxw;
import defpackage.akbk;
import defpackage.akbl;
import defpackage.akcs;
import java.util.ArrayList;

final class SqliteDbClient$query$$inlined$systrace$lambda$3 extends akcs implements akbk<ArrayList<R>> {
    final /* synthetic */ ainw $mapper$inlined;
    final /* synthetic */ ainx $statement$inlined;
    final /* synthetic */ SqliteDbClient this$0;

    SqliteDbClient$query$$inlined$systrace$lambda$3(SqliteDbClient sqliteDbClient, ainx ainx, ainw ainw) {
        this.this$0 = sqliteDbClient;
        this.$statement$inlined = ainx;
        this.$mapper$inlined = ainw;
        super(0);
    }

    public final ArrayList<R> invoke() {
        final ArrayList arrayList = new ArrayList();
        this.this$0.query(this.$statement$inlined, this.$mapper$inlined, new akbl<R, ajxw>() {
            public final void invoke(R r) {
                arrayList.add(r);
            }
        });
        return arrayList;
    }
}
