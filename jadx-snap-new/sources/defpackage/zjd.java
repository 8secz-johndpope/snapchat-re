package defpackage;

import com.snap.taskexecution.scoping.recipes.ScopedFragmentActivity.b;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: zjd */
public final class zjd extends zgi implements achk<zjm, zjk> {
    boolean a;
    final achb<zjm, zjk> b;
    final ajwy<ftl> c;
    private final ajxe d = ajxh.a(new i(this));
    private final ajei e = new ajei();
    private final zgb f;

    /* renamed from: zjd$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: zjd$i */
    static final class i extends akcs implements akbk<zfw> {
        private /* synthetic */ zjd a;

        i(zjd zjd) {
            this.a = zjd;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return zgb.a(zjc.a.callsite("DeckPagePurger"));
        }
    }

    /* renamed from: zjd$c */
    static final class c implements ajev {
        private /* synthetic */ zjd a;

        c(zjd zjd) {
            this.a = zjd;
        }

        public final void run() {
            this.a.d();
            this.a.b.b((achk) this.a);
        }
    }

    /* renamed from: zjd$b */
    static final class b implements ajev {
        private /* synthetic */ zjd a;

        b(zjd zjd) {
            this.a = zjd;
        }

        public final void run() {
            this.a.b.a((achk) this.a);
            zjd zjd = this.a;
            ajej f = ajdp.a((ajdt) ((ftl) zjd.c.get()).s(fxs.DECK_PAGE_BACKGROUND_PURGE_TIMEOUT_MIN), (ajdt) ((ftl) zjd.c.get()).u(fxs.DECK_PAGE_BACKGROUND_PURGE_PAGE_TYPES), (ajex) e.a).b((ajdw) zjd.c().i()).a((ajfl) f.a).k((ajfc) new g(zjd)).a((ajdw) zjd.c().l()).f((ajfb) new h(zjd));
            akcr.a((Object) f, "Observable.combineLatest… = true\n                }");
            zjd.a(f);
        }
    }

    /* renamed from: zjd$e */
    static final class e<T1, T2, R> implements ajex<Integer, String, ajxm<? extends Integer, ? extends String>> {
        public static final e a = new e();

        e() {
        }

        public final /* synthetic */ Object apply(Object obj, Object obj2) {
            Integer num = (Integer) obj;
            String str = (String) obj2;
            akcr.b(num, "timeoutMin");
            akcr.b(str, "types");
            return new ajxm(num, str);
        }
    }

    /* renamed from: zjd$f */
    static final class f<T> implements ajfl<ajxm<? extends Integer, ? extends String>> {
        public static final f a = new f();

        f() {
        }

        public final /* synthetic */ boolean test(Object obj) {
            ajxm ajxm = (ajxm) obj;
            akcr.b(ajxm, "<name for destructuring parameter 0>");
            int intValue = ((Number) ajxm.a).intValue();
            String str = (String) ajxm.b;
            if (intValue >= 0) {
                if ((((CharSequence) str).length() > 0 ? 1 : null) != null) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: zjd$g */
    static final class g<T, R> implements ajfc<T, ajdt<? extends R>> {
        private /* synthetic */ zjd a;

        /* renamed from: zjd$g$1 */
        static final class 1<T1, T2, R> implements ajex<ajxm<? extends Integer, ? extends String>, Long, ajxm<? extends Integer, ? extends String>> {
            public static final 1 a = new 1();

            1() {
            }

            public final /* synthetic */ Object apply(Object obj, Object obj2) {
                ajxm ajxm = (ajxm) obj;
                Long l = (Long) obj2;
                akcr.b(ajxm, "pair");
                akcr.b(l, "<anonymous parameter 1>");
                return ajxm;
            }
        }

        g(zjd zjd) {
            this.a = zjd;
        }

        public final /* synthetic */ Object apply(Object obj) {
            ajxm ajxm = (ajxm) obj;
            akcr.b(ajxm, "<name for destructuring parameter 0>");
            int intValue = ((Number) ajxm.a).intValue();
            return ajdp.a((ajdt) ajdp.b(new ajxm(Integer.valueOf(intValue), (String) ajxm.b)), (ajdt) ajdp.a((long) intValue, TimeUnit.MINUTES, (ajdw) this.a.c().l()), (ajex) 1.a);
        }
    }

    /* renamed from: zjd$h */
    static final class h<T> implements ajfb<ajxm<? extends Integer, ? extends String>> {
        private /* synthetic */ zjd a;

        h(zjd zjd) {
            this.a = zjd;
        }

        public final /* synthetic */ void accept(Object obj) {
            String str = (String) ((ajxm) obj).b;
            Object a = this.a.b.d.a();
            akcr.a(a, "pageFactory.retainedPageTypes");
            List b = akgc.b((CharSequence) str, new char[]{','});
            for (zjm a2 : (Iterable) a) {
                zjd.a(this.a, b, a2);
            }
            this.a.a = true;
        }
    }

    /* renamed from: zjd$d */
    static final class d<T> implements ajfb<String> {
        private /* synthetic */ zjd a;
        private /* synthetic */ zjm b;

        d(zjd zjd, zjm zjm) {
            this.a = zjd;
            this.b = zjm;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (String) obj;
            zjd zjd = this.a;
            akcr.a(obj, "types");
            List b = akgc.b((CharSequence) obj, new char[]{','});
            Object obj2 = this.b;
            akcr.a(obj2, "sourcePageType");
            zjd.a(zjd, b, obj2);
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(zjd.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;");
        a aVar = new a();
    }

    public zjd(zgk<b> zgk, zgb zgb, achb<zjm, zjk> achb, ajwy<ftl> ajwy) {
        akcr.b(zgk, "taskScoper");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(achb, "navigationHost");
        akcr.b(ajwy, "configProvider");
        super(zgk);
        this.f = zgb;
        this.b = achb;
        this.c = ajwy;
    }

    public static final /* synthetic */ void a(zjd zjd, List list, zjm zjm) {
        for (String a : list) {
            if (akgb.a(zjm.b(), a, true)) {
                achb achb = zjd.b;
                achg achg = zjm;
                akcr.b(achg, "pageType");
                achb.d();
                achb.d.b(achg);
            }
        }
    }

    public final ajej a() {
        d();
        this.b.b((achk) this);
        Object a = ajek.a((ajev) new b(this));
        akcr.a(a, "Disposables.fromAction {…dulePagePurge()\n        }");
        return a;
    }

    public final void a(achi<zjm, zjk> achi) {
        akcr.b(achi, "navigationEvent");
    }

    /* Access modifiers changed, original: final */
    public final void a(ajej ajej) {
        this.e.a(ajej);
    }

    public final ajej b() {
        Object a = ajek.a((ajev) new c(this));
        akcr.a(a, "Disposables.fromAction {…ubscriber(this)\n        }");
        return a;
    }

    public final void b(achi<zjm, zjk> achi) {
        akcr.b(achi, "navigationEvent");
        if (this.a && achi.d == acgw.DISMISS) {
            ajej f = ((ftl) this.c.get()).u(fxs.DECK_PAGE_BACKGROUND_PURGE_PAGE_TYPES).b((ajdw) c().i()).a((ajdw) c().l()).f((ajfb) new d(this, (zjm) achi.e.e()));
            akcr.a((Object) f, "configProvider.get().obs…pe)\n                    }");
            a(f);
        }
    }

    /* Access modifiers changed, original: final */
    public final zfw c() {
        return (zfw) this.d.b();
    }

    public final void c(achi<zjm, zjk> achi) {
        akcr.b(achi, "navigationEvent");
    }

    /* Access modifiers changed, original: final */
    public final void d() {
        this.e.a();
        this.a = false;
    }
}
