package defpackage;

import defpackage.mop.b.e;
import defpackage.mzc.a;
import defpackage.mzc.a.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: myy */
public final class myy implements mzc {
    final ajws<a> a;
    final ajxe b = ajxh.a(a.a);
    final akbw<b, abpq, mop.b> c = d.a;
    final ajdp<mmt> d;
    final ajdp<myw> e;
    private final ajxe f = ajxh.a(new b(this));
    private final ajxe g = ajxh.a(new c(this));

    /* renamed from: myy$a */
    static final class a extends akcs implements akbk<List<? extends mop.b.b>> {
        public static final a a = new a();

        a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ajyl.a(mop.b.b.a);
        }
    }

    /* renamed from: myy$d */
    static final class d extends akcs implements akbw<b, abpq, mop.b> {
        public static final d a = new d();

        d() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            b bVar = (b) obj;
            abpq abpq = (abpq) obj2;
            akcr.b(bVar, "result");
            akcr.b(abpq, "previewSize");
            int a = abpq.a();
            int b = abpq.b();
            a.a aVar = bVar.a;
            mih mih;
            float f;
            if (aVar instanceof a.a.b) {
                mih = bVar.b;
                float f2 = (float) a;
                f = (float) b;
                return new defpackage.mop.b.d(true, ((((float) mih.a) / f2) * 2.0f) - 1.0f, -(((((float) mih.d) / f) * 2.0f) - 1.0f), ((((float) mih.c) / f2) * 2.0f) - 1.0f, -(((((float) mih.b) / f) * 2.0f) - 1.0f));
            } else if (aVar instanceof a.a.a) {
                mih = bVar.b;
                f = (float) b;
                return new e(true, -1.0f, -(((((float) mih.d) / f) * 2.0f) - 1.0f), 1.0f, -(((((float) mih.b) / f) * 2.0f) - 1.0f));
            } else {
                throw new ajxk();
            }
        }
    }

    /* renamed from: myy$b */
    static final class b extends akcs implements akbk<ajfb<a>> {
        private /* synthetic */ myy a;

        b(myy myy) {
            this.a = myy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new myz(new akbl<a, ajxw>(this.a.a) {
                public final String getName() {
                    return "onNext";
                }

                public final akej getOwner() {
                    return akde.a(ajws.class);
                }

                public final String getSignature() {
                    return "onNext(Ljava/lang/Object;)V";
                }

                public final /* synthetic */ Object invoke(Object obj) {
                    a aVar = (a) obj;
                    akcr.b(aVar, "p1");
                    ((ajws) this.receiver).a((Object) aVar);
                    return ajxw.a;
                }
            });
        }
    }

    /* renamed from: myy$c */
    static final class c extends akcs implements akbk<ajdp> {
        final /* synthetic */ myy a;

        /* renamed from: myy$c$b */
        static final class b extends akcs implements akbk<ConcurrentHashMap<a.a, defpackage.mzc.a.b>> {
            public static final b a = new b();

            b() {
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                return new ConcurrentHashMap();
            }
        }

        /* renamed from: myy$c$c */
        static final class c<T, R> implements ajfc<T, K> {
            public static final c a = new c();

            c() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                a aVar = (a) obj;
                akcr.b(aVar, "action");
                return aVar.a();
            }
        }

        /* renamed from: myy$c$d */
        static final class d<T, R> implements ajfc<T, ajdt<? extends R>> {
            public static final d a = new d();

            d() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                ajvb ajvb = (ajvb) obj;
                akcr.b(ajvb, "controlActions");
                return ajvb.j(ajfu.a);
            }
        }

        /* renamed from: myy$c$a */
        public static final class a<T> implements ajfl<Object> {
            public static final a a = new a();

            public final boolean test(Object obj) {
                akcr.b(obj, "it");
                return obj instanceof b;
            }
        }

        /* renamed from: myy$c$e */
        static final class e<T1, T2, R> implements ajex<R, T, R> {
            public static final e a = new e();

            e() {
            }

            public final /* synthetic */ Object apply(Object obj, Object obj2) {
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) obj;
                b bVar = (b) obj2;
                akcr.b(concurrentHashMap, "map");
                akcr.b(bVar, "action");
                concurrentHashMap.put(bVar.a, bVar);
                return concurrentHashMap;
            }
        }

        /* renamed from: myy$c$f */
        static final class f<T, R> implements ajfc<T, R> {
            public static final f a = new f();

            f() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) obj;
                akcr.b(concurrentHashMap, "it");
                return concurrentHashMap.values();
            }
        }

        /* renamed from: myy$c$1 */
        static final class 1<T, R> implements ajfc<T, R> {
            private /* synthetic */ c a;

            1(c cVar) {
                this.a = cVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                ajxm ajxm = (ajxm) obj;
                akcr.b(ajxm, "<name for destructuring parameter 0>");
                Object obj2 = (Collection) ajxm.a;
                myw myw = (myw) ajxm.b;
                if (obj2.isEmpty()) {
                    return new mop.a((List) this.a.a.b.b(), myw.a, myw.b);
                }
                akcr.a(obj2, "actions");
                Iterable<Object> iterable = (Iterable) obj2;
                Collection arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
                for (Object obj3 : iterable) {
                    akbw akbw = this.a.a.c;
                    akcr.a(obj3, "it");
                    arrayList.add((mop.b) akbw.invoke(obj3, myw.b));
                }
                return new mop.a((List) arrayList, myw.a, myw.b);
            }
        }

        /* renamed from: myy$c$2 */
        static final class 2<T, R> implements ajfc<T, ajdt<? extends R>> {
            private /* synthetic */ c a;

            2(c cVar) {
                this.a = cVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                final mop.a aVar = (mop.a) obj;
                akcr.b(aVar, "processorResult");
                return this.a.a.d.u(new ajfc<T, ajdt<? extends R>>() {
                    public final /* synthetic */ Object apply(Object obj) {
                        mmt mmt = (mmt) obj;
                        akcr.b(mmt, "it");
                        mid a = mmt.p().a();
                        Object obj2 = aVar;
                        akcr.a(obj2, "processorResult");
                        return a.c(obj2);
                    }
                });
            }
        }

        c(myy myy) {
            this.a = myy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            akbk akbk = b.a;
            Object k = this.a.a.o(c.a).k((ajfc) d.a);
            akcr.a(k, "actionsRelay\n           ….distinctUntilChanged() }");
            k = k.a((ajfl) a.a).a(b.class);
            akcr.a(k, "this.filter { it is R }.cast(R::class.java)");
            Object p = k.b(akbk.invoke(), (ajex) e.a).p(f.a);
            akcr.a(p, "screenZonesObservable");
            k = this.a.e.j(ajfu.a);
            akcr.a(k, "cameraSizeProperties.distinctUntilChanged()");
            p = myu.a(p, k).p(new 1(this)).j(ajfu.a);
            akcr.a(p, "pairLatest(screenZonesOb…  .distinctUntilChanged()");
            ajdp k2 = p.k((ajfc) new 2(this));
            akcr.a((Object) k2, "pairLatest(screenZonesOb…      }\n                }");
            return myu.a(k2);
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(myy.class), "initialScreenZones", "getInitialScreenZones()Ljava/util/List;"), new akdc(akde.a(myy.class), "inputs", "getInputs()Lio/reactivex/functions/Consumer;"), new akdc(akde.a(myy.class), "outputs", "getOutputs()Lio/reactivex/Observable;")};
    }

    public myy(ajdp<mmt> ajdp, ajdp<myw> ajdp2) {
        akcr.b(ajdp, "lensCore");
        akcr.b(ajdp2, "cameraSizeProperties");
        this.d = ajdp;
        this.e = ajdp2;
        Object r = new ajwo().r();
        akcr.a(r, "PublishSubject.create<Sc….Action>().toSerialized()");
        this.a = r;
    }

    public final ajfb<a> a() {
        return (ajfb) this.f.b();
    }

    public final ajdp b() {
        return (ajdp) this.g.b();
    }
}
