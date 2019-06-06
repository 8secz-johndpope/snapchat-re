package net.sqlcipher.database;

import net.sqlcipher.Cursor;

public class SQLiteDirectCursorDriver implements SQLiteCursorDriver {
    private Cursor mCursor;
    private SQLiteDatabase mDatabase;
    private String mEditTable;
    private SQLiteQuery mQuery;
    private String mSql;

    public SQLiteDirectCursorDriver(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        this.mDatabase = sQLiteDatabase;
        this.mEditTable = str2;
        this.mSql = str;
    }

    public void cursorClosed() {
        this.mCursor = null;
    }

    public void cursorDeactivated() {
    }

    public void cursorRequeried(android.database.Cursor cursor) {
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:13:0x0031 in {4, 6, 8, 11, 12} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
        	at java.lang.Iterable.forEach(Iterable.java:75)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
        	at jadx.core.ProcessClass.process(ProcessClass.java:37)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    public net.sqlcipher.Cursor query(net.sqlcipher.database.SQLiteDatabase.CursorFactory r5, java.lang.Object[] r6) {
        /*
        r4 = this;
        r0 = new net.sqlcipher.database.SQLiteQuery;
        r1 = r4.mDatabase;
        r2 = r4.mSql;
        r3 = 0;
        r0.<init>(r1, r2, r3, r6);
        r0.bindArguments(r6);	 Catch:{ all -> 0x002a }
        if (r5 != 0) goto L_0x001b;	 Catch:{ all -> 0x002a }
        r5 = new net.sqlcipher.database.SQLiteCursor;	 Catch:{ all -> 0x002a }
        r6 = r4.mDatabase;	 Catch:{ all -> 0x002a }
        r1 = r4.mEditTable;	 Catch:{ all -> 0x002a }
        r5.<init>(r6, r4, r1, r0);	 Catch:{ all -> 0x002a }
        r4.mCursor = r5;	 Catch:{ all -> 0x002a }
        goto L_0x0024;	 Catch:{ all -> 0x002a }
        r6 = r4.mDatabase;	 Catch:{ all -> 0x002a }
        r1 = r4.mEditTable;	 Catch:{ all -> 0x002a }
        r5 = r5.newCursor(r6, r4, r1, r0);	 Catch:{ all -> 0x002a }
        goto L_0x0018;	 Catch:{ all -> 0x002a }
        r4.mQuery = r0;	 Catch:{ all -> 0x002a }
        r0 = 0;	 Catch:{ all -> 0x002a }
        r5 = r4.mCursor;	 Catch:{ all -> 0x002a }
        return r5;
        r5 = move-exception;
        if (r0 == 0) goto L_0x0030;
        r0.close();
        throw r5;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: net.sqlcipher.database.SQLiteDirectCursorDriver.query(net.sqlcipher.database.SQLiteDatabase$CursorFactory, java.lang.Object[]):net.sqlcipher.Cursor");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:17:0x003e in {2, 4, 6, 8, 10, 12, 15, 16} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
        	at java.lang.Iterable.forEach(Iterable.java:75)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
        	at jadx.core.ProcessClass.process(ProcessClass.java:37)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    public net.sqlcipher.Cursor query(net.sqlcipher.database.SQLiteDatabase.CursorFactory r5, java.lang.String[] r6) {
        /*
        r4 = this;
        r0 = new net.sqlcipher.database.SQLiteQuery;
        r1 = r4.mDatabase;
        r2 = r4.mSql;
        r3 = 0;
        r0.<init>(r1, r2, r3, r6);
        if (r6 != 0) goto L_0x000e;
        r1 = 0;
        goto L_0x000f;
        r1 = r6.length;	 Catch:{ all -> 0x0037 }
        if (r3 >= r1) goto L_0x001a;	 Catch:{ all -> 0x0037 }
        r2 = r3 + 1;	 Catch:{ all -> 0x0037 }
        r3 = r6[r3];	 Catch:{ all -> 0x0037 }
        r0.bindString(r2, r3);	 Catch:{ all -> 0x0037 }
        r3 = r2;	 Catch:{ all -> 0x0037 }
        goto L_0x000f;	 Catch:{ all -> 0x0037 }
        if (r5 != 0) goto L_0x0028;	 Catch:{ all -> 0x0037 }
        r5 = new net.sqlcipher.database.SQLiteCursor;	 Catch:{ all -> 0x0037 }
        r6 = r4.mDatabase;	 Catch:{ all -> 0x0037 }
        r1 = r4.mEditTable;	 Catch:{ all -> 0x0037 }
        r5.<init>(r6, r4, r1, r0);	 Catch:{ all -> 0x0037 }
        r4.mCursor = r5;	 Catch:{ all -> 0x0037 }
        goto L_0x0031;	 Catch:{ all -> 0x0037 }
        r6 = r4.mDatabase;	 Catch:{ all -> 0x0037 }
        r1 = r4.mEditTable;	 Catch:{ all -> 0x0037 }
        r5 = r5.newCursor(r6, r4, r1, r0);	 Catch:{ all -> 0x0037 }
        goto L_0x0025;	 Catch:{ all -> 0x0037 }
        r4.mQuery = r0;	 Catch:{ all -> 0x0037 }
        r0 = 0;	 Catch:{ all -> 0x0037 }
        r5 = r4.mCursor;	 Catch:{ all -> 0x0037 }
        return r5;
        r5 = move-exception;
        if (r0 == 0) goto L_0x003d;
        r0.close();
        throw r5;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: net.sqlcipher.database.SQLiteDirectCursorDriver.query(net.sqlcipher.database.SQLiteDatabase$CursorFactory, java.lang.String[]):net.sqlcipher.Cursor");
    }

    public void setBindArguments(String[] strArr) {
        int length = strArr.length;
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            this.mQuery.bindString(i2, strArr[i]);
            i = i2;
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("SQLiteDirectCursorDriver: ");
        stringBuilder.append(this.mSql);
        return stringBuilder.toString();
    }
}
