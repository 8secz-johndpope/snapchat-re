package com.snap.core.db;

import com.snap.core.db.api.androidxSqlbrite.AndroidxToSupportSqliteStatement;
import defpackage.ainy;
import defpackage.akbk;
import defpackage.akcs;

final class SqliteDbClient$executeInsert$$inlined$systrace$lambda$1 extends akcs implements akbk<Long> {
    final /* synthetic */ ainy $statement$inlined;
    final /* synthetic */ SqliteDbClient this$0;

    SqliteDbClient$executeInsert$$inlined$systrace$lambda$1(SqliteDbClient sqliteDbClient, ainy ainy) {
        this.this$0 = sqliteDbClient;
        this.$statement$inlined = ainy;
        super(0);
    }

    public final long invoke() {
        return this.this$0.getBriteDb().b(this.$statement$inlined.getTable(), new AndroidxToSupportSqliteStatement(this.$statement$inlined));
    }
}
