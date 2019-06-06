package defpackage;

import com.snap.core.db.record.StorySubscriptionModel;
import com.snap.core.db.record.UnlockablesModel;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

/* renamed from: hlz */
public final class hlz implements gnp, hfz, hmo<hjx> {
    final ide a = hbn.f;
    final hmf b;
    final aipn<hmd> c;
    final gfu d;
    private final ajwl<gnt> e;
    private final ajwl<Boolean> f;
    private final HashSet<String> g;
    private final ajei h;
    private final zfw i;
    private final ftl j;
    private final hmm k;

    /* renamed from: hlz$a */
    static final class a<T, R> implements ajfc<T, R> {
        final /* synthetic */ hlz a;

        /* renamed from: hlz$a$1 */
        static final class 1<T> implements ajfb<gnu> {
            private /* synthetic */ a a;

            1(a aVar) {
                this.a = aVar;
            }

            public final /* synthetic */ void accept(Object obj) {
                gnu gnu = (gnu) obj;
                ((hmd) this.a.a.c.get()).a(gnu.a, gnu.b);
            }
        }

        a(hlz hlz) {
            this.a = hlz;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Boolean bool = (Boolean) obj;
            akcr.b(bool, "prefetchDebuggerEnabled");
            if (bool.booleanValue()) {
                return new 1(this);
            }
            obj = igu.b();
            akcr.a(obj, "RxUtils.emptyConsumer()");
            return obj;
        }
    }

    /* renamed from: hlz$b */
    static final class b<T> implements ajfb<Integer> {
        public static final b a = new b();

        b() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: hlz$c */
    static final class c<T> implements ajfb<Throwable> {
        private /* synthetic */ hjx a;

        c(hjx hjx) {
            this.a = hjx;
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: hlz$d */
    static final class d<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ hlz a;
        private /* synthetic */ hio b;
        private /* synthetic */ int c;
        private /* synthetic */ float d;

        d(hlz hlz, hio hio, int i, float f) {
            this.a = hlz;
            this.b = hio;
            this.c = i;
            this.d = f;
        }

        public final /* synthetic */ Object apply(Object obj) {
            ajfb ajfb = (ajfb) obj;
            akcr.b(ajfb, "it");
            hmf hmf = this.a.b;
            hio hio = this.b;
            int i = this.c;
            float f = this.d;
            idl page = this.a.a.getPage();
            akcr.b(hio, UnlockablesModel.DATA);
            akcr.b(page, "uiPage");
            hmi hmi = (hmi) hmf.a.get(hio.d());
            if (hmi != null) {
                ajdx a = hmi.a(hio, i, f, page, ajfb);
                if (a != null) {
                    return a;
                }
            }
            obj = ajvo.a(ajsn.a);
            akcr.a(obj, "Single.never()");
            return obj;
        }
    }

    /* renamed from: hlz$e */
    static final class e<T, R> implements ajfc<T, Iterable<? extends U>> {
        public static final e a = new e();

        e() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            akcr.b(list, "it");
            return list;
        }
    }

    /* renamed from: hlz$f */
    static final class f<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ hlz a;
        private /* synthetic */ hio b;

        /* renamed from: hlz$f$2 */
        static final class 2<T, R> implements ajfc<Throwable, Boolean> {
            public static final 2 a = new 2();

            2() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                akcr.b((Throwable) obj, "<anonymous parameter 0>");
                return Boolean.FALSE;
            }
        }

        f(hlz hlz, hio hio) {
            this.a = hlz;
            this.b = hio;
        }

        public final /* synthetic */ Object apply(Object obj) {
            final gnt gnt = (gnt) obj;
            akcr.b(gnt, "it");
            return this.a.d.a(gnt.b, hbn.f.getPage(), 1.0f).b((ajev) new ajev() {
                public final void run() {
                    ajfb ajfb = gnt.d;
                    if (ajfb != null) {
                        ajfb.accept(new gnu(gnt.a, gnv.SUCCESS));
                    }
                }
            }).a(Boolean.TRUE).g(2.a);
        }
    }

    /* renamed from: hlz$g */
    static final class g<T, R> implements ajfc<T, R> {
        public static final g a = new g();

        g() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            akcr.b(list, "it");
            Iterable<Object> iterable = list;
            int i = 0;
            if (!((iterable instanceof Collection) && ((Collection) iterable).isEmpty())) {
                for (Object a : iterable) {
                    if (akcr.a(a, Boolean.TRUE)) {
                        i++;
                        if (i < 0) {
                            ajym.b();
                        }
                    }
                }
            }
            return Integer.valueOf(i);
        }
    }

    public hlz(hmf hmf, zfw zfw, aipn<hmd> aipn, ftl ftl, hmm hmm, gfu gfu) {
        akcr.b(hmf, "prefetchRequestFactory");
        akcr.b(zfw, "schedulers");
        akcr.b(aipn, "prefetchDebugger");
        akcr.b(ftl, "configProvider");
        akcr.b(hmm, "prefetchConfiguration");
        akcr.b(gfu, "snapContentResolver");
        this.b = hmf;
        this.i = zfw;
        this.c = aipn;
        this.j = ftl;
        this.k = hmm;
        this.d = gfu;
        Object ajwl = new ajwl();
        String str = "BehaviorSubject.create()";
        akcr.a(ajwl, str);
        this.e = ajwl;
        ajwl = new ajwl();
        akcr.a(ajwl, str);
        this.f = ajwl;
        this.g = new HashSet();
        this.h = new ajei();
    }

    private final ajdx<Integer> a(hio hio, int i, float f) {
        Object f2 = d().b((ajdw) this.i.f()).a((ajdw) this.i.b()).a((ajfc) new d(this, hio, i, f)).i().l(e.a).n(new f(this, hio)).a(16).f(g.a);
        akcr.a(f2, "getPrefetchStateObserver… -> succeeded == true } }");
        return f2;
    }

    private ajdx<Integer> a(hjx hjx) {
        akcr.b(hjx, "dataModel");
        Object a = hjx.a();
        akcr.a(a, "dataModel.data");
        Object d = a.d();
        hmm hmm = this.k;
        akcr.a(d, StorySubscriptionModel.CARDTYPE);
        String str = "type";
        akcr.b(d, str);
        Object obj = hmm.a.get(d);
        if (obj == null) {
            akcr.a();
        }
        int intValue = ((Number) obj).intValue();
        hmm hmm2 = this.k;
        akcr.b(d, str);
        d = hmm2.b.get(d);
        if (d == null) {
            akcr.a();
        }
        return a(a, intValue, ((Number) d).floatValue());
    }

    private final ajdx<ajfb<gnu>> d() {
        Object f = this.j.p(gvt.ENABLE_PREFETCH_DEBUGGER).e().f(new a(this));
        akcr.a(f, "configProvider.observeBo…      }\n                }");
        return f;
    }

    public final ajdx<Integer> a(hjx hjx, int i) {
        akcr.b(hjx, "dataModel");
        Object a = hjx.a();
        akcr.a(a, "dataModel.data");
        return a(a, i, 1.0f);
    }

    public final ide a() {
        return this.a;
    }

    public final /* bridge */ /* synthetic */ ajdp b() {
        return this.e;
    }

    public final /* synthetic */ void b(Object obj) {
        hjx hjx = (hjx) obj;
        akcr.b(hjx, "dataModel");
        if (this.g.add(hjx.a().c())) {
            ajej a = a(hjx).a((ajfb) b.a, (ajfb) new c(hjx));
            akcr.a((Object) a, "prefetch(dataModel)\n    …ge}\") }\n                )");
            ajvv.a(a, this.h);
        }
    }

    public final /* bridge */ /* synthetic */ ajdp c() {
        return this.f;
    }

    public final void dispose() {
        this.h.dispose();
    }

    public final boolean isDisposed() {
        return this.h.isDisposed();
    }
}
