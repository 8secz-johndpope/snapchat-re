package defpackage;

import defpackage.ilv.a;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* renamed from: exe */
public final class exe implements ilv {
    final ajxe a = ajxh.a(new b(this));
    final ajxe b = ajxh.a(new f(this));
    final ajwy<ajei> c;
    final ajwy<exb> d;
    final ajwy<zgb> e;
    final ajwy<ilv> f;
    private final ajxe g = ajxh.a(new a(this));
    private final ajxe h = ajxh.a(new e(this));
    private final ajxe i = ajxh.a(new c(this));

    /* renamed from: exe$b */
    static final class b extends akcs implements akbk<ajei> {
        private /* synthetic */ exe a;

        b(exe exe) {
            this.a = exe;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ajei) this.a.c.get();
        }
    }

    /* renamed from: exe$a */
    static final class a extends akcs implements akbk<exb> {
        private /* synthetic */ exe a;

        a(exe exe) {
            this.a = exe;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (exb) this.a.d.get();
        }
    }

    /* renamed from: exe$f */
    static final class f extends akcs implements akbk<zgb> {
        private /* synthetic */ exe a;

        f(exe exe) {
            this.a = exe;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (zgb) this.a.e.get();
        }
    }

    /* renamed from: exe$e */
    static final class e extends akcs implements akbk<zfw> {
        private /* synthetic */ exe a;

        e(exe exe) {
            this.a = exe;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.a.b.b();
            return zgb.a(evh.a.callsite("AsyncGrapheneLogger"));
        }
    }

    /* renamed from: exe$c */
    static final class c extends akcs implements akbk<ilv> {
        private /* synthetic */ exe a;

        c(exe exe) {
            this.a = exe;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ilv) this.a.f.get();
        }
    }

    /* renamed from: exe$d */
    public static final class d<V> implements Callable<Object> {
        final /* synthetic */ exe a;

        /* renamed from: exe$d$1 */
        static final class 1<T, R> implements ajfc<T, R> {
            private /* synthetic */ d a;

            1(d dVar) {
                this.a = dVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                List<Object> list = (List) obj;
                akcr.b(list, "eventList");
                for (Object obj2 : list) {
                    exe exe = this.a.a;
                    akcr.a(obj2, "event");
                    int i = exf.a[obj2.a.ordinal()];
                    if (i == 1) {
                        exe.b().c(obj2.b, obj2.c);
                    } else if (i == 2) {
                        exe.b().b(obj2.b, obj2.c);
                    } else if (i == 3) {
                        exe.b().a(obj2.b, obj2.c);
                    }
                }
                return ajxw.a;
            }
        }

        /* renamed from: exe$d$2 */
        static final class 2<T> implements ajfb<ajxw> {
            public static final 2 a = new 2();

            2() {
            }

            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        }

        /* renamed from: exe$d$3 */
        static final class 3<T> implements ajfb<Throwable> {
            public static final 3 a = new 3();

            3() {
            }

            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        }

        public d(exe exe) {
            this.a = exe;
        }

        public final /* synthetic */ Object call() {
            ajej a = this.a.a().d().a((ajdw) ((zfw) this.a.h.b()).f()).b((ajdt) this.a.a().d().b(1000, TimeUnit.MILLISECONDS, (ajdw) ((zfw) this.a.h.b()).f())).p(new 1(this)).a((ajfb) 2.a, (ajfb) 3.a);
            akcr.a((Object) a, "actionDispatcher.getWrit…  }\n                    )");
            ajei ajei = (ajei) this.a.a.b();
            akcr.a((Object) ajei, "compositeDisposable");
            return ajvv.a(a, ajei);
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(exe.class), "compositeDisposable", "getCompositeDisposable()Lio/reactivex/disposables/CompositeDisposable;"), new akdc(akde.a(exe.class), "actionDispatcher", "getActionDispatcher()Lcom/snap/circumstanceengine/lib/SyncEngineActionDispatcher;"), new akdc(akde.a(exe.class), "schedulersProvider", "getSchedulersProvider()Lcom/snap/taskexecution/scheduling/SchedulersProvider;"), new akdc(akde.a(exe.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;"), new akdc(akde.a(exe.class), "graphene", "getGraphene()Lcom/snap/graphene/Graphene;")};
    }

    public exe(ajwy<ajei> ajwy, ajwy<exb> ajwy2, ajwy<zgb> ajwy3, ajwy<ilv> ajwy4) {
        akcr.b(ajwy, "compositeDisposableProvider");
        akcr.b(ajwy2, "actionDispatcherProvider");
        akcr.b(ajwy3, "schedulersProviderProvider");
        akcr.b(ajwy4, "grapheneProvider");
        this.c = ajwy;
        this.d = ajwy2;
        this.e = ajwy3;
        this.f = ajwy4;
    }

    /* Access modifiers changed, original: final */
    public final exb a() {
        return (exb) this.g.b();
    }

    public final void a(ily ily, long j) {
        akcr.b(ily, "metric");
        a.a(this, ily, j);
    }

    public final void a(ilz ilz, long j) {
        akcr.b(ilz, "metric");
        a().a(new exc(ewz.TIMER, ilz, j));
    }

    /* Access modifiers changed, original: final */
    public final ilv b() {
        return (ilv) this.i.b();
    }

    public final void b(ily ily, long j) {
        akcr.b(ily, "metric");
        a.b(this, ily, j);
    }

    public final void b(ilz ilz, long j) {
        akcr.b(ilz, "metric");
        a().a(new exc(ewz.HISTOGRAM, ilz, j));
    }

    public final void c(ily ily, long j) {
        akcr.b(ily, "metric");
        a.c(this, ily, j);
    }

    public final void c(ilz ilz, long j) {
        akcr.b(ilz, "metric");
        a().a(new exc(ewz.COUNT, ilz, j));
    }
}
