package defpackage;

import com.snap.core.db.api.BriteDatabaseExtensionsKt;
import com.snap.core.db.api.DbClient;
import com.snap.core.db.api.DbTransaction;
import com.snap.core.db.api.SnapDb;
import com.snap.core.db.record.BenchmarkRequestRecord;
import com.snap.core.db.record.BenchmarkRequestRecordModel.InsertOrReplaceBenchmarkRequest;
import com.snap.core.db.record.BenchmarkRequestRecordModel.Mapper;
import com.snap.core.db.record.BenchmarkRequestRecordModel.MarkBenchmarkScheduled;
import com.snap.core.db.record.BenchmarkRequestRecordModel.RemoveBenchmarkRequest;
import com.snap.core.db.record.BenchmarkRequestRecordModel.UpdateBenchmarkResult;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;

/* renamed from: fim */
public final class fim {
    final ajxe a = ajxh.a(new o(this));
    final ajxe b = ajxh.a(new f(this));
    final ajxe c = ajxh.a(m.a);
    final ajwy<SnapDb> d;
    final ajwy<ihh> e;
    private final ajxe f = ajxh.a(new e(this));
    private final ajxe g = ajxh.a(new q(a()));
    private final ajxe h = ajxh.a(new d(this));
    private final ajxe i = ajxh.a(new n(this));
    private final ajxe j = ajxh.a(i.a);
    private final ajxe k = ajxh.a(p.a);
    private final ajxe l = ajxh.a(new b(this));
    private final ajxe m = ajxh.a(new l(this));

    /* renamed from: fim$q */
    static final class q extends akcq implements akbk<pa> {
        q(DbClient dbClient) {
            super(0, dbClient);
        }

        public final String getName() {
            return "getWritableDatabase";
        }

        public final akej getOwner() {
            return akde.a(DbClient.class);
        }

        public final String getSignature() {
            return "getWritableDatabase()Landroidx/sqlite/db/SupportSQLiteDatabase;";
        }

        public final /* synthetic */ Object invoke() {
            return ((DbClient) this.receiver).getWritableDatabase();
        }
    }

    /* renamed from: fim$i */
    static final class i extends akcs implements akbk<ainx> {
        public static final i a = new i();

        i() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return BenchmarkRequestRecord.FACTORY.GetUnreportedResults();
        }
    }

    /* renamed from: fim$p */
    static final class p extends akcs implements akbk<Mapper<BenchmarkRequestRecord>> {
        public static final p a = new p();

        p() {
            super(0);
        }

        public final /* bridge */ /* synthetic */ Object invoke() {
            return BenchmarkRequestRecord.PENDING_RESULT_MAPPER;
        }
    }

    /* renamed from: fim$m */
    static final class m extends akcs implements akbk<Mapper<BenchmarkRequestRecord>> {
        public static final m a = new m();

        m() {
            super(0);
        }

        public final /* bridge */ /* synthetic */ Object invoke() {
            return BenchmarkRequestRecord.PENDING_BENCHMARK_MAPPER;
        }
    }

    /* renamed from: fim$o */
    static final class o extends akcs implements akbk<SnapDb> {
        private /* synthetic */ fim a;

        o(fim fim) {
            this.a = fim;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (SnapDb) this.a.d.get();
        }
    }

    /* renamed from: fim$e */
    static final class e extends akcs implements akbk<DbClient> {
        private /* synthetic */ fim a;

        e(fim fim) {
            this.a = fim;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ((SnapDb) this.a.a.b()).getDbClient((ide) fil.a);
        }
    }

    /* renamed from: fim$f */
    static final class f extends akcs implements akbk<ihh> {
        private /* synthetic */ fim a;

        f(fim fim) {
            this.a = fim;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ihh) this.a.e.get();
        }
    }

    /* renamed from: fim$d */
    static final class d extends akcs implements akbk<UpdateBenchmarkResult> {
        private /* synthetic */ fim a;

        d(fim fim) {
            this.a = fim;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new UpdateBenchmarkResult(((pa) this.a.g.b()), BenchmarkRequestRecord.FACTORY);
        }
    }

    /* renamed from: fim$n */
    static final class n extends akcs implements akbk<RemoveBenchmarkRequest> {
        private /* synthetic */ fim a;

        n(fim fim) {
            this.a = fim;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new RemoveBenchmarkRequest(((pa) this.a.g.b()));
        }
    }

    /* renamed from: fim$b */
    static final class b extends akcs implements akbk<InsertOrReplaceBenchmarkRequest> {
        private /* synthetic */ fim a;

        b(fim fim) {
            this.a = fim;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new InsertOrReplaceBenchmarkRequest(((pa) this.a.g.b()));
        }
    }

    /* renamed from: fim$l */
    static final class l extends akcs implements akbk<MarkBenchmarkScheduled> {
        private /* synthetic */ fim a;

        l(fim fim) {
            this.a = fim;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new MarkBenchmarkScheduled(((pa) this.a.g.b()));
        }
    }

    /* renamed from: fim$h */
    static final class h<V> implements Callable<T> {
        private /* synthetic */ fim a;

        h(fim fim) {
            this.a = fim;
        }

        public final /* synthetic */ Object call() {
            Object a = this.a.a();
            akcr.a(a, "briteDatabase");
            Object a2 = ((ainx) this.a.j.b());
            akcr.a(a2, "getUnreportedBenchmarkResultsStatement");
            Object b = ((Mapper) this.a.k.b());
            akcr.a(b, "unreportedBenchmarksMapper");
            Iterable<BenchmarkRequestRecord> queryList = BriteDatabaseExtensionsKt.queryList(a, a2, (ainw) b);
            Collection arrayList = new ArrayList(ajyn.a((Iterable) queryList, 10));
            for (BenchmarkRequestRecord benchmarkResult : queryList) {
                arrayList.add(benchmarkResult.benchmarkResult());
            }
            return ajyu.g((Iterable) (List) arrayList);
        }
    }

    /* renamed from: fim$g */
    static final class g<V> implements Callable<T> {
        private /* synthetic */ fim a;

        g(fim fim) {
            this.a = fim;
        }

        public final /* synthetic */ Object call() {
            Object GetPendingBenchmarks = BenchmarkRequestRecord.FACTORY.GetPendingBenchmarks(Long.valueOf(((ihh) this.a.b.b()).c() / 1000));
            akcr.a(GetPendingBenchmarks, "BenchmarkRequestRecord.F…enchmarks(currentTimeSec)");
            Object a = this.a.a();
            akcr.a(a, "briteDatabase");
            Object obj = (Mapper) this.a.c.b();
            akcr.a(obj, "pendingBenchmarkMapper");
            Iterable<BenchmarkRequestRecord> queryList = BriteDatabaseExtensionsKt.queryList(a, GetPendingBenchmarks, (ainw) obj);
            Collection arrayList = new ArrayList(ajyn.a((Iterable) queryList, 10));
            for (BenchmarkRequestRecord benchmarkId : queryList) {
                arrayList.add(Integer.valueOf((int) benchmarkId.benchmarkId()));
            }
            return (List) arrayList;
        }
    }

    /* renamed from: fim$a */
    static final class a extends akcs implements akbl<DbTransaction, Boolean> {
        private /* synthetic */ fim a;
        private /* synthetic */ acbt b;
        private /* synthetic */ Long c;

        a(fim fim, acbt acbt, Long l) {
            this.a = fim;
            this.b = acbt;
            this.c = l;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            DbTransaction dbTransaction = (DbTransaction) obj;
            akcr.b(dbTransaction, "tx");
            int[] iArr = this.b.a;
            boolean z = true;
            if (iArr != null) {
                DbClient a = this.a.a();
                Object a2 = ((ainx) this.a.j.b());
                akcr.a(a2, "getUnreportedBenchmarkResultsStatement");
                Object b = ((Mapper) this.a.k.b());
                akcr.a(b, "unreportedBenchmarksMapper");
                Iterable<BenchmarkRequestRecord> query = a.query(a2, (ainw) b);
                Collection arrayList = new ArrayList(ajyn.a((Iterable) query, 10));
                for (BenchmarkRequestRecord benchmarkId : query) {
                    arrayList.add(Long.valueOf(benchmarkId.benchmarkId()));
                }
                Set m = ajyu.m((List) arrayList);
                boolean z2 = true;
                for (int i : iArr) {
                    long j = (long) i;
                    if (!m.contains(Long.valueOf(j))) {
                        ((InsertOrReplaceBenchmarkRequest) this.a.l.b()).bind(j, this.c);
                        if (this.a.a().executeUpdateDelete(((InsertOrReplaceBenchmarkRequest) this.a.l.b()), dbTransaction) == 0) {
                            z2 = false;
                        }
                    }
                }
                z = z2;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: fim$c */
    static final class c extends akcs implements akbl<DbTransaction, Boolean> {
        private /* synthetic */ fim a;
        private /* synthetic */ acbu b;

        c(fim fim, acbu acbu) {
            this.a = fim;
            this.b = acbu;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            DbTransaction dbTransaction = (DbTransaction) obj;
            akcr.b(dbTransaction, "tx");
            UpdateBenchmarkResult e = ((UpdateBenchmarkResult) this.a.h.b());
            acbu acbu = this.b;
            e.bind(acbu, (long) acbu.b());
            return Boolean.valueOf(this.a.a().executeUpdateDelete((ainy) ((UpdateBenchmarkResult) this.a.h.b()), dbTransaction) > 0);
        }
    }

    /* renamed from: fim$j */
    static final class j extends akcs implements akbl<DbTransaction, Boolean> {
        private /* synthetic */ fim a;
        private /* synthetic */ List b;

        j(fim fim, List list) {
            this.a = fim;
            this.b = list;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            DbTransaction dbTransaction = (DbTransaction) obj;
            akcr.b(dbTransaction, "tx");
            boolean z = true;
            for (acbu b : this.b) {
                ((RemoveBenchmarkRequest) this.a.i.b()).bind((long) b.b());
                if (this.a.a().executeUpdateDelete(((RemoveBenchmarkRequest) this.a.i.b()), dbTransaction) == 0) {
                    z = false;
                }
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: fim$k */
    static final class k extends akcs implements akbl<DbTransaction, Boolean> {
        private /* synthetic */ fim a;
        private /* synthetic */ int b;

        k(fim fim, int i) {
            this.a = fim;
            this.b = i;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            DbTransaction dbTransaction = (DbTransaction) obj;
            akcr.b(dbTransaction, "tx");
            ((MarkBenchmarkScheduled) this.a.m.b()).bind((long) this.b);
            Object a = this.a.a();
            akcr.a(a, "briteDatabase");
            return Boolean.valueOf(BriteDatabaseExtensionsKt.executeUpdate(a, (ainy) ((MarkBenchmarkScheduled) this.a.m.b()), dbTransaction) > 0);
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(fim.class), "snapDb", "getSnapDb()Lcom/snap/core/db/api/SnapDb;"), new akdc(akde.a(fim.class), "briteDatabase", "getBriteDatabase()Lcom/snap/core/db/api/DbClient;"), new akdc(akde.a(fim.class), "writableDatabase", "getWritableDatabase()Landroidx/sqlite/db/SupportSQLiteDatabase;"), new akdc(akde.a(fim.class), "clock", "getClock()Lcom/snap/framework/time/Clock;"), new akdc(akde.a(fim.class), "addBenchmarkResultStatement", "getAddBenchmarkResultStatement()Lcom/snap/core/db/record/BenchmarkRequestRecordModel$UpdateBenchmarkResult;"), new akdc(akde.a(fim.class), "removeBenchmarkRequestStatement", "getRemoveBenchmarkRequestStatement()Lcom/snap/core/db/record/BenchmarkRequestRecordModel$RemoveBenchmarkRequest;"), new akdc(akde.a(fim.class), "getUnreportedBenchmarkResultsStatement", "getGetUnreportedBenchmarkResultsStatement()Lcom/squareup/sqldelight/prerelease/SqlDelightQuery;"), new akdc(akde.a(fim.class), "unreportedBenchmarksMapper", "getUnreportedBenchmarksMapper()Lcom/snap/core/db/record/BenchmarkRequestRecordModel$Mapper;"), new akdc(akde.a(fim.class), "addBenchmarkRequestStatement", "getAddBenchmarkRequestStatement()Lcom/snap/core/db/record/BenchmarkRequestRecordModel$InsertOrReplaceBenchmarkRequest;"), new akdc(akde.a(fim.class), "markBenchmarkScheduledStatement", "getMarkBenchmarkScheduledStatement()Lcom/snap/core/db/record/BenchmarkRequestRecordModel$MarkBenchmarkScheduled;"), new akdc(akde.a(fim.class), "pendingBenchmarkMapper", "getPendingBenchmarkMapper()Lcom/snap/core/db/record/BenchmarkRequestRecordModel$Mapper;")};
    }

    public fim(ajwy<SnapDb> ajwy, ajwy<ihh> ajwy2) {
        akcr.b(ajwy, "snapDbProvider");
        akcr.b(ajwy2, "clockProvider");
        this.d = ajwy;
        this.e = ajwy2;
    }

    /* Access modifiers changed, original: final */
    public final DbClient a() {
        return (DbClient) this.f.b();
    }
}
