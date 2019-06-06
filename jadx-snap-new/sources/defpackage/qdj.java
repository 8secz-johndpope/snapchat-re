package defpackage;

import com.snap.core.db.api.DbClient;
import com.snap.core.db.api.DbTransaction;
import com.snap.core.db.api.SnapDb;
import com.snap.core.db.record.NetworkGatewayInfoModel;
import com.snap.messaging.MessagingHttpInterface;
import com.snap.messaging.MessagingHttpInterface.DefaultImpls;

/* renamed from: qdj */
public final class qdj implements adqp {
    final ajwy<qvh> a;
    final ajwy<gqr> b;
    final ajwy<rzx> c;
    private final ajxe d = ajxh.a(a.a);
    private final ajxe e;
    private final ajei f;
    private final ajwy<MessagingHttpInterface> g;

    /* renamed from: qdj$a */
    static final class a extends akcs implements akbk<idd> {
        public static final a a = new a();

        a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return pql.j.callsite("ChatGatewayService");
        }
    }

    /* renamed from: qdj$b */
    static final class b extends akcs implements akbk<DbClient> {
        private /* synthetic */ qdj a;
        private /* synthetic */ SnapDb b;

        b(qdj qdj, SnapDb snapDb) {
            this.a = qdj;
            this.b = snapDb;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.b.getDbClient(((idd) this.a.d.b()));
        }
    }

    /* renamed from: qdj$c */
    static final class c<T, R> implements ajfc<T, R> {
        public static final c a = new c();

        c() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            akxa akxa = (akxa) obj;
            akcr.b(akxa, "it");
            return (aesz) fst.a(akxa);
        }
    }

    /* renamed from: qdj$d */
    static final class d<T, R> implements ajfc<T, ajdn<? extends R>> {
        public static final d a = new d();

        d() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            obj = (aesz) obj;
            akcr.b(obj, "serverGatewayInfo");
            return ajdj.b(obj);
        }
    }

    /* renamed from: qdj$e */
    static final class e<T> implements ajfb<Throwable> {
        private /* synthetic */ qdj a;

        e(qdj qdj) {
            this.a = qdj;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (Throwable) obj;
            rzx rzx = (rzx) this.a.c.get();
            akcr.a(obj, "throwable");
            if (!rzx.a(obj)) {
                ((gqr) this.a.b.get()).a(gqt.HIGH, obj, ((idd) this.a.d.b()), "fetchAndStoreMessagingGatewayInfo");
            }
        }
    }

    /* renamed from: qdj$f */
    static final class f extends akcs implements akbl<DbTransaction, ajxw> {
        private /* synthetic */ qdj a;
        private /* synthetic */ aesz b;

        f(qdj qdj, aesz aesz) {
            this.a = qdj;
            this.b = aesz;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            DbTransaction dbTransaction = (DbTransaction) obj;
            akcr.b(dbTransaction, "tx");
            ((qvh) this.a.a.get()).a(this.b, dbTransaction);
            return ajxw.a;
        }
    }

    /* renamed from: qdj$g */
    static final class g extends akcs implements akbk<ajxw> {
        public static final g a = new g();

        g() {
            super(0);
        }

        public final /* bridge */ /* synthetic */ Object invoke() {
            return ajxw.a;
        }
    }

    /* renamed from: qdj$h */
    static final class h extends akcs implements akbl<Throwable, ajxw> {
        private /* synthetic */ qdj a;

        h(qdj qdj) {
            this.a = qdj;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            akcr.b(th, "throwable");
            ((gqr) this.a.b.get()).a(gqt.HIGH, th, ((idd) this.a.d.b()), "setMessagingGatewayInfo");
            return ajxw.a;
        }
    }

    /* renamed from: qdj$i */
    static final class i extends akcs implements akbl<DbTransaction, ajxw> {
        private /* synthetic */ qdj a;
        private /* synthetic */ String b;

        i(qdj qdj, String str) {
            this.a = qdj;
            this.b = str;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            DbTransaction dbTransaction = (DbTransaction) obj;
            akcr.b(dbTransaction, "tx");
            aesz a = ((qvh) this.a.a.get()).a();
            if (a != null) {
                a.b = this.b;
                if (a != null) {
                    ((qvh) this.a.a.get()).a(a, dbTransaction);
                }
            }
            return ajxw.a;
        }
    }

    /* renamed from: qdj$j */
    static final class j extends akcs implements akbk<ajxw> {
        public static final j a = new j();

        j() {
            super(0);
        }

        public final /* bridge */ /* synthetic */ Object invoke() {
            return ajxw.a;
        }
    }

    /* renamed from: qdj$k */
    static final class k extends akcs implements akbl<Throwable, ajxw> {
        private /* synthetic */ qdj a;

        k(qdj qdj) {
            this.a = qdj;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            akcr.b(th, "it");
            ((gqr) this.a.b.get()).a(gqt.HIGH, th, ((idd) this.a.d.b()), "setMessagingGatewayInfoServer");
            return ajxw.a;
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(qdj.class), "callsite", "getCallsite()Lcom/snap/framework/attribution/AttributedCallsite;"), new akdc(akde.a(qdj.class), "dbClient", "getDbClient()Lcom/snap/core/db/api/DbClient;")};
    }

    public qdj(SnapDb snapDb, ajwy<qvh> ajwy, ajei ajei, ajwy<gqr> ajwy2, ajwy<MessagingHttpInterface> ajwy3, ajwy<rzx> ajwy4) {
        akcr.b(snapDb, "snapDb");
        akcr.b(ajwy, "store");
        akcr.b(ajei, "userSessionDisposable");
        akcr.b(ajwy2, "exceptionTracker");
        akcr.b(ajwy3, "messagingHttpInterface");
        akcr.b(ajwy4, "noNetworkDetector");
        this.a = ajwy;
        this.f = ajei;
        this.b = ajwy2;
        this.g = ajwy3;
        this.c = ajwy4;
        this.e = ajxh.a(new b(this, snapDb));
    }

    private final void a(aesz aesz) {
        this.f.a(ajwe.a(c().runInTransaction("ChatGatewayService:setMessagingGatewayInfo", new f(this, aesz)), (akbl) new h(this), (akbk) g.a));
    }

    private final DbClient c() {
        return (DbClient) this.e.b();
    }

    public final aesz a() {
        aesz a = ((qvh) this.a.get()).a();
        return a == null ? b() : a;
    }

    public final void a(String str) {
        akcr.b(str, NetworkGatewayInfoModel.SERVER);
        this.f.a(ajwe.a(c().runInTransaction("ChatGatewayService:setMessagingGatewayInfoServer", new i(this, str)), (akbl) new k(this), (akbk) j.a));
    }

    public final aesz b() {
        aesz aesz = (aesz) DefaultImpls.fetchGatewayAuthToken$default((MessagingHttpInterface) this.g.get(), null, 1, null).f(c.a).b((ajfc) d.a).a((ajfb) new e(this)).b(ajfu.g).b();
        if (aesz != null) {
            a(aesz);
        }
        return aesz;
    }
}
