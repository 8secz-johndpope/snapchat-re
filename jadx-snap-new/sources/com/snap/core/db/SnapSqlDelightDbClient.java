package com.snap.core.db;

import android.database.Cursor;
import com.google.common.base.Optional;
import com.snap.core.db.api.SqlDelightDbClient;
import defpackage.ainb;
import defpackage.ainf;
import defpackage.ainf.a;
import defpackage.ainn;
import defpackage.aiod;
import defpackage.aiod.c;
import defpackage.aiod.d;
import defpackage.ajcx;
import defpackage.ajdp;
import defpackage.ajdw;
import defpackage.ajdx;
import defpackage.ajfb;
import defpackage.ajfc;
import defpackage.ajhn;
import defpackage.ajsn;
import defpackage.ajvo;
import defpackage.ajxw;
import defpackage.ajyu;
import defpackage.akbl;
import defpackage.akco;
import defpackage.akcr;
import defpackage.ide;
import defpackage.igb;
import defpackage.in;
import defpackage.pa;
import java.util.List;

public final class SnapSqlDelightDbClient implements SqlDelightDbClient {
    private static final String CHANGED_ROW_COUNT = CHANGED_ROW_COUNT;
    public static final Companion Companion = new Companion();
    private static final String LAST_INSERTED_ROW_ID = LAST_INSERTED_ROW_ID;
    private final ide attributedFeature;
    private final ajdw clientQueriesScheduler;
    private final SnapSqlDelightDbManager dbManager;
    private final DbValidator dbValidator;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(akco akco) {
            this();
        }
    }

    public SnapSqlDelightDbClient(ide ide, SnapSqlDelightDbManager snapSqlDelightDbManager, ajdw ajdw, int i, igb igb) {
        akcr.b(ide, "attributedFeature");
        akcr.b(snapSqlDelightDbManager, "dbManager");
        akcr.b(ajdw, "clientQueriesScheduler");
        akcr.b(igb, "noDiskExceptionDetector");
        this.attributedFeature = ide;
        this.dbManager = snapSqlDelightDbManager;
        this.clientQueriesScheduler = ajdw;
        this.dbValidator = new DbValidator(i, this.dbManager, igb, this.attributedFeature);
    }

    public final <T> ajdx<T> callInTransaction(String str, akbl<? super a, ? extends T> akbl) {
        akcr.b(str, "queryTag");
        akcr.b(akbl, "consumer");
        Object attempt = this.dbValidator.attempt(str, new SnapSqlDelightDbClient$callInTransaction$1(this, str, akbl), ajvo.a(ajsn.a));
        akcr.a(attempt, "dbValidator.attempt(quer…sumer) }, Single.never())");
        return (ajdx) attempt;
    }

    public final <T> T callInTransactionImmediately(String str, akbl<? super a, ? extends T> akbl) {
        akcr.b(str, "queryTag");
        akcr.b(akbl, "consumer");
        return this.dbValidator.attempt(str, new SnapSqlDelightDbClient$callInTransactionImmediately$1(this, str, akbl), null);
    }

    public final void execute(String str) {
        akcr.b(str, "sql");
        this.dbValidator.attempt(str, new SnapSqlDelightDbClient$execute$1(this, str), ajxw.a);
    }

    /* JADX WARNING: Missing block: B:18:0x0036, code skipped:
            defpackage.akax.a(r0, r1);
     */
    public final int getChangedRowCount() {
        /*
        r5 = this;
        r0 = r5.getWritableDatabase();
        r1 = CHANGED_ROW_COUNT;
        r0 = r0.b(r1);
        r0 = (java.io.Closeable) r0;
        r1 = 0;
        r2 = r0;
        r2 = (android.database.Cursor) r2;	 Catch:{ Throwable -> 0x0034 }
        r3 = "it";
        defpackage.akcr.a(r2, r3);	 Catch:{ Throwable -> 0x0034 }
        r3 = r2.getCount();	 Catch:{ Throwable -> 0x0034 }
        r4 = 0;
        if (r3 <= 0) goto L_0x001e;
    L_0x001c:
        r3 = 1;
        goto L_0x001f;
    L_0x001e:
        r3 = 0;
    L_0x001f:
        if (r3 == 0) goto L_0x0022;
    L_0x0021:
        goto L_0x0023;
    L_0x0022:
        r2 = r1;
    L_0x0023:
        if (r2 == 0) goto L_0x002d;
    L_0x0025:
        r2.moveToFirst();	 Catch:{ Throwable -> 0x0034 }
        r2 = r2.getInt(r4);	 Catch:{ Throwable -> 0x0034 }
        goto L_0x002e;
    L_0x002d:
        r2 = -1;
    L_0x002e:
        defpackage.akax.a(r0, r1);
        return r2;
    L_0x0032:
        r2 = move-exception;
        goto L_0x0036;
    L_0x0034:
        r1 = move-exception;
        throw r1;	 Catch:{ all -> 0x0032 }
    L_0x0036:
        defpackage.akax.a(r0, r1);
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.core.db.SnapSqlDelightDbClient.getChangedRowCount():int");
    }

    public final ainf getDatabase() {
        return this.dbManager.getQueryWrapper();
    }

    /* JADX WARNING: Missing block: B:18:0x0037, code skipped:
            defpackage.akax.a(r0, r1);
     */
    public final long getLastInsertedRowId() {
        /*
        r5 = this;
        r0 = r5.getWritableDatabase();
        r1 = LAST_INSERTED_ROW_ID;
        r0 = r0.b(r1);
        r0 = (java.io.Closeable) r0;
        r1 = 0;
        r2 = r0;
        r2 = (android.database.Cursor) r2;	 Catch:{ Throwable -> 0x0035 }
        r3 = "it";
        defpackage.akcr.a(r2, r3);	 Catch:{ Throwable -> 0x0035 }
        r3 = r2.getCount();	 Catch:{ Throwable -> 0x0035 }
        r4 = 0;
        if (r3 <= 0) goto L_0x001e;
    L_0x001c:
        r3 = 1;
        goto L_0x001f;
    L_0x001e:
        r3 = 0;
    L_0x001f:
        if (r3 == 0) goto L_0x0022;
    L_0x0021:
        goto L_0x0023;
    L_0x0022:
        r2 = r1;
    L_0x0023:
        if (r2 == 0) goto L_0x002d;
    L_0x0025:
        r2.moveToFirst();	 Catch:{ Throwable -> 0x0035 }
        r2 = r2.getLong(r4);	 Catch:{ Throwable -> 0x0035 }
        goto L_0x002f;
    L_0x002d:
        r2 = -1;
    L_0x002f:
        defpackage.akax.a(r0, r1);
        return r2;
    L_0x0033:
        r2 = move-exception;
        goto L_0x0037;
    L_0x0035:
        r1 = move-exception;
        throw r1;	 Catch:{ all -> 0x0033 }
    L_0x0037:
        defpackage.akax.a(r0, r1);
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.core.db.SnapSqlDelightDbClient.getLastInsertedRowId():long");
    }

    public final pa getWritableDatabase() {
        if (this.dbManager.getEnforceDbThreadCheck()) {
            this.dbManager.throwIfNotDbScheduler();
        }
        return this.dbManager.getWritableDatabase();
    }

    public final <R> ainn query(String str, ainb<? extends R> ainb) {
        akcr.b(str, "tag");
        akcr.b(ainb, "statement");
        in.a(this.dbValidator.getTagQuery());
        try {
            ainn a = ainb.a();
            return a;
        } finally {
            in.a();
        }
    }

    public final Cursor query(String str, String str2) {
        akcr.b(str, "tag");
        akcr.b(str2, "queryString");
        Object attempt = this.dbValidator.attempt(str, new SnapSqlDelightDbClient$query$2(this, str2), this.dbValidator.getEmptySqliteCursor());
        akcr.a(attempt, "dbValidator.attempt(tag,…idator.emptySqliteCursor)");
        return (Cursor) attempt;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:37:0x005a in {14, 17, 20, 24, 28, 34, 36} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
        	at java.lang.Iterable.forEach(Iterable.java:75)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
        	at jadx.core.ProcessClass.process(ProcessClass.java:37)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    public final <R> boolean query(java.lang.String r5, defpackage.ainb<? extends R> r6, defpackage.akbl<? super R, defpackage.ajxw> r7) {
        /*
        r4 = this;
        r0 = "";
        r1 = "tag";
        defpackage.akcr.b(r5, r1);
        r5 = "query";
        defpackage.akcr.b(r6, r5);
        r5 = "handler";
        defpackage.akcr.b(r7, r5);
        r5 = r6.a();
        r5 = (java.io.Closeable) r5;
        r1 = 0;
        r2 = r5;	 Catch:{ Throwable -> 0x0053 }
        r2 = (defpackage.ainn) r2;	 Catch:{ Throwable -> 0x0053 }
        defpackage.in.a(r0);	 Catch:{ Throwable -> 0x0053 }
        r3 = r2.next();	 Catch:{ all -> 0x004c }
        if (r3 == 0) goto L_0x0044;	 Catch:{ all -> 0x004c }
        defpackage.in.a(r0);	 Catch:{ all -> 0x004c }
        r3 = r6.l;	 Catch:{ all -> 0x003f }
        r3 = r3.invoke(r2);	 Catch:{ all -> 0x003f }
        defpackage.in.a();	 Catch:{ all -> 0x004c }
        defpackage.in.a(r0);	 Catch:{ all -> 0x004c }
        r7.invoke(r3);	 Catch:{ all -> 0x003a }
        defpackage.in.a();	 Catch:{ all -> 0x004c }
        goto L_0x001e;	 Catch:{ all -> 0x004c }
        r6 = move-exception;	 Catch:{ all -> 0x004c }
        defpackage.in.a();	 Catch:{ all -> 0x004c }
        throw r6;	 Catch:{ all -> 0x004c }
        r6 = move-exception;	 Catch:{ all -> 0x004c }
        defpackage.in.a();	 Catch:{ all -> 0x004c }
        throw r6;	 Catch:{ all -> 0x004c }
        defpackage.in.a();	 Catch:{ Throwable -> 0x0053 }
        defpackage.akax.a(r5, r1);
        r5 = 1;
        return r5;
        r6 = move-exception;
        defpackage.in.a();	 Catch:{ Throwable -> 0x0053 }
        throw r6;	 Catch:{ Throwable -> 0x0053 }
        r6 = move-exception;
        goto L_0x0056;
        r6 = move-exception;
        r1 = r6;
        throw r1;	 Catch:{ all -> 0x0051 }
        defpackage.akax.a(r5, r1);
        throw r6;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.core.db.SnapSqlDelightDbClient.query(java.lang.String, ainb, akbl):boolean");
    }

    public final <T> ajdp<List<T>> queryAndMapToList(String str, ainb<? extends T> ainb) {
        akcr.b(str, "tag");
        akcr.b(ainb, "query");
        Object d = aiod.a(ainb, this.clientQueriesScheduler).d((ajfb) new SnapSqlDelightDbClient$queryAndMapToList$1(str));
        akcr.a(d, "query.asObservable(clien…ompat.beginSection(tag) }");
        akcr.b(d, "receiver$0");
        d = d.p(aiod.a.a);
        akcr.a(d, "map { it.executeAsList() }");
        Object q = d.d((ajfb) SnapSqlDelightDbClient$queryAndMapToList$2.INSTANCE).q(new SnapSqlDelightDbClient$queryAndMapToList$3(this, str));
        akcr.a(q, "query.asObservable(clien….callsite(tag), error)) }");
        return q;
    }

    public final <T> ajdp<T> queryAndMapToOne(String str, ainb<? extends T> ainb) {
        akcr.b(str, "tag");
        akcr.b(ainb, "query");
        Object d = aiod.a(ainb, this.clientQueriesScheduler).d((ajfb) new SnapSqlDelightDbClient$queryAndMapToOne$1(str));
        akcr.a(d, "query.asObservable(clien…ompat.beginSection(tag) }");
        d = aiod.a(d).d((ajfb) SnapSqlDelightDbClient$queryAndMapToOne$2.INSTANCE);
        akcr.a(d, "query.asObservable(clien…raceCompat.endSection() }");
        return d;
    }

    public final <T> ajdp<T> queryAndMapToOneNonNull(String str, ainb<? extends T> ainb) {
        akcr.b(str, "tag");
        akcr.b(ainb, "query");
        Object d = aiod.a(ainb, this.clientQueriesScheduler).d((ajfb) new SnapSqlDelightDbClient$queryAndMapToOneNonNull$1(str));
        akcr.a(d, "query.asObservable(clien…ompat.beginSection(tag) }");
        akcr.b(d, "receiver$0");
        d = d.k((ajfc) c.a);
        akcr.a(d, "flatMap {\n    val result…servable.just(result)\n  }");
        Object q = d.d((ajfb) SnapSqlDelightDbClient$queryAndMapToOneNonNull$2.INSTANCE).q(new SnapSqlDelightDbClient$queryAndMapToOneNonNull$3(this, str));
        akcr.a(q, "query.asObservable(clien….callsite(tag), error)) }");
        return q;
    }

    public final <T> ajdx<T> queryAndMapToOneOrDefault(String str, ainb<? extends T> ainb, T t) {
        akcr.b(str, "tag");
        akcr.b(ainb, "query");
        String str2 = "defaultValue";
        akcr.b(t, str2);
        Object d = aiod.a(ainb, this.clientQueriesScheduler).d((ajfb) new SnapSqlDelightDbClient$queryAndMapToOneOrDefault$1(str));
        akcr.a(d, "query.asObservable(clien…ompat.beginSection(tag) }");
        akcr.b(d, "receiver$0");
        akcr.b(t, str2);
        d = d.p(new d(t));
        akcr.a(d, "map { it.executeAsOneOrNull() ?: defaultValue }");
        Object h = d.d((ajfb) SnapSqlDelightDbClient$queryAndMapToOneOrDefault$2.INSTANCE).d((Object) t).h(new SnapSqlDelightDbClient$queryAndMapToOneOrDefault$3(this, str));
        akcr.a(h, "query.asObservable(clien….callsite(tag), error)) }");
        return h;
    }

    public final <T> ajdx<T> queryAndMapToOneOrError(String str, ainb<? extends T> ainb) {
        akcr.b(str, "tag");
        akcr.b(ainb, "query");
        Object d = aiod.a(ainb, this.clientQueriesScheduler).d((ajfb) new SnapSqlDelightDbClient$queryAndMapToOneOrError$1(str));
        akcr.a(d, "query.asObservable(clien…ompat.beginSection(tag) }");
        d = aiod.a(d).d((ajfb) SnapSqlDelightDbClient$queryAndMapToOneOrError$2.INSTANCE).e();
        akcr.a(d, "query.asObservable(clien…          .firstOrError()");
        return d;
    }

    public final <T> ajdp<Optional<T>> queryAndMapToOptional(String str, ainb<? extends T> ainb) {
        akcr.b(str, "tag");
        akcr.b(ainb, "query");
        Object d = aiod.a(ainb, this.clientQueriesScheduler).d((ajfb) new SnapSqlDelightDbClient$queryAndMapToOptional$1(str));
        akcr.a(d, "query.asObservable(clien…ompat.beginSection(tag) }");
        Object q = QueryRxExtensionKt.mapValueToOptional(d).d((ajfb) SnapSqlDelightDbClient$queryAndMapToOptional$2.INSTANCE).q(new SnapSqlDelightDbClient$queryAndMapToOptional$3(this, str));
        akcr.a(q, "query.asObservable(clien….callsite(tag), error)) }");
        return q;
    }

    public final <R> List<R> queryAsList(String str, ainb<? extends R> ainb) {
        akcr.b(str, "tag");
        akcr.b(ainb, "query");
        in.a("");
        try {
            List<R> c = ainb.c();
            return c;
        } finally {
            in.a();
        }
    }

    public final <R> R queryFirst(String str, ainb<? extends R> ainb) {
        akcr.b(str, "tag");
        akcr.b(ainb, "query");
        in.a("");
        try {
            List c = ainb.c();
            R r = null;
            if ((c.isEmpty() ^ 1) == 0) {
                c = null;
            }
            if (c != null) {
                r = ajyu.f(c);
            }
            in.a();
            return r;
        } catch (Throwable th) {
            in.a();
        }
    }

    /* JADX WARNING: Missing block: B:8:0x0028, code skipped:
            if (r2 == null) goto L_0x002a;
     */
    public final <R> R queryFirst(java.lang.String r2, defpackage.ainb<? extends R> r3, R r4) {
        /*
        r1 = this;
        r0 = "tag";
        defpackage.akcr.b(r2, r0);
        r2 = "query";
        defpackage.akcr.b(r3, r2);
        r2 = "default";
        defpackage.akcr.b(r4, r2);
        r2 = "";
        defpackage.in.a(r2);
        r2 = r3.c();	 Catch:{ all -> 0x002f }
        r3 = r2.isEmpty();	 Catch:{ all -> 0x002f }
        r3 = r3 ^ 1;
        if (r3 == 0) goto L_0x0021;
    L_0x0020:
        goto L_0x0022;
    L_0x0021:
        r2 = 0;
    L_0x0022:
        if (r2 == 0) goto L_0x002a;
    L_0x0024:
        r2 = defpackage.ajyu.f(r2);	 Catch:{ all -> 0x002f }
        if (r2 != 0) goto L_0x002b;
    L_0x002a:
        r2 = r4;
    L_0x002b:
        defpackage.in.a();
        return r2;
    L_0x002f:
        r2 = move-exception;
        defpackage.in.a();
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.core.db.SnapSqlDelightDbClient.queryFirst(java.lang.String, ainb, java.lang.Object):java.lang.Object");
    }

    public final ajcx runInTransaction(String str, akbl<? super a, ajxw> akbl) {
        akcr.b(str, "queryTag");
        akcr.b(akbl, "consumer");
        Object attempt = this.dbValidator.attempt(str, new SnapSqlDelightDbClient$runInTransaction$1(this, str, akbl), ajvo.a(ajhn.a));
        akcr.a(attempt, "dbValidator.attempt(quer…  Completable.complete())");
        return (ajcx) attempt;
    }

    public final ajcx runInTransactionCompat(String str, ajfb<a> ajfb) {
        akcr.b(str, "queryTag");
        akcr.b(ajfb, "consumer");
        return runInTransaction(str, new SnapSqlDelightDbClient$runInTransactionCompat$1(ajfb));
    }

    public final void runInTransactionImmediately(String str, akbl<? super a, ajxw> akbl) {
        akcr.b(str, "queryTag");
        akcr.b(akbl, "consumer");
        this.dbValidator.attempt(str, new SnapSqlDelightDbClient$runInTransactionImmediately$1(this, str, akbl), ajxw.a);
    }
}
