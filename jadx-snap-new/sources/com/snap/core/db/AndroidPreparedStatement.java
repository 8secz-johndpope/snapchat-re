package com.snap.core.db;

import defpackage.akcr;
import defpackage.pe;

final class AndroidPreparedStatement implements AndroidStatement {
    private final pe statement;

    public AndroidPreparedStatement(pe peVar) {
        akcr.b(peVar, "statement");
        this.statement = peVar;
    }

    public final void bindBytes(int i, byte[] bArr) {
        if (bArr == null) {
            this.statement.bindNull(i);
        } else {
            this.statement.bindBlob(i, bArr);
        }
    }

    public final void bindDouble(int i, Double d) {
        if (d == null) {
            this.statement.bindNull(i);
        } else {
            this.statement.bindDouble(i, d.doubleValue());
        }
    }

    public final void bindLong(int i, Long l) {
        if (l == null) {
            this.statement.bindNull(i);
        } else {
            this.statement.bindLong(i, l.longValue());
        }
    }

    public final void bindString(int i, String str) {
        if (str == null) {
            this.statement.bindNull(i);
        } else {
            this.statement.bindString(i, str);
        }
    }

    public final void close() {
        this.statement.close();
    }

    public final void execute() {
        this.statement.execute();
    }

    public final Void executeQuery() {
        throw new UnsupportedOperationException();
    }
}
