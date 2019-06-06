package net.sqlcipher;

import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.DataSetObserver;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import java.util.Map;
import net.sqlcipher.AbstractCursor.SelfContentObserver;

public final class BulkCursorToCursorAdaptor extends AbstractWindowedCursor {
    private static final String TAG = "BulkCursor";
    private IBulkCursor mBulkCursor;
    private String[] mColumns;
    private int mCount;
    private SelfContentObserver mObserverBridge;
    private boolean mWantsAllOnMoveCalls;

    public static int findRowIdColumnIndex(String[] strArr) {
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            if (strArr[i].equals("_id")) {
                return i;
            }
        }
        return -1;
    }

    public final void close() {
        super.close();
        try {
            this.mBulkCursor.close();
        } catch (RemoteException unused) {
            Log.w(TAG, "Remote process exception when closing");
        }
        this.mWindow = null;
    }

    public final boolean commitUpdates(Map<? extends Long, ? extends Map<String, Object>> map) {
        if (supportsUpdates()) {
            synchronized (this.mUpdatedRows) {
                if (map != null) {
                    this.mUpdatedRows.putAll(map);
                }
                if (this.mUpdatedRows.size() <= 0) {
                    return false;
                }
                try {
                    boolean updateRows = this.mBulkCursor.updateRows(this.mUpdatedRows);
                    if (updateRows) {
                        this.mUpdatedRows.clear();
                        onChange(true);
                    }
                    return updateRows;
                } catch (RemoteException unused) {
                    Log.e(TAG, "Unable to commit updates because the remote process is dead");
                    return false;
                }
            }
        }
        Log.e(TAG, "commitUpdates not supported on this cursor, did you include the _id column?");
        return false;
    }

    public final void copyStringToBuffer(int i, CharArrayBuffer charArrayBuffer) {
    }

    public final void deactivate() {
        super.deactivate();
        try {
            this.mBulkCursor.deactivate();
        } catch (RemoteException unused) {
            Log.w(TAG, "Remote process exception when deactivating");
        }
        this.mWindow = null;
    }

    public final boolean deleteRow() {
        try {
            boolean deleteRow = this.mBulkCursor.deleteRow(this.mPos);
            if (deleteRow) {
                this.mWindow = null;
                this.mCount = this.mBulkCursor.count();
                if (this.mPos < this.mCount) {
                    int i = this.mPos;
                    this.mPos = -1;
                    moveToPosition(i);
                } else {
                    this.mPos = this.mCount;
                }
                onChange(true);
            }
            return deleteRow;
        } catch (RemoteException unused) {
            Log.e(TAG, "Unable to delete row because the remote process is dead");
            return false;
        }
    }

    public final String[] getColumnNames() {
        if (this.mColumns == null) {
            try {
                this.mColumns = this.mBulkCursor.getColumnNames();
            } catch (RemoteException unused) {
                Log.e(TAG, "Unable to fetch column names because the remote process is dead");
                return null;
            }
        }
        return this.mColumns;
    }

    public final int getCount() {
        return this.mCount;
    }

    public final Bundle getExtras() {
        try {
            return this.mBulkCursor.getExtras();
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public final synchronized IContentObserver getObserver() {
        if (this.mObserverBridge == null) {
            this.mObserverBridge = new SelfContentObserver(this);
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0037 A:{RETURN} */
    public final boolean onMove(int r3, int r4) {
        /*
        r2 = this;
        r3 = 0;
        r0 = r2.mWindow;	 Catch:{ RemoteException -> 0x003a }
        if (r0 == 0) goto L_0x0030;
    L_0x0005:
        r0 = r2.mWindow;	 Catch:{ RemoteException -> 0x003a }
        r0 = r0.getStartPosition();	 Catch:{ RemoteException -> 0x003a }
        if (r4 < r0) goto L_0x0027;
    L_0x000d:
        r0 = r2.mWindow;	 Catch:{ RemoteException -> 0x003a }
        r0 = r0.getStartPosition();	 Catch:{ RemoteException -> 0x003a }
        r1 = r2.mWindow;	 Catch:{ RemoteException -> 0x003a }
        r1 = r1.getNumRows();	 Catch:{ RemoteException -> 0x003a }
        r0 = r0 + r1;
        if (r4 < r0) goto L_0x001d;
    L_0x001c:
        goto L_0x0027;
    L_0x001d:
        r0 = r2.mWantsAllOnMoveCalls;	 Catch:{ RemoteException -> 0x003a }
        if (r0 == 0) goto L_0x0033;
    L_0x0021:
        r0 = r2.mBulkCursor;	 Catch:{ RemoteException -> 0x003a }
        r0.onMove(r4);	 Catch:{ RemoteException -> 0x003a }
        goto L_0x0033;
    L_0x0027:
        r0 = r2.mBulkCursor;	 Catch:{ RemoteException -> 0x003a }
    L_0x0029:
        r4 = r0.getWindow(r4);	 Catch:{ RemoteException -> 0x003a }
        r2.mWindow = r4;	 Catch:{ RemoteException -> 0x003a }
        goto L_0x0033;
    L_0x0030:
        r0 = r2.mBulkCursor;	 Catch:{ RemoteException -> 0x003a }
        goto L_0x0029;
    L_0x0033:
        r4 = r2.mWindow;
        if (r4 != 0) goto L_0x0038;
    L_0x0037:
        return r3;
    L_0x0038:
        r3 = 1;
        return r3;
    L_0x003a:
        r4 = "BulkCursor";
        r0 = "Unable to get window because the remote process is dead";
        android.util.Log.e(r4, r0);
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: net.sqlcipher.BulkCursorToCursorAdaptor.onMove(int, int):boolean");
    }

    public final void registerContentObserver(ContentObserver contentObserver) {
    }

    public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
    }

    public final boolean requery() {
        try {
            this.mCount = this.mBulkCursor.requery(getObserver(), new CursorWindow(false));
            if (this.mCount != -1) {
                this.mPos = -1;
                this.mWindow = null;
                super.requery();
                return true;
            }
            deactivate();
            return false;
        } catch (Exception e) {
            StringBuilder stringBuilder = new StringBuilder("Unable to requery because the remote process exception ");
            stringBuilder.append(e.getMessage());
            Log.e(TAG, stringBuilder.toString());
            deactivate();
            return false;
        }
    }

    public final Bundle respond(Bundle bundle) {
        try {
            return this.mBulkCursor.respond(bundle);
        } catch (RemoteException e) {
            Log.w(TAG, "respond() threw RemoteException, returning an empty bundle.", e);
            return Bundle.EMPTY;
        }
    }

    public final void set(IBulkCursor iBulkCursor) {
        this.mBulkCursor = iBulkCursor;
        try {
            this.mCount = this.mBulkCursor.count();
            this.mWantsAllOnMoveCalls = this.mBulkCursor.getWantsAllOnMoveCalls();
            this.mColumns = this.mBulkCursor.getColumnNames();
            this.mRowIdColumnIndex = findRowIdColumnIndex(this.mColumns);
        } catch (RemoteException unused) {
            Log.e(TAG, "Setup failed because the remote process is dead");
        }
    }

    public final void set(IBulkCursor iBulkCursor, int i, int i2) {
        this.mBulkCursor = iBulkCursor;
        this.mColumns = null;
        this.mCount = i;
        this.mRowIdColumnIndex = i2;
    }

    public final void unregisterContentObserver(ContentObserver contentObserver) {
    }

    public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
    }
}
