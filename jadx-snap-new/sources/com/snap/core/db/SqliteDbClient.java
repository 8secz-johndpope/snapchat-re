package com.snap.core.db;

import android.database.Cursor;
import android.database.MatrixCursor;
import android.database.SQLException;
import com.snap.core.db.api.DbClient;
import com.snap.core.db.api.DbLogger;
import com.snap.core.db.api.DbTransaction;
import defpackage.aimv;
import defpackage.aimw;
import defpackage.aimz.c;
import defpackage.ainw;
import defpackage.ainx;
import defpackage.ainy;
import defpackage.ajcx;
import defpackage.ajdp;
import defpackage.ajdw;
import defpackage.ajdx;
import defpackage.ajfb;
import defpackage.ajhn;
import defpackage.ajot;
import defpackage.ajsn;
import defpackage.ajvo;
import defpackage.ajwl;
import defpackage.ajxe;
import defpackage.ajxh;
import defpackage.ajxj;
import defpackage.ajxw;
import defpackage.ajyw;
import defpackage.akbk;
import defpackage.akbl;
import defpackage.akcr;
import defpackage.akdc;
import defpackage.akde;
import defpackage.aken;
import defpackage.ide;
import defpackage.igb;
import defpackage.ihh;
import defpackage.in;
import defpackage.pa;
import defpackage.zfd;
import java.util.List;
import java.util.Set;

public final class SqliteDbClient implements DbClient {
    static final /* synthetic */ aken[] $$delegatedProperties = new aken[]{new akdc(akde.a(SqliteDbClient.class), "briteDb", "getBriteDb()Lcom/squareup/sqlbrite3/BriteDatabase;"), new akdc(akde.a(SqliteDbClient.class), "briteDbSingle", "getBriteDbSingle()Lio/reactivex/Single;"), new akdc(akde.a(SqliteDbClient.class), "tagInsert", "getTagInsert()Ljava/lang/String;"), new akdc(akde.a(SqliteDbClient.class), "tagUpdateDelete", "getTagUpdateDelete()Ljava/lang/String;"), new akdc(akde.a(SqliteDbClient.class), "tagQuery", "getTagQuery()Ljava/lang/String;"), new akdc(akde.a(SqliteDbClient.class), "tagQueryMapList", "getTagQueryMapList()Ljava/lang/String;"), new akdc(akde.a(SqliteDbClient.class), "tagQueryMapOne", "getTagQueryMapOne()Ljava/lang/String;"), new akdc(akde.a(SqliteDbClient.class), "tagQueryFirst", "getTagQueryFirst()Ljava/lang/String;")};
    private final ide attributedFeature;
    private final ajxe briteDb$delegate = ajxh.a(ajxj.PUBLICATION, new SqliteDbClient$briteDb$2(this));
    private final ajxe briteDbSingle$delegate = ajxh.a(ajxj.PUBLICATION, new SqliteDbClient$briteDbSingle$2(this));
    private final ajdw clientQueriesScheduler;
    private final ihh clock;
    private final DbLogger dbLogger;
    private final SqliteDbManager dbManager;
    private final MatrixCursor emptyCursor = new MatrixCursor(new String[0]);
    private final aimw emptyQueryObservable = new aimw(ajvo.a(ajot.a));
    private final String name = this.attributedFeature.getName();
    private final igb noDiskExceptionDetector;
    private final ajwl<Boolean> noDiskSpaceBehaviorSubject;
    private final int sessionId;
    private final ajxe tagInsert$delegate = ajxh.a(ajxj.PUBLICATION, new SqliteDbClient$tagInsert$2(this));
    private final ajxe tagQuery$delegate = ajxh.a(ajxj.PUBLICATION, new SqliteDbClient$tagQuery$2(this));
    private final ajxe tagQueryFirst$delegate = ajxh.a(ajxj.PUBLICATION, new SqliteDbClient$tagQueryFirst$2(this));
    private final ajxe tagQueryMapList$delegate = ajxh.a(ajxj.PUBLICATION, new SqliteDbClient$tagQueryMapList$2(this));
    private final ajxe tagQueryMapOne$delegate = ajxh.a(ajxj.PUBLICATION, new SqliteDbClient$tagQueryMapOne$2(this));
    private final ajxe tagUpdateDelete$delegate = ajxh.a(ajxj.PUBLICATION, new SqliteDbClient$tagUpdateDelete$2(this));

    public SqliteDbClient(ide ide, SqliteDbManager sqliteDbManager, ajdw ajdw, int i, ihh ihh, DbLogger dbLogger, igb igb) {
        akcr.b(ide, "attributedFeature");
        akcr.b(sqliteDbManager, "dbManager");
        akcr.b(ajdw, "clientQueriesScheduler");
        akcr.b(ihh, "clock");
        akcr.b(dbLogger, "dbLogger");
        akcr.b(igb, "noDiskExceptionDetector");
        this.attributedFeature = ide;
        this.dbManager = sqliteDbManager;
        this.clientQueriesScheduler = ajdw;
        this.sessionId = i;
        this.clock = ihh;
        this.dbLogger = dbLogger;
        this.noDiskExceptionDetector = igb;
        Object ajwl = new ajwl();
        akcr.a(ajwl, "BehaviorSubject.create<Boolean>()");
        this.noDiskSpaceBehaviorSubject = ajwl;
    }

    private final <T> T attempt(String str, akbk<? extends T> akbk, T t) {
        try {
            if (isValid()) {
                return akbk.invoke();
            }
        } catch (SQLException e) {
            if (isValid()) {
                Throwable th = e;
                if (this.noDiskExceptionDetector.b(th)) {
                    this.noDiskExceptionDetector.a(th);
                    return t;
                }
                throw new zfd(this.attributedFeature.callsite(str), th, null, 12);
            }
        } catch (IllegalStateException e2) {
            if (isValid()) {
                throw new zfd(this.attributedFeature.callsite(str), (Throwable) e2, null, 12);
            }
        }
        return t;
    }

    private final <T> ajdp<T> checkDbValid(ajdp<T> ajdp, T t) {
        Object q = ajdp.q(new SqliteDbClient$checkDbValid$1(this, t));
        akcr.a(q, "this.onErrorResumeNext {…t(defaultValue)\n        }");
        return q;
    }

    private final ajdp<c> createQuery(ainx ainx) {
        Object sql = ainx.getSql();
        akcr.a(sql, "statement.sql");
        return (ajdp) attempt(sql, new SqliteDbClient$createQuery$1(this, ainx), this.emptyQueryObservable);
    }

    private final ajdp<c> createQuery(Set<String> set, ainx ainx) {
        Object sql = ainx.getSql();
        akcr.a(sql, "statement.sql");
        return (ajdp) attempt(sql, new SqliteDbClient$createQuery$2(this, set, ainx), this.emptyQueryObservable);
    }

    private final aimv getBriteDb() {
        return (aimv) this.briteDb$delegate.b();
    }

    private final ajdx<aimv> getBriteDbSingle() {
        return (ajdx) this.briteDbSingle$delegate.b();
    }

    private final String getTagInsert() {
        return (String) this.tagInsert$delegate.b();
    }

    private final String getTagQuery() {
        return (String) this.tagQuery$delegate.b();
    }

    private final String getTagQueryFirst() {
        return (String) this.tagQueryFirst$delegate.b();
    }

    private final String getTagQueryMapList() {
        return (String) this.tagQueryMapList$delegate.b();
    }

    private final String getTagQueryMapOne() {
        return (String) this.tagQueryMapOne$delegate.b();
    }

    private final String getTagUpdateDelete() {
        return (String) this.tagUpdateDelete$delegate.b();
    }

    public final <T> ajdx<T> callInTransaction(String str, akbl<? super DbTransaction, ? extends T> akbl) {
        akcr.b(str, "queryTag");
        akcr.b(akbl, "consumer");
        Object attempt = attempt(str, new SqliteDbClient$callInTransaction$1(this, str, akbl), ajvo.a(ajsn.a));
        akcr.a(attempt, "attempt(queryTag, { dbMa…nsumer)}, Single.never())");
        return (ajdx) attempt;
    }

    public final void execute(String str) {
        akcr.b(str, "sql");
        attempt(str, new SqliteDbClient$execute$1(this, str), ajxw.a);
    }

    public final void executeAndTrigger(String str, String str2, Object... objArr) {
        akcr.b(str, "table");
        akcr.b(str2, "sql");
        akcr.b(objArr, "args");
        attempt(str, new SqliteDbClient$executeAndTrigger$1(this, str, str2, objArr), ajxw.a);
    }

    public final long executeInsert(ainy ainy) {
        akcr.b(ainy, "statement");
        in.a(getTagInsert());
        try {
            this.dbManager.throwIfNotDbScheduler();
            long a = this.clock.a();
            Object table = ainy.getTable();
            akcr.a(table, "statement.table");
            long longValue = ((Number) attempt(table, new SqliteDbClient$executeInsert$$inlined$systrace$lambda$1(this, ainy), Long.valueOf(-1))).longValue();
            this.dbLogger.logLongRunningDbExecutionIfNeededWithStatement(ainy, this.clock.a() - a);
            return longValue;
        } finally {
            in.a();
        }
    }

    public final long executeInsert(ainy ainy, DbTransaction dbTransaction) {
        akcr.b(ainy, "statement");
        akcr.b(dbTransaction, "tx");
        dbTransaction.checkInTransaction();
        return executeInsert(ainy);
    }

    public final int executeUpdateDelete(ainy ainy) {
        akcr.b(ainy, "statement");
        in.a(getTagUpdateDelete());
        try {
            this.dbManager.throwIfNotDbScheduler();
            long a = this.clock.a();
            Object table = ainy.getTable();
            akcr.a(table, "statement.table");
            int intValue = ((Number) attempt(table, new SqliteDbClient$executeUpdateDelete$$inlined$systrace$lambda$1(this, ainy), Integer.valueOf(-1))).intValue();
            this.dbLogger.logLongRunningDbExecutionIfNeededWithStatement(ainy, this.clock.a() - a);
            return intValue;
        } finally {
            in.a();
        }
    }

    public final int executeUpdateDelete(ainy ainy, DbTransaction dbTransaction) {
        akcr.b(ainy, "statement");
        akcr.b(dbTransaction, "tx");
        dbTransaction.checkInTransaction();
        return executeUpdateDelete(ainy);
    }

    public final pa getWritableDatabase() {
        this.dbManager.throwIfNotDbScheduler();
        Object database = this.dbManager.getDatabase();
        akcr.a(database, "dbManager.database");
        return database;
    }

    public final boolean isValid() {
        return this.sessionId == this.dbManager.getSessionId();
    }

    public final Cursor query(ainx ainx) {
        akcr.b(ainx, "statement");
        in.a(getTagQuery());
        try {
            Object sql = ainx.getSql();
            akcr.a(sql, "statement.sql");
            Object attempt = attempt(sql, new SqliteDbClient$query$$inlined$systrace$lambda$1(this, ainx), this.emptyCursor);
            akcr.a(attempt, "attempt(statement.sql, {…tatement))}, emptyCursor)");
            Cursor cursor = (Cursor) attempt;
            return cursor;
        } finally {
            in.a();
        }
    }

    public final Cursor query(String str) {
        akcr.b(str, "statement");
        in.a(getTagQuery());
        try {
            Object attempt = attempt(str, new SqliteDbClient$query$$inlined$systrace$lambda$2(this, str), this.emptyCursor);
            akcr.a(attempt, "attempt(statement, {brit…statement)}, emptyCursor)");
            Cursor cursor = (Cursor) attempt;
            return cursor;
        } finally {
            in.a();
        }
    }

    public final <R> List<R> query(ainx ainx, ainw<R> ainw) {
        akcr.b(ainx, "statement");
        akcr.b(ainw, "mapper");
        in.a(getTagQuery());
        try {
            List<R> list = (List) attempt("query", new SqliteDbClient$query$$inlined$systrace$lambda$3(this, ainx, ainw), ajyw.a);
            return list;
        } finally {
            in.a();
        }
    }

    public final <R> boolean query(ainx ainx, ainw<R> ainw, akbl<? super R, ajxw> akbl) {
        akcr.b(ainx, "statement");
        akcr.b(ainw, "mapper");
        akcr.b(akbl, "handler");
        return ((Boolean) attempt("query", new SqliteDbClient$query$4(this, ainx, ainw, akbl), Boolean.FALSE)).booleanValue();
    }

    public final <T> ajdp<List<T>> queryAndMapToList(ainx ainx, akbl<? super Cursor, ? extends T> akbl) {
        akcr.b(ainx, "statement");
        akcr.b(akbl, "mapper");
        return queryAndMapToList(getTagQueryMapList(), ainx, akbl);
    }

    public final <T> ajdp<List<T>> queryAndMapToList(String str, ainx ainx, akbl<? super Cursor, ? extends T> akbl) {
        akcr.b(str, "tag");
        akcr.b(ainx, "statement");
        akcr.b(akbl, "mapper");
        Object a = createQuery(ainx).a(this.clientQueriesScheduler).d((ajfb) new SqliteDbClient$queryAndMapToList$1(str)).a(c.b(new SqliteDbClient$sam$io_reactivex_functions_Function$0(akbl)));
        akcr.a(a, "createQuery(statement)\n …ery.mapToList<T>(mapper))");
        Object q = checkDbValid(a, ajyw.a).d((ajfb) SqliteDbClient$queryAndMapToList$2.INSTANCE).q(new SqliteDbClient$queryAndMapToList$3(this, str));
        akcr.a(q, "createQuery(statement)\n ….callsite(tag), error)) }");
        return q;
    }

    public final <T> ajdp<List<T>> queryAndMapToList(String str, Set<String> set, ainx ainx, akbl<? super Cursor, ? extends T> akbl) {
        akcr.b(str, "tag");
        akcr.b(set, "tables");
        akcr.b(ainx, "statement");
        akcr.b(akbl, "mapper");
        Object a = createQuery(set, ainx).a(this.clientQueriesScheduler).d((ajfb) new SqliteDbClient$queryAndMapToList$4(str)).a(c.b(new SqliteDbClient$sam$io_reactivex_functions_Function$0(akbl)));
        akcr.a(a, "createQuery(tables, stat…ery.mapToList<T>(mapper))");
        Object q = checkDbValid(a, ajyw.a).d((ajfb) SqliteDbClient$queryAndMapToList$5.INSTANCE).q(new SqliteDbClient$queryAndMapToList$6(this, str));
        akcr.a(q, "createQuery(tables, stat….callsite(tag), error)) }");
        return q;
    }

    public final <T> ajdp<T> queryAndMapToOne(ainx ainx, akbl<? super Cursor, ? extends T> akbl) {
        akcr.b(ainx, "statement");
        akcr.b(akbl, "mapper");
        return queryAndMapToOne(getTagQueryMapOne(), ainx, akbl);
    }

    public final <T> ajdp<T> queryAndMapToOne(String str, ainx ainx, akbl<? super Cursor, ? extends T> akbl) {
        akcr.b(str, "tag");
        akcr.b(ainx, "statement");
        akcr.b(akbl, "mapper");
        Object q = createQuery(ainx).a(this.clientQueriesScheduler).d((ajfb) new SqliteDbClient$queryAndMapToOne$1(str)).a(c.a(new SqliteDbClient$sam$io_reactivex_functions_Function$0(akbl))).d((ajfb) SqliteDbClient$queryAndMapToOne$2.INSTANCE).q(new SqliteDbClient$queryAndMapToOne$3(this, str));
        akcr.a(q, "createQuery(statement)\n ….callsite(tag), error)) }");
        return q;
    }

    public final <T> ajdx<T> queryAndMapToOneOrDefault(ainx ainx, akbl<? super Cursor, ? extends T> akbl, T t) {
        akcr.b(ainx, "statement");
        akcr.b(akbl, "mapper");
        return queryAndMapToOneOrDefault(getTagQueryMapOne(), ainx, akbl, t);
    }

    public final <T> ajdx<T> queryAndMapToOneOrDefault(String str, ainx ainx, akbl<? super Cursor, ? extends T> akbl, T t) {
        akcr.b(str, "tag");
        akcr.b(ainx, "statement");
        akcr.b(akbl, "mapper");
        Object a = createQuery(ainx).a(this.clientQueriesScheduler).c(1).d((ajfb) new SqliteDbClient$queryAndMapToOneOrDefault$1(str)).a(c.a(new SqliteDbClient$sam$io_reactivex_functions_Function$0(akbl), t));
        akcr.a(a, "createQuery(statement)\n …T>(mapper, defaultValue))");
        Object h = checkDbValid(a, t).d((ajfb) SqliteDbClient$queryAndMapToOneOrDefault$2.INSTANCE).d((Object) t).h(new SqliteDbClient$queryAndMapToOneOrDefault$3(this, str));
        akcr.a(h, "createQuery(statement)\n ….callsite(tag), error)) }");
        return h;
    }

    public final <T> ajdp<T> queryAndMapToOneOrDefaultObservable(String str, ainx ainx, akbl<? super Cursor, ? extends T> akbl, T t) {
        akcr.b(str, "tag");
        akcr.b(ainx, "statement");
        akcr.b(akbl, "mapper");
        Object a = createQuery(ainx).a(this.clientQueriesScheduler).d((ajfb) new SqliteDbClient$queryAndMapToOneOrDefaultObservable$1(str)).a(c.a(new SqliteDbClient$sam$io_reactivex_functions_Function$0(akbl), t));
        akcr.a(a, "createQuery(statement)\n …T>(mapper, defaultValue))");
        Object q = checkDbValid(a, t).d((ajfb) SqliteDbClient$queryAndMapToOneOrDefaultObservable$2.INSTANCE).q(new SqliteDbClient$queryAndMapToOneOrDefaultObservable$3(this, str));
        akcr.a(q, "createQuery(statement)\n ….callsite(tag), error)) }");
        return q;
    }

    public final <T> ajdx<T> queryAndMapToOneOrError(ainx ainx, akbl<? super Cursor, ? extends T> akbl) {
        akcr.b(ainx, "statement");
        akcr.b(akbl, "mapper");
        return queryAndMapToOneOrError(getTagQueryMapOne(), ainx, akbl);
    }

    public final <T> ajdx<T> queryAndMapToOneOrError(String str, ainx ainx, akbl<? super Cursor, ? extends T> akbl) {
        akcr.b(str, "tag");
        akcr.b(ainx, "statement");
        akcr.b(akbl, "mapper");
        Object e = createQuery(ainx).a(this.clientQueriesScheduler).c(1).d((ajfb) new SqliteDbClient$queryAndMapToOneOrError$1(str)).a(c.a(new SqliteDbClient$sam$io_reactivex_functions_Function$0(akbl))).d((ajfb) SqliteDbClient$queryAndMapToOneOrError$2.INSTANCE).e();
        akcr.a(e, "createQuery(statement)\n …          .firstOrError()");
        return e;
    }

    public final <R> R queryFirst(ainx ainx, ainw<R> ainw) {
        akcr.b(ainx, "statement");
        akcr.b(ainw, "mapper");
        in.a(getTagQueryFirst());
        try {
            R attempt = attempt("queryFirst", new SqliteDbClient$queryFirst$$inlined$systrace$lambda$1(this, ainx, ainw), null);
            return attempt;
        } finally {
            in.a();
        }
    }

    public final <R> R queryFirst(ainx ainx, ainw<R> ainw, R r) {
        akcr.b(ainx, "statement");
        akcr.b(ainw, "mapper");
        in.a(getTagQueryFirst());
        try {
            R attempt = attempt("queryFirst", new SqliteDbClient$queryFirst$$inlined$systrace$lambda$2(this, ainx, ainw, r), r);
            return attempt;
        } finally {
            in.a();
        }
    }

    public final ajcx runInTransaction(String str, akbl<? super DbTransaction, ajxw> akbl) {
        akcr.b(str, "queryTag");
        akcr.b(akbl, "consumer");
        Object attempt = attempt(str, new SqliteDbClient$runInTransaction$1(this, str, akbl), ajvo.a(ajhn.a));
        akcr.a(attempt, "attempt(queryTag, { dbMa…, Completable.complete())");
        return (ajcx) attempt;
    }

    public final ajcx runInTransactionCompat(String str, ajfb<DbTransaction> ajfb) {
        akcr.b(str, "queryTag");
        akcr.b(ajfb, "consumer");
        return runInTransaction(str, new SqliteDbClient$runInTransactionCompat$1(ajfb));
    }

    public final void throwIfNotDbScheduler() {
        this.dbManager.throwIfNotDbScheduler();
    }
}
