package defpackage;

import android.database.sqlite.SQLiteStatement;

/* renamed from: aj */
final class aj extends ai implements ae {
    private final SQLiteStatement a;

    aj(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.a = sQLiteStatement;
    }

    public final long executeInsert() {
        return this.a.executeInsert();
    }

    public final int executeUpdateDelete() {
        return this.a.executeUpdateDelete();
    }
}
