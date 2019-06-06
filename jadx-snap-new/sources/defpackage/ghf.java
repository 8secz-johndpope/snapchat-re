package defpackage;

import com.snap.core.db.api.ForCoreDb;
import com.snap.core.db.api.SqlDelightDbClient;
import com.snap.core.db.api.SqlDelightDbManager;
import com.snap.core.db.record.DataConsumption;
import defpackage.ainf.a;
import java.util.Collection;
import java.util.List;

/* renamed from: ghf */
public final class ghf implements get {
    final SqlDelightDbManager a;
    private final ajxe b = ajxh.a(new b(this));
    private final ajxe c = ajxh.a(new d(this));

    /* renamed from: ghf$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: ghf$b */
    static final class b extends akcs implements akbk<SqlDelightDbClient> {
        private /* synthetic */ ghf a;

        b(ghf ghf) {
            this.a = ghf;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.a.getDbClient(new idd(gef.a.getPage()));
        }
    }

    /* renamed from: ghf$d */
    static final class d extends akcs implements akbk<fwr> {
        private /* synthetic */ ghf a;

        d(ghf ghf) {
            this.a = ghf;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            ainf database = this.a.b().getDatabase();
            if (database != null) {
                return (fwr) database;
            }
            throw new ajxt("null cannot be cast to non-null type com.snap.core.PlatformCoreDatabase");
        }
    }

    /* renamed from: ghf$e */
    static final class e extends akcs implements akbl<a, List<? extends DataConsumption>> {
        private /* synthetic */ ghf a;

        e(ghf ghf) {
            this.a = ghf;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((a) obj, "it");
            List queryAsList = this.a.b().queryAsList("DefaultDataConsumptionRepository:selectAndDeleteAllConsumedRecords", this.a.c().a().selectAllConsumedRows());
            this.a.c().a().deleteAllConsumedRows();
            return queryAsList;
        }
    }

    /* renamed from: ghf$c */
    static final class c extends akcs implements akbl<a, ajxw> {
        private /* synthetic */ ghf a;
        private /* synthetic */ long b;

        c(ghf ghf, long j) {
            this.a = ghf;
            this.b = j;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((a) obj, "it");
            this.a.c().a().deleteOldRecords(Long.valueOf(this.b));
            return ajxw.a;
        }
    }

    /* renamed from: ghf$f */
    static final class f extends akcs implements akbl<a, ajxw> {
        private /* synthetic */ ghf a;
        private /* synthetic */ Collection b;

        f(ghf ghf, Collection collection) {
            this.a = ghf;
            this.b = collection;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((a) obj, "tx");
            for (ges ges : this.b) {
                if (ges instanceof gev) {
                    gev gev = (gev) ges;
                    this.a.c().a().insertRow(gev.a, gev.b, gev.c, gev.d, Long.valueOf(gev.e), Long.valueOf(gev.f), gev.g);
                } else if (ges instanceof geq) {
                    geq geq = (geq) ges;
                    this.a.c().a().setFirstAccessedTimeToLastestEntry(Long.valueOf(geq.b), geq.a);
                }
            }
            return ajxw.a;
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(ghf.class), "dbClient", "getDbClient()Lcom/snap/core/db/api/SqlDelightDbClient;"), new akdc(akde.a(ghf.class), "platformCoreDatabase", "getPlatformCoreDatabase()Lcom/snap/core/PlatformCoreDatabase;")};
        a aVar = new a();
    }

    public ghf(@ForCoreDb SqlDelightDbManager sqlDelightDbManager) {
        akcr.b(sqlDelightDbManager, "dbManager");
        this.a = sqlDelightDbManager;
    }

    public final ajcx a(long j) {
        return b().runInTransaction("DefaultDataConsumptionRepository:deleteOldRecords", new c(this, j));
    }

    public final ajdx<List<DataConsumption>> a() {
        return b().callInTransaction("DefaultDataConsumptionRepository:selectAndDeleteAllConsumedRecords", new e(this));
    }

    /* Access modifiers changed, original: final */
    public final SqlDelightDbClient b() {
        return (SqlDelightDbClient) this.b.b();
    }

    /* Access modifiers changed, original: final */
    public final fwr c() {
        return (fwr) this.c.b();
    }
}
