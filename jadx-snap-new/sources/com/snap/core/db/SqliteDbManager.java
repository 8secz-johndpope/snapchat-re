package com.snap.core.db;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteFullException;
import android.os.Environment;
import android.os.Looper;
import android.os.StatFs;
import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.snap.core.db.api.DbClient;
import com.snap.core.db.api.DbLogger;
import com.snap.core.db.api.DbManager;
import com.snap.core.db.api.DbSchema;
import com.snap.core.db.api.DbTransaction;
import com.snap.core.db.api.SnapDbSQLiteOpenCallback;
import com.snap.core.db.api.SnapSqliteHelperKt;
import com.snap.core.db.api.TransactionTracker;
import com.snap.core.db.api.TransactionTracker.TrackingToken;
import com.snap.core.db.api.androidxSqlbrite.AndroidxToSupportSQLiteOpenHelper;
import defpackage.aimv;
import defpackage.aimz;
import defpackage.aimz.a;
import defpackage.aimz.c;
import defpackage.ainw;
import defpackage.ainx;
import defpackage.ajcx;
import defpackage.ajdb;
import defpackage.ajdj;
import defpackage.ajdp;
import defpackage.ajdw;
import defpackage.ajdx;
import defpackage.ajeb;
import defpackage.ajev;
import defpackage.ajfb;
import defpackage.ajhn;
import defpackage.ajvo;
import defpackage.akbl;
import defpackage.akkz;
import defpackage.gqr;
import defpackage.idd;
import defpackage.ide;
import defpackage.igb;
import defpackage.ihh;
import defpackage.pa;
import defpackage.pb;
import defpackage.pb.b;
import defpackage.ph;
import defpackage.z;
import defpackage.zgb;
import java.io.File;
import java.math.BigInteger;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class SqliteDbManager implements DbManager {
    private static final String TAG = "SqliteDbManager";
    private final Context appContext;
    private aimv briteDatabase;
    private final ihh clock;
    private final ThreadLocal<DbTransaction> currentTransaction;
    private final DbLogger dbLogger;
    private final ajdw defaultQueryScheduler;
    private final AtomicBoolean initialized;
    private final igb noDiskExceptionDetector;
    private final Supplier<pb> openHelper;
    private final Looper requiredDbWriteLooper;
    private final ajdw scheduler;
    final zgb schedulersProvider;
    private final DbSchema schema;
    private final AtomicInteger sessionId;
    private final TransactionTracker transactionTracker;

    public SqliteDbManager(Context context, DbSchema dbSchema, zgb zgb, ajdw ajdw, ajdw ajdw2, Looper looper, Supplier<pb> supplier, ihh ihh, DbLogger dbLogger, igb igb) {
        this.initialized = new AtomicBoolean(false);
        this.sessionId = new AtomicInteger(1);
        this.appContext = context.getApplicationContext();
        this.scheduler = ajdw;
        this.requiredDbWriteLooper = looper;
        this.defaultQueryScheduler = ajdw2;
        this.schedulersProvider = zgb;
        this.openHelper = supplier;
        this.currentTransaction = new ThreadLocal();
        this.dbLogger = dbLogger;
        this.clock = ihh;
        this.schema = dbSchema;
        this.noDiskExceptionDetector = igb;
        this.transactionTracker = new TransactionTracker(ihh);
    }

    public SqliteDbManager(Context context, gqr gqr, DbSchema dbSchema, zgb zgb, ajdw ajdw, ajdw ajdw2, Looper looper, ihh ihh, DbLogger dbLogger, igb igb) {
        gqr gqr2 = gqr;
        this(context, dbSchema, zgb, ajdw, ajdw2, looper, Suppliers.memoize(new -$$Lambda$SqliteDbManager$aSXcRouj9kFt01g3ShrBGQWfVKA(context, dbSchema, gqr)), ihh, dbLogger, igb);
    }

    private String collectDiskStats() {
        ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            File file = new File(this.appContext.getApplicationInfo().dataDir);
            File file2 = new File(file, "databases");
            File cacheDir = this.appContext.getCacheDir();
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            String a = akkz.a(BigInteger.valueOf(statFs.getFreeBytes()));
            String a2 = akkz.a(BigInteger.valueOf(statFs.getTotalBytes()));
            String a3 = akkz.a(BigInteger.valueOf(akkz.c(file2)));
            String a4 = akkz.a(BigInteger.valueOf(akkz.c(file)));
            String a5 = akkz.a(BigInteger.valueOf(akkz.c(cacheDir)));
            StringBuilder stringBuilder = new StringBuilder("Disk stats { data_dir_total: ");
            stringBuilder.append(a2);
            stringBuilder.append(", data_dir_free: ");
            stringBuilder.append(a);
            stringBuilder.append(", app_data: ");
            stringBuilder.append(a4);
            stringBuilder.append(", databases_dir: ");
            stringBuilder.append(a3);
            stringBuilder.append(", cache_dir: ");
            stringBuilder.append(a5);
            stringBuilder.append(" }");
            a4 = stringBuilder.toString();
            return a4;
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    private synchronized void ensureInitialized() {
        StrictMode.noteSlowCall("db initialization is slow");
        if (this.initialized.compareAndSet(false, true)) {
            a aVar = new a();
            aimz aimz = new aimz(aVar.a, aVar.b);
            this.briteDatabase = new aimv(new AndroidxToSupportSQLiteOpenHelper((pb) this.openHelper.get()), aimz.c, this.defaultQueryScheduler, aimz.d);
            this.briteDatabase.c = false;
            ((pb) this.openHelper.get()).b();
        }
    }

    /* JADX WARNING: Missing block: B:13:0x0016, code skipped:
            if (r1 != null) goto L_0x0018;
     */
    /* JADX WARNING: Missing block: B:14:0x0018, code skipped:
            if (r2 != null) goto L_0x001a;
     */
    /* JADX WARNING: Missing block: B:16:?, code skipped:
            r1.close();
     */
    /* JADX WARNING: Missing block: B:17:0x001e, code skipped:
            r1 = move-exception;
     */
    /* JADX WARNING: Missing block: B:19:?, code skipped:
            r2.addSuppressed(r1);
     */
    /* JADX WARNING: Missing block: B:20:0x0023, code skipped:
            r1.close();
     */
    private <TValue> TValue internalCallInTransaction(java.lang.String r1, com.snap.core.db.api.TransactionTracker.TrackingToken r2, defpackage.akbl<com.snap.core.db.api.DbTransaction, TValue> r3) {
        /*
        r0 = this;
        r1 = r0.newTransaction(r1, r2);	 Catch:{ Throwable -> 0x0029 }
        r2 = 0;
        r3 = r3.invoke(r1);	 Catch:{ Throwable -> 0x0014 }
        r1.markSuccessful();	 Catch:{ Throwable -> 0x0014 }
        if (r1 == 0) goto L_0x0011;
    L_0x000e:
        r1.close();	 Catch:{ Throwable -> 0x0029 }
    L_0x0011:
        return r3;
    L_0x0012:
        r3 = move-exception;
        goto L_0x0016;
    L_0x0014:
        r2 = move-exception;
        throw r2;	 Catch:{ all -> 0x0012 }
    L_0x0016:
        if (r1 == 0) goto L_0x0026;
    L_0x0018:
        if (r2 == 0) goto L_0x0023;
    L_0x001a:
        r1.close();	 Catch:{ Throwable -> 0x001e }
        goto L_0x0026;
    L_0x001e:
        r1 = move-exception;
        r2.addSuppressed(r1);	 Catch:{ Throwable -> 0x0029 }
        goto L_0x0026;
    L_0x0023:
        r1.close();	 Catch:{ Throwable -> 0x0029 }
    L_0x0026:
        throw r3;	 Catch:{ Throwable -> 0x0029 }
    L_0x0027:
        r1 = move-exception;
        goto L_0x002b;
    L_0x0029:
        r1 = move-exception;
        throw r1;	 Catch:{ all -> 0x0027 }
    L_0x002b:
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.core.db.SqliteDbManager.internalCallInTransaction(java.lang.String, com.snap.core.db.api.TransactionTracker$TrackingToken, akbl):java.lang.Object");
    }

    /* JADX WARNING: Missing block: B:16:0x001c, code skipped:
            if (r2 != null) goto L_0x001e;
     */
    /* JADX WARNING: Missing block: B:17:0x001e, code skipped:
            if (r3 != null) goto L_0x0020;
     */
    /* JADX WARNING: Missing block: B:19:?, code skipped:
            r2.close();
     */
    /* JADX WARNING: Missing block: B:20:0x0024, code skipped:
            r2 = move-exception;
     */
    /* JADX WARNING: Missing block: B:22:?, code skipped:
            r3.addSuppressed(r2);
     */
    /* JADX WARNING: Missing block: B:23:0x0029, code skipped:
            r2.close();
     */
    private void internalRunInTransaction(java.lang.String r2, int r3, com.snap.core.db.api.TransactionTracker.TrackingToken r4, defpackage.ajfb<com.snap.core.db.api.DbTransaction> r5) {
        /*
        r1 = this;
        r0 = r1.getSessionId();
        if (r3 == r0) goto L_0x0007;
    L_0x0006:
        return;
    L_0x0007:
        r2 = r1.newTransaction(r2, r4);	 Catch:{ Throwable -> 0x002f }
        r3 = 0;
        r5.accept(r2);	 Catch:{ Throwable -> 0x001a }
        r2.markSuccessful();	 Catch:{ Throwable -> 0x001a }
        if (r2 == 0) goto L_0x0017;
    L_0x0014:
        r2.close();	 Catch:{ Throwable -> 0x002f }
    L_0x0017:
        return;
    L_0x0018:
        r4 = move-exception;
        goto L_0x001c;
    L_0x001a:
        r3 = move-exception;
        throw r3;	 Catch:{ all -> 0x0018 }
    L_0x001c:
        if (r2 == 0) goto L_0x002c;
    L_0x001e:
        if (r3 == 0) goto L_0x0029;
    L_0x0020:
        r2.close();	 Catch:{ Throwable -> 0x0024 }
        goto L_0x002c;
    L_0x0024:
        r2 = move-exception;
        r3.addSuppressed(r2);	 Catch:{ Throwable -> 0x002f }
        goto L_0x002c;
    L_0x0029:
        r2.close();	 Catch:{ Throwable -> 0x002f }
    L_0x002c:
        throw r4;	 Catch:{ Throwable -> 0x002f }
    L_0x002d:
        r2 = move-exception;
        goto L_0x0031;
    L_0x002f:
        r2 = move-exception;
        throw r2;	 Catch:{ all -> 0x002d }
    L_0x0031:
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.core.db.SqliteDbManager.internalRunInTransaction(java.lang.String, int, com.snap.core.db.api.TransactionTracker$TrackingToken, ajfb):void");
    }

    static /* synthetic */ ajeb lambda$callInTransaction$10(ajdx ajdx) {
        return ajdx;
    }

    private static /* synthetic */ void lambda$ensureInitialized$1(String str) {
    }

    static /* synthetic */ pb lambda$new$0(Context context, DbSchema dbSchema, gqr gqr) {
        b.a a = b.a(context);
        a.a = dbSchema.getDatabaseName();
        a.b = new SnapDbSQLiteOpenCallback(dbSchema, gqr);
        pb a2 = new ph().a(a.a());
        a2.a(true);
        return a2;
    }

    static /* synthetic */ ajdb lambda$runInTransaction$6(ajcx ajcx) {
        return ajcx;
    }

    public <TValue> ajdx<TValue> callInTransaction(idd idd, akbl<DbTransaction, TValue> akbl) {
        String idd2 = idd.toString();
        return ajdx.c(new -$$Lambda$SqliteDbManager$l9xkbFVAPK_jM2QkjkwyctRTUAQ(this, idd2, akbl, trackTransaction(idd2))).a(-$$Lambda$SqliteDbManager$0QrNmDtrhsu1PIQVDcXMTmAEokM.INSTANCE).a((ajdw) zgb.a(idd).b());
    }

    /* Access modifiers changed, original: 0000 */
    public SQLException expandSQLExceptionIfNeeded(SQLException sQLException) {
        if (sQLException instanceof SQLiteFullException) {
            try {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(sQLException.getMessage());
                stringBuilder.append(". ");
                stringBuilder.append(collectDiskStats());
                SQLiteFullException sQLiteFullException = new SQLiteFullException(stringBuilder.toString());
                sQLiteFullException.setStackTrace(sQLException.getStackTrace());
                sQLiteFullException.initCause(sQLException.getCause());
                return sQLiteFullException;
            } catch (Throwable unused) {
            }
        }
        return sQLException;
    }

    public <T> ajdj<T> firstElement(ainx ainx, ainw<T> ainw) {
        aimv briteDatabase = getBriteDatabase();
        ajdp c = briteDatabase.a(new aimv.a(ainx.getTables(), new z(ainx.getSql(), new Object[0]))).c(1);
        ainw.getClass();
        return c.a(c.a(new -$$Lambda$hSSlmLZcLsOGs5FNdzXaY6yB2LQ(ainw))).d();
    }

    /* Access modifiers changed, original: 0000 */
    public aimv getBriteDatabase() {
        ensureInitialized();
        return this.briteDatabase;
    }

    public pa getDatabase() {
        return ((pb) this.openHelper.get()).c();
    }

    public DbClient getDbClient(idd idd) {
        return new SqliteDbClient(idd.a, this, zgb.a(idd).i(), this.sessionId.get(), this.clock, this.dbLogger, this.noDiskExceptionDetector);
    }

    public DbClient getDbClient(ide ide) {
        return new SqliteDbClient(ide, this, zgb.a(ide, "DbClient").i(), this.sessionId.get(), this.clock, this.dbLogger, this.noDiskExceptionDetector);
    }

    public int getSessionId() {
        return this.sessionId.get();
    }

    public TransactionTracker getTransactionTracker() {
        return this.transactionTracker;
    }

    public ajcx init(Context context) {
        return ajcx.a(new -$$Lambda$SqliteDbManager$wji30rdnWCfgbBGKlF8-lmyXn9k(this)).b(scheduler());
    }

    public boolean isDbScheduler() {
        Looper looper = this.requiredDbWriteLooper;
        return looper == null || looper == Looper.myLooper();
    }

    public /* synthetic */ ajdx lambda$callInTransaction$9$SqliteDbManager(String str, akbl akbl, TrackingToken trackingToken) {
        if (!isDbScheduler()) {
            return ajdx.c(new -$$Lambda$SqliteDbManager$vWLi3FKUhN_PK1KpA81FIe2oETA(this, str, trackingToken, akbl)).b(scheduler());
        }
        DbTransaction dbTransaction = (DbTransaction) this.currentTransaction.get();
        return dbTransaction != null ? ajdx.b(akbl.invoke(dbTransaction)) : ajdx.b(internalCallInTransaction(str, trackingToken, akbl));
    }

    public /* synthetic */ void lambda$newTransaction$2$SqliteDbManager(DbTransaction dbTransaction, TrackingToken trackingToken, DbTransaction dbTransaction2) {
        this.currentTransaction.set(dbTransaction);
        this.transactionTracker.reportTransactionEnded(trackingToken);
    }

    public /* synthetic */ void lambda$null$4$SqliteDbManager(String str, TrackingToken trackingToken, ajfb ajfb) {
        internalRunInTransaction(str, this.sessionId.get(), trackingToken, ajfb);
    }

    public /* synthetic */ Object lambda$null$8$SqliteDbManager(String str, TrackingToken trackingToken, akbl akbl) {
        return internalCallInTransaction(str, trackingToken, akbl);
    }

    public /* synthetic */ void lambda$reset$3$SqliteDbManager(Context context, ajev ajev) {
        synchronized (this) {
            if (this.initialized.compareAndSet(true, false)) {
                this.sessionId.incrementAndGet();
                ((pb) this.openHelper.get()).d();
                SnapSqliteHelperKt.deleteDatabaseFile(context, this.schema.getDatabaseName());
            }
        }
        if (ajev != null) {
            ajev.run();
        }
    }

    public /* synthetic */ ajcx lambda$runInTransaction$5$SqliteDbManager(String str, ajfb ajfb, TrackingToken trackingToken) {
        if (!isDbScheduler()) {
            return ajcx.a(new -$$Lambda$SqliteDbManager$EKryexbYQEuA_kxTPJAPuyXeb60(this, str, trackingToken, ajfb)).b(scheduler());
        }
        DbTransaction dbTransaction = (DbTransaction) this.currentTransaction.get();
        if (dbTransaction != null) {
            ajfb.accept(dbTransaction);
            return ajvo.a(ajhn.a);
        }
        internalRunInTransaction(str, getSessionId(), trackingToken, ajfb);
        return ajvo.a(ajhn.a);
    }

    public /* synthetic */ Object lambda$scheduleCallInTransaction$11$SqliteDbManager(String str, TrackingToken trackingToken, akbl akbl) {
        return internalCallInTransaction(str, trackingToken, akbl);
    }

    public /* synthetic */ void lambda$scheduleRunInTransaction$7$SqliteDbManager(String str, int i, TrackingToken trackingToken, ajfb ajfb) {
        internalRunInTransaction(str, i, trackingToken, ajfb);
    }

    /* Access modifiers changed, original: 0000 */
    public DbTransaction newTransaction(String str, TrackingToken trackingToken) {
        aimv briteDatabase = getBriteDatabase();
        aimv.b bVar = new aimv.b((aimv.b) briteDatabase.a.get());
        briteDatabase.a.set(bVar);
        boolean z = briteDatabase.c;
        briteDatabase.b().beginTransactionWithListener(bVar);
        DbTransaction dbTransaction = new DbTransaction(briteDatabase.b, str, trackingToken.getSubmissionTimeMillis(), this.clock, this.dbLogger, this.noDiskExceptionDetector);
        this.transactionTracker.reportTransactionStarted(trackingToken, dbTransaction);
        DbTransaction dbTransaction2 = (DbTransaction) this.currentTransaction.get();
        this.currentTransaction.set(dbTransaction);
        dbTransaction.runAfter(new -$$Lambda$SqliteDbManager$cgtn1TuMhLBmRcc16qEWdGw9Hy8(this, dbTransaction2, trackingToken));
        return dbTransaction;
    }

    /* Access modifiers changed, original: 0000 */
    public ajdw queriesScheduler() {
        return this.defaultQueryScheduler;
    }

    public ajcx reset(Context context, ajev ajev) {
        return ajcx.a(new -$$Lambda$SqliteDbManager$DfWk_sXbeXnX2B6KzwviAYzXWxI(this, context, ajev)).b(scheduler());
    }

    /* Access modifiers changed, original: 0000 */
    public ajcx runInTransaction(idd idd, ajfb<DbTransaction> ajfb) {
        String idd2 = idd.toString();
        return ajdx.c(new -$$Lambda$SqliteDbManager$fqsXpxRiGBEYLpXrvS1tuhKPnSI(this, idd2, ajfb, trackTransaction(idd2))).e(-$$Lambda$SqliteDbManager$er0SsoPS9yYtVxSxN8FATa4nYcY.INSTANCE).a((ajdw) zgb.a(idd).b());
    }

    public <TValue> ajdx<TValue> scheduleCallInTransaction(String str, akbl<DbTransaction, TValue> akbl) {
        return ajdx.c(new -$$Lambda$SqliteDbManager$C-7Bp60dHdtlsg3yse5ruh3bpdE(this, str, trackTransaction(str), akbl)).b(scheduler());
    }

    public ajcx scheduleRunInTransaction(String str, ajfb<DbTransaction> ajfb) {
        return ajcx.a(new -$$Lambda$SqliteDbManager$baqtu9Zm8uYFAhxEkSYe8-r4FCI(this, str, getSessionId(), trackTransaction(str), ajfb)).b(scheduler());
    }

    public ajdw scheduler() {
        return this.scheduler;
    }

    public void throwIfNotDbScheduler() {
        if (!isDbScheduler()) {
            throw new IllegalStateException("Database writes (updates/inserts/deletes must be run on the dedicated DatabaseHandlerThread. See SnapDb.scheduler()");
        }
    }

    /* Access modifiers changed, original: 0000 */
    public TrackingToken trackTransaction(String str) {
        return this.transactionTracker.reportTransactionSubmitted(str);
    }
}
