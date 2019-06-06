package com.snap.core.db;

import android.database.Cursor;
import defpackage.akbk;
import defpackage.akcr;
import defpackage.akcs;

final class SqliteDbClient$query$$inlined$systrace$lambda$2 extends akcs implements akbk<Cursor> {
    final /* synthetic */ String $statement$inlined;
    final /* synthetic */ SqliteDbClient this$0;

    SqliteDbClient$query$$inlined$systrace$lambda$2(SqliteDbClient sqliteDbClient, String str) {
        this.this$0 = sqliteDbClient;
        this.$statement$inlined = str;
        super(0);
    }

    public final Cursor invoke() {
        Object a = this.this$0.getBriteDb().a(this.$statement$inlined, new Object[0]);
        akcr.a(a, "briteDb.query(statement)");
        return a;
    }
}
