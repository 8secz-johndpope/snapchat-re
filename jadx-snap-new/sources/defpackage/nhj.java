package defpackage;

import com.snap.core.db.api.DbClient;
import com.snap.core.db.api.DbTransaction;
import com.snap.core.db.api.SnapDb;
import com.snap.core.db.record.ConnectedAppScopesModel.UpdateScope;
import com.snap.core.db.record.ConnectedAppsModel.UpdateApp;

/* renamed from: nhj */
public final class nhj {
    public final DbClient a;
    private final ajxe b = ajxh.a(new d(this.a));
    private final ajxe c = ajxh.a(new b(this));
    private final ajxe d = ajxh.a(new c(this));

    /* renamed from: nhj$d */
    static final class d extends akcq implements akbk<pa> {
        d(DbClient dbClient) {
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

    /* renamed from: nhj$b */
    static final class b extends akcs implements akbk<UpdateApp> {
        private /* synthetic */ nhj a;

        b(nhj nhj) {
            this.a = nhj;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new UpdateApp(((pa) this.a.b.b()));
        }
    }

    /* renamed from: nhj$c */
    static final class c extends akcs implements akbk<UpdateScope> {
        private /* synthetic */ nhj a;

        c(nhj nhj) {
            this.a = nhj;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new UpdateScope(((pa) this.a.b.b()));
        }
    }

    /* renamed from: nhj$a */
    public static final class a extends akcs implements akbl<DbTransaction, ajxw> {
        private /* synthetic */ nhj a;
        private /* synthetic */ kog b;

        public a(nhj nhj, kog kog) {
            this.a = nhj;
            this.b = kog;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            DbTransaction dbTransaction = (DbTransaction) obj;
            akcr.b(dbTransaction, "tx");
            UpdateApp a = ((UpdateApp) this.a.c.b());
            String b = this.b.b();
            String c = this.b.c();
            String d = this.b.d();
            koe koe = this.b.a;
            Long l = null;
            String a2 = koe != null ? koe.a() : null;
            koe koe2 = this.b.a;
            String b2 = koe2 != null ? koe2.b() : null;
            koe koe3 = this.b.a;
            if (koe3 != null) {
                l = Long.valueOf((long) koe3.c());
            }
            a.bind(b, c, d, a2, b2, l);
            this.a.a.executeInsert(((UpdateApp) this.a.c.b()), dbTransaction);
            Object obj2 = this.b.b;
            akcr.a(obj2, "appConnection.scopesApproved");
            for (Object obj3 : obj2) {
                UpdateScope b3 = ((UpdateScope) this.a.d.b());
                b2 = this.b.b();
                akcr.a(obj3, "scope");
                String b4 = obj3.b();
                Object obj4 = obj3.a;
                akcr.a(obj4, "scope.descriptions");
                b3.bind(b2, b4, ajyi.a((Object[]) obj4, null, null, null, 0, null, null, 63), Boolean.valueOf(obj3.c()), obj3.d());
                this.a.a.executeInsert(((UpdateScope) this.a.d.b()), dbTransaction);
            }
            return ajxw.a;
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(nhj.class), "writeableDb", "getWriteableDb()Landroidx/sqlite/db/SupportSQLiteDatabase;"), new akdc(akde.a(nhj.class), "updateAppStatement", "getUpdateAppStatement()Lcom/snap/core/db/record/ConnectedAppsModel$UpdateApp;"), new akdc(akde.a(nhj.class), "updateScopesStatement", "getUpdateScopesStatement()Lcom/snap/core/db/record/ConnectedAppScopesModel$UpdateScope;")};
    }

    public nhj(SnapDb snapDb) {
        akcr.b(snapDb, "snapDb");
        this.a = snapDb.getDbClient((ide) ngn.d);
    }
}
