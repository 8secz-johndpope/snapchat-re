package com.snap.core.db.api.androidxSqlbrite;

import defpackage.ae;
import defpackage.akcr;
import defpackage.pe;

public final class AndroidxToSupportSqliteStatement implements ae {
    private final pe statement;

    public AndroidxToSupportSqliteStatement(pe peVar) {
        akcr.b(peVar, "statement");
        this.statement = peVar;
    }

    public final void bindBlob(int i, byte[] bArr) {
        this.statement.bindBlob(i, bArr);
    }

    public final void bindDouble(int i, double d) {
        this.statement.bindDouble(i, d);
    }

    public final void bindLong(int i, long j) {
        this.statement.bindLong(i, j);
    }

    public final void bindNull(int i) {
        this.statement.bindNull(i);
    }

    public final void bindString(int i, String str) {
        this.statement.bindString(i, str);
    }

    public final void clearBindings() {
        this.statement.clearBindings();
    }

    public final void close() {
        this.statement.close();
    }

    public final void execute() {
        this.statement.execute();
    }

    public final long executeInsert() {
        return this.statement.executeInsert();
    }

    public final int executeUpdateDelete() {
        return this.statement.executeUpdateDelete();
    }

    public final long simpleQueryForLong() {
        return this.statement.simpleQueryForLong();
    }

    public final String simpleQueryForString() {
        Object simpleQueryForString = this.statement.simpleQueryForString();
        akcr.a(simpleQueryForString, "statement.simpleQueryForString()");
        return simpleQueryForString;
    }
}
