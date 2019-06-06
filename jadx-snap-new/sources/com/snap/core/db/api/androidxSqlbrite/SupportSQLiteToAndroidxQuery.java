package com.snap.core.db.api.androidxSqlbrite;

import defpackage.ad;
import defpackage.akcr;
import defpackage.pc;
import defpackage.pd;

public final class SupportSQLiteToAndroidxQuery implements pd {
    private final ad query;

    public SupportSQLiteToAndroidxQuery(ad adVar) {
        akcr.b(adVar, "query");
        this.query = adVar;
    }

    public final void bindTo(pc pcVar) {
        akcr.b(pcVar, "statement");
        this.query.bindTo(new AndroidxToSupportSQLiteProgram(pcVar));
    }

    public final int getArgCount() {
        return this.query.getArgCount();
    }

    public final ad getQuery() {
        return this.query;
    }

    public final String getSql() {
        Object sql = this.query.getSql();
        akcr.a(sql, "query.sql");
        return sql;
    }
}
