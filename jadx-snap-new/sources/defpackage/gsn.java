package defpackage;

import android.app.ActivityManager.MemoryInfo;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import defpackage.gqr.a;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: gsn */
public final class gsn implements gqr {
    final ajxe a = ajxh.a(a.a);
    final ajxe b = ajxh.a(new c(this));
    final ajxe c = ajxh.a(new b(this));
    final ajxe d = ajxh.a(f.a);
    final ajxe e = ajxh.a(new g(this));
    final aipn<Set<gqq>> f;
    final aipn<ygs> g;
    final aipn<ppm> h;
    private final ajxe i = ajxh.a(new e(this));
    private zgb j;

    /* renamed from: gsn$a */
    static final class a extends akcs implements akbk<ajei> {
        public static final a a = new a();

        a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new ajei();
        }
    }

    /* renamed from: gsn$f */
    static final class f extends akcs implements akbk<Supplier<gqu>> {
        public static final f a = new f();

        /* renamed from: gsn$f$1 */
        static final class 1<T> implements Supplier<gqu> {
            public static final 1 a = new 1();

            1() {
            }

            public final /* synthetic */ Object get() {
                return new gqu();
            }
        }

        f() {
            super(0);
        }

        public final /* bridge */ /* synthetic */ Object invoke() {
            return 1.a;
        }
    }

    /* renamed from: gsn$e */
    static final class e extends akcs implements akbk<zfw> {
        private /* synthetic */ gsn a;

        e(gsn gsn) {
            this.a = gsn;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return zgb.a(gqe.a, "ExceptionTracker");
        }
    }

    /* renamed from: gsn$c */
    static final class c extends akcs implements akbk<Supplier<gqs>> {
        final /* synthetic */ gsn a;

        /* renamed from: gsn$c$1 */
        static final class 1<T> implements Supplier<T> {
            private /* synthetic */ c a;

            1(c cVar) {
                this.a = cVar;
            }

            public final /* synthetic */ Object get() {
                MemoryInfo a = ((ppm) this.a.a.h.get()).a();
                return new gqs(a != null ? Long.valueOf(a.totalMem) : null, a != null ? Long.valueOf(a.availMem) : null, a != null ? Boolean.valueOf(a.lowMemory) : null, Long.valueOf((long) ((ppm) this.a.a.h.get()).b()), a != null ? Long.valueOf(a.threshold) : null);
            }
        }

        c(gsn gsn) {
            this.a = gsn;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Suppliers.memoizeWithExpiration(new 1(this), 1, TimeUnit.SECONDS);
        }
    }

    /* renamed from: gsn$b */
    static final class b extends akcs implements akbk<Supplier<gqp>> {
        final /* synthetic */ gsn a;

        /* renamed from: gsn$b$1 */
        static final class 1<T> implements Supplier<T> {
            private /* synthetic */ b a;

            1(b bVar) {
                this.a = bVar;
            }

            public final /* synthetic */ Object get() {
                String str = "storageInfo.get()";
                akcr.a(this.a.a.g.get(), str);
                Long valueOf = Long.valueOf(ygs.f());
                akcr.a(this.a.a.g.get(), str);
                return new gqp(Long.valueOf(ygs.c()), valueOf);
            }
        }

        b(gsn gsn) {
            this.a = gsn;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Suppliers.memoizeWithExpiration(new 1(this), 1, TimeUnit.HOURS);
        }
    }

    /* renamed from: gsn$g */
    static final class g extends akcs implements akbk<ajwl<gqo>> {
        private /* synthetic */ gsn a;

        /* renamed from: gsn$g$1 */
        static final class 1<T, R> implements ajfc<T, K> {
            public static final 1 a = new 1();

            1() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                gqo gqo = (gqo) obj;
                akcr.b(gqo, "it");
                return gqo.e;
            }
        }

        g(gsn gsn) {
            this.a = gsn;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Object ajwl = new ajwl();
            akcr.a(ajwl, "BehaviorSubject.create<AnnotatedException>()");
            for (final gqq gqq : (Set) this.a.f.get()) {
                ajei ajei = (ajei) this.a.a.b();
                ajdp a = ajwl.a((ajdw) this.a.a().b());
                akcr.a((Object) a, "behaviorSubject\n        …schedulers.computation())");
                ajei.a(igs.a(a, gqq.b(), TimeUnit.MINUTES, 0, (ajdw) this.a.a().b(), 4).o(1.a).k((ajfc) new ajfc<T, ajdt<? extends R>>() {
                    public final /* synthetic */ Object apply(Object obj) {
                        ajvb ajvb = (ajvb) obj;
                        akcr.b(ajvb, "it");
                        return igs.a((ajdp) ajvb, gqq.a(), TimeUnit.MINUTES, 0, null, 12);
                    }
                }).b((ajdw) this.a.a().b()).f((ajfb) new ajfb<gqo>() {
                    public final /* synthetic */ void accept(Object obj) {
                        obj = (gqo) obj;
                        gqq gqq = gqq;
                        akcr.a(obj, "it");
                        gqq.a(obj);
                    }
                }));
            }
            return ajwl;
        }
    }

    /* renamed from: gsn$d */
    static final class d implements Runnable {
        private /* synthetic */ gsn a;
        private /* synthetic */ String b;
        private /* synthetic */ gqt c;
        private /* synthetic */ idd d;
        private /* synthetic */ Throwable e;

        d(gsn gsn, String str, gqt gqt, idd idd, Throwable th) {
            this.a = gsn;
            this.b = str;
            this.c = gqt;
            this.d = idd;
            this.e = th;
        }

        public final void run() {
            String str = this.b;
            gqt gqt = this.c;
            zfd zfd = new zfd(this.d, this.e, null, 12);
            Object obj = ((Supplier) this.a.b.b()).get();
            akcr.a(obj, "heapAnnotationSupplier.get()");
            gqs gqs = (gqs) obj;
            obj = ((Supplier) this.a.c.b()).get();
            akcr.a(obj, "diskAnnotationSupplier.get()");
            gqp gqp = (gqp) obj;
            obj = ((Supplier) this.a.d.b()).get();
            akcr.a(obj, "startupAnnotationSupplier.get()");
            ((ajwl) this.a.e.b()).a((Object) new gqo(zfd, gqt, (gqu) obj, gqs, gqp, str));
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(gsn.class), "compositeDisposable", "getCompositeDisposable()Lio/reactivex/disposables/CompositeDisposable;"), new akdc(akde.a(gsn.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;"), new akdc(akde.a(gsn.class), "heapAnnotationSupplier", "getHeapAnnotationSupplier()Lcom/google/common/base/Supplier;"), new akdc(akde.a(gsn.class), "diskAnnotationSupplier", "getDiskAnnotationSupplier()Lcom/google/common/base/Supplier;"), new akdc(akde.a(gsn.class), "startupAnnotationSupplier", "getStartupAnnotationSupplier()Lcom/google/common/base/Supplier;"), new akdc(akde.a(gsn.class), "subject", "getSubject()Lio/reactivex/subjects/BehaviorSubject;")};
    }

    public gsn(aipn<Set<gqq>> aipn, zgb zgb, aipn<ygs> aipn2, aipn<ppm> aipn3) {
        akcr.b(aipn, "sinks");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(aipn2, "storageInfo");
        akcr.b(aipn3, "memoryInfo");
        this.f = aipn;
        this.j = zgb;
        this.g = aipn2;
        this.h = aipn3;
    }

    public final zfw a() {
        return (zfw) this.i.b();
    }

    public final void a(gqt gqt, Throwable th, idd idd) {
        akcr.b(gqt, "severity");
        akcr.b(th, "throwable");
        akcr.b(idd, "attributedCallsite");
        a.a(this, gqt, th, idd);
    }

    public final void a(gqt gqt, Throwable th, idd idd, String str) {
        akcr.b(gqt, "severity");
        akcr.b(th, "throwable");
        akcr.b(idd, "attributedCallsite");
        akcr.b(str, "triggerId");
        a().b().a((Runnable) new d(this, str, gqt, idd, th));
    }
}
