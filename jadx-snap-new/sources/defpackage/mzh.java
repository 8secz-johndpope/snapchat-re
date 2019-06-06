package defpackage;

import com.looksery.sdk.ProfilingSessionReceiver;
import defpackage.mhs.b;
import defpackage.mmi.c.a.d;

/* renamed from: mzh */
public final class mzh implements mzm {
    final mzk a;
    private final ajdp b;

    /* renamed from: mzh$b */
    static final class b<T, R> implements ajfc<T, ajdt<? extends R>> {
        public static final b a = new b();

        b() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            mmt mmt = (mmt) obj;
            akcr.b(mmt, "it");
            return mmt.a().b();
        }
    }

    /* renamed from: mzh$a */
    public static final class a<T> implements ajfl<Object> {
        public static final a a = new a();

        public final boolean test(Object obj) {
            akcr.b(obj, "it");
            return obj instanceof d;
        }
    }

    /* renamed from: mzh$c */
    static final class c<T, R> implements ajfc<T, R> {
        public static final c a = new c();

        c() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            d dVar = (d) obj;
            akcr.b(dVar, ProfilingSessionReceiver.EXTRA_STRING_FIELD_FILTER);
            return dVar.a;
        }
    }

    /* renamed from: mzh$d */
    static final class d<T, R> implements ajfc<b, ajdb> {
        private /* synthetic */ mzh a;

        d(mzh mzh) {
            this.a = mzh;
        }

        public final /* synthetic */ Object apply(Object obj) {
            b bVar = (b) obj;
            akcr.b(bVar, "it");
            return this.a.a.a(bVar);
        }
    }

    public mzh(ajdp<mmt> ajdp, mzk mzk) {
        akcr.b(ajdp, "lensCore");
        akcr.b(mzk, "lensStatisticsRepository");
        this.a = mzk;
        Object u = ajdp.u(b.a);
        akcr.a(u, "lensCore.switchMap { it.…licator.filterLifecycle }");
        u = u.a((ajfl) a.a).a(d.class);
        akcr.a(u, "this.filter { it is R }.cast(R::class.java)");
        u = u.p(c.a).j(ajfu.a).a((ajfc) new d(this), false).h();
        akcr.a(u, "lensCore.switchMap { it.… .toObservable<Nothing>()");
        this.b = u;
    }

    public final ajfb a() {
        return myr.a();
    }

    public final ajdp b() {
        return this.b;
    }
}
