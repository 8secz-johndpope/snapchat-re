package com.snap.core.db.api.androidxSqlbrite;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import android.util.Pair;
import defpackage.aa;
import defpackage.ad;
import defpackage.ae;
import defpackage.akcr;
import defpackage.pa;
import defpackage.pd;
import java.util.List;
import java.util.Locale;

public final class AndroidxToSupportSqliteDatabase implements aa {
    private final pa database;

    public AndroidxToSupportSqliteDatabase(pa paVar) {
        akcr.b(paVar, "database");
        this.database = paVar;
    }

    public final void beginTransaction() {
        this.database.a();
    }

    public final void beginTransactionNonExclusive() {
        this.database.b();
    }

    public final void beginTransactionWithListener(SQLiteTransactionListener sQLiteTransactionListener) {
        this.database.a(sQLiteTransactionListener);
    }

    public final void beginTransactionWithListenerNonExclusive(SQLiteTransactionListener sQLiteTransactionListener) {
        akcr.b(sQLiteTransactionListener, "transactionListener");
        this.database.b(sQLiteTransactionListener);
    }

    public final void close() {
        this.database.close();
    }

    public final ae compileStatement(String str) {
        akcr.b(str, "sql");
        Object a = this.database.a(str);
        akcr.a(a, "database.compileStatement(sql)");
        return new AndroidxToSupportSqliteStatement(a);
    }

    public final int delete(String str, String str2, Object[] objArr) {
        return this.database.a(str, str2, objArr);
    }

    public final void disableWriteAheadLogging() {
        this.database.o();
    }

    public final boolean enableWriteAheadLogging() {
        return this.database.n();
    }

    public final void endTransaction() {
        this.database.c();
    }

    public final void execSQL(String str) {
        this.database.c(str);
    }

    public final void execSQL(String str, Object[] objArr) {
        this.database.b(str, objArr);
    }

    public final List<Pair<String, String>> getAttachedDbs() {
        Object q = this.database.q();
        akcr.a(q, "database.attachedDbs");
        return q;
    }

    public final pa getDatabase() {
        return this.database;
    }

    public final long getMaximumSize() {
        return this.database.i();
    }

    public final long getPageSize() {
        return this.database.j();
    }

    public final String getPath() {
        Object m = this.database.m();
        akcr.a(m, "database.path");
        return m;
    }

    public final int getVersion() {
        return this.database.h();
    }

    public final boolean inTransaction() {
        return this.database.e();
    }

    public final long insert(String str, int i, ContentValues contentValues) {
        return this.database.a(str, i, contentValues);
    }

    public final boolean isDatabaseIntegrityOk() {
        return this.database.r();
    }

    public final boolean isDbLockedByCurrentThread() {
        return this.database.f();
    }

    public final boolean isOpen() {
        return this.database.l();
    }

    public final boolean isReadOnly() {
        return this.database.k();
    }

    public final boolean isWriteAheadLoggingEnabled() {
        return this.database.p();
    }

    public final boolean needUpgrade(int i) {
        return this.database.b(i);
    }

    public final Cursor query(ad adVar) {
        akcr.b(adVar, "query");
        Object a = this.database.a((pd) new SupportSQLiteToAndroidxQuery(adVar));
        akcr.a(a, "database.query(SupportSQ…teToAndroidxQuery(query))");
        return a;
    }

    public final Cursor query(ad adVar, CancellationSignal cancellationSignal) {
        akcr.b(adVar, "query");
        Object a = this.database.a((pd) new SupportSQLiteToAndroidxQuery(adVar), cancellationSignal);
        akcr.a(a, "database.query(SupportSQ…ery), cancellationSignal)");
        return a;
    }

    public final Cursor query(String str) {
        Object b = this.database.b(str);
        akcr.a(b, "database.query(query)");
        return b;
    }

    public final Cursor query(String str, Object[] objArr) {
        Object a = this.database.a(str, objArr);
        akcr.a(a, "database.query(query, bindArgs)");
        return a;
    }

    public final void setForeignKeyConstraintsEnabled(boolean z) {
        this.database.a(z);
    }

    public final void setLocale(Locale locale) {
        this.database.a(locale);
    }

    public final void setMaxSqlCacheSize(int i) {
        this.database.c(i);
    }

    public final long setMaximumSize(long j) {
        return this.database.b(j);
    }

    public final void setPageSize(long j) {
        this.database.c(j);
    }

    public final void setTransactionSuccessful() {
        this.database.d();
    }

    public final void setVersion(int i) {
        this.database.a(i);
    }

    public final int update(String str, int i, ContentValues contentValues, String str2, Object[] objArr) {
        return this.database.a(str, i, contentValues, str2, objArr);
    }

    public final boolean yieldIfContendedSafely() {
        return this.database.g();
    }

    public final boolean yieldIfContendedSafely(long j) {
        return this.database.a(j);
    }
}
