package com.snap.core.db;

import android.content.Context;
import android.os.Looper;
import com.mapbox.mapboxsdk.style.sources.RasterSource;
import com.snap.core.db.api.DbLogger;
import defpackage.ainf.a;
import defpackage.ainn;
import defpackage.aino;
import defpackage.aino.b;
import defpackage.ainp;
import defpackage.ajxw;
import defpackage.akbk;
import defpackage.akbl;
import defpackage.akco;
import defpackage.akcr;
import defpackage.ihh;
import defpackage.in;
import defpackage.pa;
import defpackage.pb;
import defpackage.pb.c;
import defpackage.ph;

public final class SnapSqliteDatabaseDriver implements aino {
    private final int cacheSize;
    private ihh clock;
    private final pa database;
    private final DbLogger dbLogger;
    private final DbValidator dbValidator;
    private final boolean enforceDbThread;
    private final pb openHelper;
    private final Looper requiredDbWriteLooper;
    private final SnapSqliteDatabaseDriver$statements$1 statements;
    private final ThreadLocal<a> transactions;

    public final class Transaction extends a {
        private final a enclosingTransaction;

        public Transaction(a aVar) {
            this.enclosingTransaction = aVar;
        }

        public final void endTransaction(boolean z) {
            if (getEnclosingTransaction() == null) {
                if (z) {
                    SnapSqliteDatabaseDriver.this.database.d();
                }
                SnapSqliteDatabaseDriver.this.database.c();
            }
            SnapSqliteDatabaseDriver.this.transactions.set(getEnclosingTransaction());
        }

        public final a getEnclosingTransaction() {
            return this.enclosingTransaction;
        }
    }

    public static class Callback extends pb.a {
        private final ihh clock;
        private final DbLogger dbLogger;
        private final DbValidator dbValidator;
        private final Looper requiredDbWriteLooper;
        private final b schema;

        public Callback(b bVar, Looper looper, ihh ihh, DbLogger dbLogger, DbValidator dbValidator) {
            akcr.b(bVar, "schema");
            akcr.b(looper, "requiredDbWriteLooper");
            akcr.b(ihh, "clock");
            akcr.b(dbLogger, "dbLogger");
            akcr.b(dbValidator, "dbValidator");
            super(bVar.a());
            this.schema = bVar;
            this.requiredDbWriteLooper = looper;
            this.clock = ihh;
            this.dbLogger = dbLogger;
            this.dbValidator = dbValidator;
        }

        public void onCreate(pa paVar) {
            akcr.b(paVar, "db");
            pa paVar2 = paVar;
            SnapSqliteDatabaseDriver snapSqliteDatabaseDriver = new SnapSqliteDatabaseDriver(null, paVar2, this.dbLogger, this.clock, this.requiredDbWriteLooper, 1, false, this.dbValidator, 64, null);
        }

        public void onUpgrade(pa paVar, int i, int i2) {
            akcr.b(paVar, "db");
            pa paVar2 = paVar;
            SnapSqliteDatabaseDriver snapSqliteDatabaseDriver = new SnapSqliteDatabaseDriver(null, paVar2, this.dbLogger, this.clock, this.requiredDbWriteLooper, 1, false, this.dbValidator, 64, null);
        }
    }

    public SnapSqliteDatabaseDriver(b bVar, Context context, DbLogger dbLogger, ihh ihh, Looper looper, DbValidator dbValidator) {
        this(bVar, context, null, dbLogger, ihh, looper, dbValidator, null, null, 0, 900, null);
    }

    public SnapSqliteDatabaseDriver(b bVar, Context context, String str, DbLogger dbLogger, ihh ihh, Looper looper, DbValidator dbValidator) {
        this(bVar, context, str, dbLogger, ihh, looper, dbValidator, null, null, 0, 896, null);
    }

    public SnapSqliteDatabaseDriver(b bVar, Context context, String str, DbLogger dbLogger, ihh ihh, Looper looper, DbValidator dbValidator, c cVar) {
        this(bVar, context, str, dbLogger, ihh, looper, dbValidator, cVar, null, 0, 768, null);
    }

    public SnapSqliteDatabaseDriver(b bVar, Context context, String str, DbLogger dbLogger, ihh ihh, Looper looper, DbValidator dbValidator, c cVar, pb.a aVar) {
        this(bVar, context, str, dbLogger, ihh, looper, dbValidator, cVar, aVar, 0, RasterSource.DEFAULT_TILE_SIZE, null);
    }

    public SnapSqliteDatabaseDriver(b bVar, Context context, String str, DbLogger dbLogger, ihh ihh, Looper looper, DbValidator dbValidator, c cVar, pb.a aVar, int i) {
        c cVar2 = cVar;
        pb.a aVar2 = aVar;
        b bVar2 = bVar;
        akcr.b(bVar, "schema");
        akcr.b(context, "context");
        DbLogger dbLogger2 = dbLogger;
        akcr.b(dbLogger2, "dbLogger");
        ihh ihh2 = ihh;
        akcr.b(ihh2, "clock");
        Looper looper2 = looper;
        akcr.b(looper2, "requiredDbWriteLooper");
        DbValidator dbValidator2 = dbValidator;
        akcr.b(dbValidator2, "dbValidator");
        akcr.b(cVar2, "factory");
        akcr.b(aVar2, "callback");
        this(cVar2.a(pb.b.a(context).a(aVar2).a(str).a()), null, dbLogger2, ihh2, looper2, i, false, dbValidator2, 64, null);
    }

    public /* synthetic */ SnapSqliteDatabaseDriver(b bVar, Context context, String str, DbLogger dbLogger, ihh ihh, Looper looper, DbValidator dbValidator, c cVar, pb.a aVar, int i, int i2, akco akco) {
        int i3 = i2;
        this(bVar, context, (i3 & 4) != 0 ? null : str, dbLogger, ihh, looper, dbValidator, (i3 & 128) != 0 ? new ph() : cVar, (i3 & 256) != 0 ? new Callback(bVar, looper, ihh, dbLogger, dbValidator) : aVar, (i3 & RasterSource.DEFAULT_TILE_SIZE) != 0 ? SnapSqliteDatabaseDriverKt.DEFAULT_CACHE_SIZE : i);
    }

    public SnapSqliteDatabaseDriver(DbLogger dbLogger, Looper looper, ihh ihh, pb pbVar, DbValidator dbValidator) {
        DbLogger dbLogger2 = dbLogger;
        akcr.b(dbLogger, "dbLogger");
        Looper looper2 = looper;
        akcr.b(looper, "requiredDbWriteLooper");
        ihh ihh2 = ihh;
        akcr.b(ihh, "clock");
        pb pbVar2 = pbVar;
        akcr.b(pbVar2, "openHelper");
        DbValidator dbValidator2 = dbValidator;
        akcr.b(dbValidator2, "dbValidator");
        this(pbVar2, null, dbLogger2, ihh2, looper2, SnapSqliteDatabaseDriverKt.DEFAULT_CACHE_SIZE, false, dbValidator2, 64, null);
    }

    public SnapSqliteDatabaseDriver(pa paVar, DbLogger dbLogger, ihh ihh, Looper looper, int i, DbValidator dbValidator) {
        this(paVar, dbLogger, ihh, looper, i, false, dbValidator, 32, null);
    }

    public SnapSqliteDatabaseDriver(pa paVar, DbLogger dbLogger, ihh ihh, Looper looper, int i, boolean z, DbValidator dbValidator) {
        pa paVar2 = paVar;
        akcr.b(paVar, "database");
        DbLogger dbLogger2 = dbLogger;
        akcr.b(dbLogger, "dbLogger");
        ihh ihh2 = ihh;
        akcr.b(ihh, "clock");
        DbValidator dbValidator2 = dbValidator;
        akcr.b(dbValidator2, "dbValidator");
        this(null, paVar2, dbLogger2, ihh2, looper, i, z, dbValidator2);
    }

    public SnapSqliteDatabaseDriver(pa paVar, DbLogger dbLogger, ihh ihh, Looper looper, DbValidator dbValidator) {
        this(paVar, dbLogger, ihh, looper, 0, false, dbValidator, 48, null);
    }

    /* JADX WARNING: Missing block: B:3:0x0020, code skipped:
            if (r1 == null) goto L_0x0022;
     */
    private SnapSqliteDatabaseDriver(defpackage.pb r1, defpackage.pa r2, com.snap.core.db.api.DbLogger r3, defpackage.ihh r4, android.os.Looper r5, int r6, boolean r7, com.snap.core.db.DbValidator r8) {
        /*
        r0 = this;
        r0.<init>();
        r0.openHelper = r1;
        r0.dbLogger = r3;
        r0.clock = r4;
        r0.requiredDbWriteLooper = r5;
        r0.cacheSize = r6;
        r0.enforceDbThread = r7;
        r0.dbValidator = r8;
        r1 = new java.lang.ThreadLocal;
        r1.<init>();
        r0.transactions = r1;
        r1 = r0.openHelper;
        if (r1 == 0) goto L_0x0022;
    L_0x001c:
        r1 = r1.b();
        if (r1 != 0) goto L_0x0028;
    L_0x0022:
        if (r2 != 0) goto L_0x0027;
    L_0x0024:
        defpackage.akcr.a();
    L_0x0027:
        r1 = r2;
    L_0x0028:
        r0.database = r1;
        r1 = new com.snap.core.db.SnapSqliteDatabaseDriver$statements$1;
        r2 = r0.cacheSize;
        r1.<init>(r0, r2);
        r0.statements = r1;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.core.db.SnapSqliteDatabaseDriver.<init>(pb, pa, com.snap.core.db.api.DbLogger, ihh, android.os.Looper, int, boolean, com.snap.core.db.DbValidator):void");
    }

    private final <T> T execute(Integer num, akbk<? extends AndroidStatement> akbk, akbl<? super ainp, ajxw> akbl, akbl<? super AndroidStatement, ? extends T> akbl2, T t) {
        in.a("");
        try {
            T attempt = this.dbValidator.attempt("execute", new SnapSqliteDatabaseDriver$execute$$inlined$systrace$lambda$1(this, num, akbk, akbl, akbl2, t), t);
            return attempt;
        } finally {
            in.a();
        }
    }

    public final void close() {
        if (this.openHelper != null) {
            this.statements.evictAll();
            this.openHelper.d();
            return;
        }
        throw new IllegalStateException("Tried to call close during initialization");
    }

    public final a currentTransaction() {
        return (a) this.transactions.get();
    }

    public final void execute(Integer num, String str, int i, akbl<? super ainp, ajxw> akbl) {
        akcr.b(str, "sql");
        if (this.enforceDbThread) {
            throwIfNotDbScheduler();
        }
        execute(num, new SnapSqliteDatabaseDriver$execute$2(this, str), akbl, SnapSqliteDatabaseDriver$execute$3.INSTANCE, ajxw.a);
    }

    public final ainn executeQuery(Integer num, String str, int i, akbl<? super ainp, ajxw> akbl) {
        akcr.b(str, "sql");
        return (ainn) execute(num, new SnapSqliteDatabaseDriver$executeQuery$1(this, str, i), akbl, SnapSqliteDatabaseDriver$executeQuery$2.INSTANCE, this.dbValidator.getEmptyCursor());
    }

    public final boolean isDbScheduler() {
        Looper looper = this.requiredDbWriteLooper;
        return looper == null || looper == Looper.myLooper();
    }

    public final Transaction newTransaction() {
        a aVar = (a) this.transactions.get();
        Transaction transaction = new Transaction(aVar);
        this.transactions.set(transaction);
        if (aVar == null) {
            this.database.b();
        }
        return transaction;
    }

    public final void throwIfNotDbScheduler() {
        if (!isDbScheduler()) {
            throw new IllegalStateException("Database writes (updates/inserts/deletes must be run on the dedicated DatabaseHandlerThread. See SnapDb.scheduler()");
        }
    }
}
