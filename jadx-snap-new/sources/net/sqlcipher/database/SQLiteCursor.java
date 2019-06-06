package net.sqlcipher.database;

import android.database.DataSetObserver;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import net.sqlcipher.AbstractWindowedCursor;
import net.sqlcipher.CursorWindow;
import net.sqlcipher.SQLException;

public class SQLiteCursor extends AbstractWindowedCursor {
    static final int NO_COUNT = -1;
    static final String TAG = "Cursor";
    private boolean fillWindowForwardOnly;
    private Map<String, Integer> mColumnNameMap;
    private String[] mColumns;
    private int mCount;
    private int mCursorState;
    private int mCursorWindowCapacity;
    private SQLiteDatabase mDatabase;
    private SQLiteCursorDriver mDriver;
    private String mEditTable;
    private int mInitialRead;
    private ReentrantLock mLock;
    private int mMaxRead;
    protected MainThreadNotificationHandler mNotificationHandler;
    private boolean mPendingData;
    private SQLiteQuery mQuery;
    private Throwable mStackTrace;

    public static class MainThreadNotificationHandler extends Handler {
        private final WeakReference<SQLiteCursor> wrappedCursor;

        MainThreadNotificationHandler(SQLiteCursor sQLiteCursor) {
            this.wrappedCursor = new WeakReference(sQLiteCursor);
        }

        public void handleMessage(Message message) {
            SQLiteCursor sQLiteCursor = (SQLiteCursor) this.wrappedCursor.get();
            if (sQLiteCursor != null) {
                sQLiteCursor.notifyDataSetChange();
            }
        }
    }

    final class QueryThread implements Runnable {
        private final int mThreadState;

        QueryThread(int i) {
            this.mThreadState = i;
        }

        private void sendMessage() {
            SQLiteCursor sQLiteCursor;
            boolean z = true;
            if (SQLiteCursor.this.mNotificationHandler != null) {
                SQLiteCursor.this.mNotificationHandler.sendEmptyMessage(1);
                sQLiteCursor = SQLiteCursor.this;
                z = false;
            } else {
                sQLiteCursor = SQLiteCursor.this;
            }
            sQLiteCursor.mPendingData = z;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:22:0x008d in {3, 7, 8, 15, 18, 21} preds:[]
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
            	at jadx.core.ProcessClass.process(ProcessClass.java:32)
            	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
            	at java.lang.Iterable.forEach(Iterable.java:75)
            	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
            	at jadx.core.ProcessClass.process(ProcessClass.java:37)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
            */
        public final void run() {
            /*
            r4 = this;
            r0 = net.sqlcipher.database.SQLiteCursor.this;
            r0 = r0.mWindow;
            r1 = android.os.Process.myTid();
            r2 = 10;
            android.os.Process.setThreadPriority(r1, r2);
            r1 = net.sqlcipher.database.SQLiteCursor.this;
            r1 = r1.mLock;
            if (r1 != 0) goto L_0x0022;
            r1 = net.sqlcipher.database.SQLiteCursor.this;
            r2 = new java.util.concurrent.locks.ReentrantLock;
            r3 = 1;
            r2.<init>(r3);
            r1.mLock = r2;
            r1 = net.sqlcipher.database.SQLiteCursor.this;
            r1 = r1.mLock;
            r1.lock();
            r1 = net.sqlcipher.database.SQLiteCursor.this;
            r1 = r1.mCursorState;
            r2 = r4.mThreadState;
            if (r1 == r2) goto L_0x003f;
            r0 = net.sqlcipher.database.SQLiteCursor.this;
            r0 = r0.mLock;
            r0.unlock();
            return;
            r1 = net.sqlcipher.database.SQLiteCursor.this;	 Catch:{ Exception -> 0x0035, all -> 0x0082 }
            r1 = r1.mQuery;	 Catch:{ Exception -> 0x0035, all -> 0x0082 }
            r2 = net.sqlcipher.database.SQLiteCursor.this;	 Catch:{ Exception -> 0x0035, all -> 0x0082 }
            r2 = r2.mMaxRead;	 Catch:{ Exception -> 0x0035, all -> 0x0082 }
            r3 = net.sqlcipher.database.SQLiteCursor.this;	 Catch:{ Exception -> 0x0035, all -> 0x0082 }
            r3 = r3.mCount;	 Catch:{ Exception -> 0x0035, all -> 0x0082 }
            r1 = r1.fillWindow(r0, r2, r3);	 Catch:{ Exception -> 0x0035, all -> 0x0082 }
            if (r1 == 0) goto L_0x0035;	 Catch:{ Exception -> 0x0035, all -> 0x0082 }
            r2 = -1;	 Catch:{ Exception -> 0x0035, all -> 0x0082 }
            if (r1 != r2) goto L_0x0079;	 Catch:{ Exception -> 0x0035, all -> 0x0082 }
            r1 = net.sqlcipher.database.SQLiteCursor.this;	 Catch:{ Exception -> 0x0035, all -> 0x0082 }
            r2 = net.sqlcipher.database.SQLiteCursor.this;	 Catch:{ Exception -> 0x0035, all -> 0x0082 }
            r2 = r2.mCount;	 Catch:{ Exception -> 0x0035, all -> 0x0082 }
            r3 = net.sqlcipher.database.SQLiteCursor.this;	 Catch:{ Exception -> 0x0035, all -> 0x0082 }
            r3 = r3.mMaxRead;	 Catch:{ Exception -> 0x0035, all -> 0x0082 }
            r2 = r2 + r3;	 Catch:{ Exception -> 0x0035, all -> 0x0082 }
            r1.mCount = r2;	 Catch:{ Exception -> 0x0035, all -> 0x0082 }
            r4.sendMessage();	 Catch:{ Exception -> 0x0035, all -> 0x0082 }
            r1 = net.sqlcipher.database.SQLiteCursor.this;
            r1 = r1.mLock;
            r1.unlock();
            goto L_0x000f;
            r0 = net.sqlcipher.database.SQLiteCursor.this;	 Catch:{ Exception -> 0x0035, all -> 0x0082 }
            r0.mCount = r1;	 Catch:{ Exception -> 0x0035, all -> 0x0082 }
            r4.sendMessage();	 Catch:{ Exception -> 0x0035, all -> 0x0082 }
            goto L_0x0035;
            r0 = move-exception;
            r1 = net.sqlcipher.database.SQLiteCursor.this;
            r1 = r1.mLock;
            r1.unlock();
            throw r0;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: net.sqlcipher.database.SQLiteCursor$QueryThread.run():void");
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:13:0x005d in {6, 7, 9, 12} preds:[]
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
    public SQLiteCursor(net.sqlcipher.database.SQLiteDatabase r4, net.sqlcipher.database.SQLiteCursorDriver r5, java.lang.String r6, net.sqlcipher.database.SQLiteQuery r7) {
        /*
        r3 = this;
        r3.<init>();
        r0 = -1;
        r3.mCount = r0;
        r0 = 0;
        r3.mCursorWindowCapacity = r0;
        r3.fillWindowForwardOnly = r0;
        r1 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        r3.mMaxRead = r1;
        r3.mInitialRead = r1;
        r3.mCursorState = r0;
        r1 = 0;
        r3.mLock = r1;
        r3.mPendingData = r0;
        r2 = new net.sqlcipher.database.DatabaseObjectNotClosedException;
        r2.<init>();
        r2 = r2.fillInStackTrace();
        r3.mStackTrace = r2;
        r3.mDatabase = r4;
        r3.mDriver = r5;
        r3.mEditTable = r6;
        r3.mColumnNameMap = r1;
        r3.mQuery = r7;
        r4.lock();	 Catch:{ all -> 0x0058 }
        r5 = r3.mQuery;	 Catch:{ all -> 0x0058 }
        r5 = r5.columnCountLocked();	 Catch:{ all -> 0x0058 }
        r6 = new java.lang.String[r5];	 Catch:{ all -> 0x0058 }
        r3.mColumns = r6;	 Catch:{ all -> 0x0058 }
        if (r0 >= r5) goto L_0x0054;	 Catch:{ all -> 0x0058 }
        r6 = r3.mQuery;	 Catch:{ all -> 0x0058 }
        r6 = r6.columnNameLocked(r0);	 Catch:{ all -> 0x0058 }
        r7 = r3.mColumns;	 Catch:{ all -> 0x0058 }
        r7[r0] = r6;	 Catch:{ all -> 0x0058 }
        r7 = "_id";	 Catch:{ all -> 0x0058 }
        r6 = r7.equals(r6);	 Catch:{ all -> 0x0058 }
        if (r6 == 0) goto L_0x0051;	 Catch:{ all -> 0x0058 }
        r3.mRowIdColumnIndex = r0;	 Catch:{ all -> 0x0058 }
        r0 = r0 + 1;
        goto L_0x003b;
        r4.unlock();
        return;
        r5 = move-exception;
        r4.unlock();
        throw r5;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: net.sqlcipher.database.SQLiteCursor.<init>(net.sqlcipher.database.SQLiteDatabase, net.sqlcipher.database.SQLiteCursorDriver, java.lang.String, net.sqlcipher.database.SQLiteQuery):void");
    }

    private void deactivateCommon() {
        this.mCursorState = 0;
        if (this.mWindow != null) {
            this.mWindow.close();
            this.mWindow = null;
        }
    }

    private void fillWindow(int i) {
        if (this.mWindow == null) {
            this.mWindow = new CursorWindow(true);
        } else {
            this.mCursorState++;
            queryThreadLock();
            try {
                this.mWindow.clear();
            } finally {
                queryThreadUnlock();
            }
        }
        int cursorPickFillWindowStartPosition = this.fillWindowForwardOnly ? i : this.mCount == -1 ? cursorPickFillWindowStartPosition(i, 0) : cursorPickFillWindowStartPosition(i, this.mCursorWindowCapacity);
        this.mWindow.setStartPosition(cursorPickFillWindowStartPosition);
        this.mWindow.setRequiredPosition(i);
        Log.v(TAG, String.format("Filling cursor window with start position:%d required position:%d", new Object[]{Integer.valueOf(cursorPickFillWindowStartPosition), Integer.valueOf(i)}));
        this.mCount = this.mQuery.fillWindow(this.mWindow, this.mInitialRead, 0);
        if (this.mCursorWindowCapacity == 0) {
            this.mCursorWindowCapacity = this.mWindow.getNumRows();
        }
        if (this.mCount == -1) {
            this.mCount = cursorPickFillWindowStartPosition + this.mInitialRead;
            new Thread(new QueryThread(this.mCursorState), "query thread").start();
        }
    }

    private void queryThreadLock() {
        ReentrantLock reentrantLock = this.mLock;
        if (reentrantLock != null) {
            reentrantLock.lock();
        }
    }

    private void queryThreadUnlock() {
        ReentrantLock reentrantLock = this.mLock;
        if (reentrantLock != null) {
            reentrantLock.unlock();
        }
    }

    public void close() {
        super.close();
        deactivateCommon();
        this.mQuery.close();
        this.mDriver.cursorClosed();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:46:0x0128 in {3, 8, 12, 28, 29, 30, 32, 38, 42, 45} preds:[]
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
    public boolean commitUpdates(java.util.Map<? extends java.lang.Long, ? extends java.util.Map<java.lang.String, java.lang.Object>> r12) {
        /*
        r11 = this;
        r0 = r11.supportsUpdates();
        r1 = 0;
        if (r0 != 0) goto L_0x000f;
        r12 = "Cursor";
        r0 = "commitUpdates not supported on this cursor, did you include the _id column?";
        android.util.Log.e(r12, r0);
        return r1;
        r0 = r11.mUpdatedRows;
        monitor-enter(r0);
        if (r12 == 0) goto L_0x0019;
        r2 = r11.mUpdatedRows;	 Catch:{ all -> 0x0125 }
        r2.putAll(r12);	 Catch:{ all -> 0x0125 }
        r12 = r11.mUpdatedRows;	 Catch:{ all -> 0x0125 }
        r12 = r12.size();	 Catch:{ all -> 0x0125 }
        r2 = 1;	 Catch:{ all -> 0x0125 }
        if (r12 != 0) goto L_0x0024;	 Catch:{ all -> 0x0125 }
        monitor-exit(r0);	 Catch:{ all -> 0x0125 }
        return r2;	 Catch:{ all -> 0x0125 }
        r12 = r11.mDatabase;	 Catch:{ all -> 0x0125 }
        r12.beginTransaction();	 Catch:{ all -> 0x0125 }
        r12 = new java.lang.StringBuilder;	 Catch:{ all -> 0x011e }
        r3 = 128; // 0x80 float:1.794E-43 double:6.32E-322;	 Catch:{ all -> 0x011e }
        r12.<init>(r3);	 Catch:{ all -> 0x011e }
        r3 = r11.mUpdatedRows;	 Catch:{ all -> 0x011e }
        r3 = r3.entrySet();	 Catch:{ all -> 0x011e }
        r3 = r3.iterator();	 Catch:{ all -> 0x011e }
        r4 = r3.hasNext();	 Catch:{ all -> 0x011e }
        if (r4 == 0) goto L_0x010a;	 Catch:{ all -> 0x011e }
        r4 = r3.next();	 Catch:{ all -> 0x011e }
        r4 = (java.util.Map.Entry) r4;	 Catch:{ all -> 0x011e }
        r5 = r4.getValue();	 Catch:{ all -> 0x011e }
        r5 = (java.util.Map) r5;	 Catch:{ all -> 0x011e }
        r4 = r4.getKey();	 Catch:{ all -> 0x011e }
        r4 = (java.lang.Long) r4;	 Catch:{ all -> 0x011e }
        if (r4 == 0) goto L_0x00ee;	 Catch:{ all -> 0x011e }
        if (r5 == 0) goto L_0x00ee;	 Catch:{ all -> 0x011e }
        r6 = r5.size();	 Catch:{ all -> 0x011e }
        if (r6 == 0) goto L_0x003a;	 Catch:{ all -> 0x011e }
        r6 = r4.longValue();	 Catch:{ all -> 0x011e }
        r4 = r5.entrySet();	 Catch:{ all -> 0x011e }
        r4 = r4.iterator();	 Catch:{ all -> 0x011e }
        r12.setLength(r1);	 Catch:{ all -> 0x011e }
        r8 = new java.lang.StringBuilder;	 Catch:{ all -> 0x011e }
        r9 = "UPDATE ";	 Catch:{ all -> 0x011e }
        r8.<init>(r9);	 Catch:{ all -> 0x011e }
        r9 = r11.mEditTable;	 Catch:{ all -> 0x011e }
        r8.append(r9);	 Catch:{ all -> 0x011e }
        r9 = " SET ";	 Catch:{ all -> 0x011e }
        r8.append(r9);	 Catch:{ all -> 0x011e }
        r8 = r8.toString();	 Catch:{ all -> 0x011e }
        r12.append(r8);	 Catch:{ all -> 0x011e }
        r5 = r5.size();	 Catch:{ all -> 0x011e }
        r5 = new java.lang.Object[r5];	 Catch:{ all -> 0x011e }
        r8 = 0;	 Catch:{ all -> 0x011e }
        r9 = r4.hasNext();	 Catch:{ all -> 0x011e }
        if (r9 == 0) goto L_0x00b8;	 Catch:{ all -> 0x011e }
        r9 = r4.next();	 Catch:{ all -> 0x011e }
        r9 = (java.util.Map.Entry) r9;	 Catch:{ all -> 0x011e }
        r10 = r9.getKey();	 Catch:{ all -> 0x011e }
        r10 = (java.lang.String) r10;	 Catch:{ all -> 0x011e }
        r12.append(r10);	 Catch:{ all -> 0x011e }
        r10 = "=?";	 Catch:{ all -> 0x011e }
        r12.append(r10);	 Catch:{ all -> 0x011e }
        r9 = r9.getValue();	 Catch:{ all -> 0x011e }
        r5[r8] = r9;	 Catch:{ all -> 0x011e }
        r9 = r4.hasNext();	 Catch:{ all -> 0x011e }
        if (r9 == 0) goto L_0x00b5;	 Catch:{ all -> 0x011e }
        r9 = ", ";	 Catch:{ all -> 0x011e }
        r12.append(r9);	 Catch:{ all -> 0x011e }
        r8 = r8 + 1;	 Catch:{ all -> 0x011e }
        goto L_0x008a;	 Catch:{ all -> 0x011e }
        r4 = new java.lang.StringBuilder;	 Catch:{ all -> 0x011e }
        r8 = " WHERE ";	 Catch:{ all -> 0x011e }
        r4.<init>(r8);	 Catch:{ all -> 0x011e }
        r8 = r11.mColumns;	 Catch:{ all -> 0x011e }
        r9 = r11.mRowIdColumnIndex;	 Catch:{ all -> 0x011e }
        r8 = r8[r9];	 Catch:{ all -> 0x011e }
        r4.append(r8);	 Catch:{ all -> 0x011e }
        r8 = 61;	 Catch:{ all -> 0x011e }
        r4.append(r8);	 Catch:{ all -> 0x011e }
        r4.append(r6);	 Catch:{ all -> 0x011e }
        r4 = r4.toString();	 Catch:{ all -> 0x011e }
        r12.append(r4);	 Catch:{ all -> 0x011e }
        r4 = 59;	 Catch:{ all -> 0x011e }
        r12.append(r4);	 Catch:{ all -> 0x011e }
        r4 = r11.mDatabase;	 Catch:{ all -> 0x011e }
        r8 = r12.toString();	 Catch:{ all -> 0x011e }
        r4.execSQL(r8, r5);	 Catch:{ all -> 0x011e }
        r4 = r11.mDatabase;	 Catch:{ all -> 0x011e }
        r5 = r11.mEditTable;	 Catch:{ all -> 0x011e }
        r4.rowUpdated(r5, r6);	 Catch:{ all -> 0x011e }
        goto L_0x003a;	 Catch:{ all -> 0x011e }
        r12 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x011e }
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x011e }
        r2 = "null rowId or values found! rowId = ";	 Catch:{ all -> 0x011e }
        r1.<init>(r2);	 Catch:{ all -> 0x011e }
        r1.append(r4);	 Catch:{ all -> 0x011e }
        r2 = ", values = ";	 Catch:{ all -> 0x011e }
        r1.append(r2);	 Catch:{ all -> 0x011e }
        r1.append(r5);	 Catch:{ all -> 0x011e }
        r1 = r1.toString();	 Catch:{ all -> 0x011e }
        r12.<init>(r1);	 Catch:{ all -> 0x011e }
        throw r12;	 Catch:{ all -> 0x011e }
        r12 = r11.mDatabase;	 Catch:{ all -> 0x011e }
        r12.setTransactionSuccessful();	 Catch:{ all -> 0x011e }
        r12 = r11.mDatabase;	 Catch:{ all -> 0x0125 }
        r12.endTransaction();	 Catch:{ all -> 0x0125 }
        r12 = r11.mUpdatedRows;	 Catch:{ all -> 0x0125 }
        r12.clear();	 Catch:{ all -> 0x0125 }
        monitor-exit(r0);	 Catch:{ all -> 0x0125 }
        r11.onChange(r2);
        return r2;
        r12 = move-exception;
        r1 = r11.mDatabase;	 Catch:{ all -> 0x0125 }
        r1.endTransaction();	 Catch:{ all -> 0x0125 }
        throw r12;	 Catch:{ all -> 0x0125 }
        r12 = move-exception;	 Catch:{ all -> 0x0125 }
        monitor-exit(r0);	 Catch:{ all -> 0x0125 }
        throw r12;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: net.sqlcipher.database.SQLiteCursor.commitUpdates(java.util.Map):boolean");
    }

    public int cursorPickFillWindowStartPosition(int i, int i2) {
        return Math.max(i - (i2 / 3), 0);
    }

    public void deactivate() {
        super.deactivate();
        deactivateCommon();
        this.mDriver.cursorDeactivated();
    }

    public boolean deleteRow() {
        checkPosition();
        boolean z = false;
        if (this.mRowIdColumnIndex == -1 || this.mCurrentRowID == null) {
            Log.e(TAG, "Could not delete row because either the row ID column is not available or ithas not been read.");
            return false;
        }
        Object obj;
        this.mDatabase.lock();
        try {
            SQLiteDatabase sQLiteDatabase = this.mDatabase;
            String str = this.mEditTable;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.mColumns[this.mRowIdColumnIndex]);
            stringBuilder.append("=?");
            sQLiteDatabase.delete(str, stringBuilder.toString(), new String[]{this.mCurrentRowID.toString()});
            obj = 1;
        } catch (SQLException unused) {
            obj = null;
        }
        try {
            int i = this.mPos;
            requery();
            moveToPosition(i);
            if (obj == null) {
                return z;
            }
            onChange(true);
            return true;
        } finally {
            z = this.mDatabase;
            z.unlock();
        }
    }

    public void fillWindow(int i, android.database.CursorWindow cursorWindow) {
        if (this.mWindow == null) {
            this.mWindow = new CursorWindow(true);
        } else {
            this.mCursorState++;
            queryThreadLock();
            try {
                this.mWindow.clear();
            } finally {
                queryThreadUnlock();
            }
        }
        int cursorPickFillWindowStartPosition = this.fillWindowForwardOnly ? i : this.mCount == -1 ? cursorPickFillWindowStartPosition(i, 0) : cursorPickFillWindowStartPosition(i, this.mCursorWindowCapacity);
        this.mWindow.setStartPosition(cursorPickFillWindowStartPosition);
        this.mWindow.setRequiredPosition(i);
        Log.v(TAG, String.format("Filling cursor window with start position:%d required position:%d", new Object[]{Integer.valueOf(cursorPickFillWindowStartPosition), Integer.valueOf(i)}));
        this.mCount = this.mQuery.fillWindow(this.mWindow, this.mInitialRead, 0);
        if (this.mCursorWindowCapacity == 0) {
            this.mCursorWindowCapacity = this.mWindow.getNumRows();
        }
        if (this.mCount == -1) {
            this.mCount = cursorPickFillWindowStartPosition + this.mInitialRead;
            new Thread(new QueryThread(this.mCursorState), "query thread").start();
        }
    }

    public void finalize() {
        try {
            if (this.mWindow != null) {
                int length = this.mQuery.mSql.length();
                String str = TAG;
                StringBuilder stringBuilder = new StringBuilder("Finalizing a Cursor that has not been deactivated or closed. database = ");
                stringBuilder.append(this.mDatabase.getPath());
                stringBuilder.append(", table = ");
                stringBuilder.append(this.mEditTable);
                stringBuilder.append(", query = ");
                String str2 = this.mQuery.mSql;
                if (length > 100) {
                    length = 100;
                }
                stringBuilder.append(str2.substring(0, length));
                Log.e(str, stringBuilder.toString(), this.mStackTrace);
                close();
                SQLiteDebug.notifyActiveCursorFinalized();
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
        }
    }

    public int getColumnIndex(String str) {
        Object str2;
        if (this.mColumnNameMap == null) {
            String[] strArr = this.mColumns;
            int length = strArr.length;
            HashMap hashMap = new HashMap(length, 1.0f);
            for (int i = 0; i < length; i++) {
                hashMap.put(strArr[i], Integer.valueOf(i));
            }
            this.mColumnNameMap = hashMap;
        }
        int lastIndexOf = str2.lastIndexOf(46);
        if (lastIndexOf != -1) {
            Log.e(TAG, "requesting column name with table name -- ".concat(String.valueOf(str2)), new Exception());
            str2 = str2.substring(lastIndexOf + 1);
        }
        Integer num = (Integer) this.mColumnNameMap.get(str2);
        return num != null ? num.intValue() : -1;
    }

    public String[] getColumnNames() {
        return this.mColumns;
    }

    public int getCount() {
        if (this.mCount == -1) {
            fillWindow(0);
        }
        return this.mCount;
    }

    public SQLiteDatabase getDatabase() {
        return this.mDatabase;
    }

    public boolean onMove(int i, int i2) {
        if (this.mWindow == null || i2 < this.mWindow.getStartPosition() || i2 >= this.mWindow.getStartPosition() + this.mWindow.getNumRows()) {
            fillWindow(i2);
        }
        return true;
    }

    public void registerDataSetObserver(DataSetObserver dataSetObserver) {
        super.registerDataSetObserver(dataSetObserver);
        if (!(Integer.MAX_VALUE == this.mMaxRead && Integer.MAX_VALUE == this.mInitialRead) && this.mNotificationHandler == null) {
            queryThreadLock();
            try {
                this.mNotificationHandler = new MainThreadNotificationHandler(this);
                if (this.mPendingData) {
                    notifyDataSetChange();
                    this.mPendingData = false;
                }
                queryThreadUnlock();
            } catch (Throwable th) {
                queryThreadUnlock();
            }
        }
    }

    public boolean requery() {
        if (isClosed()) {
            return false;
        }
        this.mDatabase.lock();
        try {
            if (this.mWindow != null) {
                this.mWindow.clear();
            }
            this.mPos = -1;
            this.mDriver.cursorRequeried(this);
            this.mCount = -1;
            this.mCursorState++;
            queryThreadLock();
            this.mQuery.requery();
            queryThreadUnlock();
            this.mDatabase.unlock();
            return super.requery();
        } catch (Throwable th) {
            this.mDatabase.unlock();
        }
    }

    public void setFillWindowForwardOnly(boolean z) {
        this.fillWindowForwardOnly = z;
    }

    public void setLoadStyle(int i, int i2) {
        this.mMaxRead = i2;
        this.mInitialRead = i;
        this.mLock = new ReentrantLock(true);
    }

    public void setSelectionArguments(String[] strArr) {
        this.mDriver.setBindArguments(strArr);
    }

    public void setWindow(CursorWindow cursorWindow) {
        if (this.mWindow != null) {
            this.mCursorState++;
            queryThreadLock();
            try {
                this.mWindow.close();
                this.mCount = -1;
            } finally {
                queryThreadUnlock();
            }
        }
        this.mWindow = cursorWindow;
    }

    public boolean supportsUpdates() {
        return !TextUtils.isEmpty(this.mEditTable);
    }
}
