package defpackage;

import android.database.sqlite.SQLiteStatement;

/* renamed from: pj */
final class pj extends pi implements pe {
    private final SQLiteStatement a;

    pj(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.a = sQLiteStatement;
    }

    public final void execute() {
        this.a.execute();
    }

    public final long executeInsert() {
        return this.a.executeInsert();
    }

    public final int executeUpdateDelete() {
        return this.a.executeUpdateDelete();
    }

    public final long simpleQueryForLong() {
        return this.a.simpleQueryForLong();
    }

    public final String simpleQueryForString() {
        return this.a.simpleQueryForString();
    }
}
