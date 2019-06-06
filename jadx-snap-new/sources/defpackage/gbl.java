package defpackage;

import com.snap.core.db.api.SqlDelightDbClient;
import com.snap.core.db.api.SqlDelightDbManager;
import defpackage.ainf.a;
import java.nio.charset.Charset;
import java.sql.SQLException;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: gbl */
public final class gbl {
    final SqlDelightDbManager a;
    final ajwy<iha> b;
    final ajwy<hwr> c;
    public final ihh d;
    private final String e = "DurableJobRepository";
    private final ajxe f = ajxh.a(new b(this));
    private final ajxe g = ajxh.a(new e(this));
    private final ajwy<gqr> h;

    /* renamed from: gbl$b */
    static final class b extends akcs implements akbk<SqlDelightDbClient> {
        private /* synthetic */ gbl a;

        b(gbl gbl) {
            this.a = gbl;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.a.getDbClient(new idd(hwj.a.getPage()));
        }
    }

    /* renamed from: gbl$e */
    static final class e extends akcs implements akbk<gaz> {
        private /* synthetic */ gbl a;

        e(gbl gbl) {
            this.a = gbl;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            ainf database = this.a.a().getDatabase();
            if (database != null) {
                return (gaz) database;
            }
            throw new ajxt("null cannot be cast to non-null type com.snap.core.durablejob.DurableJobDatabase");
        }
    }

    /* renamed from: gbl$c */
    public static final class c extends akcs implements akbl<a, ajxw> {
        private /* synthetic */ gbl a;
        private /* synthetic */ List b;

        public c(gbl gbl, List list) {
            this.a = gbl;
            this.b = list;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((a) obj, "tx");
            for (String d : this.b) {
                this.a.b().a().d(d);
            }
            return ajxw.a;
        }
    }

    /* renamed from: gbl$f */
    static final class f extends akcs implements akbl<a, String> {
        private /* synthetic */ gbl a;
        private /* synthetic */ hwg b;
        private /* synthetic */ hwp c;
        private /* synthetic */ int d = 0;

        f(gbl gbl, hwg hwg, hwp hwp) {
            this.a = gbl;
            this.b = hwg;
            this.c = hwp;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((a) obj, "tx");
            hwi hwi = this.b.c.c;
            gbm a = hwi != hwi.APPEND ? this.a.a(this.b.b()) : null;
            if (a != null) {
                if (hwi == hwi.REPLACE) {
                    this.a.b().a().d(this.b.b());
                } else if (hwi == hwi.KEEP) {
                    return a.a();
                }
            }
            String a2 = ((hwr) this.a.c.get()).a();
            Object b = ((iha) this.a.b.get()).b(this.b.d);
            akcr.a(b, "serializationHelper.get(…ring(durableJob.metadata)");
            Charset charset = akfp.a;
            String str = "null cannot be cast to non-null type java.lang.String";
            if (b != null) {
                Object bytes = b.getBytes(charset);
                String str2 = "(this as java.lang.String).getBytes(charset)";
                akcr.a(bytes, str2);
                Object b2 = ((iha) this.a.b.get()).b(this.b.c);
                akcr.a(b2, "serializationHelper.get(…String(durableJob.config)");
                Charset charset2 = akfp.a;
                if (b2 != null) {
                    Object bytes2 = b2.getBytes(charset2);
                    akcr.a(bytes2, str2);
                    hwq hwq = this.b.c.e;
                    long j = 0;
                    if (hwq != null) {
                        TimeUnit timeUnit = hwq.b;
                        if (timeUnit != null) {
                            hwq hwq2 = this.b.c.e;
                            if (hwq2 != null) {
                                j = hwq2.a;
                            }
                            j = timeUnit.toMillis(j);
                        }
                    }
                    this.a.b().a().a(a2, this.b.a(), this.b.b(), (String) this.b.b.b(), this.a.d.a() + j, hwt.ENQUEUED, this.c, bytes2, bytes, 0);
                    return a2;
                }
                throw new ajxt(str);
            }
            throw new ajxt(str);
        }
    }

    /* renamed from: gbl$g */
    static final class g extends akcs implements akbl<a, ajxw> {
        private /* synthetic */ gbl a;
        private /* synthetic */ hwt b;
        private /* synthetic */ int c;
        private /* synthetic */ String d;

        g(gbl gbl, hwt hwt, int i, String str) {
            this.a = gbl;
            this.b = hwt;
            this.c = i;
            this.d = str;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((a) obj, "tx");
            this.a.b().a().a(this.b, (long) this.c, this.d);
            return ajxw.a;
        }
    }

    /* renamed from: gbl$a */
    public static final class a extends akcs implements akbl<defpackage.ainf.a, ajxw> {
        private /* synthetic */ gbl a;
        private /* synthetic */ String b;

        public a(gbl gbl, String str) {
            this.a = gbl;
            this.b = str;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((defpackage.ainf.a) obj, "tx");
            this.a.b().a().c(this.b);
            return ajxw.a;
        }
    }

    /* renamed from: gbl$d */
    public static final class d extends akcs implements akbl<a, ajxw> {
        private /* synthetic */ gbl a;
        private /* synthetic */ List b;

        public d(gbl gbl, List list) {
            this.a = gbl;
            this.b = list;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((a) obj, "it");
            this.a.b().a().a((Collection) this.b);
            return ajxw.a;
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(gbl.class), "dbClient", "getDbClient()Lcom/snap/core/db/api/SqlDelightDbClient;"), new akdc(akde.a(gbl.class), "durablejobDatabase", "getDurablejobDatabase()Lcom/snap/core/durablejob/DurableJobDatabase;")};
    }

    public gbl(SqlDelightDbManager sqlDelightDbManager, ajwy<iha> ajwy, ajwy<hwr> ajwy2, ajwy<gqr> ajwy3, ihh ihh) {
        akcr.b(sqlDelightDbManager, "dbManager");
        akcr.b(ajwy, "serializationHelper");
        akcr.b(ajwy2, "jobIdGenerator");
        akcr.b(ajwy3, "exceptionTracker");
        akcr.b(ihh, "clock");
        this.a = sqlDelightDbManager;
        this.b = ajwy;
        this.c = ajwy2;
        this.h = ajwy3;
        this.d = ihh;
    }

    public final ajcx a(String str, hwt hwt, int i) {
        akcr.b(str, "uuid");
        akcr.b(hwt, "state");
        return a().runInTransaction("DurableJobManagerImpl:updateJob", new g(this, hwt, i, str));
    }

    public final synchronized <T extends hwg<?>> ajdx<String> a(hwp hwp, T t) {
        akcr.b(hwp, "scope");
        akcr.b(t, "durableJob");
        return a().callInTransaction("DurableJobRepository:insertNewJobIfNeeded", new f(this, t, hwp));
    }

    public final SqlDelightDbClient a() {
        return (SqlDelightDbClient) this.f.b();
    }

    public final gbm a(String str) {
        akcr.b(str, "uniqueTag");
        return (gbm) a().queryFirst("DurableJobRepository:getNextJobByUniqueTag", b().a().b(str));
    }

    public final gaz b() {
        return (gaz) this.g.b();
    }

    public final boolean b(String str) {
        akcr.b(str, "uniqueTag");
        try {
            Long l = (Long) a().queryFirst("DurableJobRepository:hasEnqueuedJob", b().a().a(str, hwt.ENQUEUED));
            return (l != null ? l.longValue() : 0) > 0;
        } catch (IllegalStateException | SQLException e) {
            ((gqr) this.h.get()).a(gqt.HIGH, e, hwj.a.callsite(this.e));
            return false;
        }
    }
}
