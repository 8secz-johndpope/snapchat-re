package defpackage;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import defpackage.pb.a;

/* renamed from: pg */
final class pg implements pb {
    private final a a;

    /* renamed from: pg$a */
    static class a extends SQLiteOpenHelper {
        private pf[] a;
        private defpackage.pb.a b;
        private boolean c;

        a(Context context, String str, final pf[] pfVarArr, final defpackage.pb.a aVar) {
            super(context, str, null, aVar.version, new DatabaseErrorHandler() {
                public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                    pa paVar = pfVarArr[0];
                    if (paVar != null) {
                        aVar.onCorruption(paVar);
                    }
                }
            });
            this.b = aVar;
            this.a = pfVarArr;
        }

        private pf a(SQLiteDatabase sQLiteDatabase) {
            if (this.a[0] == null) {
                this.a[0] = new pf(sQLiteDatabase);
            }
            return this.a[0];
        }

        /* Access modifiers changed, original: final|declared_synchronized */
        public final synchronized pa a() {
            this.c = false;
            SQLiteDatabase writableDatabase = super.getWritableDatabase();
            if (this.c) {
                close();
                return a();
            }
            return a(writableDatabase);
        }

        /* Access modifiers changed, original: final|declared_synchronized */
        public final synchronized pa b() {
            this.c = false;
            SQLiteDatabase readableDatabase = super.getReadableDatabase();
            if (this.c) {
                close();
                return b();
            }
            return a(readableDatabase);
        }

        public final synchronized void close() {
            super.close();
            this.a[0] = null;
        }

        public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
            this.b.onConfigure(a(sQLiteDatabase));
        }

        public final void onCreate(SQLiteDatabase sQLiteDatabase) {
            this.b.onCreate(a(sQLiteDatabase));
        }

        public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            this.c = true;
            this.b.onDowngrade(a(sQLiteDatabase), i, i2);
        }

        public final void onOpen(SQLiteDatabase sQLiteDatabase) {
            if (!this.c) {
                this.b.onOpen(a(sQLiteDatabase));
            }
        }

        public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            this.c = true;
            this.b.onUpgrade(a(sQLiteDatabase), i, i2);
        }
    }

    pg(Context context, String str, a aVar) {
        this.a = new a(context, str, new pf[1], aVar);
    }

    public final String a() {
        return this.a.getDatabaseName();
    }

    public final void a(boolean z) {
        this.a.setWriteAheadLoggingEnabled(z);
    }

    public final pa b() {
        return this.a.a();
    }

    public final pa c() {
        return this.a.b();
    }

    public final void d() {
        this.a.close();
    }
}
