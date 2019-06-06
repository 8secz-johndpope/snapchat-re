package com.snap.core.db;

import android.database.Cursor;
import defpackage.akbk;
import defpackage.akcr;
import defpackage.akcs;

final class SnapSqlDelightDbClient$query$2 extends akcs implements akbk<Cursor> {
    final /* synthetic */ String $queryString;
    final /* synthetic */ SnapSqlDelightDbClient this$0;

    SnapSqlDelightDbClient$query$2(SnapSqlDelightDbClient snapSqlDelightDbClient, String str) {
        this.this$0 = snapSqlDelightDbClient;
        this.$queryString = str;
        super(0);
    }

    public final Cursor invoke() {
        Object b = this.this$0.dbManager.getWritableDatabase().b(this.$queryString);
        akcr.a(b, "dbManager.getWritableDatabase().query(queryString)");
        return b;
    }
}
