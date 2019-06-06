package com.snap.core.db;

import com.snap.core.db.api.androidxSqlbrite.AndroidxToSupportSqliteStatement;
import defpackage.ae;
import defpackage.ainy;
import defpackage.akbk;
import defpackage.akcs;

final class SqliteDbClient$executeUpdateDelete$$inlined$systrace$lambda$1 extends akcs implements akbk<Integer> {
    final /* synthetic */ ainy $statement$inlined;
    final /* synthetic */ SqliteDbClient this$0;

    SqliteDbClient$executeUpdateDelete$$inlined$systrace$lambda$1(SqliteDbClient sqliteDbClient, ainy ainy) {
        this.this$0 = sqliteDbClient;
        this.$statement$inlined = ainy;
        super(0);
    }

    public final int invoke() {
        return this.this$0.getBriteDb().a(this.$statement$inlined.getTable(), (ae) new AndroidxToSupportSqliteStatement(this.$statement$inlined));
    }
}
