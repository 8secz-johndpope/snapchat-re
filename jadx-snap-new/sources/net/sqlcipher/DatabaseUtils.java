package net.sqlcipher;

import android.content.ContentValues;
import android.content.OperationApplicationException;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Log;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.text.Collator;
import java.util.HashMap;
import net.sqlcipher.database.SQLiteAbortException;
import net.sqlcipher.database.SQLiteConstraintException;
import net.sqlcipher.database.SQLiteDatabase;
import net.sqlcipher.database.SQLiteDatabaseCorruptException;
import net.sqlcipher.database.SQLiteDiskIOException;
import net.sqlcipher.database.SQLiteException;
import net.sqlcipher.database.SQLiteFullException;
import net.sqlcipher.database.SQLiteProgram;
import net.sqlcipher.database.SQLiteStatement;

public class DatabaseUtils {
    private static final boolean DEBUG = false;
    private static final char[] HEX_DIGITS_LOWER = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    private static final boolean LOCAL_LOGV = false;
    private static final String TAG = "DatabaseUtils";
    private static final String[] countProjection = new String[]{"count(*)"};
    private static Collator mColl = null;

    public static class InsertHelper {
        public static final int TABLE_INFO_PRAGMA_COLUMNNAME_INDEX = 1;
        public static final int TABLE_INFO_PRAGMA_DEFAULT_INDEX = 4;
        private HashMap<String, Integer> mColumns;
        private final SQLiteDatabase mDb;
        private String mInsertSQL = null;
        private SQLiteStatement mInsertStatement = null;
        private SQLiteStatement mPreparedStatement = null;
        private SQLiteStatement mReplaceStatement = null;
        private final String mTableName;

        public InsertHelper(SQLiteDatabase sQLiteDatabase, String str) {
            this.mDb = sQLiteDatabase;
            this.mTableName = str;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:28:0x00b2 in {7, 8, 13, 14, 17, 19, 21, 23, 26, 27} preds:[]
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
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
            */
        private void buildSQL() {
            /*
            r11 = this;
            r0 = "'";
            r1 = ")";
            r2 = new java.lang.StringBuilder;
            r3 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
            r2.<init>(r3);
            r4 = "INSERT INTO ";
            r2.append(r4);
            r4 = r11.mTableName;
            r2.append(r4);
            r4 = " (";
            r2.append(r4);
            r4 = new java.lang.StringBuilder;
            r4.<init>(r3);
            r3 = "VALUES (";
            r4.append(r3);
            r3 = 0;
            r5 = r11.mDb;	 Catch:{ all -> 0x00ab }
            r6 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00ab }
            r7 = "PRAGMA table_info(";	 Catch:{ all -> 0x00ab }
            r6.<init>(r7);	 Catch:{ all -> 0x00ab }
            r7 = r11.mTableName;	 Catch:{ all -> 0x00ab }
            r6.append(r7);	 Catch:{ all -> 0x00ab }
            r6.append(r1);	 Catch:{ all -> 0x00ab }
            r6 = r6.toString();	 Catch:{ all -> 0x00ab }
            r3 = r5.rawQuery(r6, r3);	 Catch:{ all -> 0x00ab }
            r5 = new java.util.HashMap;	 Catch:{ all -> 0x00ab }
            r6 = r3.getCount();	 Catch:{ all -> 0x00ab }
            r5.<init>(r6);	 Catch:{ all -> 0x00ab }
            r11.mColumns = r5;	 Catch:{ all -> 0x00ab }
            r5 = 1;	 Catch:{ all -> 0x00ab }
            r6 = 1;	 Catch:{ all -> 0x00ab }
            r7 = r3.moveToNext();	 Catch:{ all -> 0x00ab }
            if (r7 == 0) goto L_0x009c;	 Catch:{ all -> 0x00ab }
            r7 = r3.getString(r5);	 Catch:{ all -> 0x00ab }
            r8 = 4;	 Catch:{ all -> 0x00ab }
            r8 = r3.getString(r8);	 Catch:{ all -> 0x00ab }
            r9 = r11.mColumns;	 Catch:{ all -> 0x00ab }
            r10 = java.lang.Integer.valueOf(r6);	 Catch:{ all -> 0x00ab }
            r9.put(r7, r10);	 Catch:{ all -> 0x00ab }
            r2.append(r0);	 Catch:{ all -> 0x00ab }
            r2.append(r7);	 Catch:{ all -> 0x00ab }
            r2.append(r0);	 Catch:{ all -> 0x00ab }
            if (r8 != 0) goto L_0x0074;	 Catch:{ all -> 0x00ab }
            r7 = "?";	 Catch:{ all -> 0x00ab }
            r4.append(r7);	 Catch:{ all -> 0x00ab }
            goto L_0x007f;	 Catch:{ all -> 0x00ab }
            r7 = "COALESCE(?, ";	 Catch:{ all -> 0x00ab }
            r4.append(r7);	 Catch:{ all -> 0x00ab }
            r4.append(r8);	 Catch:{ all -> 0x00ab }
            r4.append(r1);	 Catch:{ all -> 0x00ab }
            r7 = r3.getCount();	 Catch:{ all -> 0x00ab }
            r8 = ", ";
            if (r6 != r7) goto L_0x008a;
            r7 = ") ";	 Catch:{ all -> 0x00ab }
            goto L_0x008b;	 Catch:{ all -> 0x00ab }
            r7 = r8;	 Catch:{ all -> 0x00ab }
            r2.append(r7);	 Catch:{ all -> 0x00ab }
            r7 = r3.getCount();	 Catch:{ all -> 0x00ab }
            if (r6 != r7) goto L_0x0096;	 Catch:{ all -> 0x00ab }
            r8 = ");";	 Catch:{ all -> 0x00ab }
            r4.append(r8);	 Catch:{ all -> 0x00ab }
            r6 = r6 + 1;
            goto L_0x004b;
            if (r3 == 0) goto L_0x00a1;
            r3.close();
            r2.append(r4);
            r0 = r2.toString();
            r11.mInsertSQL = r0;
            return;
            r0 = move-exception;
            if (r3 == 0) goto L_0x00b1;
            r3.close();
            throw r0;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: net.sqlcipher.DatabaseUtils$InsertHelper.buildSQL():void");
        }

        private SQLiteStatement getStatement(boolean z) {
            if (z) {
                if (this.mReplaceStatement == null) {
                    if (this.mInsertSQL == null) {
                        buildSQL();
                    }
                    StringBuilder stringBuilder = new StringBuilder("INSERT OR REPLACE");
                    stringBuilder.append(this.mInsertSQL.substring(6));
                    this.mReplaceStatement = this.mDb.compileStatement(stringBuilder.toString());
                }
                return this.mReplaceStatement;
            }
            if (this.mInsertStatement == null) {
                if (this.mInsertSQL == null) {
                    buildSQL();
                }
                this.mInsertStatement = this.mDb.compileStatement(this.mInsertSQL);
            }
            return this.mInsertStatement;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:19:0x005a in {5, 8, 16, 18} preds:[]
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
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
            */
        private synchronized long insertInternal(android.content.ContentValues r4, boolean r5) {
            /*
            r3 = this;
            monitor-enter(r3);
            r5 = r3.getStatement(r5);	 Catch:{ SQLException -> 0x0036 }
            r5.clearBindings();	 Catch:{ SQLException -> 0x0036 }
            r0 = r4.valueSet();	 Catch:{ SQLException -> 0x0036 }
            r0 = r0.iterator();	 Catch:{ SQLException -> 0x0036 }
            r1 = r0.hasNext();	 Catch:{ SQLException -> 0x0036 }
            if (r1 == 0) goto L_0x002e;	 Catch:{ SQLException -> 0x0036 }
            r1 = r0.next();	 Catch:{ SQLException -> 0x0036 }
            r1 = (java.util.Map.Entry) r1;	 Catch:{ SQLException -> 0x0036 }
            r2 = r1.getKey();	 Catch:{ SQLException -> 0x0036 }
            r2 = (java.lang.String) r2;	 Catch:{ SQLException -> 0x0036 }
            r2 = r3.getColumnIndex(r2);	 Catch:{ SQLException -> 0x0036 }
            r1 = r1.getValue();	 Catch:{ SQLException -> 0x0036 }
            net.sqlcipher.DatabaseUtils.bindObjectToProgram(r5, r2, r1);	 Catch:{ SQLException -> 0x0036 }
            goto L_0x0010;	 Catch:{ SQLException -> 0x0036 }
            r4 = r5.executeInsert();	 Catch:{ SQLException -> 0x0036 }
            monitor-exit(r3);
            return r4;
            r4 = move-exception;
            goto L_0x0058;
            r5 = move-exception;
            r0 = "DatabaseUtils";	 Catch:{ all -> 0x0034 }
            r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0034 }
            r2 = "Error inserting ";	 Catch:{ all -> 0x0034 }
            r1.<init>(r2);	 Catch:{ all -> 0x0034 }
            r1.append(r4);	 Catch:{ all -> 0x0034 }
            r4 = " into table  ";	 Catch:{ all -> 0x0034 }
            r1.append(r4);	 Catch:{ all -> 0x0034 }
            r4 = r3.mTableName;	 Catch:{ all -> 0x0034 }
            r1.append(r4);	 Catch:{ all -> 0x0034 }
            r4 = r1.toString();	 Catch:{ all -> 0x0034 }
            android.util.Log.e(r0, r4, r5);	 Catch:{ all -> 0x0034 }
            r4 = -1;
            monitor-exit(r3);
            return r4;
            monitor-exit(r3);
            throw r4;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: net.sqlcipher.DatabaseUtils$InsertHelper.insertInternal(android.content.ContentValues, boolean):long");
        }

        public void bind(int i, double d) {
            this.mPreparedStatement.bindDouble(i, d);
        }

        public void bind(int i, float f) {
            this.mPreparedStatement.bindDouble(i, (double) f);
        }

        public void bind(int i, int i2) {
            this.mPreparedStatement.bindLong(i, (long) i2);
        }

        public void bind(int i, long j) {
            this.mPreparedStatement.bindLong(i, j);
        }

        public void bind(int i, String str) {
            if (str == null) {
                this.mPreparedStatement.bindNull(i);
            } else {
                this.mPreparedStatement.bindString(i, str);
            }
        }

        public void bind(int i, boolean z) {
            this.mPreparedStatement.bindLong(i, z ? 1 : 0);
        }

        public void bind(int i, byte[] bArr) {
            if (bArr == null) {
                this.mPreparedStatement.bindNull(i);
            } else {
                this.mPreparedStatement.bindBlob(i, bArr);
            }
        }

        public void bindNull(int i) {
            this.mPreparedStatement.bindNull(i);
        }

        public void close() {
            SQLiteStatement sQLiteStatement = this.mInsertStatement;
            if (sQLiteStatement != null) {
                sQLiteStatement.close();
                this.mInsertStatement = null;
            }
            sQLiteStatement = this.mReplaceStatement;
            if (sQLiteStatement != null) {
                sQLiteStatement.close();
                this.mReplaceStatement = null;
            }
            this.mInsertSQL = null;
            this.mColumns = null;
        }

        public long execute() {
            SQLiteStatement sQLiteStatement = this.mPreparedStatement;
            if (sQLiteStatement != null) {
                long executeInsert;
                try {
                    executeInsert = sQLiteStatement.executeInsert();
                    return executeInsert;
                } catch (SQLException e) {
                    executeInsert = DatabaseUtils.TAG;
                    StringBuilder stringBuilder = new StringBuilder("Error executing InsertHelper with table ");
                    stringBuilder.append(this.mTableName);
                    Log.e(executeInsert, stringBuilder.toString(), e);
                    return -1;
                } finally {
                    this.mPreparedStatement = null;
                }
            } else {
                throw new IllegalStateException("you must prepare this inserter before calling execute");
            }
        }

        public int getColumnIndex(String str) {
            getStatement(false);
            Integer num = (Integer) this.mColumns.get(str);
            if (num != null) {
                return num.intValue();
            }
            StringBuilder stringBuilder = new StringBuilder("column '");
            stringBuilder.append(str);
            stringBuilder.append("' is invalid");
            throw new IllegalArgumentException(stringBuilder.toString());
        }

        public long insert(ContentValues contentValues) {
            return insertInternal(contentValues, false);
        }

        public void prepareForInsert() {
            this.mPreparedStatement = getStatement(false);
            this.mPreparedStatement.clearBindings();
        }

        public void prepareForReplace() {
            this.mPreparedStatement = getStatement(true);
            this.mPreparedStatement.clearBindings();
        }

        public long replace(ContentValues contentValues) {
            return insertInternal(contentValues, true);
        }
    }

    public static void appendEscapedSQLString(StringBuilder stringBuilder, String str) {
        stringBuilder.append('\'');
        if (str.indexOf(39) != -1) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if (charAt == '\'') {
                    stringBuilder.append('\'');
                }
                stringBuilder.append(charAt);
            }
        } else {
            stringBuilder.append(str);
        }
        stringBuilder.append('\'');
    }

    public static final void appendValueToSql(StringBuilder stringBuilder, Object obj) {
        if (obj == null) {
            stringBuilder.append("NULL");
        } else if (!(obj instanceof Boolean)) {
            appendEscapedSQLString(stringBuilder, obj.toString());
        } else if (((Boolean) obj).booleanValue()) {
            stringBuilder.append('1');
        } else {
            stringBuilder.append('0');
        }
    }

    public static void bindObjectToProgram(SQLiteProgram sQLiteProgram, int i, Object obj) {
        if (obj == null) {
            sQLiteProgram.bindNull(i);
        } else if ((obj instanceof Double) || (obj instanceof Float)) {
            sQLiteProgram.bindDouble(i, ((Number) obj).doubleValue());
        } else if (obj instanceof Number) {
            sQLiteProgram.bindLong(i, ((Number) obj).longValue());
        } else if (obj instanceof Boolean) {
            if (((Boolean) obj).booleanValue()) {
                sQLiteProgram.bindLong(i, 1);
            } else {
                sQLiteProgram.bindLong(i, 0);
            }
        } else if (obj instanceof byte[]) {
            sQLiteProgram.bindBlob(i, (byte[]) obj);
        } else {
            sQLiteProgram.bindString(i, obj.toString());
        }
    }

    public static String concatenateWhere(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        StringBuilder stringBuilder = new StringBuilder("(");
        stringBuilder.append(str);
        stringBuilder.append(") AND (");
        stringBuilder.append(str2);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public static void cursorDoubleToContentValues(Cursor cursor, String str, ContentValues contentValues, String str2) {
        int columnIndex = cursor.getColumnIndex(str);
        contentValues.put(str2, !cursor.isNull(columnIndex) ? Double.valueOf(cursor.getDouble(columnIndex)) : null);
    }

    public static void cursorDoubleToContentValuesIfPresent(Cursor cursor, ContentValues contentValues, String str) {
        int columnIndexOrThrow = cursor.getColumnIndexOrThrow(str);
        if (!cursor.isNull(columnIndexOrThrow)) {
            contentValues.put(str, Double.valueOf(cursor.getDouble(columnIndexOrThrow)));
        }
    }

    public static void cursorDoubleToCursorValues(Cursor cursor, String str, ContentValues contentValues) {
        cursorDoubleToContentValues(cursor, str, contentValues, str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x006a A:{LOOP_END, LOOP:1: B:8:0x0027->B:28:0x006a} */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0066 A:{SYNTHETIC} */
    public static void cursorFillWindow(net.sqlcipher.Cursor r5, int r6, android.database.CursorWindow r7) {
        /*
        if (r6 < 0) goto L_0x0078;
    L_0x0002:
        r0 = r5.getCount();
        if (r6 < r0) goto L_0x0009;
    L_0x0008:
        goto L_0x0078;
    L_0x0009:
        r0 = r5.getPosition();
        r1 = r5.getColumnCount();
        r7.clear();
        r7.setStartPosition(r6);
        r7.setNumColumns(r1);
        r2 = r5.moveToPosition(r6);
        if (r2 == 0) goto L_0x0075;
    L_0x0020:
        r2 = r7.allocRow();
        if (r2 == 0) goto L_0x0075;
    L_0x0026:
        r2 = 0;
    L_0x0027:
        if (r2 >= r1) goto L_0x006d;
    L_0x0029:
        r3 = r5.getType(r2);
        if (r3 == 0) goto L_0x004e;
    L_0x002f:
        r4 = 1;
        if (r3 == r4) goto L_0x005c;
    L_0x0032:
        r4 = 2;
        if (r3 == r4) goto L_0x0053;
    L_0x0035:
        r4 = 4;
        if (r3 == r4) goto L_0x0043;
    L_0x0038:
        r3 = r5.getString(r2);
        if (r3 == 0) goto L_0x004e;
    L_0x003e:
        r3 = r7.putString(r3, r6, r2);
        goto L_0x0064;
    L_0x0043:
        r3 = r5.getBlob(r2);
        if (r3 == 0) goto L_0x004e;
    L_0x0049:
        r3 = r7.putBlob(r3, r6, r2);
        goto L_0x0064;
    L_0x004e:
        r3 = r7.putNull(r6, r2);
        goto L_0x0064;
    L_0x0053:
        r3 = r5.getDouble(r2);
        r3 = r7.putDouble(r3, r6, r2);
        goto L_0x0064;
    L_0x005c:
        r3 = r5.getLong(r2);
        r3 = r7.putLong(r3, r6, r2);
    L_0x0064:
        if (r3 != 0) goto L_0x006a;
    L_0x0066:
        r7.freeLastRow();
        goto L_0x006d;
    L_0x006a:
        r2 = r2 + 1;
        goto L_0x0027;
    L_0x006d:
        r6 = r6 + 1;
        r2 = r5.moveToNext();
        if (r2 != 0) goto L_0x0020;
    L_0x0075:
        r5.moveToPosition(r0);
    L_0x0078:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: net.sqlcipher.DatabaseUtils.cursorFillWindow(net.sqlcipher.Cursor, int, android.database.CursorWindow):void");
    }

    public static void cursorFloatToContentValuesIfPresent(Cursor cursor, ContentValues contentValues, String str) {
        int columnIndexOrThrow = cursor.getColumnIndexOrThrow(str);
        if (!cursor.isNull(columnIndexOrThrow)) {
            contentValues.put(str, Float.valueOf(cursor.getFloat(columnIndexOrThrow)));
        }
    }

    public static void cursorIntToContentValues(Cursor cursor, String str, ContentValues contentValues) {
        cursorIntToContentValues(cursor, str, contentValues, str);
    }

    public static void cursorIntToContentValues(Cursor cursor, String str, ContentValues contentValues, String str2) {
        int columnIndex = cursor.getColumnIndex(str);
        contentValues.put(str2, !cursor.isNull(columnIndex) ? Integer.valueOf(cursor.getInt(columnIndex)) : null);
    }

    public static void cursorIntToContentValuesIfPresent(Cursor cursor, ContentValues contentValues, String str) {
        int columnIndexOrThrow = cursor.getColumnIndexOrThrow(str);
        if (!cursor.isNull(columnIndexOrThrow)) {
            contentValues.put(str, Integer.valueOf(cursor.getInt(columnIndexOrThrow)));
        }
    }

    public static void cursorLongToContentValues(Cursor cursor, String str, ContentValues contentValues) {
        cursorLongToContentValues(cursor, str, contentValues, str);
    }

    public static void cursorLongToContentValues(Cursor cursor, String str, ContentValues contentValues, String str2) {
        int columnIndex = cursor.getColumnIndex(str);
        contentValues.put(str2, !cursor.isNull(columnIndex) ? Long.valueOf(cursor.getLong(columnIndex)) : null);
    }

    public static void cursorLongToContentValuesIfPresent(Cursor cursor, ContentValues contentValues, String str) {
        int columnIndexOrThrow = cursor.getColumnIndexOrThrow(str);
        if (!cursor.isNull(columnIndexOrThrow)) {
            contentValues.put(str, Long.valueOf(cursor.getLong(columnIndexOrThrow)));
        }
    }

    public static void cursorRowToContentValues(Cursor cursor, ContentValues contentValues) {
        AbstractWindowedCursor abstractWindowedCursor = cursor instanceof AbstractWindowedCursor ? (AbstractWindowedCursor) cursor : null;
        String[] columnNames = cursor.getColumnNames();
        int length = columnNames.length;
        int i = 0;
        while (i < length) {
            if (abstractWindowedCursor == null || !abstractWindowedCursor.isBlob(i)) {
                contentValues.put(columnNames[i], cursor.getString(i));
            } else {
                contentValues.put(columnNames[i], cursor.getBlob(i));
            }
            i++;
        }
    }

    public static void cursorShortToContentValuesIfPresent(Cursor cursor, ContentValues contentValues, String str) {
        int columnIndexOrThrow = cursor.getColumnIndexOrThrow(str);
        if (!cursor.isNull(columnIndexOrThrow)) {
            contentValues.put(str, Short.valueOf(cursor.getShort(columnIndexOrThrow)));
        }
    }

    public static void cursorStringToContentValues(Cursor cursor, String str, ContentValues contentValues) {
        cursorStringToContentValues(cursor, str, contentValues, str);
    }

    public static void cursorStringToContentValues(Cursor cursor, String str, ContentValues contentValues, String str2) {
        contentValues.put(str2, cursor.getString(cursor.getColumnIndexOrThrow(str)));
    }

    public static void cursorStringToContentValuesIfPresent(Cursor cursor, ContentValues contentValues, String str) {
        int columnIndexOrThrow = cursor.getColumnIndexOrThrow(str);
        if (!cursor.isNull(columnIndexOrThrow)) {
            contentValues.put(str, cursor.getString(columnIndexOrThrow));
        }
    }

    public static void cursorStringToInsertHelper(Cursor cursor, String str, InsertHelper insertHelper, int i) {
        insertHelper.bind(i, cursor.getString(cursor.getColumnIndexOrThrow(str)));
    }

    public static void dumpCurrentRow(Cursor cursor) {
        dumpCurrentRow(cursor, System.out);
    }

    public static void dumpCurrentRow(Cursor cursor, PrintStream printStream) {
        String[] columnNames = cursor.getColumnNames();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(cursor.getPosition());
        stringBuilder.append(" {");
        printStream.println(stringBuilder.toString());
        int length = columnNames.length;
        for (int i = 0; i < length; i++) {
            String string;
            try {
                string = cursor.getString(i);
            } catch (SQLiteException unused) {
                string = "<unprintable>";
            }
            StringBuilder stringBuilder2 = new StringBuilder("   ");
            stringBuilder2.append(columnNames[i]);
            stringBuilder2.append('=');
            stringBuilder2.append(string);
            printStream.println(stringBuilder2.toString());
        }
        printStream.println("}");
    }

    public static void dumpCurrentRow(Cursor cursor, StringBuilder stringBuilder) {
        String[] columnNames = cursor.getColumnNames();
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(cursor.getPosition());
        stringBuilder2.append(" {\n");
        stringBuilder.append(stringBuilder2.toString());
        int length = columnNames.length;
        for (int i = 0; i < length; i++) {
            String string;
            try {
                string = cursor.getString(i);
            } catch (SQLiteException unused) {
                string = "<unprintable>";
            }
            StringBuilder stringBuilder3 = new StringBuilder("   ");
            stringBuilder3.append(columnNames[i]);
            stringBuilder3.append('=');
            stringBuilder3.append(string);
            stringBuilder3.append("\n");
            stringBuilder.append(stringBuilder3.toString());
        }
        stringBuilder.append("}\n");
    }

    public static String dumpCurrentRowToString(Cursor cursor) {
        StringBuilder stringBuilder = new StringBuilder();
        dumpCurrentRow(cursor, stringBuilder);
        return stringBuilder.toString();
    }

    public static void dumpCursor(Cursor cursor) {
        dumpCursor(cursor, System.out);
    }

    public static void dumpCursor(Cursor cursor, PrintStream printStream) {
        printStream.println(">>>>> Dumping cursor ".concat(String.valueOf(cursor)));
        if (cursor != null) {
            int position = cursor.getPosition();
            cursor.moveToPosition(-1);
            while (cursor.moveToNext()) {
                dumpCurrentRow(cursor, printStream);
            }
            cursor.moveToPosition(position);
        }
        printStream.println("<<<<<");
    }

    public static void dumpCursor(Cursor cursor, StringBuilder stringBuilder) {
        StringBuilder stringBuilder2 = new StringBuilder(">>>>> Dumping cursor ");
        stringBuilder2.append(cursor);
        stringBuilder2.append("\n");
        stringBuilder.append(stringBuilder2.toString());
        if (cursor != null) {
            int position = cursor.getPosition();
            cursor.moveToPosition(-1);
            while (cursor.moveToNext()) {
                dumpCurrentRow(cursor, stringBuilder);
            }
            cursor.moveToPosition(position);
        }
        stringBuilder.append("<<<<<\n");
    }

    public static String dumpCursorToString(Cursor cursor) {
        StringBuilder stringBuilder = new StringBuilder();
        dumpCursor(cursor, stringBuilder);
        return stringBuilder.toString();
    }

    private static char[] encodeHex(byte[] bArr, char[] cArr) {
        int length = bArr.length;
        char[] cArr2 = new char[(length << 1)];
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i + 1;
            cArr2[i] = cArr[(bArr[i2] & 240) >>> 4];
            i = i3 + 1;
            cArr2[i3] = cArr[bArr[i2] & 15];
        }
        return cArr2;
    }

    public static String getCollationKey(String str) {
        byte[] collationKeyInBytes = getCollationKeyInBytes(str);
        try {
            return new String(collationKeyInBytes, 0, getKeyLen(collationKeyInBytes), "ISO8859_1");
        } catch (Exception unused) {
            return "";
        }
    }

    private static byte[] getCollationKeyInBytes(String str) {
        if (mColl == null) {
            Collator instance = Collator.getInstance();
            mColl = instance;
            instance.setStrength(0);
        }
        return mColl.getCollationKey(str).toByteArray();
    }

    public static String getHexCollationKey(String str) {
        byte[] collationKeyInBytes = getCollationKeyInBytes(str);
        return new String(encodeHex(collationKeyInBytes, HEX_DIGITS_LOWER), 0, getKeyLen(collationKeyInBytes) << 1);
    }

    private static int getKeyLen(byte[] bArr) {
        return bArr[bArr.length + -1] != (byte) 0 ? bArr.length : bArr.length - 1;
    }

    public static int getTypeOfObject(Object obj) {
        return obj == null ? 0 : obj instanceof byte[] ? 4 : ((obj instanceof Float) || (obj instanceof Double)) ? 2 : ((obj instanceof Long) || (obj instanceof Integer)) ? 1 : 3;
    }

    public static long longForQuery(SQLiteDatabase sQLiteDatabase, String str, String[] strArr) {
        SQLiteStatement compileStatement = sQLiteDatabase.compileStatement(str);
        try {
            long longForQuery = longForQuery(compileStatement, strArr);
            return longForQuery;
        } finally {
            compileStatement.close();
        }
    }

    public static long longForQuery(SQLiteStatement sQLiteStatement, String[] strArr) {
        if (strArr != null) {
            int length = strArr.length;
            int i = 0;
            while (i < length) {
                int i2 = i + 1;
                bindObjectToProgram(sQLiteStatement, i2, strArr[i]);
                i = i2;
            }
        }
        return sQLiteStatement.simpleQueryForLong();
    }

    public static long queryNumEntries(SQLiteDatabase sQLiteDatabase, String str) {
        long j = sQLiteDatabase;
        Cursor query = j.query(str, countProjection, null, null, null, null, null);
        try {
            query.moveToFirst();
            j = query.getLong(0);
            return j;
        } finally {
            query.close();
        }
    }

    public static final void readExceptionFromParcel(Parcel parcel) {
        int readInt = parcel.readInt();
        if (readInt != 0) {
            readExceptionFromParcel(parcel, parcel.readString(), readInt);
        }
    }

    private static final void readExceptionFromParcel(Parcel parcel, String str, int i) {
        switch (i) {
            case 2:
                throw new IllegalArgumentException(str);
            case 3:
                throw new UnsupportedOperationException(str);
            case 4:
                throw new SQLiteAbortException(str);
            case 5:
                throw new SQLiteConstraintException(str);
            case 6:
                throw new SQLiteDatabaseCorruptException(str);
            case 7:
                throw new SQLiteFullException(str);
            case 8:
                throw new SQLiteDiskIOException(str);
            case 9:
                throw new SQLiteException(str);
            default:
                parcel.readException(i, str);
                return;
        }
    }

    public static void readExceptionWithFileNotFoundExceptionFromParcel(Parcel parcel) {
        int readInt = parcel.readInt();
        if (readInt != 0) {
            String readString = parcel.readString();
            if (readInt != 1) {
                readExceptionFromParcel(parcel, readString, readInt);
                return;
            }
            throw new FileNotFoundException(readString);
        }
    }

    public static void readExceptionWithOperationApplicationExceptionFromParcel(Parcel parcel) {
        int readInt = parcel.readInt();
        if (readInt != 0) {
            String readString = parcel.readString();
            if (readInt != 10) {
                readExceptionFromParcel(parcel, readString, readInt);
                return;
            }
            throw new OperationApplicationException(readString);
        }
    }

    public static String sqlEscapeString(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        appendEscapedSQLString(stringBuilder, str);
        return stringBuilder.toString();
    }

    public static String stringForQuery(SQLiteDatabase sQLiteDatabase, String str, String[] strArr) {
        SQLiteStatement compileStatement = sQLiteDatabase.compileStatement(str);
        try {
            str = stringForQuery(compileStatement, strArr);
            return str;
        } finally {
            compileStatement.close();
        }
    }

    public static String stringForQuery(SQLiteStatement sQLiteStatement, String[] strArr) {
        if (strArr != null) {
            int length = strArr.length;
            int i = 0;
            while (i < length) {
                int i2 = i + 1;
                bindObjectToProgram(sQLiteStatement, i2, strArr[i]);
                i = i2;
            }
        }
        return sQLiteStatement.simpleQueryForString();
    }

    public static final void writeExceptionToParcel(Parcel parcel, Exception exception) {
        int i;
        boolean z = exception instanceof FileNotFoundException;
        String str = "Writing exception to parcel";
        String str2 = TAG;
        Object obj = 1;
        if (z) {
            i = 1;
            obj = null;
        } else if (exception instanceof IllegalArgumentException) {
            i = 2;
        } else if (exception instanceof UnsupportedOperationException) {
            i = 3;
        } else if (exception instanceof SQLiteAbortException) {
            i = 4;
        } else if (exception instanceof SQLiteConstraintException) {
            i = 5;
        } else if (exception instanceof SQLiteDatabaseCorruptException) {
            i = 6;
        } else if (exception instanceof SQLiteFullException) {
            i = 7;
        } else if (exception instanceof SQLiteDiskIOException) {
            i = 8;
        } else if (exception instanceof SQLiteException) {
            i = 9;
        } else if (exception instanceof OperationApplicationException) {
            i = 10;
        } else {
            parcel.writeException(exception);
            Log.e(str2, str, exception);
            return;
        }
        parcel.writeInt(i);
        parcel.writeString(exception.getMessage());
        if (obj != null) {
            Log.e(str2, str, exception);
        }
    }
}
