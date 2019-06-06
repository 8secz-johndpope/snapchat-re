package defpackage;

import com.snap.core.db.api.DbClient;
import com.snap.core.db.api.DbTransaction;
import com.snap.core.db.api.SnapDb;
import java.util.concurrent.TimeUnit;

/* renamed from: yih */
public final class yih implements yhu {
    final DbClient a = this.d.getDbClient((ide) yhy.j);
    final yip b;
    private ajej c;
    private final SnapDb d;
    private final gpu e;

    /* renamed from: yih$b */
    static final class b extends akcs implements akbl<Throwable, ajxw> {
        public static final b a = new b();

        b() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((Throwable) obj, "it");
            return ajxw.a;
        }
    }

    /* renamed from: yih$a */
    static final class a<T, R> implements ajfc<Long, ajdb> {
        final /* synthetic */ yih a;

        /* renamed from: yih$a$1 */
        static final class 1 extends akcs implements akbl<DbTransaction, ajxw> {
            private /* synthetic */ a a;

            1(a aVar) {
                this.a = aVar;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                DbTransaction dbTransaction = (DbTransaction) obj;
                akcr.b(dbTransaction, "tx");
                this.a.a.b.a(dbTransaction);
                return ajxw.a;
            }
        }

        a(yih yih) {
            this.a = yih;
        }

        public final /* synthetic */ Object apply(Object obj) {
            akcr.b((Long) obj, "it");
            return this.a.a.runInTransaction("StoryRepositoryClient:startPeriodicDeletionOfExpiredStorySnaps", new 1(this));
        }
    }

    public yih(yip yip, SnapDb snapDb, gpu gpu) {
        akcr.b(yip, "storyRepositoryClient");
        akcr.b(snapDb, "snapDb");
        akcr.b(gpu, "userSession");
        this.b = yip;
        this.d = snapDb;
        this.e = gpu;
    }

    public final void a() {
        ajcx a = ajdp.a(0, 60, TimeUnit.SECONDS).b(this.d.scheduler()).a((ajfc) new a(this), false);
        akcr.a((Object) a, "Observable.interval(0, E…      }\n                }");
        this.c = ajvv.a(yit.a(a, (akbl) b.a, null, 2), this.e.a);
    }

    public final void b() {
        ajej ajej = this.c;
        if (ajej != null) {
            this.e.a.b(ajej);
            ajej.dispose();
        }
    }
}
