package com.snap.core.db.api.androidxSqlbrite;

import defpackage.ac;
import defpackage.ad;
import defpackage.akcr;
import defpackage.pd;

public final class AndroidxToSupportSQLiteQuery implements ad {
    private final pd query;

    public AndroidxToSupportSQLiteQuery(pd pdVar) {
        akcr.b(pdVar, "query");
        this.query = pdVar;
    }

    public final void bindTo(ac acVar) {
        akcr.b(acVar, "statement");
        this.query.bindTo(new SupportSQLiteToAndroidxProgram(acVar));
    }

    public final int getArgCount() {
        return this.query.getArgCount();
    }

    public final pd getQuery() {
        return this.query;
    }

    public final String getSql() {
        Object sql = this.query.getSql();
        akcr.a(sql, "query.sql");
        return sql;
    }
}
