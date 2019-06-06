package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import android.text.TextUtils;
import android.util.Pair;
import java.util.List;
import java.util.Locale;

/* renamed from: pf */
final class pf implements pa {
    private static final String[] a = new String[]{"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};
    private static final String[] b = new String[0];
    private final SQLiteDatabase c;

    pf(SQLiteDatabase sQLiteDatabase) {
        this.c = sQLiteDatabase;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:26:0x0094 in {5, 6, 12, 13, 14, 18, 21, 23, 25} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    public final int a(java.lang.String r7, int r8, android.content.ContentValues r9, java.lang.String r10, java.lang.Object[] r11) {
        /*
        r6 = this;
        if (r9 == 0) goto L_0x008c;
        r0 = r9.size();
        if (r0 == 0) goto L_0x008c;
        r0 = new java.lang.StringBuilder;
        r1 = 120; // 0x78 float:1.68E-43 double:5.93E-322;
        r0.<init>(r1);
        r1 = "UPDATE ";
        r0.append(r1);
        r1 = a;
        r8 = r1[r8];
        r0.append(r8);
        r0.append(r7);
        r7 = " SET ";
        r0.append(r7);
        r7 = r9.size();
        if (r11 != 0) goto L_0x002b;
        r8 = r7;
        goto L_0x002d;
        r8 = r11.length;
        r8 = r8 + r7;
        r1 = new java.lang.Object[r8];
        r2 = 0;
        r3 = r9.keySet();
        r3 = r3.iterator();
        r4 = r3.hasNext();
        if (r4 == 0) goto L_0x0060;
        r4 = r3.next();
        r4 = (java.lang.String) r4;
        if (r2 <= 0) goto L_0x0049;
        r5 = ",";
        goto L_0x004b;
        r5 = "";
        r0.append(r5);
        r0.append(r4);
        r5 = r2 + 1;
        r4 = r9.get(r4);
        r1[r2] = r4;
        r2 = "=?";
        r0.append(r2);
        r2 = r5;
        goto L_0x0038;
        if (r11 == 0) goto L_0x006e;
        r9 = r7;
        if (r9 >= r8) goto L_0x006e;
        r2 = r9 - r7;
        r2 = r11[r2];
        r1[r9] = r2;
        r9 = r9 + 1;
        goto L_0x0063;
        r7 = android.text.TextUtils.isEmpty(r10);
        if (r7 != 0) goto L_0x007c;
        r7 = " WHERE ";
        r0.append(r7);
        r0.append(r10);
        r7 = r0.toString();
        r7 = r6.a(r7);
        defpackage.oz.a(r7, r1);
        r7 = r7.executeUpdateDelete();
        return r7;
        r7 = new java.lang.IllegalArgumentException;
        r8 = "Empty values";
        r7.<init>(r8);
        throw r7;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pf.a(java.lang.String, int, android.content.ContentValues, java.lang.String, java.lang.Object[]):int");
    }

    public final int a(String str, String str2, Object[] objArr) {
        StringBuilder stringBuilder = new StringBuilder("DELETE FROM ");
        stringBuilder.append(str);
        if (TextUtils.isEmpty(str2)) {
            str = "";
        } else {
            str = " WHERE ".concat(String.valueOf(str2));
        }
        stringBuilder.append(str);
        pe a = a(stringBuilder.toString());
        oz.a(a, objArr);
        return a.executeUpdateDelete();
    }

    public final long a(String str, int i, ContentValues contentValues) {
        return this.c.insertWithOnConflict(str, null, contentValues, i);
    }

    public final Cursor a(String str, Object[] objArr) {
        return a(new oz(str, objArr));
    }

    public final Cursor a(final pd pdVar) {
        return this.c.rawQueryWithFactory(new CursorFactory() {
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                pdVar.bindTo(new pi(sQLiteQuery));
                return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, pdVar.getSql(), b, null);
    }

    public final Cursor a(final pd pdVar, CancellationSignal cancellationSignal) {
        return this.c.rawQueryWithFactory(new CursorFactory() {
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                pdVar.bindTo(new pi(sQLiteQuery));
                return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, pdVar.getSql(), b, null, cancellationSignal);
    }

    public final pe a(String str) {
        return new pj(this.c.compileStatement(str));
    }

    public final void a() {
        this.c.beginTransaction();
    }

    public final void a(int i) {
        this.c.setVersion(i);
    }

    public final void a(SQLiteTransactionListener sQLiteTransactionListener) {
        this.c.beginTransactionWithListener(sQLiteTransactionListener);
    }

    public final void a(Locale locale) {
        this.c.setLocale(locale);
    }

    public final void a(boolean z) {
        this.c.setForeignKeyConstraintsEnabled(z);
    }

    public final boolean a(long j) {
        return this.c.yieldIfContendedSafely(j);
    }

    public final long b(long j) {
        return this.c.setMaximumSize(j);
    }

    public final Cursor b(String str) {
        return a(new oz(str));
    }

    public final void b() {
        this.c.beginTransactionNonExclusive();
    }

    public final void b(SQLiteTransactionListener sQLiteTransactionListener) {
        this.c.beginTransactionWithListenerNonExclusive(sQLiteTransactionListener);
    }

    public final void b(String str, Object[] objArr) {
        this.c.execSQL(str, objArr);
    }

    public final boolean b(int i) {
        return this.c.needUpgrade(i);
    }

    public final void c() {
        this.c.endTransaction();
    }

    public final void c(int i) {
        this.c.setMaxSqlCacheSize(i);
    }

    public final void c(long j) {
        this.c.setPageSize(j);
    }

    public final void c(String str) {
        this.c.execSQL(str);
    }

    public final void close() {
        this.c.close();
    }

    public final void d() {
        this.c.setTransactionSuccessful();
    }

    public final boolean e() {
        return this.c.inTransaction();
    }

    public final boolean f() {
        return this.c.isDbLockedByCurrentThread();
    }

    public final boolean g() {
        return this.c.yieldIfContendedSafely();
    }

    public final int h() {
        return this.c.getVersion();
    }

    public final long i() {
        return this.c.getMaximumSize();
    }

    public final long j() {
        return this.c.getPageSize();
    }

    public final boolean k() {
        return this.c.isReadOnly();
    }

    public final boolean l() {
        return this.c.isOpen();
    }

    public final String m() {
        return this.c.getPath();
    }

    public final boolean n() {
        return this.c.enableWriteAheadLogging();
    }

    public final void o() {
        this.c.disableWriteAheadLogging();
    }

    public final boolean p() {
        return this.c.isWriteAheadLoggingEnabled();
    }

    public final List<Pair<String, String>> q() {
        return this.c.getAttachedDbs();
    }

    public final boolean r() {
        return this.c.isDatabaseIntegrityOk();
    }
}
