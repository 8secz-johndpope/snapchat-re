package net.sqlcipher.database;

import android.content.Context;
import android.util.Log;
import java.io.File;
import net.sqlcipher.DatabaseErrorHandler;
import net.sqlcipher.DefaultDatabaseErrorHandler;
import net.sqlcipher.database.SQLiteDatabase.CursorFactory;

public abstract class SQLiteOpenHelper {
    private static final String TAG = "SQLiteOpenHelper";
    private final Context mContext;
    private SQLiteDatabase mDatabase;
    private boolean mDeferSetWriteAheadLoggingEnabled;
    private boolean mEnableWriteAheadLogging;
    private final DatabaseErrorHandler mErrorHandler;
    private final CursorFactory mFactory;
    private final SQLiteDatabaseHook mHook;
    private boolean mIsInitializing;
    private final String mName;
    private final int mNewVersion;

    public SQLiteOpenHelper(Context context, String str, CursorFactory cursorFactory, int i) {
        this(context, str, cursorFactory, i, null, new DefaultDatabaseErrorHandler());
    }

    public SQLiteOpenHelper(Context context, String str, CursorFactory cursorFactory, int i, SQLiteDatabaseHook sQLiteDatabaseHook) {
        this(context, str, cursorFactory, i, sQLiteDatabaseHook, new DefaultDatabaseErrorHandler());
    }

    public SQLiteOpenHelper(Context context, String str, CursorFactory cursorFactory, int i, SQLiteDatabaseHook sQLiteDatabaseHook, DatabaseErrorHandler databaseErrorHandler) {
        this.mDatabase = null;
        this.mIsInitializing = false;
        if (i <= 0) {
            throw new IllegalArgumentException("Version must be >= 1, was ".concat(String.valueOf(i)));
        } else if (databaseErrorHandler != null) {
            this.mContext = context;
            this.mName = str;
            this.mFactory = cursorFactory;
            this.mNewVersion = i;
            this.mHook = sQLiteDatabaseHook;
            this.mErrorHandler = databaseErrorHandler;
        } else {
            throw new IllegalArgumentException("DatabaseErrorHandler param value can't be null.");
        }
    }

    public synchronized void close() {
        if (this.mIsInitializing) {
            throw new IllegalStateException("Closed during initialization");
        } else if (this.mDatabase != null && this.mDatabase.isOpen()) {
            this.mDatabase.close();
            this.mDatabase = null;
        }
    }

    public String getDatabaseName() {
        return this.mName;
    }

    public synchronized SQLiteDatabase getReadableDatabase(String str) {
        return getReadableDatabase(str == null ? null : str.toCharArray());
    }

    public synchronized SQLiteDatabase getReadableDatabase(char[] cArr) {
        SQLiteDatabase sQLiteDatabase;
        if (this.mDatabase != null && this.mDatabase.isOpen()) {
            return this.mDatabase;
        } else if (this.mIsInitializing) {
            throw new IllegalStateException("getReadableDatabase called recursively");
        } else {
            try {
                cArr = getWritableDatabase(cArr);
                return cArr;
            } catch (SQLiteException e) {
                if (this.mName != null) {
                    String str = TAG;
                    StringBuilder stringBuilder = new StringBuilder("Couldn't open ");
                    stringBuilder.append(this.mName);
                    stringBuilder.append(" for writing (will try read-only):");
                    Log.e(str, stringBuilder.toString(), e);
                    sQLiteDatabase = null;
                    this.mIsInitializing = true;
                    String path = this.mContext.getDatabasePath(this.mName).getPath();
                    File file = new File(path);
                    File file2 = new File(this.mContext.getDatabasePath(this.mName).getParent());
                    if (!file2.exists()) {
                        file2.mkdirs();
                    }
                    if (!file.exists()) {
                        this.mIsInitializing = false;
                        sQLiteDatabase = getWritableDatabase(cArr);
                        this.mIsInitializing = true;
                        sQLiteDatabase.close();
                    }
                    sQLiteDatabase = SQLiteDatabase.openDatabase(path, cArr, this.mFactory, 1);
                    if (sQLiteDatabase.getVersion() == this.mNewVersion) {
                        onOpen(sQLiteDatabase);
                        String str2 = TAG;
                        stringBuilder = new StringBuilder("Opened ");
                        stringBuilder.append(this.mName);
                        stringBuilder.append(" in read-only mode");
                        Log.w(str2, stringBuilder.toString());
                        this.mDatabase = sQLiteDatabase;
                        SQLiteDatabase sQLiteDatabase2 = this.mDatabase;
                        return sQLiteDatabase2;
                    }
                    stringBuilder = new StringBuilder("Can't upgrade read-only database from version ");
                    stringBuilder.append(sQLiteDatabase.getVersion());
                    stringBuilder.append(" to ");
                    stringBuilder.append(this.mNewVersion);
                    stringBuilder.append(": ");
                    stringBuilder.append(path);
                    throw new SQLiteException(stringBuilder.toString());
                }
                throw e;
            } finally {
                this.mIsInitializing = false;
                if (!(sQLiteDatabase == null || sQLiteDatabase == this.mDatabase)) {
                    sQLiteDatabase.close();
                }
            }
        }
    }

    public synchronized SQLiteDatabase getWritableDatabase(String str) {
        return getWritableDatabase(str == null ? null : str.toCharArray());
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:70:0x00d0 in {10, 16, 21, 25, 26, 29, 35, 38, 39, 42, 45, 51, 53, 56, 61, 63, 64, 66, 69} preds:[]
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
    public synchronized net.sqlcipher.database.SQLiteDatabase getWritableDatabase(char[] r7) {
        /*
        r6 = this;
        monitor-enter(r6);
        r0 = r6.mDatabase;	 Catch:{ all -> 0x00cd }
        if (r0 == 0) goto L_0x0019;	 Catch:{ all -> 0x00cd }
        r0 = r6.mDatabase;	 Catch:{ all -> 0x00cd }
        r0 = r0.isOpen();	 Catch:{ all -> 0x00cd }
        if (r0 == 0) goto L_0x0019;	 Catch:{ all -> 0x00cd }
        r0 = r6.mDatabase;	 Catch:{ all -> 0x00cd }
        r0 = r0.isReadOnly();	 Catch:{ all -> 0x00cd }
        if (r0 != 0) goto L_0x0019;	 Catch:{ all -> 0x00cd }
        r7 = r6.mDatabase;	 Catch:{ all -> 0x00cd }
        monitor-exit(r6);
        return r7;
        r0 = r6.mIsInitializing;	 Catch:{ all -> 0x00cd }
        if (r0 != 0) goto L_0x00c5;	 Catch:{ all -> 0x00cd }
        r0 = r6.mDatabase;	 Catch:{ all -> 0x00cd }
        if (r0 == 0) goto L_0x0026;	 Catch:{ all -> 0x00cd }
        r0 = r6.mDatabase;	 Catch:{ all -> 0x00cd }
        r0.lock();	 Catch:{ all -> 0x00cd }
        r0 = 1;
        r1 = 0;
        r2 = 0;
        r6.mIsInitializing = r0;	 Catch:{ all -> 0x00b3 }
        r0 = r6.mName;	 Catch:{ all -> 0x00b3 }
        if (r0 != 0) goto L_0x0035;	 Catch:{ all -> 0x00b3 }
        r7 = net.sqlcipher.database.SQLiteDatabase.create(r2, r7);	 Catch:{ all -> 0x00b3 }
        r2 = r7;	 Catch:{ all -> 0x00b3 }
        goto L_0x005e;	 Catch:{ all -> 0x00b3 }
        r0 = r6.mContext;	 Catch:{ all -> 0x00b3 }
        r3 = r6.mName;	 Catch:{ all -> 0x00b3 }
        r0 = r0.getDatabasePath(r3);	 Catch:{ all -> 0x00b3 }
        r0 = r0.getPath();	 Catch:{ all -> 0x00b3 }
        r3 = new java.io.File;	 Catch:{ all -> 0x00b3 }
        r3.<init>(r0);	 Catch:{ all -> 0x00b3 }
        r4 = r3.exists();	 Catch:{ all -> 0x00b3 }
        if (r4 != 0) goto L_0x0053;	 Catch:{ all -> 0x00b3 }
        r3 = r3.getParentFile();	 Catch:{ all -> 0x00b3 }
        r3.mkdirs();	 Catch:{ all -> 0x00b3 }
        r3 = r6.mFactory;	 Catch:{ all -> 0x00b3 }
        r4 = r6.mHook;	 Catch:{ all -> 0x00b3 }
        r5 = r6.mErrorHandler;	 Catch:{ all -> 0x00b3 }
        r7 = net.sqlcipher.database.SQLiteDatabase.openOrCreateDatabase(r0, r7, r3, r4, r5);	 Catch:{ all -> 0x00b3 }
        goto L_0x0033;	 Catch:{ all -> 0x00b3 }
        r7 = r6.mDeferSetWriteAheadLoggingEnabled;	 Catch:{ all -> 0x00b3 }
        if (r7 == 0) goto L_0x0068;	 Catch:{ all -> 0x00b3 }
        r7 = r2.enableWriteAheadLogging();	 Catch:{ all -> 0x00b3 }
        r6.mEnableWriteAheadLogging = r7;	 Catch:{ all -> 0x00b3 }
        r6.onConfigure(r2);	 Catch:{ all -> 0x00b3 }
        r7 = r2.getVersion();	 Catch:{ all -> 0x00b3 }
        r0 = r6.mNewVersion;	 Catch:{ all -> 0x00b3 }
        if (r7 == r0) goto L_0x009c;	 Catch:{ all -> 0x00b3 }
        r2.beginTransaction();	 Catch:{ all -> 0x00b3 }
        if (r7 != 0) goto L_0x007c;
        r6.onCreate(r2);	 Catch:{ all -> 0x0097 }
        goto L_0x008b;	 Catch:{ all -> 0x0097 }
        r0 = r6.mNewVersion;	 Catch:{ all -> 0x0097 }
        if (r7 <= r0) goto L_0x0086;	 Catch:{ all -> 0x0097 }
        r0 = r6.mNewVersion;	 Catch:{ all -> 0x0097 }
        r6.onDowngrade(r2, r7, r0);	 Catch:{ all -> 0x0097 }
        goto L_0x008b;	 Catch:{ all -> 0x0097 }
        r0 = r6.mNewVersion;	 Catch:{ all -> 0x0097 }
        r6.onUpgrade(r2, r7, r0);	 Catch:{ all -> 0x0097 }
        r7 = r6.mNewVersion;	 Catch:{ all -> 0x0097 }
        r2.setVersion(r7);	 Catch:{ all -> 0x0097 }
        r2.setTransactionSuccessful();	 Catch:{ all -> 0x0097 }
        r2.endTransaction();	 Catch:{ all -> 0x00b3 }
        goto L_0x009c;	 Catch:{ all -> 0x00b3 }
        r7 = move-exception;	 Catch:{ all -> 0x00b3 }
        r2.endTransaction();	 Catch:{ all -> 0x00b3 }
        throw r7;	 Catch:{ all -> 0x00b3 }
        r6.onOpen(r2);	 Catch:{ all -> 0x00b3 }
        r6.mIsInitializing = r1;	 Catch:{ all -> 0x00cd }
        r7 = r6.mDatabase;	 Catch:{ all -> 0x00cd }
        if (r7 == 0) goto L_0x00af;
        r7 = r6.mDatabase;	 Catch:{ Exception -> 0x00aa }
        r7.close();	 Catch:{ Exception -> 0x00aa }
    L_0x00aa:
        r7 = r6.mDatabase;	 Catch:{ all -> 0x00cd }
        r7.unlock();	 Catch:{ all -> 0x00cd }
        r6.mDatabase = r2;	 Catch:{ all -> 0x00cd }
        monitor-exit(r6);
        return r2;
        r7 = move-exception;
        r6.mIsInitializing = r1;	 Catch:{ all -> 0x00cd }
        r0 = r6.mDatabase;	 Catch:{ all -> 0x00cd }
        if (r0 == 0) goto L_0x00bf;	 Catch:{ all -> 0x00cd }
        r0 = r6.mDatabase;	 Catch:{ all -> 0x00cd }
        r0.unlock();	 Catch:{ all -> 0x00cd }
        if (r2 == 0) goto L_0x00c4;	 Catch:{ all -> 0x00cd }
        r2.close();	 Catch:{ all -> 0x00cd }
        throw r7;	 Catch:{ all -> 0x00cd }
        r7 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x00cd }
        r0 = "getWritableDatabase called recursively";	 Catch:{ all -> 0x00cd }
        r7.<init>(r0);	 Catch:{ all -> 0x00cd }
        throw r7;	 Catch:{ all -> 0x00cd }
        r7 = move-exception;
        monitor-exit(r6);
        throw r7;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: net.sqlcipher.database.SQLiteOpenHelper.getWritableDatabase(char[]):net.sqlcipher.database.SQLiteDatabase");
    }

    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
    }

    public abstract void onCreate(SQLiteDatabase sQLiteDatabase);

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        StringBuilder stringBuilder = new StringBuilder("Can't downgrade database from version ");
        stringBuilder.append(i);
        stringBuilder.append(" to ");
        stringBuilder.append(i2);
        throw new SQLiteException(stringBuilder.toString());
    }

    public void onOpen(SQLiteDatabase sQLiteDatabase) {
    }

    public abstract void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2);

    public void setWriteAheadLoggingEnabled(boolean z) {
        synchronized (this) {
            if (this.mEnableWriteAheadLogging != z) {
                if (this.mDatabase == null || !this.mDatabase.isOpen() || this.mDatabase.isReadOnly()) {
                    this.mDeferSetWriteAheadLoggingEnabled = z;
                } else {
                    if (z) {
                        this.mDatabase.enableWriteAheadLogging();
                    } else {
                        this.mDatabase.disableWriteAheadLogging();
                    }
                    this.mEnableWriteAheadLogging = z;
                }
            }
        }
    }
}
