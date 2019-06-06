package net.sqlcipher.database;

import android.os.SystemClock;
import android.util.Log;
import net.sqlcipher.CursorWindow;

public class SQLiteQuery extends SQLiteProgram {
    private static final String TAG = "Cursor";
    private String[] mBindArgs;
    private Object[] mObjectBindArgs;
    private int mOffsetIndex;

    SQLiteQuery(SQLiteDatabase sQLiteDatabase, String str, int i, Object[] objArr) {
        super(sQLiteDatabase, str);
        this.mOffsetIndex = i;
        this.mObjectBindArgs = objArr;
        Object[] objArr2 = this.mObjectBindArgs;
        this.mBindArgs = new String[(objArr2 != null ? objArr2.length : 0)];
    }

    SQLiteQuery(SQLiteDatabase sQLiteDatabase, String str, int i, String[] strArr) {
        super(sQLiteDatabase, str);
        this.mOffsetIndex = i;
        this.mBindArgs = strArr;
    }

    private final native int native_column_count();

    private final native String native_column_name(int i);

    private final native int native_fill_window(CursorWindow cursorWindow, int i, int i2, int i3, int i4, int i5);

    public void bindArguments(Object[] objArr) {
        if (objArr != null && objArr.length > 0) {
            for (int i = 0; i < objArr.length; i++) {
                Object obj = objArr[i];
                if (obj == null) {
                    bindNull(i + 1);
                } else {
                    int i2;
                    double doubleValue;
                    if (obj instanceof Double) {
                        i2 = i + 1;
                        doubleValue = ((Double) obj).doubleValue();
                    } else if (obj instanceof Float) {
                        i2 = i + 1;
                        doubleValue = (double) ((Number) obj).floatValue();
                    } else {
                        long longValue;
                        if (obj instanceof Long) {
                            i2 = i + 1;
                            longValue = ((Long) obj).longValue();
                        } else if (obj instanceof Integer) {
                            i2 = i + 1;
                            longValue = (long) ((Number) obj).intValue();
                        } else if (obj instanceof Boolean) {
                            i2 = i + 1;
                            longValue = ((Boolean) obj).booleanValue() ? 1 : 0;
                        } else if (obj instanceof byte[]) {
                            bindBlob(i + 1, (byte[]) obj);
                        } else {
                            bindString(i + 1, obj.toString());
                        }
                        bindLong(i2, longValue);
                    }
                    bindDouble(i2, doubleValue);
                }
            }
        }
    }

    public void bindDouble(int i, double d) {
        this.mBindArgs[i - 1] = Double.toString(d);
        if (!this.mClosed) {
            super.bindDouble(i, d);
        }
    }

    public void bindLong(int i, long j) {
        this.mBindArgs[i - 1] = Long.toString(j);
        if (!this.mClosed) {
            super.bindLong(i, j);
        }
    }

    public void bindNull(int i) {
        this.mBindArgs[i - 1] = null;
        if (!this.mClosed) {
            super.bindNull(i);
        }
    }

    public void bindString(int i, String str) {
        this.mBindArgs[i - 1] = str;
        if (!this.mClosed) {
            super.bindString(i, str);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public int columnCountLocked() {
        acquireReference();
        try {
            int native_column_count = native_column_count();
            return native_column_count;
        } finally {
            releaseReference();
        }
    }

    /* Access modifiers changed, original: 0000 */
    public String columnNameLocked(int i) {
        acquireReference();
        try {
            String native_column_name = native_column_name(i);
            return native_column_name;
        } finally {
            releaseReference();
        }
    }

    /* Access modifiers changed, original: 0000 */
    public int fillWindow(CursorWindow cursorWindow, int i, int i2) {
        SystemClock.uptimeMillis();
        this.mDatabase.lock();
        try {
            acquireReference();
            cursorWindow.acquireReference();
            i = native_fill_window(cursorWindow, cursorWindow.getStartPosition(), cursorWindow.getRequiredPosition(), this.mOffsetIndex, i, i2);
            if (SQLiteDebug.DEBUG_SQL_STATEMENTS) {
                String str = TAG;
                StringBuilder stringBuilder = new StringBuilder("fillWindow(): ");
                stringBuilder.append(this.mSql);
                Log.d(str, stringBuilder.toString());
            }
            cursorWindow.releaseReference();
            releaseReference();
            this.mDatabase.unlock();
            return i;
        } catch (IllegalStateException unused) {
            cursorWindow.releaseReference();
            releaseReference();
            this.mDatabase.unlock();
            return 0;
        } catch (SQLiteDatabaseCorruptException e) {
            this.mDatabase.onCorruption();
            throw e;
        } catch (Throwable th) {
            releaseReference();
            this.mDatabase.unlock();
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void requery() {
        String[] strArr = this.mBindArgs;
        if (strArr != null) {
            int length = strArr.length;
            int i = 0;
            try {
                if (this.mObjectBindArgs != null) {
                    bindArguments(this.mObjectBindArgs);
                    return;
                }
                int i2 = 0;
                while (i2 < length) {
                    int i3 = i2 + 1;
                    super.bindString(i3, this.mBindArgs[i2]);
                    i2 = i3;
                }
            } catch (SQLiteMisuseException e) {
                StringBuilder stringBuilder = new StringBuilder("mSql ");
                stringBuilder.append(this.mSql);
                StringBuilder stringBuilder2 = new StringBuilder(stringBuilder.toString());
                while (true) {
                    String str = " ";
                    if (i < length) {
                        stringBuilder2.append(str);
                        stringBuilder2.append(this.mBindArgs[i]);
                        i++;
                    } else {
                        stringBuilder2.append(str);
                        throw new IllegalStateException(stringBuilder2.toString(), e);
                    }
                }
            }
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("SQLiteQuery: ");
        stringBuilder.append(this.mSql);
        return stringBuilder.toString();
    }
}
