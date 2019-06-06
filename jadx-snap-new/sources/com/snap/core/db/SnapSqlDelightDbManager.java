package com.snap.core.db;

import android.content.Context;
import android.os.Looper;
import android.os.StrictMode;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.snap.core.db.api.DbLogger;
import com.snap.core.db.api.DbSchema;
import com.snap.core.db.api.SnapDbCoreFeature;
import com.snap.core.db.api.SnapDbSQLiteOpenCallback;
import com.snap.core.db.api.SnapSqliteHelperKt;
import com.snap.core.db.api.SqlDelightDbClient;
import com.snap.core.db.api.SqlDelightDbManager;
import defpackage.ainf;
import defpackage.ajcx;
import defpackage.ajdw;
import defpackage.ajdx;
import defpackage.ajev;
import defpackage.ajfc;
import defpackage.ajxw;
import defpackage.akbl;
import defpackage.akco;
import defpackage.akcr;
import defpackage.akdd.e;
import defpackage.gqr;
import defpackage.idd;
import defpackage.igb;
import defpackage.ihh;
import defpackage.pa;
import defpackage.pb;
import defpackage.pb.a;
import defpackage.pb.b;
import defpackage.ph;
import defpackage.zgb;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class SnapSqlDelightDbManager implements SqlDelightDbManager {
    public static final Companion Companion = new Companion();
    private static final String TAG = TAG;
    private final ihh clock;
    private final Context context;
    private final DbLogger dbLogger;
    private final ajdw defaultQueryScheduler;
    private final boolean enforceDbThreadCheck;
    private final gqr exceptionTracker;
    private final AtomicBoolean initialized;
    private final igb noDiskExceptionDetector;
    private final Supplier<pb> openHelper;
    private final Looper requiredDbWriteLooper;
    private final zgb schedulersProvider;
    private final AtomicInteger sessionId;
    private SnapSqliteDatabaseDriver sqlDatabaseDriver;
    private ainf sqlQueryWrapper;
    private final ajdw writeScheduler;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(akco akco) {
            this();
        }
    }

    public SnapSqlDelightDbManager(final Context context, final gqr gqr, final DbSchema dbSchema, zgb zgb, ajdw ajdw, ajdw ajdw2, Looper looper, ihh ihh, DbLogger dbLogger, igb igb, boolean z) {
        Context context2 = context;
        gqr gqr2 = gqr;
        DbSchema dbSchema2 = dbSchema;
        akcr.b(context, "context");
        akcr.b(gqr, "exceptionTracker");
        akcr.b(dbSchema, "schema");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(ajdw, "writeScheduler");
        akcr.b(ajdw2, "defaultQueryScheduler");
        ihh ihh2 = ihh;
        akcr.b(ihh2, "clock");
        DbLogger dbLogger2 = dbLogger;
        akcr.b(dbLogger2, "dbLogger");
        igb igb2 = igb;
        akcr.b(igb2, "noDiskExceptionDetector");
        Supplier memoize = Suppliers.memoize(new Supplier<T>() {
            public final pb get() {
                pb a = new ph().a(b.a(context).a(SnapSqliteHelperKt.getNormalizedDatabaseName(dbSchema.getDatabaseName())).a((a) new SnapDbSQLiteOpenCallback(dbSchema, gqr)).a());
                a.a(true);
                return a;
            }
        });
        akcr.a((Object) memoize, "Suppliers.memoize {\n    …     helper\n            }");
        this(context2, gqr2, zgb, ajdw, ajdw2, looper, ihh2, dbLogger2, igb2, memoize, z);
    }

    public SnapSqlDelightDbManager(Context context, gqr gqr, zgb zgb, ajdw ajdw, ajdw ajdw2, Looper looper, ihh ihh, DbLogger dbLogger, igb igb, Supplier<pb> supplier, boolean z) {
        akcr.b(context, "context");
        akcr.b(gqr, "exceptionTracker");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(ajdw, "writeScheduler");
        akcr.b(ajdw2, "defaultQueryScheduler");
        akcr.b(ihh, "clock");
        akcr.b(dbLogger, "dbLogger");
        akcr.b(igb, "noDiskExceptionDetector");
        akcr.b(supplier, "openHelper");
        this.context = context;
        this.exceptionTracker = gqr;
        this.schedulersProvider = zgb;
        this.writeScheduler = ajdw;
        this.defaultQueryScheduler = ajdw2;
        this.requiredDbWriteLooper = looper;
        this.clock = ihh;
        this.dbLogger = dbLogger;
        this.noDiskExceptionDetector = igb;
        this.openHelper = supplier;
        this.enforceDbThreadCheck = z;
        this.initialized = new AtomicBoolean(false);
        this.sessionId = new AtomicInteger(1);
    }

    public <TValue> ajdx<TValue> callInTransaction(idd idd, akbl<? super ainf.a, ? extends TValue> akbl) {
        akcr.b(idd, "callsite");
        akcr.b(akbl, "consumer");
        Object a = ajdx.c((Callable) new SnapSqlDelightDbManager$callInTransaction$1(this, idd.toString(), akbl)).a((ajfc) SnapSqlDelightDbManager$callInTransaction$2.INSTANCE).a((ajdw) zgb.a(idd).b());
        akcr.a(a, "Single.fromCallable<Sing…(callsite).computation())");
        return a;
    }

    public <TValue> TValue callInTransactionImmediately(String str, akbl<? super ainf.a, ? extends TValue> akbl) {
        akcr.b(str, "tag");
        akcr.b(akbl, "consumer");
        this.clock.a();
        e eVar = new e();
        eVar.a = null;
        getQueryWrapper().a(new SnapSqlDelightDbManager$callInTransactionImmediately$wrapper$1(eVar, akbl));
        Object obj = eVar.a;
        if (obj == null) {
            akcr.a();
        }
        return obj;
    }

    public synchronized void ensureInitialized() {
        StrictMode.noteSlowCall("db initialization is slow");
        if (this.initialized.compareAndSet(false, true)) {
            Object obj = this.openHelper.get();
            akcr.a(obj, "openHelper.get()");
            pa b = ((pb) obj).b();
            akcr.a((Object) b, "openHelper.get().writableDatabase");
            this.sqlDatabaseDriver = new SnapSqliteDatabaseDriver(b, this.dbLogger, this.clock, this.requiredDbWriteLooper, 0, false, new DbValidator(this.sessionId.get(), this, this.noDiskExceptionDetector, SnapDbCoreFeature.INSTANCE), 16, null);
            SnapSqliteDatabaseDriver snapSqliteDatabaseDriver = this.sqlDatabaseDriver;
            if (snapSqliteDatabaseDriver == null) {
                akcr.a("sqlDatabaseDriver");
            }
            this.sqlQueryWrapper = initSqldelight(snapSqliteDatabaseDriver);
            Object obj2 = this.openHelper.get();
            akcr.a(obj2, "openHelper.get()");
            ((pb) obj2).b();
        }
    }

    public SqlDelightDbClient getDbClient(idd idd) {
        akcr.b(idd, "feature");
        return new SnapSqlDelightDbClient(idd.a, this, zgb.a(idd).i(), this.sessionId.get(), this.noDiskExceptionDetector);
    }

    public final boolean getEnforceDbThreadCheck() {
        return this.enforceDbThreadCheck;
    }

    /* Access modifiers changed, original: protected|final */
    public final AtomicBoolean getInitialized() {
        return this.initialized;
    }

    public ainf getQueryWrapper() {
        ensureInitialized();
        ainf ainf = this.sqlQueryWrapper;
        if (ainf == null) {
            akcr.a("sqlQueryWrapper");
        }
        return ainf;
    }

    public int getSessionId() {
        return this.sessionId.get();
    }

    /* Access modifiers changed, original: protected|final */
    /* renamed from: getSessionId */
    public final AtomicInteger m6getSessionId() {
        return this.sessionId;
    }

    public SnapSqliteDatabaseDriver getSqlDriver() {
        ensureInitialized();
        SnapSqliteDatabaseDriver snapSqliteDatabaseDriver = this.sqlDatabaseDriver;
        if (snapSqliteDatabaseDriver == null) {
            akcr.a("sqlDatabaseDriver");
        }
        return snapSqliteDatabaseDriver;
    }

    public pa getWritableDatabase() {
        ensureInitialized();
        Object obj = this.openHelper.get();
        akcr.a(obj, "openHelper.get()");
        obj = ((pb) obj).b();
        akcr.a(obj, "openHelper.get().writableDatabase");
        return obj;
    }

    public ajcx init(Context context) {
        akcr.b(context, "context");
        Object b = ajcx.a((ajev) new SnapSqlDelightDbManager$init$1(this)).b(scheduler());
        akcr.a(b, "Completable.fromAction {….subscribeOn(scheduler())");
        return b;
    }

    public boolean isDbScheduler() {
        Object obj = this.requiredDbWriteLooper;
        return obj == null || akcr.a(obj, Looper.myLooper());
    }

    public final ajdw queriesScheduler$db_manager_release() {
        return this.defaultQueryScheduler;
    }

    public ajcx reset(Context context, ajev ajev) {
        akcr.b(context, "context");
        Object b = ajcx.a((ajev) new SnapSqlDelightDbManager$reset$1(this, context, ajev)).b(scheduler());
        akcr.a(b, "Completable.fromAction {….subscribeOn(scheduler())");
        return b;
    }

    public ajcx runInTransaction(idd idd, akbl<? super ainf.a, ajxw> akbl) {
        akcr.b(idd, "callsite");
        akcr.b(akbl, "consumer");
        Object a = ajdx.c((Callable) new SnapSqlDelightDbManager$runInTransaction$1(this, idd.toString(), akbl)).e((ajfc) SnapSqlDelightDbManager$runInTransaction$2.INSTANCE).a((ajdw) zgb.a(idd).b());
        akcr.a(a, "Single.fromCallable<Comp…(callsite).computation())");
        return a;
    }

    public void runInTransactionImmediately(String str, int i, akbl<? super ainf.a, ajxw> akbl) {
        akcr.b(str, "tag");
        akcr.b(akbl, "consumer");
        long a = this.clock.a();
        if (i == getSessionId()) {
            getQueryWrapper().a(akbl);
            this.dbLogger.logLongRunningDbExecutionIfNeeded(str, this.clock.a() - a);
        }
    }

    public final <TValue> ajdx<TValue> scheduleCallInTransaction(String str, akbl<? super ainf.a, ? extends TValue> akbl) {
        akcr.b(str, "tag");
        akcr.b(akbl, "consumer");
        Object b = ajdx.c((Callable) new SnapSqlDelightDbManager$scheduleCallInTransaction$1(this, str, akbl)).b(scheduler());
        akcr.a(b, "Single.fromCallable { ca….subscribeOn(scheduler())");
        return b;
    }

    public final ajcx scheduleRunInTransaction(String str, akbl<? super ainf.a, ajxw> akbl) {
        akcr.b(str, "tag");
        akcr.b(akbl, "consumer");
        Object b = ajcx.a((ajev) new SnapSqlDelightDbManager$scheduleRunInTransaction$1(this, str, getSessionId(), akbl)).b(scheduler());
        akcr.a(b, "Completable.fromAction {….subscribeOn(scheduler())");
        return b;
    }

    public ajdw scheduler() {
        return this.writeScheduler;
    }

    public void throwIfNotDbScheduler() {
        if (!isDbScheduler()) {
            throw new IllegalStateException("Database writes (updates/inserts/deletes must be run on the dedicated DatabaseHandlerThread. See SnapDb.scheduler()");
        }
    }
}
