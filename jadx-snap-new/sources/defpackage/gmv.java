package defpackage;

import com.snap.core.persistence.DiskUsageReportDurableJob;
import com.snap.taskexecution.scoping.recipes.ScopedFragmentActivity.b;
import defpackage.ygx.a;
import defpackage.ygx.c;
import defpackage.ygx.d;
import defpackage.ygx.e;
import java.util.concurrent.Callable;

/* renamed from: gmv */
public final class gmv extends ablj {
    final ajxe a = ajxh.a(new d(this));
    boolean b;
    final ajei c = new ajei();
    final ajwy<hwl> d;
    final zgk<b> e;
    final ygx f;
    final ajwy<ablk> g;
    final gmq h;
    private final ajei i = new ajei();
    private final ajxe j = ajxh.a(new e(this));
    private final zgb k;

    /* renamed from: gmv$d */
    static final class d extends akcs implements akbk<zfw> {
        private /* synthetic */ gmv a;

        d(gmv gmv) {
            this.a = gmv;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return zgb.a(yet.a.callsite("DiskUsageReportingObserver"));
        }
    }

    /* renamed from: gmv$e */
    static final class e extends akcs implements akbk<ajdx<Boolean>> {
        private /* synthetic */ gmv a;

        e(gmv gmv) {
            this.a = gmv;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ((ablk) this.a.g.get()).b(new aaic()).a(ajef.a());
        }
    }

    /* renamed from: gmv$c */
    static final class c<T> implements ajfb<Boolean> {
        private /* synthetic */ gmv a;

        c(gmv gmv) {
            this.a = gmv;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (Boolean) obj;
            akcr.a(obj, "shouldMonitor");
            if (obj.booleanValue()) {
                gmv.a(this.a);
            }
        }
    }

    /* renamed from: gmv$b */
    static final class b<T> implements ajfb<Boolean> {
        private /* synthetic */ gmv a;

        b(gmv gmv) {
            this.a = gmv;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (Boolean) obj;
            akcr.a(obj, "shouldMonitor");
            if (obj.booleanValue()) {
                if (!this.a.b) {
                    gmv.a(this.a);
                }
                gmv gmv = this.a;
                ajvv.a(gmv.h.a(), gmv.c);
                ygx ygx = gmv.f;
                ajej e = ajdx.c((Callable) new a(ygx)).a((ajdw) ygx.f.f()).b((ajdw) ygx.f.b()).c((ajfb) defpackage.ygx.b.a).e((ajfb) new c(ygx));
                akcr.a((Object) e, "Single.fromCallable { st…ate(availableBytes, 0L) }");
                ajvv.a(e, gmv.c);
                e = ajek.a((ajev) new a(gmv));
                akcr.a((Object) e, "Disposables.fromAction {…N_DESTROY, TAG)\n        }");
                ajvv.a(e, gmv.c);
            }
        }
    }

    /* renamed from: gmv$a */
    static final class a implements ajev {
        private /* synthetic */ gmv a;

        /* renamed from: gmv$a$2 */
        static final class 2<T, R> implements ajfc<hwl, ajdb> {
            public static final 2 a = new 2();

            2() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                hwl hwl = (hwl) obj;
                akcr.b(hwl, "it");
                return hwl.a((hwg) new DiskUsageReportDurableJob(new gmu()));
            }
        }

        a(gmv gmv) {
            this.a = gmv;
        }

        public final void run() {
            this.a.e.a(ajdx.c((Callable) new gmw(new akbk<hwl>(this.a.d) {
                public final String getName() {
                    return "get";
                }

                public final akej getOwner() {
                    return akde.a(ajwy.class);
                }

                public final String getSignature() {
                    return "get()Ljava/lang/Object;";
                }

                public final /* synthetic */ Object invoke() {
                    return (hwl) ((ajwy) this.receiver).get();
                }
            })).e((ajfc) 2.a).b((ajdw) ((zfw) this.a.a.b()).f()).e(), b.ON_DESTROY, "DiskUsageReportingObserver");
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(gmv.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;"), new akdc(akde.a(gmv.class), "shouldMonitorObservable", "getShouldMonitorObservable()Lio/reactivex/Single;")};
    }

    public gmv(ajwy<hwl> ajwy, zgb zgb, zgk<b> zgk, ygx ygx, ajwy<ablk> ajwy2, gmq gmq) {
        akcr.b(ajwy, "durableJobManager");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(zgk, "taskScoper");
        akcr.b(ygx, "storageStateMonitorRx");
        akcr.b(ajwy2, "perfMonitorConfig");
        akcr.b(gmq, "diskUsageNotificationEmitter");
        this.d = ajwy;
        this.k = zgb;
        this.e = zgk;
        this.f = ygx;
        this.g = ajwy2;
        this.h = gmq;
    }

    private final ajdx<Boolean> a() {
        return (ajdx) this.j.b();
    }

    public static final /* synthetic */ void a(gmv gmv) {
        if (!gmv.b) {
            gmv.b = true;
            ajei ajei = gmv.i;
            ygx ygx = gmv.f;
            ajej f = ygx.d.b((ajdw) ygx.f.b()).f((ajfb) new d(ygx));
            akcr.a((Object) f, "fileGroupCacheBehaviorSu…      }\n                }");
            ajvv.a(f, ygx.a);
            f = ygx.c.b((ajdw) ygx.f.b()).f((ajfb) new e(ygx));
            akcr.a((Object) f, "diskUsageBehaviorSubject…es, it)\n                }");
            ajvv.a(f, ygx.a);
            ajei.a((ajej) ygx.a);
        }
    }

    public final void b() {
        ajej e = a().e((ajfb) new c(this));
        akcr.a((Object) e, "shouldMonitorObservable.…)\n            }\n        }");
        ajvv.a(e, this.i);
    }

    public final void c() {
        this.i.a();
    }

    public final void e() {
        ajej e = a().e((ajfb) new b(this));
        akcr.a((Object) e, "shouldMonitorObservable.…)\n            }\n        }");
        ajvv.a(e, this.c);
    }

    public final void f() {
        this.c.a();
    }
}
