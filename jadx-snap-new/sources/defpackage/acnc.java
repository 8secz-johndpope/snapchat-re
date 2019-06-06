package defpackage;

import com.snap.core.db.api.SqlDelightDbClient;
import com.snap.core.db.api.SqlDelightDbManager;
import defpackage.ainf.a;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: acnc */
public final class acnc {
    final ajdx<ajxm<SqlDelightDbClient, niv>> a = ajdx.c((Callable) new b(this)).b((ajdw) this.c.b()).a();
    final SqlDelightDbManager b;
    private final zfw c = zgb.a(adcw.b.callsite("EggHuntFailedAcquisitionRepository"));

    /* renamed from: acnc$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: acnc$b */
    static final class b<V> implements Callable<T> {
        private /* synthetic */ acnc a;

        b(acnc acnc) {
            this.a = acnc;
        }

        public final /* synthetic */ Object call() {
            SqlDelightDbClient dbClient = this.a.b.getDbClient(adcw.b.callsite("EggHuntFailedAcquisitionRepository"));
            ainf database = dbClient.getDatabase();
            if (database != null) {
                return new ajxm(dbClient, (niv) database);
            }
            throw new ajxt("null cannot be cast to non-null type com.snap.map.MapCoreDatabase");
        }
    }

    /* renamed from: acnc$c */
    static final class c<T, R> implements ajfc<ajxm<? extends SqlDelightDbClient, ? extends niv>, ajdb> {
        final /* synthetic */ String a;

        c(String str) {
            this.a = str;
        }

        public final /* synthetic */ Object apply(Object obj) {
            ajxm ajxm = (ajxm) obj;
            akcr.b(ajxm, "<name for destructuring parameter 0>");
            SqlDelightDbClient sqlDelightDbClient = (SqlDelightDbClient) ajxm.a;
            final niv niv = (niv) ajxm.b;
            return sqlDelightDbClient.runInTransaction("EggHuntFailedAcquisitionRepository:insertEgg", new akbl<a, ajxw>(this) {
                private /* synthetic */ c a;

                public final /* synthetic */ Object invoke(Object obj) {
                    akcr.b((a) obj, "it");
                    niv.a().deleteRow(this.a.a);
                    return ajxw.a;
                }
            });
        }
    }

    /* renamed from: acnc$d */
    static final class d<T, R> implements ajfc<ajxm<? extends SqlDelightDbClient, ? extends niv>, ajdb> {
        final /* synthetic */ addl a;

        d(addl addl) {
            this.a = addl;
        }

        public final /* synthetic */ Object apply(Object obj) {
            ajxm ajxm = (ajxm) obj;
            akcr.b(ajxm, "<name for destructuring parameter 0>");
            SqlDelightDbClient sqlDelightDbClient = (SqlDelightDbClient) ajxm.a;
            final niv niv = (niv) ajxm.b;
            return sqlDelightDbClient.runInTransaction("EggHuntFailedAcquisitionRepository:insertEgg", new akbl<a, ajxw>(this) {
                private /* synthetic */ d a;

                public final /* synthetic */ Object invoke(Object obj) {
                    akcr.b((a) obj, "it");
                    niv.a().insertRow(this.a.a.a, (long) this.a.a.b, (long) this.a.a.c);
                    return ajxw.a;
                }
            });
        }
    }

    /* renamed from: acnc$e */
    static final class e<T, R> implements ajfc<T, ajdt<? extends R>> {
        public static final e a = new e();

        /* renamed from: acnc$e$1 */
        static final class 1 extends akcs implements akcb<Long, String, Long, Long, addl> {
            public static final 1 a = new 1();

            1() {
                super(4);
            }

            public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                ((Number) obj).longValue();
                String str = (String) obj2;
                long longValue = ((Number) obj3).longValue();
                long longValue2 = ((Number) obj4).longValue();
                akcr.b(str, "eggId");
                return new addl(str, (int) longValue, (int) longValue2);
            }
        }

        e() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            ajxm ajxm = (ajxm) obj;
            akcr.b(ajxm, "<name for destructuring parameter 0>");
            return ((SqlDelightDbClient) ajxm.a).queryAndMapToList("EggHuntFailedAcquisitionRepository:insertEgg", ((niv) ajxm.b).a().selectAll(1.a));
        }
    }

    static {
        a aVar = new a();
    }

    public acnc(SqlDelightDbManager sqlDelightDbManager, zgb zgb) {
        akcr.b(sqlDelightDbManager, "dbManager");
        akcr.b(zgb, "schedulersProvider");
        this.b = sqlDelightDbManager;
    }

    public final ajdp<List<addl>> a() {
        Object d = this.a.d((ajfc) e.a);
        akcr.a(d, "clientAndDatabase.flatMa…            }))\n        }");
        return d;
    }
}
