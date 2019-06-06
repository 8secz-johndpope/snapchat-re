package defpackage;

import com.mapbox.services.android.telemetry.MapboxEvent;
import defpackage.kqe.x;
import defpackage.lrw.a;
import defpackage.lsd.b;
import java.util.Collection;
import java.util.List;

/* renamed from: lsz */
public final class lsz implements ajdu<b, b> {
    final mwe a;
    final ajdp<lqf> b;
    private final kqf c;

    /* renamed from: lsz$e */
    static final class e extends akcq implements akbl<kqe, ajxw> {
        e(kqf kqf) {
            super(1, kqf);
        }

        public final String getName() {
            return "handle";
        }

        public final akej getOwner() {
            return akde.a(kqf.class);
        }

        public final String getSignature() {
            return "handle(Lcom/snap/lenses/analytics/AnalyticsEvent;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            kqe kqe = (kqe) obj;
            akcr.b(kqe, "p1");
            ((kqf) this.receiver).a(kqe);
            return ajxw.a;
        }
    }

    /* renamed from: lsz$a */
    public static final class a<T> implements ajfl<Object> {
        public static final a a = new a();

        public final boolean test(Object obj) {
            akcr.b(obj, "it");
            return obj instanceof b.b;
        }
    }

    /* renamed from: lsz$b */
    static final class b<T1, T2> implements ajey<defpackage.lsd.b.b, defpackage.lsd.b.b> {
        public static final b a = new b();

        b() {
        }

        public final /* synthetic */ boolean test(Object obj, Object obj2) {
            defpackage.lsd.b.b bVar = (defpackage.lsd.b.b) obj;
            defpackage.lsd.b.b bVar2 = (defpackage.lsd.b.b) obj2;
            akcr.b(bVar, "old");
            akcr.b(bVar2, "new");
            a aVar = (a) ajyu.a(bVar.b, bVar.c);
            Object obj3 = null;
            obj = aVar != null ? aVar.d() : null;
            a aVar2 = (a) ajyu.a(bVar2.b, bVar2.c);
            if (aVar2 != null) {
                obj3 = aVar2.d();
            }
            return akcr.a(obj, obj3);
        }
    }

    /* renamed from: lsz$c */
    static final class c<T> implements ajfl<b.b> {
        public static final c a = new c();

        c() {
        }

        public final /* synthetic */ boolean test(Object obj) {
            b.b bVar = (b.b) obj;
            akcr.b(bVar, "it");
            return !((Collection) bVar.b).isEmpty();
        }
    }

    /* renamed from: lsz$d */
    static final class d<T, R> implements ajfc<T, ajdt<? extends R>> {
        final /* synthetic */ lsz a;

        /* renamed from: lsz$d$1 */
        static final class 1<T> implements ajfl<List<? extends mux>> {
            public static final 1 a = new 1();

            1() {
            }

            public final /* synthetic */ boolean test(Object obj) {
                List list = (List) obj;
                akcr.b(list, "it");
                return !((Collection) list).isEmpty();
            }
        }

        /* renamed from: lsz$d$2 */
        static final class 2<T, R> implements ajfc<T, R> {
            public static final 2 a = new 2();

            2() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                List list = (List) obj;
                akcr.b(list, "it");
                return (mux) ajyu.f(list);
            }
        }

        d(lsz lsz) {
            this.a = lsz;
        }

        public final /* synthetic */ Object apply(Object obj) {
            final b.b bVar = (b.b) obj;
            akcr.b(bVar, MapboxEvent.KEY_MODEL);
            mhs d = ((a) bVar.b.get(bVar.c)).d();
            return d instanceof mhs.b ? this.a.a.a(new mwe.a.b((mhs.b) d)).b((ajfl) 1.a).h().d((ajfc) 2.a).j().u(new ajfc<T, ajdt<? extends R>>(this) {
                private /* synthetic */ d b;

                /* renamed from: lsz$d$3$a */
                public static final class a<T> implements ajfl<Object> {
                    public static final a a = new a();

                    public final boolean test(Object obj) {
                        akcr.b(obj, "it");
                        return obj instanceof lqf.b;
                    }
                }

                public final /* synthetic */ Object apply(Object obj) {
                    final mux mux = (mux) obj;
                    akcr.b(mux, "lens");
                    Object a = this.b.a.b.a((ajfl) a.a).a(lqf.b.class);
                    akcr.a(a, "this.filter { it is R }.cast(R::class.java)");
                    return a.c(1).p(new ajfc<T, R>(this) {
                        private /* synthetic */ 3 a;

                        public final /* synthetic */ Object apply(Object obj) {
                            lqf.b bVar = (lqf.b) obj;
                            akcr.b(bVar, "it");
                            Object obj2 = mux;
                            akcr.a(obj2, "lens");
                            return new x(obj2, bVar.c - bVar.a(), bVar.b.size(), bVar.a().value);
                        }
                    });
                }
            }) : ajvo.a(ajot.a);
        }
    }

    /* renamed from: lsz$f */
    static final class f<T, R> implements ajfc<T, ajdt<? extends R>> {
        public static final f a = new f();

        f() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            akcr.b((kqe) obj, "it");
            return ajvo.a(ajot.a);
        }
    }

    public lsz(mwe mwe, kqf kqf, ajdp<lqf> ajdp) {
        akcr.b(mwe, "lensRepository");
        akcr.b(kqf, "analyticsEventHandler");
        akcr.b(ajdp, "cameraLifecycle");
        this.a = mwe;
        this.c = kqf;
        this.b = ajdp;
    }

    public final ajdt<b> apply(ajdp<b> ajdp) {
        akcr.b(ajdp, "upstream");
        Object a = ajpy.k(ajdp).a();
        akcr.a(a, "sharedUpstream");
        Object a2 = a.a((ajfl) a.a).a(b.b.class);
        akcr.a(a2, "this.filter { it is R }.cast(R::class.java)");
        a = ajdp.b((ajdt) a, (ajdt) a2.a((ajey) b.a).a((ajfl) c.a).u(new d(this)).d((ajfb) new lta(new e(this.c))).u(f.a));
        akcr.a(a, "merge(sharedUpstream, selectedLensChanged)");
        return (ajdt) a;
    }
}
