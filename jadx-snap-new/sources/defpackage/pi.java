package defpackage;

import android.database.sqlite.SQLiteProgram;

/* renamed from: pi */
class pi implements pc {
    private final SQLiteProgram a;

    pi(SQLiteProgram sQLiteProgram) {
        this.a = sQLiteProgram;
    }

    public void bindBlob(int i, byte[] bArr) {
        this.a.bindBlob(i, bArr);
    }

    public void bindDouble(int i, double d) {
        this.a.bindDouble(i, d);
    }

    public void bindLong(int i, long j) {
        this.a.bindLong(i, j);
    }

    public void bindNull(int i) {
        this.a.bindNull(i);
    }

    public void bindString(int i, String str) {
        this.a.bindString(i, str);
    }

    public void clearBindings() {
        this.a.clearBindings();
    }

    public void close() {
        this.a.close();
    }
}
