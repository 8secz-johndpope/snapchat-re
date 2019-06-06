package com.snap.core.db.api.androidxSqlbrite;

import defpackage.aa;
import defpackage.ab;
import defpackage.akcr;
import defpackage.pb;

public final class AndroidxToSupportSQLiteOpenHelper implements ab {
    private final pb openHelper;

    public AndroidxToSupportSQLiteOpenHelper(pb pbVar) {
        akcr.b(pbVar, "openHelper");
        this.openHelper = pbVar;
    }

    public final void close() {
        this.openHelper.d();
    }

    public final String getDatabaseName() {
        Object a = this.openHelper.a();
        akcr.a(a, "openHelper.databaseName");
        return a;
    }

    public final pb getOpenHelper() {
        return this.openHelper;
    }

    public final aa getReadableDatabase() {
        Object c = this.openHelper.c();
        akcr.a(c, "openHelper.readableDatabase");
        return new AndroidxToSupportSqliteDatabase(c);
    }

    public final aa getWritableDatabase() {
        Object b = this.openHelper.b();
        akcr.a(b, "openHelper.writableDatabase");
        return new AndroidxToSupportSqliteDatabase(b);
    }

    public final void setWriteAheadLoggingEnabled(boolean z) {
        this.openHelper.a(z);
    }
}
