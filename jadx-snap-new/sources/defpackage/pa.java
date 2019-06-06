package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import android.util.Pair;
import java.io.Closeable;
import java.util.List;
import java.util.Locale;

/* renamed from: pa */
public interface pa extends Closeable {
    int a(String str, int i, ContentValues contentValues, String str2, Object[] objArr);

    int a(String str, String str2, Object[] objArr);

    long a(String str, int i, ContentValues contentValues);

    Cursor a(String str, Object[] objArr);

    Cursor a(pd pdVar);

    Cursor a(pd pdVar, CancellationSignal cancellationSignal);

    pe a(String str);

    void a();

    void a(int i);

    void a(SQLiteTransactionListener sQLiteTransactionListener);

    void a(Locale locale);

    void a(boolean z);

    boolean a(long j);

    long b(long j);

    Cursor b(String str);

    void b();

    void b(SQLiteTransactionListener sQLiteTransactionListener);

    void b(String str, Object[] objArr);

    boolean b(int i);

    void c();

    void c(int i);

    void c(long j);

    void c(String str);

    void d();

    boolean e();

    boolean f();

    boolean g();

    int h();

    long i();

    long j();

    boolean k();

    boolean l();

    String m();

    boolean n();

    void o();

    boolean p();

    List<Pair<String, String>> q();

    boolean r();
}
