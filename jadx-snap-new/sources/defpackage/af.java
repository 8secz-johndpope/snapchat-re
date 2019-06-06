package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteTransactionListener;
import android.util.Pair;
import java.util.List;

/* renamed from: af */
final class af implements aa {
    private static final String[] a = new String[]{"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};
    private static final String[] b = new String[0];
    private final SQLiteDatabase c;

    af(SQLiteDatabase sQLiteDatabase) {
        this.c = sQLiteDatabase;
    }

    public final void beginTransaction() {
        this.c.beginTransaction();
    }

    public final void beginTransactionWithListener(SQLiteTransactionListener sQLiteTransactionListener) {
        this.c.beginTransactionWithListener(sQLiteTransactionListener);
    }

    public final void close() {
        this.c.close();
    }

    public final ae compileStatement(String str) {
        return new aj(this.c.compileStatement(str));
    }

    public final void endTransaction() {
        this.c.endTransaction();
    }

    public final void execSQL(String str) {
        this.c.execSQL(str);
    }

    public final void execSQL(String str, Object[] objArr) {
        this.c.execSQL(str, objArr);
    }

    public final List<Pair<String, String>> getAttachedDbs() {
        return this.c.getAttachedDbs();
    }

    public final String getPath() {
        return this.c.getPath();
    }

    public final boolean inTransaction() {
        return this.c.inTransaction();
    }

    public final long insert(String str, int i, ContentValues contentValues) {
        return this.c.insertWithOnConflict(str, null, contentValues, i);
    }

    public final boolean isOpen() {
        return this.c.isOpen();
    }

    public final Cursor query(final ad adVar) {
        return this.c.rawQueryWithFactory(new CursorFactory() {
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                adVar.bindTo(new ai(sQLiteQuery));
                return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, adVar.getSql(), b, null);
    }

    public final Cursor query(String str) {
        return query(new z(str));
    }

    public final Cursor query(String str, Object[] objArr) {
        return query(new z(str, objArr));
    }

    public final void setTransactionSuccessful() {
        this.c.setTransactionSuccessful();
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
    public final int update(java.lang.String r7, int r8, android.content.ContentValues r9, java.lang.String r10, java.lang.Object[] r11) {
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
        r7 = r6.compileStatement(r7);
        defpackage.z.a(r7, r1);
        r7 = r7.executeUpdateDelete();
        return r7;
        r7 = new java.lang.IllegalArgumentException;
        r8 = "Empty values";
        r7.<init>(r8);
        throw r7;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.af.update(java.lang.String, int, android.content.ContentValues, java.lang.String, java.lang.Object[]):int");
    }

    public final boolean yieldIfContendedSafely() {
        return this.c.yieldIfContendedSafely();
    }

    public final boolean yieldIfContendedSafely(long j) {
        return this.c.yieldIfContendedSafely(j);
    }
}
