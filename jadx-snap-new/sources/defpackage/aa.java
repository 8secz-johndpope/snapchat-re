package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteTransactionListener;
import android.util.Pair;
import java.io.Closeable;
import java.util.List;

/* renamed from: aa */
public interface aa extends Closeable {
    void beginTransaction();

    void beginTransactionWithListener(SQLiteTransactionListener sQLiteTransactionListener);

    ae compileStatement(String str);

    void endTransaction();

    void execSQL(String str);

    void execSQL(String str, Object[] objArr);

    List<Pair<String, String>> getAttachedDbs();

    String getPath();

    boolean inTransaction();

    long insert(String str, int i, ContentValues contentValues);

    boolean isOpen();

    Cursor query(ad adVar);

    Cursor query(String str);

    Cursor query(String str, Object[] objArr);

    void setTransactionSuccessful();

    int update(String str, int i, ContentValues contentValues, String str2, Object[] objArr);

    boolean yieldIfContendedSafely();

    boolean yieldIfContendedSafely(long j);
}
