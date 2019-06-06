package defpackage;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import defpackage.ab.a;

/* renamed from: ag */
final class ag implements ab {
    private final a a;

    /* renamed from: ag$a */
    static class a extends SQLiteOpenHelper {
        private af[] a;
        private defpackage.ab.a b;
        private boolean c;

        a(Context context, String str, final af[] afVarArr, final defpackage.ab.a aVar) {
            super(context, str, null, aVar.a, new DatabaseErrorHandler() {
                /* JADX WARNING: Removed duplicated region for block: B:21:0x005c  */
                /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0034 */
                /* JADX WARNING: Removed duplicated region for block: B:9:0x0032 A:{ExcHandler: all (th java.lang.Throwable), PHI: r0 , Splitter:B:7:0x002d} */
                /* JADX WARNING: Failed to process nested try/catch */
                /* JADX WARNING: Missing block: B:12:0x0038, code skipped:
            if (r0 != null) goto L_0x003a;
     */
                /* JADX WARNING: Missing block: B:13:0x003a, code skipped:
            r3 = r0.iterator();
     */
                /* JADX WARNING: Missing block: B:15:0x0042, code skipped:
            if (r3.hasNext() != false) goto L_0x0044;
     */
                /* JADX WARNING: Missing block: B:16:0x0044, code skipped:
            defpackage.ab.a.a((java.lang.String) ((android.util.Pair) r3.next()).second);
     */
                /* JADX WARNING: Missing block: B:17:0x0052, code skipped:
            defpackage.ab.a.a(r3.getPath());
     */
                public final void onCorruption(android.database.sqlite.SQLiteDatabase r3) {
                    /*
                    r2 = this;
                    r3 = r9;
                    r0 = 0;
                    r3 = r3[r0];
                    if (r3 == 0) goto L_0x0074;
                L_0x0007:
                    r0 = new java.lang.StringBuilder;
                    r1 = "Corruption reported by sqlite on database: ";
                    r0.<init>(r1);
                    r1 = r3.getPath();
                    r0.append(r1);
                    r0 = r0.toString();
                    r1 = "SupportSQLite";
                    android.util.Log.e(r1, r0);
                    r0 = r3.isOpen();
                    if (r0 != 0) goto L_0x002c;
                L_0x0024:
                    r3 = r3.getPath();
                    defpackage.ab.a.a(r3);
                    return;
                L_0x002c:
                    r0 = 0;
                    r0 = r3.getAttachedDbs();	 Catch:{ SQLiteException -> 0x0034, all -> 0x0032 }
                    goto L_0x0034;
                L_0x0032:
                    r1 = move-exception;
                    goto L_0x0038;
                L_0x0034:
                    r3.close();	 Catch:{ IOException -> 0x005a, all -> 0x0032 }
                    goto L_0x005a;
                L_0x0038:
                    if (r0 == 0) goto L_0x0052;
                L_0x003a:
                    r3 = r0.iterator();
                L_0x003e:
                    r0 = r3.hasNext();
                    if (r0 == 0) goto L_0x0059;
                L_0x0044:
                    r0 = r3.next();
                    r0 = (android.util.Pair) r0;
                    r0 = r0.second;
                    r0 = (java.lang.String) r0;
                    defpackage.ab.a.a(r0);
                    goto L_0x003e;
                L_0x0052:
                    r3 = r3.getPath();
                    defpackage.ab.a.a(r3);
                L_0x0059:
                    throw r1;
                L_0x005a:
                    if (r0 == 0) goto L_0x0024;
                L_0x005c:
                    r3 = r0.iterator();
                L_0x0060:
                    r0 = r3.hasNext();
                    if (r0 == 0) goto L_0x0074;
                L_0x0066:
                    r0 = r3.next();
                    r0 = (android.util.Pair) r0;
                    r0 = r0.second;
                    r0 = (java.lang.String) r0;
                    defpackage.ab.a.a(r0);
                    goto L_0x0060;
                L_0x0074:
                    return;
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.ag$a$1.onCorruption(android.database.sqlite.SQLiteDatabase):void");
                }
            });
            this.b = aVar;
            this.a = afVarArr;
        }

        private af a(SQLiteDatabase sQLiteDatabase) {
            if (this.a[0] == null) {
                this.a[0] = new af(sQLiteDatabase);
            }
            return this.a[0];
        }

        /* Access modifiers changed, original: final|declared_synchronized */
        public final synchronized aa a() {
            this.c = false;
            SQLiteDatabase writableDatabase = super.getWritableDatabase();
            if (this.c) {
                close();
                return a();
            }
            return a(writableDatabase);
        }

        /* Access modifiers changed, original: final|declared_synchronized */
        public final synchronized aa b() {
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
            a(sQLiteDatabase);
        }

        public final void onCreate(SQLiteDatabase sQLiteDatabase) {
            this.b.a(a(sQLiteDatabase));
        }

        public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            this.c = true;
            this.b.b(a(sQLiteDatabase), i, i2);
        }

        public final void onOpen(SQLiteDatabase sQLiteDatabase) {
            if (!this.c) {
                this.b.b(a(sQLiteDatabase));
            }
        }

        public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            this.c = true;
            this.b.a(a(sQLiteDatabase), i, i2);
        }
    }

    ag(Context context, String str, a aVar) {
        this.a = new a(context, str, new af[1], aVar);
    }

    public final void close() {
        this.a.close();
    }

    public final aa getReadableDatabase() {
        return this.a.b();
    }

    public final aa getWritableDatabase() {
        return this.a.a();
    }

    public final void setWriteAheadLoggingEnabled(boolean z) {
        this.a.setWriteAheadLoggingEnabled(z);
    }
}
