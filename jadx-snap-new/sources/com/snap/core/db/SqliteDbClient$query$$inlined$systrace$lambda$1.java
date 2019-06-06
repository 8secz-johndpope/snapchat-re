package com.snap.core.db;

import android.database.Cursor;
import com.snap.core.db.api.androidxSqlbrite.AndroidxToSupportSQLiteQuery;
import defpackage.ad;
import defpackage.ainx;
import defpackage.akbk;
import defpackage.akcr;
import defpackage.akcs;

final class SqliteDbClient$query$$inlined$systrace$lambda$1 extends akcs implements akbk<Cursor> {
    final /* synthetic */ ainx $statement$inlined;
    final /* synthetic */ SqliteDbClient this$0;

    SqliteDbClient$query$$inlined$systrace$lambda$1(SqliteDbClient sqliteDbClient, ainx ainx) {
        this.this$0 = sqliteDbClient;
        this.$statement$inlined = ainx;
        super(0);
    }

    public final Cursor invoke() {
        Object a = this.this$0.getBriteDb().a((ad) new AndroidxToSupportSQLiteQuery(this.$statement$inlined));
        akcr.a(a, "briteDb.query(AndroidxTo…rtSQLiteQuery(statement))");
        return a;
    }
}
