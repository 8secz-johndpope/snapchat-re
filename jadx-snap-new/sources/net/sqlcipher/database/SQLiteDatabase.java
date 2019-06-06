package net.sqlcipher.database;

import android.content.ContentValues;
import android.content.Context;
import android.os.Debug;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import java.io.File;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Pattern;
import net.sqlcipher.CrossProcessCursorWrapper;
import net.sqlcipher.Cursor;
import net.sqlcipher.CursorWrapper;
import net.sqlcipher.DatabaseErrorHandler;
import net.sqlcipher.SQLException;
import net.sqlcipher.database.SQLiteDebug.DbStats;

public class SQLiteDatabase extends SQLiteClosable {
    private static final String COMMIT_SQL = "COMMIT;";
    public static final int CONFLICT_ABORT = 2;
    public static final int CONFLICT_FAIL = 3;
    public static final int CONFLICT_IGNORE = 4;
    public static final int CONFLICT_NONE = 0;
    public static final int CONFLICT_REPLACE = 5;
    public static final int CONFLICT_ROLLBACK = 1;
    private static final String[] CONFLICT_VALUES = new String[]{"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};
    public static final int CREATE_IF_NECESSARY = 268435456;
    private static final Pattern EMAIL_IN_DB_PATTERN = Pattern.compile("[\\w\\.\\-]+@[\\w\\.\\-]+");
    private static final int EVENT_DB_CORRUPT = 75004;
    private static final int EVENT_DB_OPERATION = 52000;
    static final String GET_LOCK_LOG_PREFIX = "GETLOCK:";
    private static final String KEY_ENCODING = "UTF-8";
    private static final int LOCK_ACQUIRED_WARNING_THREAD_TIME_IN_MS = 100;
    private static final int LOCK_ACQUIRED_WARNING_TIME_IN_MS = 300;
    private static final int LOCK_ACQUIRED_WARNING_TIME_IN_MS_ALWAYS_PRINT = 2000;
    private static final int LOCK_WARNING_WINDOW_IN_MS = 20000;
    private static final String LOG_SLOW_QUERIES_PROPERTY = "db.log.slow_query_threshold";
    public static final int MAX_SQL_CACHE_SIZE = 250;
    private static final int MAX_WARNINGS_ON_CACHESIZE_CONDITION = 1;
    public static final String MEMORY = ":memory:";
    public static final int NO_LOCALIZED_COLLATORS = 16;
    public static final int OPEN_READONLY = 1;
    public static final int OPEN_READWRITE = 0;
    private static final int OPEN_READ_MASK = 1;
    private static final int QUERY_LOG_SQL_LENGTH = 64;
    private static final int SLEEP_AFTER_YIELD_QUANTUM = 1000;
    public static final String SQLCIPHER_ANDROID_VERSION = "3.5.9";
    public static final int SQLITE_MAX_LIKE_PATTERN_LENGTH = 50000;
    private static final String TAG = "Database";
    private static WeakHashMap<SQLiteDatabase, Object> sActiveDatabases = new WeakHashMap();
    private static int sQueryLogTimeInMillis = 0;
    private int mCacheFullWarnings;
    Map<String, SQLiteCompiledSql> mCompiledQueries;
    private final DatabaseErrorHandler mErrorHandler;
    private CursorFactory mFactory;
    private int mFlags;
    private boolean mInnerTransactionIsSuccessful;
    private long mLastLockMessageTime;
    private String mLastSqlStatement;
    private final ReentrantLock mLock;
    private long mLockAcquiredThreadTime;
    private long mLockAcquiredWallTime;
    private boolean mLockingEnabled;
    private int mMaxSqlCacheSize;
    long mNativeHandle;
    private int mNumCacheHits;
    private int mNumCacheMisses;
    private String mPath;
    private String mPathForLogs;
    private WeakHashMap<SQLiteClosable, Object> mPrograms;
    private final int mSlowQueryThreshold;
    private Throwable mStackTrace;
    private final Map<String, SyncUpdateInfo> mSyncUpdateInfo;
    int mTempTableSequence;
    private String mTimeClosed;
    private String mTimeOpened;
    private boolean mTransactionIsSuccessful;
    private SQLiteTransactionListener mTransactionListener;

    public interface CursorFactory {
        Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery);
    }

    public interface LibraryLoader {
        void loadLibraries(String... strArr);
    }

    enum SQLiteDatabaseTransactionType {
        Deferred,
        Immediate,
        Exclusive
    }

    static class SyncUpdateInfo {
        String deletedTable;
        String foreignKey;
        String masterTable;

        SyncUpdateInfo(String str, String str2, String str3) {
            this.masterTable = str;
            this.deletedTable = str2;
            this.foreignKey = str3;
        }
    }

    private SQLiteDatabase(String str, CursorFactory cursorFactory, int i, DatabaseErrorHandler databaseErrorHandler) {
        this.mLock = new ReentrantLock(true);
        this.mLockAcquiredWallTime = 0;
        this.mLockAcquiredThreadTime = 0;
        this.mLastLockMessageTime = 0;
        this.mLastSqlStatement = null;
        this.mNativeHandle = 0;
        this.mTempTableSequence = 0;
        this.mPathForLogs = null;
        this.mCompiledQueries = new HashMap();
        this.mMaxSqlCacheSize = 250;
        this.mTimeOpened = null;
        this.mTimeClosed = null;
        this.mStackTrace = null;
        this.mLockingEnabled = true;
        this.mSyncUpdateInfo = new HashMap();
        if (str != null) {
            this.mFlags = i;
            this.mPath = str;
            this.mSlowQueryThreshold = -1;
            this.mStackTrace = new DatabaseObjectNotClosedException().fillInStackTrace();
            this.mFactory = cursorFactory;
            this.mPrograms = new WeakHashMap();
            this.mErrorHandler = databaseErrorHandler;
            return;
        }
        throw new IllegalArgumentException("path should not be null");
    }

    public SQLiteDatabase(String str, char[] cArr, CursorFactory cursorFactory, int i) {
        this(str, cursorFactory, i, null);
        openDatabaseInternal(cArr, null);
    }

    public SQLiteDatabase(String str, char[] cArr, CursorFactory cursorFactory, int i, SQLiteDatabaseHook sQLiteDatabaseHook) {
        this(str, cursorFactory, i, null);
        openDatabaseInternal(cArr, sQLiteDatabaseHook);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:37:0x0070 in {7, 9, 12, 16, 19, 24, 28, 29, 31, 34, 36} preds:[]
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
    private void beginTransactionWithListenerInternal(net.sqlcipher.database.SQLiteTransactionListener r4, net.sqlcipher.database.SQLiteDatabase.SQLiteDatabaseTransactionType r5) {
        /*
        r3 = this;
        r3.lockForced();
        r0 = r3.isOpen();
        if (r0 == 0) goto L_0x0068;
        r0 = r3.mLock;	 Catch:{ all -> 0x0063 }
        r0 = r0.getHoldCount();	 Catch:{ all -> 0x0063 }
        r1 = 1;	 Catch:{ all -> 0x0063 }
        if (r0 <= r1) goto L_0x0026;	 Catch:{ all -> 0x0063 }
        r4 = r3.mInnerTransactionIsSuccessful;	 Catch:{ all -> 0x0063 }
        if (r4 != 0) goto L_0x0017;	 Catch:{ all -> 0x0063 }
        return;	 Catch:{ all -> 0x0063 }
        r4 = "Cannot call beginTransaction between calling setTransactionSuccessful and endTransaction";	 Catch:{ all -> 0x0063 }
        r5 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x0063 }
        r5.<init>(r4);	 Catch:{ all -> 0x0063 }
        r4 = "Database";	 Catch:{ all -> 0x0063 }
        r0 = "beginTransaction() failed";	 Catch:{ all -> 0x0063 }
        android.util.Log.e(r4, r0, r5);	 Catch:{ all -> 0x0063 }
        throw r5;	 Catch:{ all -> 0x0063 }
        r0 = net.sqlcipher.database.SQLiteDatabase.SQLiteDatabaseTransactionType.Exclusive;	 Catch:{ all -> 0x0063 }
        r2 = 0;	 Catch:{ all -> 0x0063 }
        if (r5 != r0) goto L_0x0031;	 Catch:{ all -> 0x0063 }
        r5 = "BEGIN EXCLUSIVE;";	 Catch:{ all -> 0x0063 }
        r3.execSQL(r5);	 Catch:{ all -> 0x0063 }
        goto L_0x003f;	 Catch:{ all -> 0x0063 }
        r0 = net.sqlcipher.database.SQLiteDatabase.SQLiteDatabaseTransactionType.Immediate;	 Catch:{ all -> 0x0063 }
        if (r5 != r0) goto L_0x0038;	 Catch:{ all -> 0x0063 }
        r5 = "BEGIN IMMEDIATE;";	 Catch:{ all -> 0x0063 }
        goto L_0x002d;	 Catch:{ all -> 0x0063 }
        r0 = net.sqlcipher.database.SQLiteDatabase.SQLiteDatabaseTransactionType.Deferred;	 Catch:{ all -> 0x0063 }
        if (r5 != r0) goto L_0x0053;	 Catch:{ all -> 0x0063 }
        r5 = "BEGIN DEFERRED;";	 Catch:{ all -> 0x0063 }
        goto L_0x002d;	 Catch:{ all -> 0x0063 }
        r3.mTransactionListener = r4;	 Catch:{ all -> 0x0063 }
        r3.mTransactionIsSuccessful = r1;	 Catch:{ all -> 0x0063 }
        r3.mInnerTransactionIsSuccessful = r2;	 Catch:{ all -> 0x0063 }
        if (r4 == 0) goto L_0x0052;
        r4.onBegin();	 Catch:{ RuntimeException -> 0x004b }
        return;
        r4 = move-exception;
        r5 = "ROLLBACK;";	 Catch:{ all -> 0x0063 }
        r3.execSQL(r5);	 Catch:{ all -> 0x0063 }
        throw r4;	 Catch:{ all -> 0x0063 }
        return;	 Catch:{ all -> 0x0063 }
        r4 = "%s is an unsupported transaction type";	 Catch:{ all -> 0x0063 }
        r0 = new java.lang.Object[r1];	 Catch:{ all -> 0x0063 }
        r0[r2] = r5;	 Catch:{ all -> 0x0063 }
        r4 = java.lang.String.format(r4, r0);	 Catch:{ all -> 0x0063 }
        r5 = new java.lang.IllegalArgumentException;	 Catch:{ all -> 0x0063 }
        r5.<init>(r4);	 Catch:{ all -> 0x0063 }
        throw r5;	 Catch:{ all -> 0x0063 }
        r4 = move-exception;
        r3.unlockForced();
        throw r4;
        r4 = new java.lang.IllegalStateException;
        r5 = "database not open";
        r4.<init>(r5);
        throw r4;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: net.sqlcipher.database.SQLiteDatabase.beginTransactionWithListenerInternal(net.sqlcipher.database.SQLiteTransactionListener, net.sqlcipher.database.SQLiteDatabase$SQLiteDatabaseTransactionType):void");
    }

    private void checkLockHoldTime() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = elapsedRealtime - this.mLockAcquiredWallTime;
        String str = TAG;
        if ((j >= 2000 || Log.isLoggable(str, 2) || elapsedRealtime - this.mLastLockMessageTime >= 20000) && j > 300) {
            int threadCpuTimeNanos = (int) ((Debug.threadCpuTimeNanos() - this.mLockAcquiredThreadTime) / 1000000);
            if (threadCpuTimeNanos > 100 || j > 2000) {
                this.mLastLockMessageTime = elapsedRealtime;
                StringBuilder stringBuilder = new StringBuilder("lock held on ");
                stringBuilder.append(this.mPath);
                stringBuilder.append(" for ");
                stringBuilder.append(j);
                stringBuilder.append("ms. Thread time was ");
                stringBuilder.append(threadCpuTimeNanos);
                stringBuilder.append("ms");
                String stringBuilder2 = stringBuilder.toString();
                if (SQLiteDebug.DEBUG_LOCK_TIME_TRACKING_STACK_TRACE) {
                    Log.d(str, stringBuilder2, new Exception());
                    return;
                }
                Log.d(str, stringBuilder2);
            }
        }
    }

    private void closeClosable() {
        deallocCachedSqlStatements();
        for (Entry key : this.mPrograms.entrySet()) {
            SQLiteClosable sQLiteClosable = (SQLiteClosable) key.getKey();
            if (sQLiteClosable != null) {
                sQLiteClosable.onAllReferencesReleasedFromContainer();
            }
        }
    }

    private boolean containsNull(char[] cArr) {
        if (cArr == null || cArr.length <= 0) {
            return false;
        }
        for (char c : cArr) {
            if (c == 0) {
                return true;
            }
        }
        return false;
    }

    public static SQLiteDatabase create(CursorFactory cursorFactory, String str) {
        return openDatabase(":memory:", str == null ? null : str.toCharArray(), cursorFactory, (int) CREATE_IF_NECESSARY);
    }

    public static SQLiteDatabase create(CursorFactory cursorFactory, char[] cArr) {
        return openDatabase(":memory:", cArr, cursorFactory, (int) CREATE_IF_NECESSARY);
    }

    private native void dbclose();

    private native void dbopen(String str, int i);

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:13:0x0027 in {6, 9, 12} preds:[]
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
    private void deallocCachedSqlStatements() {
        /*
        r3 = this;
        r0 = r3.mCompiledQueries;
        monitor-enter(r0);
        r1 = r3.mCompiledQueries;	 Catch:{ all -> 0x0024 }
        r1 = r1.values();	 Catch:{ all -> 0x0024 }
        r1 = r1.iterator();	 Catch:{ all -> 0x0024 }
        r2 = r1.hasNext();	 Catch:{ all -> 0x0024 }
        if (r2 == 0) goto L_0x001d;	 Catch:{ all -> 0x0024 }
        r2 = r1.next();	 Catch:{ all -> 0x0024 }
        r2 = (net.sqlcipher.database.SQLiteCompiledSql) r2;	 Catch:{ all -> 0x0024 }
        r2.releaseSqlStatement();	 Catch:{ all -> 0x0024 }
        goto L_0x000d;	 Catch:{ all -> 0x0024 }
        r1 = r3.mCompiledQueries;	 Catch:{ all -> 0x0024 }
        r1.clear();	 Catch:{ all -> 0x0024 }
        monitor-exit(r0);	 Catch:{ all -> 0x0024 }
        return;	 Catch:{ all -> 0x0024 }
        r1 = move-exception;	 Catch:{ all -> 0x0024 }
        monitor-exit(r0);	 Catch:{ all -> 0x0024 }
        throw r1;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: net.sqlcipher.database.SQLiteDatabase.deallocCachedSqlStatements():void");
    }

    private native void enableSqlProfiling(String str);

    private native void enableSqlTracing(String str);

    public static String findEditTable(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalStateException("Invalid tables");
        }
        int indexOf = str.indexOf(32);
        int indexOf2 = str.indexOf(44);
        if (indexOf > 0 && (indexOf < indexOf2 || indexOf2 < 0)) {
            return str.substring(0, indexOf);
        }
        if (indexOf2 > 0 && (indexOf2 < indexOf || indexOf < 0)) {
            str = str.substring(0, indexOf2);
        }
        return str;
    }

    private static ArrayList<SQLiteDatabase> getActiveDatabases() {
        ArrayList arrayList = new ArrayList();
        synchronized (sActiveDatabases) {
            arrayList.addAll(sActiveDatabases.keySet());
        }
        return arrayList;
    }

    private static ArrayList<Pair<String, String>> getAttachedDbs(SQLiteDatabase sQLiteDatabase) {
        if (!sQLiteDatabase.isOpen()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Cursor rawQuery = sQLiteDatabase.rawQuery("pragma database_list;", null);
        while (rawQuery.moveToNext()) {
            arrayList.add(new Pair(rawQuery.getString(1), rawQuery.getString(2)));
        }
        rawQuery.close();
        return arrayList;
    }

    private byte[] getBytes(char[] cArr) {
        if (cArr == null || cArr.length == 0) {
            return null;
        }
        ByteBuffer encode = Charset.forName(KEY_ENCODING).encode(CharBuffer.wrap(cArr));
        byte[] bArr = new byte[encode.limit()];
        encode.get(bArr);
        return bArr;
    }

    static ArrayList<DbStats> getDbStats() {
        ArrayList arrayList = new ArrayList();
        Iterator it = getActiveDatabases().iterator();
        while (it.hasNext()) {
            SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) it.next();
            if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
                int native_getDbLookaside = sQLiteDatabase.native_getDbLookaside();
                String path = sQLiteDatabase.getPath();
                String str = "/";
                int lastIndexOf = path.lastIndexOf(str);
                path = path.substring(lastIndexOf != -1 ? lastIndexOf + 1 : 0);
                ArrayList attachedDbs = getAttachedDbs(sQLiteDatabase);
                if (attachedDbs != null) {
                    int i = native_getDbLookaside;
                    for (native_getDbLookaside = 0; native_getDbLookaside < attachedDbs.size(); native_getDbLookaside++) {
                        String str2;
                        Pair pair = (Pair) attachedDbs.get(native_getDbLookaside);
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append((String) pair.first);
                        stringBuilder.append(".page_count;");
                        long pragmaVal = getPragmaVal(sQLiteDatabase, stringBuilder.toString());
                        if (native_getDbLookaside == 0) {
                            str2 = path;
                        } else {
                            StringBuilder stringBuilder2 = new StringBuilder("  (attached) ");
                            stringBuilder2.append((String) pair.first);
                            String stringBuilder3 = stringBuilder2.toString();
                            if (((String) pair.second).trim().length() > 0) {
                                int lastIndexOf2 = ((String) pair.second).lastIndexOf(str);
                                StringBuilder stringBuilder4 = new StringBuilder();
                                stringBuilder4.append(stringBuilder3);
                                stringBuilder4.append(" : ");
                                stringBuilder4.append(((String) pair.second).substring(lastIndexOf2 != -1 ? lastIndexOf2 + 1 : 0));
                                stringBuilder3 = stringBuilder4.toString();
                            }
                            str2 = stringBuilder3;
                            i = 0;
                        }
                        if (pragmaVal > 0) {
                            arrayList.add(new DbStats(str2, pragmaVal, sQLiteDatabase.getPageSize(), i));
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    private String getPathForLogs() {
        String str = this.mPathForLogs;
        if (str != null) {
            return str;
        }
        str = this.mPath;
        if (str == null) {
            return null;
        }
        this.mPathForLogs = str.indexOf(64) == -1 ? this.mPath : EMAIL_IN_DB_PATTERN.matcher(this.mPath).replaceAll("XX@YY");
        return this.mPathForLogs;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0027  */
    private static long getPragmaVal(net.sqlcipher.database.SQLiteDatabase r3, java.lang.String r4) {
        /*
        r0 = r3.isOpen();
        if (r0 != 0) goto L_0x0009;
    L_0x0006:
        r3 = 0;
        return r3;
    L_0x0009:
        r0 = 0;
        r1 = new net.sqlcipher.database.SQLiteStatement;	 Catch:{ all -> 0x0024 }
        r2 = "PRAGMA ";
        r4 = java.lang.String.valueOf(r4);	 Catch:{ all -> 0x0024 }
        r4 = r2.concat(r4);	 Catch:{ all -> 0x0024 }
        r1.<init>(r3, r4);	 Catch:{ all -> 0x0024 }
        r3 = r1.simpleQueryForLong();	 Catch:{ all -> 0x0021 }
        r1.close();
        return r3;
    L_0x0021:
        r3 = move-exception;
        r0 = r1;
        goto L_0x0025;
    L_0x0024:
        r3 = move-exception;
    L_0x0025:
        if (r0 == 0) goto L_0x002a;
    L_0x0027:
        r0.close();
    L_0x002a:
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: net.sqlcipher.database.SQLiteDatabase.getPragmaVal(net.sqlcipher.database.SQLiteDatabase, java.lang.String):long");
    }

    private Pair<Boolean, String> getResultFromPragma(String str) {
        Cursor rawQuery = rawQuery(str, new Object[0]);
        if (rawQuery == null) {
            return new Pair(Boolean.FALSE, "");
        }
        rawQuery.moveToFirst();
        String string = rawQuery.getString(0);
        rawQuery.close();
        return new Pair(Boolean.TRUE, string);
    }

    private String getTime() {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS ", Locale.US).format(Long.valueOf(System.currentTimeMillis()));
    }

    private native void key(byte[] bArr);

    private void keyDatabase(SQLiteDatabaseHook sQLiteDatabaseHook, Runnable runnable) {
        if (sQLiteDatabaseHook != null) {
            sQLiteDatabaseHook.preKey(this);
        }
        if (runnable != null) {
            runnable.run();
        }
        if (sQLiteDatabaseHook != null) {
            sQLiteDatabaseHook.postKey(this);
        }
        if (SQLiteDebug.DEBUG_SQL_CACHE) {
            this.mTimeOpened = getTime();
        }
        try {
            Cursor rawQuery = rawQuery("select count(*) from sqlite_master;", new String[0]);
            if (rawQuery != null) {
                rawQuery.moveToFirst();
                rawQuery.getInt(0);
                rawQuery.close();
            }
        } catch (RuntimeException e) {
            Log.e(TAG, e.getMessage(), e);
            throw e;
        }
    }

    private native void key_mutf8(char[] cArr);

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:57:0x00a5 in {4, 16, 18, 20, 22, 23, 26, 31, 33, 34, 36, 38, 42, 44, 45, 48, 53, 55, 56} preds:[]
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
    private static void loadICUData(android.content.Context r7, java.io.File r8) {
        /*
        r0 = "Error in closing streams IO streams after expanding ICU dat file";
        r1 = "Database";
        r2 = new java.io.File;
        r3 = "icu";
        r2.<init>(r8, r3);
        r8 = new java.io.File;
        r3 = "icudt46l.dat";
        r8.<init>(r2, r3);
        r3 = 0;
        r4 = r2.exists();	 Catch:{ Exception -> 0x0073, all -> 0x0070 }
        if (r4 != 0) goto L_0x001c;	 Catch:{ Exception -> 0x0073, all -> 0x0070 }
        r2.mkdirs();	 Catch:{ Exception -> 0x0073, all -> 0x0070 }
        r2 = r8.exists();	 Catch:{ Exception -> 0x0073, all -> 0x0070 }
        if (r2 != 0) goto L_0x0053;	 Catch:{ Exception -> 0x0073, all -> 0x0070 }
        r2 = new java.util.zip.ZipInputStream;	 Catch:{ Exception -> 0x0073, all -> 0x0070 }
        r7 = r7.getAssets();	 Catch:{ Exception -> 0x0073, all -> 0x0070 }
        r4 = "icudt46l.zip";	 Catch:{ Exception -> 0x0073, all -> 0x0070 }
        r7 = r7.open(r4);	 Catch:{ Exception -> 0x0073, all -> 0x0070 }
        r2.<init>(r7);	 Catch:{ Exception -> 0x0073, all -> 0x0070 }
        r2.getNextEntry();	 Catch:{ Exception -> 0x0051 }
        r7 = new java.io.FileOutputStream;	 Catch:{ Exception -> 0x0051 }
        r7.<init>(r8);	 Catch:{ Exception -> 0x0051 }
        r3 = 1024; // 0x400 float:1.435E-42 double:5.06E-321;
        r3 = new byte[r3];	 Catch:{ Exception -> 0x004c, all -> 0x0048 }
        r4 = r2.read(r3);	 Catch:{ Exception -> 0x004c, all -> 0x0048 }
        if (r4 <= 0) goto L_0x0055;	 Catch:{ Exception -> 0x004c, all -> 0x0048 }
        r5 = 0;	 Catch:{ Exception -> 0x004c, all -> 0x0048 }
        r7.write(r3, r5, r4);	 Catch:{ Exception -> 0x004c, all -> 0x0048 }
        goto L_0x003d;
        r8 = move-exception;
        r3 = r7;
        r7 = r8;
        goto L_0x008a;
        r3 = move-exception;
        r6 = r3;
        r3 = r7;
        r7 = r6;
        goto L_0x0075;
        r7 = move-exception;
        goto L_0x0075;
        r7 = r3;
        r2 = r7;
        if (r2 == 0) goto L_0x005d;
        r2.close();	 Catch:{ IOException -> 0x005b }
        goto L_0x005d;	 Catch:{ IOException -> 0x005b }
        r7 = move-exception;	 Catch:{ IOException -> 0x005b }
        goto L_0x0066;	 Catch:{ IOException -> 0x005b }
        if (r7 == 0) goto L_0x006f;	 Catch:{ IOException -> 0x005b }
        r7.flush();	 Catch:{ IOException -> 0x005b }
        r7.close();	 Catch:{ IOException -> 0x005b }
        goto L_0x006f;
        android.util.Log.e(r1, r0, r7);
        r8 = new java.lang.RuntimeException;
        r8.<init>(r7);
        throw r8;
        return;
        r7 = move-exception;
        r2 = r3;
        goto L_0x008a;
        r7 = move-exception;
        r2 = r3;
        r4 = "Error copying icu dat file";	 Catch:{ all -> 0x0089 }
        android.util.Log.e(r1, r4, r7);	 Catch:{ all -> 0x0089 }
        r4 = r8.exists();	 Catch:{ all -> 0x0089 }
        if (r4 == 0) goto L_0x0083;	 Catch:{ all -> 0x0089 }
        r8.delete();	 Catch:{ all -> 0x0089 }
        r8 = new java.lang.RuntimeException;	 Catch:{ all -> 0x0089 }
        r8.<init>(r7);	 Catch:{ all -> 0x0089 }
        throw r8;	 Catch:{ all -> 0x0089 }
        r7 = move-exception;
        if (r2 == 0) goto L_0x0092;
        r2.close();	 Catch:{ IOException -> 0x0090 }
        goto L_0x0092;	 Catch:{ IOException -> 0x0090 }
        r7 = move-exception;	 Catch:{ IOException -> 0x0090 }
        goto L_0x009b;	 Catch:{ IOException -> 0x0090 }
        if (r3 == 0) goto L_0x00a4;	 Catch:{ IOException -> 0x0090 }
        r3.flush();	 Catch:{ IOException -> 0x0090 }
        r3.close();	 Catch:{ IOException -> 0x0090 }
        goto L_0x00a4;
        android.util.Log.e(r1, r0, r7);
        r8 = new java.lang.RuntimeException;
        r8.<init>(r7);
        throw r8;
        throw r7;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: net.sqlcipher.database.SQLiteDatabase.loadICUData(android.content.Context, java.io.File):void");
    }

    public static synchronized void loadLibs(Context context) {
        synchronized (SQLiteDatabase.class) {
            loadLibs(context, context.getFilesDir());
        }
    }

    public static synchronized void loadLibs(Context context, File file) {
        synchronized (SQLiteDatabase.class) {
            loadLibs(context, file, new LibraryLoader() {
                public final void loadLibraries(String... strArr) {
                    for (String loadLibrary : strArr) {
                        System.loadLibrary(loadLibrary);
                    }
                }
            });
        }
    }

    public static synchronized void loadLibs(Context context, File file, LibraryLoader libraryLoader) {
        synchronized (SQLiteDatabase.class) {
            libraryLoader.loadLibraries("sqlcipher");
        }
    }

    public static synchronized void loadLibs(Context context, LibraryLoader libraryLoader) {
        synchronized (SQLiteDatabase.class) {
            loadLibs(context, context.getFilesDir(), libraryLoader);
        }
    }

    private void lockForced() {
        this.mLock.lock();
        if (SQLiteDebug.DEBUG_LOCK_TIME_TRACKING && this.mLock.getHoldCount() == 1) {
            this.mLockAcquiredWallTime = SystemClock.elapsedRealtime();
            this.mLockAcquiredThreadTime = Debug.threadCpuTimeNanos();
        }
    }

    private void markTableSyncable(String str, String str2, String str3, String str4) {
        lock();
        try {
            StringBuilder stringBuilder = new StringBuilder("SELECT _sync_dirty FROM ");
            stringBuilder.append(str3);
            stringBuilder.append(" LIMIT 0");
            native_execSQL(stringBuilder.toString());
            stringBuilder = new StringBuilder("SELECT ");
            stringBuilder.append(str2);
            stringBuilder.append(" FROM ");
            stringBuilder.append(str);
            stringBuilder.append(" LIMIT 0");
            native_execSQL(stringBuilder.toString());
            SyncUpdateInfo syncUpdateInfo = new SyncUpdateInfo(str3, str4, str2);
            synchronized (this.mSyncUpdateInfo) {
                this.mSyncUpdateInfo.put(str, syncUpdateInfo);
            }
        } finally {
            unlock();
        }
    }

    private native int native_getDbLookaside();

    private native void native_key(char[] cArr);

    private native void native_rawExecSQL(String str);

    private native void native_rekey(String str);

    private native int native_status(int i, boolean z);

    public static SQLiteDatabase openDatabase(String str, String str2, CursorFactory cursorFactory, int i) {
        return openDatabase(str, str2, cursorFactory, i, null);
    }

    public static SQLiteDatabase openDatabase(String str, String str2, CursorFactory cursorFactory, int i, SQLiteDatabaseHook sQLiteDatabaseHook) {
        return openDatabase(str, str2, cursorFactory, i, sQLiteDatabaseHook, null);
    }

    public static SQLiteDatabase openDatabase(String str, String str2, CursorFactory cursorFactory, int i, SQLiteDatabaseHook sQLiteDatabaseHook, DatabaseErrorHandler databaseErrorHandler) {
        return openDatabase(str, str2 == null ? null : str2.toCharArray(), cursorFactory, i, sQLiteDatabaseHook, databaseErrorHandler);
    }

    public static SQLiteDatabase openDatabase(String str, char[] cArr, CursorFactory cursorFactory, int i) {
        return openDatabase(str, cArr, cursorFactory, i, null, null);
    }

    public static SQLiteDatabase openDatabase(String str, char[] cArr, CursorFactory cursorFactory, int i, SQLiteDatabaseHook sQLiteDatabaseHook) {
        return openDatabase(str, cArr, cursorFactory, i, sQLiteDatabaseHook, null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0041 A:{SYNTHETIC} */
    public static net.sqlcipher.database.SQLiteDatabase openDatabase(java.lang.String r5, char[] r6, net.sqlcipher.database.SQLiteDatabase.CursorFactory r7, int r8, net.sqlcipher.database.SQLiteDatabaseHook r9, net.sqlcipher.DatabaseErrorHandler r10) {
        /*
        if (r10 == 0) goto L_0x0003;
    L_0x0002:
        goto L_0x0008;
    L_0x0003:
        r10 = new net.sqlcipher.DefaultDatabaseErrorHandler;
        r10.<init>();
    L_0x0008:
        r0 = 0;
        r1 = new net.sqlcipher.database.SQLiteDatabase;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0014 }
        r1.<init>(r5, r7, r8, r10);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0014 }
        r1.openDatabaseInternal(r6, r9);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0012 }
        goto L_0x0030;
    L_0x0012:
        r2 = move-exception;
        goto L_0x0016;
    L_0x0014:
        r2 = move-exception;
        r1 = r0;
    L_0x0016:
        r3 = java.lang.String.valueOf(r5);
        r4 = "Calling error handler for corrupt database ";
        r3 = r4.concat(r3);
        r4 = "Database";
        android.util.Log.e(r4, r3, r2);
        r10.onCorruption(r1);
        r1 = new net.sqlcipher.database.SQLiteDatabase;
        r1.<init>(r5, r7, r8, r10);
        r1.openDatabaseInternal(r6, r9);
    L_0x0030:
        r6 = net.sqlcipher.database.SQLiteDebug.DEBUG_SQL_STATEMENTS;
        if (r6 == 0) goto L_0x0037;
    L_0x0034:
        r1.enableSqlTracing(r5);
    L_0x0037:
        r6 = net.sqlcipher.database.SQLiteDebug.DEBUG_SQL_TIME;
        if (r6 == 0) goto L_0x003e;
    L_0x003b:
        r1.enableSqlProfiling(r5);
    L_0x003e:
        r5 = sActiveDatabases;
        monitor-enter(r5);
        r6 = sActiveDatabases;	 Catch:{ all -> 0x0048 }
        r6.put(r1, r0);	 Catch:{ all -> 0x0048 }
        monitor-exit(r5);	 Catch:{ all -> 0x0048 }
        return r1;
    L_0x0048:
        r6 = move-exception;
        monitor-exit(r5);	 Catch:{ all -> 0x0048 }
        throw r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: net.sqlcipher.database.SQLiteDatabase.openDatabase(java.lang.String, char[], net.sqlcipher.database.SQLiteDatabase$CursorFactory, int, net.sqlcipher.database.SQLiteDatabaseHook, net.sqlcipher.DatabaseErrorHandler):net.sqlcipher.database.SQLiteDatabase");
    }

    private void openDatabaseInternal(final char[] cArr, SQLiteDatabaseHook sQLiteDatabaseHook) {
        final byte[] bytes = getBytes(cArr);
        dbopen(this.mPath, this.mFlags);
        try {
            keyDatabase(sQLiteDatabaseHook, new Runnable() {
                public void run() {
                    byte[] bArr = bytes;
                    if (bArr != null && bArr.length > 0) {
                        SQLiteDatabase.this.key(bArr);
                    }
                }
            });
            if (bytes != null && bytes.length <= 0) {
            }
        } catch (RuntimeException e) {
            if (containsNull(cArr)) {
                keyDatabase(sQLiteDatabaseHook, new Runnable() {
                    public void run() {
                        char[] cArr = cArr;
                        if (cArr != null) {
                            SQLiteDatabase.this.key_mutf8(cArr);
                        }
                    }
                });
                if (bytes != null && bytes.length > 0) {
                    rekey(bytes);
                }
                if (bytes != null) {
                    int length = bytes.length;
                }
            } else {
                throw e;
            }
        } catch (Throwable th) {
            dbclose();
            if (SQLiteDebug.DEBUG_SQL_CACHE) {
                this.mTimeClosed = getTime();
            }
        }
    }

    public static SQLiteDatabase openOrCreateDatabase(File file, String str, CursorFactory cursorFactory) {
        return openOrCreateDatabase(file, str, cursorFactory, null);
    }

    public static SQLiteDatabase openOrCreateDatabase(File file, String str, CursorFactory cursorFactory, SQLiteDatabaseHook sQLiteDatabaseHook) {
        return openOrCreateDatabase(file, str, cursorFactory, sQLiteDatabaseHook, null);
    }

    public static SQLiteDatabase openOrCreateDatabase(File file, String str, CursorFactory cursorFactory, SQLiteDatabaseHook sQLiteDatabaseHook, DatabaseErrorHandler databaseErrorHandler) {
        return openOrCreateDatabase(file == null ? null : file.getPath(), str, cursorFactory, sQLiteDatabaseHook, databaseErrorHandler);
    }

    public static SQLiteDatabase openOrCreateDatabase(String str, String str2, CursorFactory cursorFactory) {
        return openDatabase(str, str2, cursorFactory, (int) CREATE_IF_NECESSARY, null);
    }

    public static SQLiteDatabase openOrCreateDatabase(String str, String str2, CursorFactory cursorFactory, SQLiteDatabaseHook sQLiteDatabaseHook) {
        return openDatabase(str, str2, cursorFactory, (int) CREATE_IF_NECESSARY, sQLiteDatabaseHook);
    }

    public static SQLiteDatabase openOrCreateDatabase(String str, String str2, CursorFactory cursorFactory, SQLiteDatabaseHook sQLiteDatabaseHook, DatabaseErrorHandler databaseErrorHandler) {
        return openDatabase(str, str2 == null ? null : str2.toCharArray(), cursorFactory, (int) CREATE_IF_NECESSARY, sQLiteDatabaseHook, databaseErrorHandler);
    }

    public static SQLiteDatabase openOrCreateDatabase(String str, char[] cArr, CursorFactory cursorFactory) {
        return openDatabase(str, cArr, cursorFactory, (int) CREATE_IF_NECESSARY, null);
    }

    public static SQLiteDatabase openOrCreateDatabase(String str, char[] cArr, CursorFactory cursorFactory, SQLiteDatabaseHook sQLiteDatabaseHook) {
        return openDatabase(str, cArr, cursorFactory, (int) CREATE_IF_NECESSARY, sQLiteDatabaseHook);
    }

    public static SQLiteDatabase openOrCreateDatabase(String str, char[] cArr, CursorFactory cursorFactory, SQLiteDatabaseHook sQLiteDatabaseHook, DatabaseErrorHandler databaseErrorHandler) {
        return openDatabase(str, cArr, cursorFactory, (int) CREATE_IF_NECESSARY, sQLiteDatabaseHook, databaseErrorHandler);
    }

    private native void rekey(byte[] bArr);

    public static native int releaseMemory();

    public static native void setICURoot(String str);

    private void unlockForced() {
        if (SQLiteDebug.DEBUG_LOCK_TIME_TRACKING && this.mLock.getHoldCount() == 1) {
            checkLockHoldTime();
        }
        this.mLock.unlock();
    }

    private boolean yieldIfContendedHelper(boolean z, long j) {
        if (this.mLock.getQueueLength() == 0) {
            this.mLockAcquiredWallTime = SystemClock.elapsedRealtime();
            this.mLockAcquiredThreadTime = Debug.threadCpuTimeNanos();
            return false;
        }
        setTransactionSuccessful();
        SQLiteTransactionListener sQLiteTransactionListener = this.mTransactionListener;
        endTransaction();
        if (z && isDbLockedByCurrentThread()) {
            throw new IllegalStateException("Db locked more than once. yielfIfContended cannot yield");
        }
        if (j > 0) {
            while (j > 0) {
                try {
                    Thread.sleep(j < 1000 ? j : 1000);
                } catch (InterruptedException unused) {
                    Thread.interrupted();
                }
                j -= 1000;
                if (this.mLock.getQueueLength() == 0) {
                    break;
                }
            }
        }
        beginTransactionWithListener(sQLiteTransactionListener);
        return true;
    }

    /* Access modifiers changed, original: 0000 */
    public void addSQLiteClosable(SQLiteClosable sQLiteClosable) {
        lock();
        try {
            this.mPrograms.put(sQLiteClosable, null);
        } finally {
            unlock();
        }
    }

    /* Access modifiers changed, original: 0000 */
    /* JADX WARNING: Missing block: B:22:0x00a5, code skipped:
            return;
     */
    public void addToCompiledQueries(java.lang.String r4, net.sqlcipher.database.SQLiteCompiledSql r5) {
        /*
        r3 = this;
        r0 = r3.mMaxSqlCacheSize;
        if (r0 != 0) goto L_0x0028;
    L_0x0004:
        r5 = net.sqlcipher.database.SQLiteDebug.DEBUG_SQL_CACHE;
        if (r5 == 0) goto L_0x0027;
    L_0x0008:
        r5 = new java.lang.StringBuilder;
        r0 = "|NOT adding_sql_to_cache|";
        r5.<init>(r0);
        r0 = r3.getPath();
        r5.append(r0);
        r0 = "|";
        r5.append(r0);
        r5.append(r4);
        r4 = r5.toString();
        r5 = "Database";
        android.util.Log.v(r5, r4);
    L_0x0027:
        return;
    L_0x0028:
        r0 = r3.mCompiledQueries;
        monitor-enter(r0);
        r1 = r3.mCompiledQueries;	 Catch:{ all -> 0x00a6 }
        r1 = r1.get(r4);	 Catch:{ all -> 0x00a6 }
        r1 = (net.sqlcipher.database.SQLiteCompiledSql) r1;	 Catch:{ all -> 0x00a6 }
        if (r1 == 0) goto L_0x0037;
    L_0x0035:
        monitor-exit(r0);	 Catch:{ all -> 0x00a6 }
        return;
    L_0x0037:
        r1 = r3.mCompiledQueries;	 Catch:{ all -> 0x00a6 }
        r1 = r1.size();	 Catch:{ all -> 0x00a6 }
        r2 = r3.mMaxSqlCacheSize;	 Catch:{ all -> 0x00a6 }
        if (r1 != r2) goto L_0x006e;
    L_0x0041:
        r5 = r3.mCacheFullWarnings;	 Catch:{ all -> 0x00a6 }
        r1 = 1;
        r5 = r5 + r1;
        r3.mCacheFullWarnings = r5;	 Catch:{ all -> 0x00a6 }
        if (r5 != r1) goto L_0x00a4;
    L_0x0049:
        r5 = "Database";
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00a6 }
        r2 = "Reached MAX size for compiled-sql statement cache for database ";
        r1.<init>(r2);	 Catch:{ all -> 0x00a6 }
        r2 = r3.getPath();	 Catch:{ all -> 0x00a6 }
        r1.append(r2);	 Catch:{ all -> 0x00a6 }
        r2 = "; i.e., NO space for this sql statement in cache: ";
        r1.append(r2);	 Catch:{ all -> 0x00a6 }
        r1.append(r4);	 Catch:{ all -> 0x00a6 }
        r4 = ". Please change your sql statements to use '?' for bindargs, instead of using actual values";
        r1.append(r4);	 Catch:{ all -> 0x00a6 }
        r4 = r1.toString();	 Catch:{ all -> 0x00a6 }
        android.util.Log.w(r5, r4);	 Catch:{ all -> 0x00a6 }
        goto L_0x00a4;
    L_0x006e:
        r1 = r3.mCompiledQueries;	 Catch:{ all -> 0x00a6 }
        r1.put(r4, r5);	 Catch:{ all -> 0x00a6 }
        r5 = net.sqlcipher.database.SQLiteDebug.DEBUG_SQL_CACHE;	 Catch:{ all -> 0x00a6 }
        if (r5 == 0) goto L_0x00a4;
    L_0x0077:
        r5 = "Database";
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00a6 }
        r2 = "|adding_sql_to_cache|";
        r1.<init>(r2);	 Catch:{ all -> 0x00a6 }
        r2 = r3.getPath();	 Catch:{ all -> 0x00a6 }
        r1.append(r2);	 Catch:{ all -> 0x00a6 }
        r2 = "|";
        r1.append(r2);	 Catch:{ all -> 0x00a6 }
        r2 = r3.mCompiledQueries;	 Catch:{ all -> 0x00a6 }
        r2 = r2.size();	 Catch:{ all -> 0x00a6 }
        r1.append(r2);	 Catch:{ all -> 0x00a6 }
        r2 = "|";
        r1.append(r2);	 Catch:{ all -> 0x00a6 }
        r1.append(r4);	 Catch:{ all -> 0x00a6 }
        r4 = r1.toString();	 Catch:{ all -> 0x00a6 }
        android.util.Log.v(r5, r4);	 Catch:{ all -> 0x00a6 }
    L_0x00a4:
        monitor-exit(r0);	 Catch:{ all -> 0x00a6 }
        return;
    L_0x00a6:
        r4 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x00a6 }
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: net.sqlcipher.database.SQLiteDatabase.addToCompiledQueries(java.lang.String, net.sqlcipher.database.SQLiteCompiledSql):void");
    }

    public void beginTransaction() {
        beginTransactionWithListener(null);
    }

    public void beginTransactionNonExclusive() {
        beginTransactionWithListenerInternal(null, SQLiteDatabaseTransactionType.Immediate);
    }

    public void beginTransactionWithListener(SQLiteTransactionListener sQLiteTransactionListener) {
        beginTransactionWithListenerInternal(sQLiteTransactionListener, SQLiteDatabaseTransactionType.Exclusive);
    }

    public void beginTransactionWithListenerNonExclusive(SQLiteTransactionListener sQLiteTransactionListener) {
        beginTransactionWithListenerInternal(sQLiteTransactionListener, SQLiteDatabaseTransactionType.Immediate);
    }

    public void changePassword(String str) {
        if (!isOpen()) {
            throw new SQLiteException("database not open");
        } else if (str != null) {
            rekey(getBytes(str.toCharArray()));
        }
    }

    public void changePassword(char[] cArr) {
        if (!isOpen()) {
            throw new SQLiteException("database not open");
        } else if (cArr != null) {
            rekey(getBytes(cArr));
        }
    }

    public void close() {
        if (isOpen()) {
            lock();
            try {
                closeClosable();
                onAllReferencesReleased();
            } finally {
                unlock();
            }
        }
    }

    public SQLiteStatement compileStatement(String str) {
        lock();
        SQLiteStatement isOpen = isOpen();
        if (isOpen == true) {
            try {
                isOpen = new SQLiteStatement(this, str);
                return isOpen;
            } finally {
                unlock();
            }
        } else {
            throw new IllegalStateException("database not open");
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:30:0x0069 in {6, 7, 12, 15, 17, 23, 25, 27, 29} preds:[]
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
    public int delete(java.lang.String r4, java.lang.String r5, java.lang.String[] r6) {
        /*
        r3 = this;
        r3.lock();
        r0 = r3.isOpen();
        if (r0 == 0) goto L_0x0061;
        r0 = 0;
        r1 = new java.lang.StringBuilder;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0053 }
        r2 = "DELETE FROM ";	 Catch:{ SQLiteDatabaseCorruptException -> 0x0053 }
        r1.<init>(r2);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0053 }
        r1.append(r4);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0053 }
        r4 = android.text.TextUtils.isEmpty(r5);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0053 }
        if (r4 != 0) goto L_0x0025;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0053 }
        r4 = " WHERE ";	 Catch:{ SQLiteDatabaseCorruptException -> 0x0053 }
        r5 = java.lang.String.valueOf(r5);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0053 }
        r4 = r4.concat(r5);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0053 }
        goto L_0x0027;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0053 }
        r4 = "";	 Catch:{ SQLiteDatabaseCorruptException -> 0x0053 }
        r1.append(r4);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0053 }
        r4 = r1.toString();	 Catch:{ SQLiteDatabaseCorruptException -> 0x0053 }
        r0 = r3.compileStatement(r4);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0053 }
        if (r6 == 0) goto L_0x0041;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0053 }
        r4 = r6.length;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0053 }
        r5 = 0;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0053 }
        if (r5 >= r4) goto L_0x0041;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0053 }
        r1 = r5 + 1;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0053 }
        r5 = r6[r5];	 Catch:{ SQLiteDatabaseCorruptException -> 0x0053 }
        net.sqlcipher.DatabaseUtils.bindObjectToProgram(r0, r1, r5);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0053 }
        r5 = r1;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0053 }
        goto L_0x0036;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0053 }
        r0.execute();	 Catch:{ SQLiteDatabaseCorruptException -> 0x0053 }
        r4 = r3.lastChangeCount();	 Catch:{ SQLiteDatabaseCorruptException -> 0x0053 }
        if (r0 == 0) goto L_0x004d;
        r0.close();
        r3.unlock();
        return r4;
        r4 = move-exception;
        goto L_0x0058;
        r4 = move-exception;
        r3.onCorruption();	 Catch:{ all -> 0x0051 }
        throw r4;	 Catch:{ all -> 0x0051 }
        if (r0 == 0) goto L_0x005d;
        r0.close();
        r3.unlock();
        throw r4;
        r4 = new java.lang.IllegalStateException;
        r5 = "database not open";
        r4.<init>(r5);
        throw r4;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: net.sqlcipher.database.SQLiteDatabase.delete(java.lang.String, java.lang.String, java.lang.String[]):int");
    }

    public void disableWriteAheadLogging() {
        if (inTransaction()) {
            throw new IllegalStateException("Write Ahead Logging cannot be disabled while in a transaction");
        }
        rawExecSQL("PRAGMA journal_mode = DELETE;");
    }

    public boolean enableWriteAheadLogging() {
        if (inTransaction()) {
            throw new IllegalStateException("Write Ahead Logging cannot be enabled while in a transaction");
        }
        ArrayList attachedDbs = getAttachedDbs(this);
        if ((attachedDbs != null && attachedDbs.size() > 1) || isReadOnly() || getPath().equals(":memory:")) {
            return false;
        }
        rawExecSQL("PRAGMA journal_mode = WAL;");
        return true;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:47:0x0073 in {8, 9, 14, 21, 23, 26, 27, 31, 35, 36, 39, 42, 44, 46} preds:[]
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
    public void endTransaction() {
        /*
        r4 = this;
        r0 = r4.isOpen();
        if (r0 == 0) goto L_0x006b;
        r0 = r4.mLock;
        r0 = r0.isHeldByCurrentThread();
        if (r0 == 0) goto L_0x0063;
        r0 = 0;
        r1 = r4.mInnerTransactionIsSuccessful;	 Catch:{ all -> 0x005c }
        r2 = 0;	 Catch:{ all -> 0x005c }
        if (r1 == 0) goto L_0x0017;	 Catch:{ all -> 0x005c }
        r4.mInnerTransactionIsSuccessful = r2;	 Catch:{ all -> 0x005c }
        goto L_0x0019;	 Catch:{ all -> 0x005c }
        r4.mTransactionIsSuccessful = r2;	 Catch:{ all -> 0x005c }
        r1 = r4.mLock;	 Catch:{ all -> 0x005c }
        r1 = r1.getHoldCount();	 Catch:{ all -> 0x005c }
        r3 = 1;
        if (r1 == r3) goto L_0x0028;
        r4.mTransactionListener = r0;
        r4.unlockForced();
        return;
        r1 = r4.mTransactionListener;	 Catch:{ all -> 0x005c }
        if (r1 == 0) goto L_0x0040;
        r1 = r4.mTransactionIsSuccessful;	 Catch:{ RuntimeException -> 0x003c }
        if (r1 == 0) goto L_0x0036;	 Catch:{ RuntimeException -> 0x003c }
        r1 = r4.mTransactionListener;	 Catch:{ RuntimeException -> 0x003c }
        r1.onCommit();	 Catch:{ RuntimeException -> 0x003c }
        goto L_0x0040;	 Catch:{ RuntimeException -> 0x003c }
        r1 = r4.mTransactionListener;	 Catch:{ RuntimeException -> 0x003c }
        r1.onRollback();	 Catch:{ RuntimeException -> 0x003c }
        goto L_0x0040;
        r1 = move-exception;
        r4.mTransactionIsSuccessful = r2;	 Catch:{ all -> 0x005c }
        goto L_0x0041;	 Catch:{ all -> 0x005c }
        r1 = r0;	 Catch:{ all -> 0x005c }
        r2 = r4.mTransactionIsSuccessful;	 Catch:{ all -> 0x005c }
        if (r2 == 0) goto L_0x004b;	 Catch:{ all -> 0x005c }
        r1 = "COMMIT;";	 Catch:{ all -> 0x005c }
        r4.execSQL(r1);	 Catch:{ all -> 0x005c }
        goto L_0x0022;
        r2 = "ROLLBACK;";	 Catch:{ SQLException -> 0x0054 }
        r4.execSQL(r2);	 Catch:{ SQLException -> 0x0054 }
        if (r1 != 0) goto L_0x0053;	 Catch:{ SQLException -> 0x0054 }
        goto L_0x0022;	 Catch:{ SQLException -> 0x0054 }
        throw r1;	 Catch:{ SQLException -> 0x0054 }
    L_0x0054:
        r1 = "Database";	 Catch:{ all -> 0x005c }
        r2 = "exception during rollback, maybe the DB previously performed an auto-rollback";	 Catch:{ all -> 0x005c }
        android.util.Log.d(r1, r2);	 Catch:{ all -> 0x005c }
        goto L_0x0022;
        r1 = move-exception;
        r4.mTransactionListener = r0;
        r4.unlockForced();
        throw r1;
        r0 = new java.lang.IllegalStateException;
        r1 = "no transaction pending";
        r0.<init>(r1);
        throw r0;
        r0 = new java.lang.IllegalStateException;
        r1 = "database not open";
        r0.<init>(r1);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: net.sqlcipher.database.SQLiteDatabase.endTransaction():void");
    }

    public void execSQL(String str) {
        SystemClock.uptimeMillis();
        lock();
        if (isOpen()) {
            try {
                native_execSQL(str);
                unlock();
            } catch (SQLiteDatabaseCorruptException e) {
                onCorruption();
                throw e;
            } catch (Throwable th) {
                unlock();
            }
        } else {
            throw new IllegalStateException("database not open");
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:29:0x004e in {9, 12, 14, 20, 22, 24, 26, 28} preds:[]
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
    public void execSQL(java.lang.String r4, java.lang.Object[] r5) {
        /*
        r3 = this;
        if (r5 == 0) goto L_0x0046;
        android.os.SystemClock.uptimeMillis();
        r3.lock();
        r0 = r3.isOpen();
        if (r0 == 0) goto L_0x003e;
        r0 = 0;
        r0 = r3.compileStatement(r4);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0030 }
        if (r5 == 0) goto L_0x0022;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0030 }
        r4 = r5.length;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0030 }
        r1 = 0;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0030 }
        if (r1 >= r4) goto L_0x0022;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0030 }
        r2 = r1 + 1;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0030 }
        r1 = r5[r1];	 Catch:{ SQLiteDatabaseCorruptException -> 0x0030 }
        net.sqlcipher.DatabaseUtils.bindObjectToProgram(r0, r2, r1);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0030 }
        r1 = r2;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0030 }
        goto L_0x0017;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0030 }
        r0.execute();	 Catch:{ SQLiteDatabaseCorruptException -> 0x0030 }
        if (r0 == 0) goto L_0x002a;
        r0.close();
        r3.unlock();
        return;
        r4 = move-exception;
        goto L_0x0035;
        r4 = move-exception;
        r3.onCorruption();	 Catch:{ all -> 0x002e }
        throw r4;	 Catch:{ all -> 0x002e }
        if (r0 == 0) goto L_0x003a;
        r0.close();
        r3.unlock();
        throw r4;
        r4 = new java.lang.IllegalStateException;
        r5 = "database not open";
        r4.<init>(r5);
        throw r4;
        r4 = new java.lang.IllegalArgumentException;
        r5 = "Empty bindArgs";
        r4.<init>(r5);
        throw r4;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: net.sqlcipher.database.SQLiteDatabase.execSQL(java.lang.String, java.lang.Object[]):void");
    }

    /* Access modifiers changed, original: protected */
    public void finalize() {
        if (isOpen()) {
            StringBuilder stringBuilder = new StringBuilder("close() was never explicitly called on database '");
            stringBuilder.append(this.mPath);
            stringBuilder.append("' ");
            Log.e(TAG, stringBuilder.toString(), this.mStackTrace);
            closeClosable();
            onAllReferencesReleased();
        }
    }

    public List<Pair<String, String>> getAttachedDbs() {
        return getAttachedDbs(this);
    }

    /* Access modifiers changed, original: 0000 */
    /* JADX WARNING: Missing block: B:16:0x0034, code skipped:
            if (r3 == false) goto L_0x003c;
     */
    /* JADX WARNING: Missing block: B:17:0x0036, code skipped:
            r4.mNumCacheHits++;
     */
    /* JADX WARNING: Missing block: B:18:0x003c, code skipped:
            r4.mNumCacheMisses++;
     */
    /* JADX WARNING: Missing block: B:20:0x0043, code skipped:
            if (net.sqlcipher.database.SQLiteDebug.DEBUG_SQL_CACHE == false) goto L_0x00a2;
     */
    /* JADX WARNING: Missing block: B:21:0x0045, code skipped:
            r0 = new java.lang.StringBuilder("|cache_stats|");
            r0.append(getPath());
            r0.append("|");
            r0.append(r4.mCompiledQueries.size());
            r0.append("|");
            r0.append(r4.mNumCacheHits);
            r0.append("|");
            r0.append(r4.mNumCacheMisses);
            r0.append("|");
            r0.append(r3);
            r0.append("|");
            r0.append(r4.mTimeOpened);
            r0.append("|");
            r0.append(r4.mTimeClosed);
            r0.append("|");
            r0.append(r5);
            android.util.Log.v(TAG, r0.toString());
     */
    /* JADX WARNING: Missing block: B:22:0x00a2, code skipped:
            return r1;
     */
    public net.sqlcipher.database.SQLiteCompiledSql getCompiledStatementForSql(java.lang.String r5) {
        /*
        r4 = this;
        r0 = r4.mCompiledQueries;
        monitor-enter(r0);
        r1 = r4.mMaxSqlCacheSize;	 Catch:{ all -> 0x00a3 }
        if (r1 != 0) goto L_0x0025;
    L_0x0007:
        r5 = net.sqlcipher.database.SQLiteDebug.DEBUG_SQL_CACHE;	 Catch:{ all -> 0x00a3 }
        if (r5 == 0) goto L_0x0022;
    L_0x000b:
        r5 = "Database";
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00a3 }
        r2 = "|cache NOT found|";
        r1.<init>(r2);	 Catch:{ all -> 0x00a3 }
        r2 = r4.getPath();	 Catch:{ all -> 0x00a3 }
        r1.append(r2);	 Catch:{ all -> 0x00a3 }
        r1 = r1.toString();	 Catch:{ all -> 0x00a3 }
        android.util.Log.v(r5, r1);	 Catch:{ all -> 0x00a3 }
    L_0x0022:
        r5 = 0;
        monitor-exit(r0);	 Catch:{ all -> 0x00a3 }
        return r5;
    L_0x0025:
        r1 = r4.mCompiledQueries;	 Catch:{ all -> 0x00a3 }
        r1 = r1.get(r5);	 Catch:{ all -> 0x00a3 }
        r1 = (net.sqlcipher.database.SQLiteCompiledSql) r1;	 Catch:{ all -> 0x00a3 }
        r2 = 1;
        if (r1 == 0) goto L_0x0032;
    L_0x0030:
        r3 = 1;
        goto L_0x0033;
    L_0x0032:
        r3 = 0;
    L_0x0033:
        monitor-exit(r0);	 Catch:{ all -> 0x00a3 }
        if (r3 == 0) goto L_0x003c;
    L_0x0036:
        r0 = r4.mNumCacheHits;
        r0 = r0 + r2;
        r4.mNumCacheHits = r0;
        goto L_0x0041;
    L_0x003c:
        r0 = r4.mNumCacheMisses;
        r0 = r0 + r2;
        r4.mNumCacheMisses = r0;
    L_0x0041:
        r0 = net.sqlcipher.database.SQLiteDebug.DEBUG_SQL_CACHE;
        if (r0 == 0) goto L_0x00a2;
    L_0x0045:
        r0 = new java.lang.StringBuilder;
        r2 = "|cache_stats|";
        r0.<init>(r2);
        r2 = r4.getPath();
        r0.append(r2);
        r2 = "|";
        r0.append(r2);
        r2 = r4.mCompiledQueries;
        r2 = r2.size();
        r0.append(r2);
        r2 = "|";
        r0.append(r2);
        r2 = r4.mNumCacheHits;
        r0.append(r2);
        r2 = "|";
        r0.append(r2);
        r2 = r4.mNumCacheMisses;
        r0.append(r2);
        r2 = "|";
        r0.append(r2);
        r0.append(r3);
        r2 = "|";
        r0.append(r2);
        r2 = r4.mTimeOpened;
        r0.append(r2);
        r2 = "|";
        r0.append(r2);
        r2 = r4.mTimeClosed;
        r0.append(r2);
        r2 = "|";
        r0.append(r2);
        r0.append(r5);
        r5 = r0.toString();
        r0 = "Database";
        android.util.Log.v(r0, r5);
    L_0x00a2:
        return r1;
    L_0x00a3:
        r5 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x00a3 }
        throw r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: net.sqlcipher.database.SQLiteDatabase.getCompiledStatementForSql(java.lang.String):net.sqlcipher.database.SQLiteCompiledSql");
    }

    public synchronized int getMaxSqlCacheSize() {
        return this.mMaxSqlCacheSize;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0029  */
    public long getMaximumSize() {
        /*
        r7 = this;
        r7.lock();
        r0 = r7.isOpen();
        if (r0 == 0) goto L_0x0030;
    L_0x0009:
        r0 = 0;
        r1 = new net.sqlcipher.database.SQLiteStatement;	 Catch:{ all -> 0x0026 }
        r2 = "PRAGMA max_page_count;";
        r1.<init>(r7, r2);	 Catch:{ all -> 0x0026 }
        r2 = r1.simpleQueryForLong();	 Catch:{ all -> 0x0021 }
        r4 = r7.getPageSize();	 Catch:{ all -> 0x0021 }
        r2 = r2 * r4;
        r1.close();
        r7.unlock();
        return r2;
    L_0x0021:
        r0 = move-exception;
        r6 = r1;
        r1 = r0;
        r0 = r6;
        goto L_0x0027;
    L_0x0026:
        r1 = move-exception;
    L_0x0027:
        if (r0 == 0) goto L_0x002c;
    L_0x0029:
        r0.close();
    L_0x002c:
        r7.unlock();
        throw r1;
    L_0x0030:
        r0 = new java.lang.IllegalStateException;
        r1 = "database not open";
        r0.<init>(r1);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: net.sqlcipher.database.SQLiteDatabase.getMaximumSize():long");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0024  */
    public long getPageSize() {
        /*
        r5 = this;
        r5.lock();
        r0 = r5.isOpen();
        if (r0 == 0) goto L_0x002b;
    L_0x0009:
        r0 = 0;
        r1 = new net.sqlcipher.database.SQLiteStatement;	 Catch:{ all -> 0x0021 }
        r2 = "PRAGMA page_size;";
        r1.<init>(r5, r2);	 Catch:{ all -> 0x0021 }
        r2 = r1.simpleQueryForLong();	 Catch:{ all -> 0x001c }
        r1.close();
        r5.unlock();
        return r2;
    L_0x001c:
        r0 = move-exception;
        r4 = r1;
        r1 = r0;
        r0 = r4;
        goto L_0x0022;
    L_0x0021:
        r1 = move-exception;
    L_0x0022:
        if (r0 == 0) goto L_0x0027;
    L_0x0024:
        r0.close();
    L_0x0027:
        r5.unlock();
        throw r1;
    L_0x002b:
        r0 = new java.lang.IllegalStateException;
        r1 = "database not open";
        r0.<init>(r1);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: net.sqlcipher.database.SQLiteDatabase.getPageSize():long");
    }

    public final String getPath() {
        return this.mPath;
    }

    public SQLiteQueryStats getQueryStats(String str, Object[] objArr) {
        try {
            execSQL(String.format("CREATE TABLE tempstat AS %s", new Object[]{str}), objArr);
            Cursor rawQuery = rawQuery("SELECT sum(payload) FROM dbstat WHERE name = 'tempstat';", new Object[0]);
            if (rawQuery == null) {
                return new SQLiteQueryStats(0, 0);
            }
            rawQuery.moveToFirst();
            long j = rawQuery.getLong(0);
            rawQuery.close();
            rawQuery = rawQuery("SELECT max(mx_payload) FROM dbstat WHERE name = 'tempstat';", new Object[0]);
            if (rawQuery == null) {
                return new SQLiteQueryStats(j, 0);
            }
            rawQuery.moveToFirst();
            long j2 = rawQuery.getLong(0);
            rawQuery.close();
            execSQL("DROP TABLE tempstat;");
            return new SQLiteQueryStats(j, j2);
        } catch (Exception e) {
            execSQL("DROP TABLE IF EXISTS tempstat;");
            throw e;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:14:0x0035 in {8, 10, 13} preds:[]
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
    public java.util.Map<java.lang.String, java.lang.String> getSyncedTables() {
        /*
        r6 = this;
        r0 = r6.mSyncUpdateInfo;
        monitor-enter(r0);
        r1 = new java.util.HashMap;	 Catch:{ all -> 0x0032 }
        r1.<init>();	 Catch:{ all -> 0x0032 }
        r2 = r6.mSyncUpdateInfo;	 Catch:{ all -> 0x0032 }
        r2 = r2.keySet();	 Catch:{ all -> 0x0032 }
        r2 = r2.iterator();	 Catch:{ all -> 0x0032 }
        r3 = r2.hasNext();	 Catch:{ all -> 0x0032 }
        if (r3 == 0) goto L_0x0030;	 Catch:{ all -> 0x0032 }
        r3 = r2.next();	 Catch:{ all -> 0x0032 }
        r3 = (java.lang.String) r3;	 Catch:{ all -> 0x0032 }
        r4 = r6.mSyncUpdateInfo;	 Catch:{ all -> 0x0032 }
        r4 = r4.get(r3);	 Catch:{ all -> 0x0032 }
        r4 = (net.sqlcipher.database.SQLiteDatabase.SyncUpdateInfo) r4;	 Catch:{ all -> 0x0032 }
        r5 = r4.deletedTable;	 Catch:{ all -> 0x0032 }
        if (r5 == 0) goto L_0x0012;	 Catch:{ all -> 0x0032 }
        r4 = r4.deletedTable;	 Catch:{ all -> 0x0032 }
        r1.put(r3, r4);	 Catch:{ all -> 0x0032 }
        goto L_0x0012;	 Catch:{ all -> 0x0032 }
        monitor-exit(r0);	 Catch:{ all -> 0x0032 }
        return r1;	 Catch:{ all -> 0x0032 }
        r1 = move-exception;	 Catch:{ all -> 0x0032 }
        monitor-exit(r0);	 Catch:{ all -> 0x0032 }
        throw r1;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: net.sqlcipher.database.SQLiteDatabase.getSyncedTables():java.util.Map");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0025  */
    public int getVersion() {
        /*
        r5 = this;
        r5.lock();
        r0 = r5.isOpen();
        if (r0 == 0) goto L_0x002c;
    L_0x0009:
        r0 = 0;
        r1 = new net.sqlcipher.database.SQLiteStatement;	 Catch:{ all -> 0x0022 }
        r2 = "PRAGMA user_version;";
        r1.<init>(r5, r2);	 Catch:{ all -> 0x0022 }
        r2 = r1.simpleQueryForLong();	 Catch:{ all -> 0x001d }
        r0 = (int) r2;
        r1.close();
        r5.unlock();
        return r0;
    L_0x001d:
        r0 = move-exception;
        r4 = r1;
        r1 = r0;
        r0 = r4;
        goto L_0x0023;
    L_0x0022:
        r1 = move-exception;
    L_0x0023:
        if (r0 == 0) goto L_0x0028;
    L_0x0025:
        r0.close();
    L_0x0028:
        r5.unlock();
        throw r1;
    L_0x002c:
        r0 = new java.lang.IllegalStateException;
        r1 = "database not open";
        r0.<init>(r1);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: net.sqlcipher.database.SQLiteDatabase.getVersion():int");
    }

    public boolean inTransaction() {
        return this.mLock.getHoldCount() > 0;
    }

    public long insert(String str, String str2, ContentValues contentValues) {
        Object str3;
        try {
            str3 = insertWithOnConflict(str3, str2, contentValues, 0);
            return str3;
        } catch (SQLException e) {
            Log.e(TAG, "Error inserting <redacted values> into ".concat(String.valueOf(str3)), e);
            return -1;
        }
    }

    public long insertOrThrow(String str, String str2, ContentValues contentValues) {
        return insertWithOnConflict(str, str2, contentValues, 0);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:49:0x0120 in {10, 11, 12, 13, 20, 24, 25, 29, 32, 34, 36, 42, 44, 46, 48} preds:[]
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
    public long insertWithOnConflict(java.lang.String r6, java.lang.String r7, android.content.ContentValues r8, int r9) {
        /*
        r5 = this;
        r0 = r5.isOpen();
        if (r0 == 0) goto L_0x0118;
        r0 = new java.lang.StringBuilder;
        r1 = 152; // 0x98 float:2.13E-43 double:7.5E-322;
        r0.<init>(r1);
        r1 = "INSERT";
        r0.append(r1);
        r1 = CONFLICT_VALUES;
        r9 = r1[r9];
        r0.append(r9);
        r9 = " INTO ";
        r0.append(r9);
        r0.append(r6);
        r9 = new java.lang.StringBuilder;
        r1 = 40;
        r9.<init>(r1);
        r2 = 0;
        r3 = 0;
        if (r8 == 0) goto L_0x006a;
        r4 = r8.size();
        if (r4 <= 0) goto L_0x006a;
        r7 = r8.valueSet();
        r8 = r7.iterator();
        r0.append(r1);
        r1 = 0;
        r4 = r8.hasNext();
        if (r4 == 0) goto L_0x0064;
        if (r1 == 0) goto L_0x004e;
        r1 = ", ";
        r0.append(r1);
        r9.append(r1);
        r1 = r8.next();
        r1 = (java.util.Map.Entry) r1;
        r1 = r1.getKey();
        r1 = (java.lang.String) r1;
        r0.append(r1);
        r1 = 63;
        r9.append(r1);
        r1 = 1;
        goto L_0x003e;
        r8 = 41;
        r0.append(r8);
        goto L_0x0086;
        r8 = new java.lang.StringBuilder;
        r1 = "(";
        r8.<init>(r1);
        r8.append(r7);
        r7 = ") ";
        r8.append(r7);
        r7 = r8.toString();
        r0.append(r7);
        r7 = "NULL";
        r9.append(r7);
        r7 = r3;
        r8 = " VALUES(";
        r0.append(r8);
        r0.append(r9);
        r8 = ");";
        r0.append(r8);
        r5.lock();
        r8 = r0.toString();	 Catch:{ SQLiteDatabaseCorruptException -> 0x010a }
        r3 = r5.compileStatement(r8);	 Catch:{ SQLiteDatabaseCorruptException -> 0x010a }
        if (r7 == 0) goto L_0x00ba;	 Catch:{ SQLiteDatabaseCorruptException -> 0x010a }
        r8 = r7.size();	 Catch:{ SQLiteDatabaseCorruptException -> 0x010a }
        r7 = r7.iterator();	 Catch:{ SQLiteDatabaseCorruptException -> 0x010a }
        if (r2 >= r8) goto L_0x00ba;	 Catch:{ SQLiteDatabaseCorruptException -> 0x010a }
        r9 = r7.next();	 Catch:{ SQLiteDatabaseCorruptException -> 0x010a }
        r9 = (java.util.Map.Entry) r9;	 Catch:{ SQLiteDatabaseCorruptException -> 0x010a }
        r2 = r2 + 1;	 Catch:{ SQLiteDatabaseCorruptException -> 0x010a }
        r9 = r9.getValue();	 Catch:{ SQLiteDatabaseCorruptException -> 0x010a }
        net.sqlcipher.DatabaseUtils.bindObjectToProgram(r3, r2, r9);	 Catch:{ SQLiteDatabaseCorruptException -> 0x010a }
        goto L_0x00a8;	 Catch:{ SQLiteDatabaseCorruptException -> 0x010a }
        r3.execute();	 Catch:{ SQLiteDatabaseCorruptException -> 0x010a }
        r7 = r5.lastChangeCount();	 Catch:{ SQLiteDatabaseCorruptException -> 0x010a }
        r8 = -1;	 Catch:{ SQLiteDatabaseCorruptException -> 0x010a }
        if (r7 <= 0) goto L_0x00ca;	 Catch:{ SQLiteDatabaseCorruptException -> 0x010a }
        r0 = r5.lastInsertRow();	 Catch:{ SQLiteDatabaseCorruptException -> 0x010a }
        goto L_0x00cb;
        r0 = r8;
        r7 = "Database";
        r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1));
        if (r2 != 0) goto L_0x00df;
        r8 = "Error inserting <redacted values> using <redacted sql> into ";	 Catch:{ SQLiteDatabaseCorruptException -> 0x010a }
        r6 = java.lang.String.valueOf(r6);	 Catch:{ SQLiteDatabaseCorruptException -> 0x010a }
        r6 = r8.concat(r6);	 Catch:{ SQLiteDatabaseCorruptException -> 0x010a }
        android.util.Log.e(r7, r6);	 Catch:{ SQLiteDatabaseCorruptException -> 0x010a }
        goto L_0x00ff;	 Catch:{ SQLiteDatabaseCorruptException -> 0x010a }
        r8 = 2;	 Catch:{ SQLiteDatabaseCorruptException -> 0x010a }
        r8 = android.util.Log.isLoggable(r7, r8);	 Catch:{ SQLiteDatabaseCorruptException -> 0x010a }
        if (r8 == 0) goto L_0x00ff;	 Catch:{ SQLiteDatabaseCorruptException -> 0x010a }
        r8 = new java.lang.StringBuilder;	 Catch:{ SQLiteDatabaseCorruptException -> 0x010a }
        r9 = "Inserting row ";	 Catch:{ SQLiteDatabaseCorruptException -> 0x010a }
        r8.<init>(r9);	 Catch:{ SQLiteDatabaseCorruptException -> 0x010a }
        r8.append(r0);	 Catch:{ SQLiteDatabaseCorruptException -> 0x010a }
        r9 = " from <redacted values> using <redacted sql> into ";	 Catch:{ SQLiteDatabaseCorruptException -> 0x010a }
        r8.append(r9);	 Catch:{ SQLiteDatabaseCorruptException -> 0x010a }
        r8.append(r6);	 Catch:{ SQLiteDatabaseCorruptException -> 0x010a }
        r6 = r8.toString();	 Catch:{ SQLiteDatabaseCorruptException -> 0x010a }
        android.util.Log.v(r7, r6);	 Catch:{ SQLiteDatabaseCorruptException -> 0x010a }
        if (r3 == 0) goto L_0x0104;
        r3.close();
        r5.unlock();
        return r0;
        r6 = move-exception;
        goto L_0x010f;
        r6 = move-exception;
        r5.onCorruption();	 Catch:{ all -> 0x0108 }
        throw r6;	 Catch:{ all -> 0x0108 }
        if (r3 == 0) goto L_0x0114;
        r3.close();
        r5.unlock();
        throw r6;
        r6 = new java.lang.IllegalStateException;
        r7 = "database not open";
        r6.<init>(r7);
        throw r6;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: net.sqlcipher.database.SQLiteDatabase.insertWithOnConflict(java.lang.String, java.lang.String, android.content.ContentValues, int):long");
    }

    public boolean isDatabaseIntegrityOk() {
        Pair resultFromPragma = getResultFromPragma("PRAGMA integrity_check;");
        return ((Boolean) resultFromPragma.first).booleanValue() ? ((String) resultFromPragma.second).equals("ok") : ((Boolean) resultFromPragma.first).booleanValue();
    }

    public boolean isDbLockedByCurrentThread() {
        return this.mLock.isHeldByCurrentThread();
    }

    public boolean isDbLockedByOtherThreads() {
        return !this.mLock.isHeldByCurrentThread() && this.mLock.isLocked();
    }

    public boolean isInCompiledSqlCache(String str) {
        boolean containsKey;
        synchronized (this.mCompiledQueries) {
            containsKey = this.mCompiledQueries.containsKey(str);
        }
        return containsKey;
    }

    public boolean isOpen() {
        return this.mNativeHandle != 0;
    }

    public boolean isReadOnly() {
        return (this.mFlags & 1) == 1;
    }

    public boolean isWriteAheadLoggingEnabled() {
        Pair resultFromPragma = getResultFromPragma("PRAGMA journal_mode;");
        return ((Boolean) resultFromPragma.first).booleanValue() ? ((String) resultFromPragma.second).equals("wal") : ((Boolean) resultFromPragma.first).booleanValue();
    }

    public native int lastChangeCount();

    public native long lastInsertRow();

    /* Access modifiers changed, original: 0000 */
    public void lock() {
        if (this.mLockingEnabled) {
            this.mLock.lock();
            if (SQLiteDebug.DEBUG_LOCK_TIME_TRACKING && this.mLock.getHoldCount() == 1) {
                this.mLockAcquiredWallTime = SystemClock.elapsedRealtime();
                this.mLockAcquiredThreadTime = Debug.threadCpuTimeNanos();
            }
        }
    }

    public void markTableSyncable(String str, String str2) {
        if (isOpen()) {
            markTableSyncable(str, "_id", str, str2);
            return;
        }
        throw new SQLiteException("database not open");
    }

    public void markTableSyncable(String str, String str2, String str3) {
        if (isOpen()) {
            markTableSyncable(str, str2, str3, null);
            return;
        }
        throw new SQLiteException("database not open");
    }

    public native void native_execSQL(String str);

    public native void native_setLocale(String str, int i);

    public boolean needUpgrade(int i) {
        return i > getVersion();
    }

    /* Access modifiers changed, original: protected */
    public void onAllReferencesReleased() {
        if (isOpen()) {
            if (SQLiteDebug.DEBUG_SQL_CACHE) {
                this.mTimeClosed = getTime();
            }
            dbclose();
            synchronized (sActiveDatabases) {
                sActiveDatabases.remove(this);
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void onCorruption() {
        StringBuilder stringBuilder = new StringBuilder("Calling error handler for corrupt database (detected) ");
        stringBuilder.append(this.mPath);
        Log.e(TAG, stringBuilder.toString());
        this.mErrorHandler.onCorruption(this);
    }

    public void purgeFromCompiledSqlCache(String str) {
        synchronized (this.mCompiledQueries) {
            this.mCompiledQueries.remove(str);
        }
    }

    public Cursor query(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
        return query(false, str, strArr, str2, strArr2, str3, str4, str5, null);
    }

    public Cursor query(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, String str6) {
        return query(false, str, strArr, str2, strArr2, str3, str4, str5, str6);
    }

    public Cursor query(boolean z, String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, String str6) {
        return queryWithFactory(null, z, str, strArr, str2, strArr2, str3, str4, str5, str6);
    }

    public Cursor queryWithFactory(CursorFactory cursorFactory, boolean z, String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, String str6) {
        if (isOpen()) {
            CursorFactory cursorFactory2 = cursorFactory;
            String[] strArr3 = strArr2;
            return rawQueryWithFactory(cursorFactory, SQLiteQueryBuilder.buildQueryString(z, str, strArr, str2, str3, str4, str5, str6), strArr2, findEditTable(str));
        }
        throw new IllegalStateException("database not open");
    }

    public void rawExecSQL(String str) {
        SystemClock.uptimeMillis();
        lock();
        if (isOpen()) {
            try {
                native_rawExecSQL(str);
                unlock();
            } catch (SQLiteDatabaseCorruptException e) {
                onCorruption();
                throw e;
            } catch (Throwable th) {
                unlock();
            }
        } else {
            throw new IllegalStateException("database not open");
        }
    }

    public Cursor rawQuery(String str, Object[] objArr) {
        String str2 = " ms): ";
        String str3 = "query (";
        String str4 = TAG;
        if (isOpen()) {
            long j = 0;
            int i = -1;
            if (this.mSlowQueryThreshold != -1) {
                j = System.currentTimeMillis();
            }
            SQLiteDirectCursorDriver sQLiteDirectCursorDriver = new SQLiteDirectCursorDriver(this, str, null);
            StringBuilder stringBuilder;
            try {
                Cursor query = sQLiteDirectCursorDriver.query(this.mFactory, objArr);
                if (this.mSlowQueryThreshold != -1) {
                    if (query != null) {
                        i = query.getCount();
                    }
                    long currentTimeMillis = System.currentTimeMillis() - j;
                    if (currentTimeMillis >= ((long) this.mSlowQueryThreshold)) {
                        stringBuilder = new StringBuilder(str3);
                        stringBuilder.append(currentTimeMillis);
                        stringBuilder.append(str2);
                        stringBuilder.append(sQLiteDirectCursorDriver.toString());
                        stringBuilder.append(", args are <redacted>, count is ");
                        stringBuilder.append(i);
                        Log.v(str4, stringBuilder.toString());
                    }
                }
                return new CrossProcessCursorWrapper(query);
            } catch (Throwable th) {
                if (this.mSlowQueryThreshold != -1) {
                    long currentTimeMillis2 = System.currentTimeMillis() - j;
                    if (currentTimeMillis2 >= ((long) this.mSlowQueryThreshold)) {
                        stringBuilder = new StringBuilder(str3);
                        stringBuilder.append(currentTimeMillis2);
                        stringBuilder.append(str2);
                        stringBuilder.append(sQLiteDirectCursorDriver.toString());
                        stringBuilder.append(", args are <redacted>, count is -1");
                        Log.v(str4, stringBuilder.toString());
                    }
                }
            }
        } else {
            throw new IllegalStateException("database not open");
        }
    }

    public Cursor rawQuery(String str, String[] strArr) {
        return rawQueryWithFactory(null, str, strArr, null);
    }

    public Cursor rawQuery(String str, String[] strArr, int i, int i2) {
        CursorWrapper cursorWrapper = (CursorWrapper) rawQueryWithFactory(null, str, strArr, null);
        ((SQLiteCursor) cursorWrapper.getWrappedCursor()).setLoadStyle(i, i2);
        return cursorWrapper;
    }

    public Cursor rawQueryWithFactory(CursorFactory cursorFactory, String str, String[] strArr, String str2) {
        long currentTimeMillis;
        StringBuilder stringBuilder;
        if (isOpen()) {
            long j = 0;
            int i = -1;
            if (this.mSlowQueryThreshold != -1) {
                j = System.currentTimeMillis();
            }
            SQLiteDirectCursorDriver sQLiteDirectCursorDriver = new SQLiteDirectCursorDriver(this, str, str2);
            str = " ms): ";
            str2 = "query (";
            String str3 = TAG;
            if (cursorFactory == null) {
                try {
                    cursorFactory = this.mFactory;
                } catch (Throwable th) {
                    if (this.mSlowQueryThreshold != -1) {
                        currentTimeMillis = System.currentTimeMillis() - j;
                        if (currentTimeMillis >= ((long) this.mSlowQueryThreshold)) {
                            stringBuilder = new StringBuilder(str2);
                            stringBuilder.append(currentTimeMillis);
                            stringBuilder.append(str);
                            stringBuilder.append(sQLiteDirectCursorDriver.toString());
                            stringBuilder.append(", args are <redacted>, count is -1");
                            Log.v(str3, stringBuilder.toString());
                        }
                    }
                }
            }
            Cursor query = sQLiteDirectCursorDriver.query(cursorFactory, strArr);
            if (this.mSlowQueryThreshold != -1) {
                if (query != null) {
                    i = query.getCount();
                }
                currentTimeMillis = System.currentTimeMillis() - j;
                if (currentTimeMillis >= ((long) this.mSlowQueryThreshold)) {
                    stringBuilder = new StringBuilder(str2);
                    stringBuilder.append(currentTimeMillis);
                    stringBuilder.append(str);
                    stringBuilder.append(sQLiteDirectCursorDriver.toString());
                    stringBuilder.append(", args are <redacted>, count is ");
                    stringBuilder.append(i);
                    Log.v(str3, stringBuilder.toString());
                }
            }
            return new CrossProcessCursorWrapper(query);
        }
        throw new IllegalStateException("database not open");
    }

    /* Access modifiers changed, original: 0000 */
    public void removeSQLiteClosable(SQLiteClosable sQLiteClosable) {
        lock();
        try {
            this.mPrograms.remove(sQLiteClosable);
        } finally {
            unlock();
        }
    }

    public long replace(String str, String str2, ContentValues contentValues) {
        Object str3;
        try {
            str3 = insertWithOnConflict(str3, str2, contentValues, 5);
            return str3;
        } catch (SQLException e) {
            Log.e(TAG, "Error inserting <redacted values> into ".concat(String.valueOf(str3)), e);
            return -1;
        }
    }

    public long replaceOrThrow(String str, String str2, ContentValues contentValues) {
        return insertWithOnConflict(str, str2, contentValues, 5);
    }

    public void resetCompiledSqlCache() {
        synchronized (this.mCompiledQueries) {
            this.mCompiledQueries.clear();
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void rowUpdated(String str, long j) {
        SyncUpdateInfo syncUpdateInfo;
        synchronized (this.mSyncUpdateInfo) {
            syncUpdateInfo = (SyncUpdateInfo) this.mSyncUpdateInfo.get(str);
        }
        if (syncUpdateInfo != null) {
            StringBuilder stringBuilder = new StringBuilder("UPDATE ");
            stringBuilder.append(syncUpdateInfo.masterTable);
            stringBuilder.append(" SET _sync_dirty=1 WHERE _id=(SELECT ");
            stringBuilder.append(syncUpdateInfo.foreignKey);
            stringBuilder.append(" FROM ");
            stringBuilder.append(str);
            stringBuilder.append(" WHERE _id=");
            stringBuilder.append(j);
            stringBuilder.append(")");
            execSQL(stringBuilder.toString());
        }
    }

    public void setForeignKeyConstraintsEnabled(boolean z) {
        if (inTransaction()) {
            throw new IllegalStateException("Foreign key constraints may not be changed while in a transaction");
        }
        Object[] objArr = new Object[1];
        objArr[0] = z ? "ON" : "OFF";
        execSQL(String.format("PRAGMA foreign_keys = %s;", objArr));
    }

    public void setLocale(Locale locale) {
        lock();
        try {
            native_setLocale(locale.toString(), this.mFlags);
        } finally {
            unlock();
        }
    }

    public void setLockingEnabled(boolean z) {
        this.mLockingEnabled = z;
    }

    public synchronized void setMaxSqlCacheSize(int i) {
        if (i > 250 || i < 0) {
            throw new IllegalStateException("expected value between 0 and 250");
        } else if (i >= this.mMaxSqlCacheSize) {
            this.mMaxSqlCacheSize = i;
        } else {
            throw new IllegalStateException("cannot set cacheSize to a value less than the value set with previous setMaxSqlCacheSize() call.");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x003b  */
    public long setMaximumSize(long r9) {
        /*
        r8 = this;
        r8.lock();
        r0 = r8.isOpen();
        if (r0 == 0) goto L_0x0042;
    L_0x0009:
        r0 = 0;
        r1 = r8.getPageSize();	 Catch:{ all -> 0x0038 }
        r3 = r9 / r1;
        r9 = r9 % r1;
        r5 = 0;
        r7 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1));
        if (r7 == 0) goto L_0x001a;
    L_0x0017:
        r9 = 1;
        r3 = r3 + r9;
    L_0x001a:
        r9 = new net.sqlcipher.database.SQLiteStatement;	 Catch:{ all -> 0x0038 }
        r10 = "PRAGMA max_page_count = ";
        r3 = java.lang.String.valueOf(r3);	 Catch:{ all -> 0x0038 }
        r10 = r10.concat(r3);	 Catch:{ all -> 0x0038 }
        r9.<init>(r8, r10);	 Catch:{ all -> 0x0038 }
        r3 = r9.simpleQueryForLong();	 Catch:{ all -> 0x0035 }
        r3 = r3 * r1;
        r9.close();
        r8.unlock();
        return r3;
    L_0x0035:
        r10 = move-exception;
        r0 = r9;
        goto L_0x0039;
    L_0x0038:
        r10 = move-exception;
    L_0x0039:
        if (r0 == 0) goto L_0x003e;
    L_0x003b:
        r0.close();
    L_0x003e:
        r8.unlock();
        throw r10;
    L_0x0042:
        r9 = new java.lang.IllegalStateException;
        r10 = "database not open";
        r9.<init>(r10);
        throw r9;
        */
        throw new UnsupportedOperationException("Method not decompiled: net.sqlcipher.database.SQLiteDatabase.setMaximumSize(long):long");
    }

    public void setPageSize(long j) {
        execSQL("PRAGMA page_size = ".concat(String.valueOf(j)));
    }

    public void setTransactionSuccessful() {
        if (!isOpen()) {
            throw new IllegalStateException("database not open");
        } else if (!this.mLock.isHeldByCurrentThread()) {
            throw new IllegalStateException("no transaction pending");
        } else if (this.mInnerTransactionIsSuccessful) {
            throw new IllegalStateException("setTransactionSuccessful may only be called once per call to beginTransaction");
        } else {
            this.mInnerTransactionIsSuccessful = true;
        }
    }

    public void setVersion(int i) {
        execSQL("PRAGMA user_version = ".concat(String.valueOf(i)));
    }

    public int status(int i, boolean z) {
        return native_status(i, z);
    }

    /* Access modifiers changed, original: 0000 */
    public void unlock() {
        if (this.mLockingEnabled) {
            if (SQLiteDebug.DEBUG_LOCK_TIME_TRACKING && this.mLock.getHoldCount() == 1) {
                checkLockHoldTime();
            }
            this.mLock.unlock();
        }
    }

    public int update(String str, ContentValues contentValues, String str2, String[] strArr) {
        return updateWithOnConflict(str, contentValues, str2, strArr, 0);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:48:0x0101 in {9, 12, 19, 23, 26, 28, 30, 36, 39, 41, 43, 45, 47} preds:[]
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
    public int updateWithOnConflict(java.lang.String r6, android.content.ContentValues r7, java.lang.String r8, java.lang.String[] r9, int r10) {
        /*
        r5 = this;
        r0 = "Database";
        if (r7 == 0) goto L_0x00f9;
        r1 = r7.size();
        if (r1 == 0) goto L_0x00f9;
        r1 = new java.lang.StringBuilder;
        r2 = 120; // 0x78 float:1.68E-43 double:5.93E-322;
        r1.<init>(r2);
        r2 = "UPDATE ";
        r1.append(r2);
        r2 = CONFLICT_VALUES;
        r10 = r2[r10];
        r1.append(r10);
        r1.append(r6);
        r10 = " SET ";
        r1.append(r10);
        r7 = r7.valueSet();
        r10 = r7.iterator();
        r2 = r10.hasNext();
        if (r2 == 0) goto L_0x0053;
        r2 = r10.next();
        r2 = (java.util.Map.Entry) r2;
        r2 = r2.getKey();
        r2 = (java.lang.String) r2;
        r1.append(r2);
        r2 = "=?";
        r1.append(r2);
        r2 = r10.hasNext();
        if (r2 == 0) goto L_0x002d;
        r2 = ", ";
        r1.append(r2);
        goto L_0x002d;
        r10 = android.text.TextUtils.isEmpty(r8);
        if (r10 != 0) goto L_0x0061;
        r10 = " WHERE ";
        r1.append(r10);
        r1.append(r8);
        r5.lock();
        r8 = r5.isOpen();
        if (r8 == 0) goto L_0x00f1;
        r8 = 0;
        r10 = r1.toString();	 Catch:{ SQLiteDatabaseCorruptException -> 0x00e3, SQLException -> 0x00d4 }
        r8 = r5.compileStatement(r10);	 Catch:{ SQLiteDatabaseCorruptException -> 0x00e3, SQLException -> 0x00d4 }
        r10 = r7.size();	 Catch:{ SQLiteDatabaseCorruptException -> 0x00e3, SQLException -> 0x00d4 }
        r7 = r7.iterator();	 Catch:{ SQLiteDatabaseCorruptException -> 0x00e3, SQLException -> 0x00d4 }
        r1 = 0;	 Catch:{ SQLiteDatabaseCorruptException -> 0x00e3, SQLException -> 0x00d4 }
        r2 = 1;	 Catch:{ SQLiteDatabaseCorruptException -> 0x00e3, SQLException -> 0x00d4 }
        r2 = 0;	 Catch:{ SQLiteDatabaseCorruptException -> 0x00e3, SQLException -> 0x00d4 }
        r3 = 1;	 Catch:{ SQLiteDatabaseCorruptException -> 0x00e3, SQLException -> 0x00d4 }
        if (r2 >= r10) goto L_0x0093;	 Catch:{ SQLiteDatabaseCorruptException -> 0x00e3, SQLException -> 0x00d4 }
        r4 = r7.next();	 Catch:{ SQLiteDatabaseCorruptException -> 0x00e3, SQLException -> 0x00d4 }
        r4 = (java.util.Map.Entry) r4;	 Catch:{ SQLiteDatabaseCorruptException -> 0x00e3, SQLException -> 0x00d4 }
        r4 = r4.getValue();	 Catch:{ SQLiteDatabaseCorruptException -> 0x00e3, SQLException -> 0x00d4 }
        net.sqlcipher.DatabaseUtils.bindObjectToProgram(r8, r3, r4);	 Catch:{ SQLiteDatabaseCorruptException -> 0x00e3, SQLException -> 0x00d4 }
        r3 = r3 + 1;	 Catch:{ SQLiteDatabaseCorruptException -> 0x00e3, SQLException -> 0x00d4 }
        r2 = r2 + 1;	 Catch:{ SQLiteDatabaseCorruptException -> 0x00e3, SQLException -> 0x00d4 }
        goto L_0x007f;	 Catch:{ SQLiteDatabaseCorruptException -> 0x00e3, SQLException -> 0x00d4 }
        if (r9 == 0) goto L_0x00a2;	 Catch:{ SQLiteDatabaseCorruptException -> 0x00e3, SQLException -> 0x00d4 }
        r7 = r9.length;	 Catch:{ SQLiteDatabaseCorruptException -> 0x00e3, SQLException -> 0x00d4 }
        if (r1 >= r7) goto L_0x00a2;	 Catch:{ SQLiteDatabaseCorruptException -> 0x00e3, SQLException -> 0x00d4 }
        r10 = r9[r1];	 Catch:{ SQLiteDatabaseCorruptException -> 0x00e3, SQLException -> 0x00d4 }
        r8.bindString(r3, r10);	 Catch:{ SQLiteDatabaseCorruptException -> 0x00e3, SQLException -> 0x00d4 }
        r3 = r3 + 1;	 Catch:{ SQLiteDatabaseCorruptException -> 0x00e3, SQLException -> 0x00d4 }
        r1 = r1 + 1;	 Catch:{ SQLiteDatabaseCorruptException -> 0x00e3, SQLException -> 0x00d4 }
        goto L_0x0096;	 Catch:{ SQLiteDatabaseCorruptException -> 0x00e3, SQLException -> 0x00d4 }
        r8.execute();	 Catch:{ SQLiteDatabaseCorruptException -> 0x00e3, SQLException -> 0x00d4 }
        r7 = r5.lastChangeCount();	 Catch:{ SQLiteDatabaseCorruptException -> 0x00e3, SQLException -> 0x00d4 }
        r9 = 2;	 Catch:{ SQLiteDatabaseCorruptException -> 0x00e3, SQLException -> 0x00d4 }
        r9 = android.util.Log.isLoggable(r0, r9);	 Catch:{ SQLiteDatabaseCorruptException -> 0x00e3, SQLException -> 0x00d4 }
        if (r9 == 0) goto L_0x00c9;	 Catch:{ SQLiteDatabaseCorruptException -> 0x00e3, SQLException -> 0x00d4 }
        r9 = new java.lang.StringBuilder;	 Catch:{ SQLiteDatabaseCorruptException -> 0x00e3, SQLException -> 0x00d4 }
        r10 = "Updated ";	 Catch:{ SQLiteDatabaseCorruptException -> 0x00e3, SQLException -> 0x00d4 }
        r9.<init>(r10);	 Catch:{ SQLiteDatabaseCorruptException -> 0x00e3, SQLException -> 0x00d4 }
        r9.append(r7);	 Catch:{ SQLiteDatabaseCorruptException -> 0x00e3, SQLException -> 0x00d4 }
        r10 = " rows using <redacted values> and <redacted sql> for ";	 Catch:{ SQLiteDatabaseCorruptException -> 0x00e3, SQLException -> 0x00d4 }
        r9.append(r10);	 Catch:{ SQLiteDatabaseCorruptException -> 0x00e3, SQLException -> 0x00d4 }
        r9.append(r6);	 Catch:{ SQLiteDatabaseCorruptException -> 0x00e3, SQLException -> 0x00d4 }
        r9 = r9.toString();	 Catch:{ SQLiteDatabaseCorruptException -> 0x00e3, SQLException -> 0x00d4 }
        android.util.Log.v(r0, r9);	 Catch:{ SQLiteDatabaseCorruptException -> 0x00e3, SQLException -> 0x00d4 }
        if (r8 == 0) goto L_0x00ce;
        r8.close();
        r5.unlock();
        return r7;
        r6 = move-exception;
        goto L_0x00e8;
        r7 = move-exception;
        r9 = "Error updating <redacted values> using <redacted sql> for ";	 Catch:{ all -> 0x00d2 }
        r6 = java.lang.String.valueOf(r6);	 Catch:{ all -> 0x00d2 }
        r6 = r9.concat(r6);	 Catch:{ all -> 0x00d2 }
        android.util.Log.e(r0, r6);	 Catch:{ all -> 0x00d2 }
        throw r7;	 Catch:{ all -> 0x00d2 }
        r6 = move-exception;	 Catch:{ all -> 0x00d2 }
        r5.onCorruption();	 Catch:{ all -> 0x00d2 }
        throw r6;	 Catch:{ all -> 0x00d2 }
        if (r8 == 0) goto L_0x00ed;
        r8.close();
        r5.unlock();
        throw r6;
        r6 = new java.lang.IllegalStateException;
        r7 = "database not open";
        r6.<init>(r7);
        throw r6;
        r6 = new java.lang.IllegalArgumentException;
        r7 = "Empty values";
        r6.<init>(r7);
        throw r6;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: net.sqlcipher.database.SQLiteDatabase.updateWithOnConflict(java.lang.String, android.content.ContentValues, java.lang.String, java.lang.String[], int):int");
    }

    @Deprecated
    public boolean yieldIfContended() {
        return !isOpen() ? false : yieldIfContendedHelper(false, -1);
    }

    public boolean yieldIfContendedSafely() {
        return !isOpen() ? false : yieldIfContendedHelper(true, -1);
    }

    public boolean yieldIfContendedSafely(long j) {
        return !isOpen() ? false : yieldIfContendedHelper(true, j);
    }
}
