package defpackage;

import com.google.common.base.Optional;
import com.looksery.sdk.ProfilingSessionReceiver;
import defpackage.lxr.a;
import defpackage.lxr.b;
import defpackage.lxr.b.e;
import defpackage.miq.f;
import defpackage.mnu.c;
import defpackage.mnu.d;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: lxw */
public final class lxw implements lxr {
    final ajxe a = ajxh.a(new j(this));
    final ajws<a> b;
    final ajdp<mmt> c;
    final ajdp<Double> d;
    final zfw e;
    final mwe f;
    final mvu g;
    private final ajxe h;
    private final ajxe i;

    /* renamed from: lxw$j */
    static final class j extends akcs implements akbk<ajdp<Double>> {
        private /* synthetic */ lxw a;

        j(lxw lxw) {
            this.a = lxw;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.d.e(1, TimeUnit.SECONDS, this.a.e.b());
        }
    }

    /* renamed from: lxw$b */
    static final class b extends akcs implements akbk<ajfb<a>> {
        private /* synthetic */ lxw a;

        b(lxw lxw) {
            this.a = lxw;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new lxx(new akbl<a, ajxw>(this.a.b) {
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

    /* renamed from: lxw$g */
    static final class g extends akcs implements akbk<ajdp<b>> {
        final /* synthetic */ lxw a;

        g(lxw lxw) {
            this.a = lxw;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            final ajdp ajdp = this.a.b;
            Object h = ajdp.h(a.a.b.a);
            akcr.a(h, "actions\n                …se.Action.DebugInfo.Show)");
            h = h.b(a.a.class);
            akcr.a(h, "ofType(R::class.java)");
            final ajdp a = igs.a(h);
            return ajpy.k(this.a.c.u(new ajfc<T, ajdt<? extends R>>(this) {
                final /* synthetic */ g a;

                /* renamed from: lxw$g$1$1 */
                static final class 1<T1, T2, R> implements ajex<R, T, R> {
                    public static final 1 a = new 1();

                    1() {
                    }

                    public final /* synthetic */ Object apply(Object obj, Object obj2) {
                        Optional optional = (Optional) obj;
                        a.b bVar = (a.b) obj2;
                        akcr.b(optional, ProfilingSessionReceiver.EXTRA_BOOLEAN_FIELD_ACTIVE);
                        akcr.b(bVar, "action");
                        if (bVar instanceof a.b.a) {
                            obj = optional.or(Boolean.FALSE);
                            akcr.a(obj, "active.or(false)");
                            if (!((Boolean) obj).booleanValue()) {
                                return Optional.absent();
                            }
                            obj = Boolean.FALSE;
                        } else if (!(bVar instanceof a.b.b)) {
                            return optional;
                        } else {
                            obj = Boolean.TRUE;
                        }
                        return Optional.of(obj);
                    }
                }

                /* renamed from: lxw$g$1$3 */
                static final class 3<T, R> implements ajfc<T, R> {
                    public static final 3 a = new 3();

                    3() {
                    }

                    public final /* synthetic */ Object apply(Object obj) {
                        d dVar = (d) obj;
                        akcr.b(dVar, "report");
                        Map linkedHashMap = new LinkedHashMap();
                        for (c cVar : dVar.a) {
                            linkedHashMap.put(cVar.a.a(), cVar.b);
                        }
                        return new e(linkedHashMap);
                    }
                }

                /* renamed from: lxw$g$1$4 */
                static final class 4<T> implements ajfl<mmi.c> {
                    public static final 4 a = new 4();

                    4() {
                    }

                    public final /* synthetic */ boolean test(Object obj) {
                        obj = (mmi.c) obj;
                        akcr.b(obj, "it");
                        return (obj instanceof mmi.c.a.d) || akcr.a(obj, mmi.c.b.a);
                    }
                }

                /* renamed from: lxw$g$1$5 */
                static final class 5 extends akcs implements akbw<mmi.c, a.a, ajxm<? extends mmi.c, ? extends a.a>> {
                    public static final 5 a = new 5();

                    5() {
                        super(2);
                    }

                    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                        mmi.c cVar = (mmi.c) obj;
                        a.a aVar = (a.a) obj2;
                        akcr.b(aVar, "action");
                        return ajxs.a(cVar, aVar);
                    }
                }

                public final /* synthetic */ Object apply(Object obj) {
                    final mmt mmt = (mmt) obj;
                    akcr.b(mmt, "lensCore");
                    Object b = ajdp.b(a.b.class);
                    akcr.a(b, "ofType(R::class.java)");
                    b = b.b(Optional.absent(), (ajex) 1.a).j(ajfu.a).u(new ajfc<T, ajdt<? extends R>>() {
                        public final /* synthetic */ Object apply(Object obj) {
                            Optional optional = (Optional) obj;
                            akcr.b(optional, ProfilingSessionReceiver.EXTRA_BOOLEAN_FIELD_ACTIVE);
                            if (optional.isPresent()) {
                                obj = optional.get();
                                akcr.a(obj, "active.get()");
                                if (!((Boolean) obj).booleanValue()) {
                                    return ajdp.b(mmt.n().b());
                                }
                                mmt.n().a(ajyi.k(mmr.values()));
                            }
                            return ajvo.a(ajot.a);
                        }
                    }).p(3.a);
                    akcr.a(b, "actions.ofType<DebugUseC…                        }");
                    ajdt ajdt = (ajdt) b;
                    ajdp a = mmt.a().b().a((ajfl) 4.a);
                    akcr.a((Object) a, "lensCore.filterApplicato…                        }");
                    return ajdp.b(ajdt, (ajdt) igs.a(a, a, (akbw) 5.a).u(new ajfc<T, ajdt<? extends R>>(this) {
                        private /* synthetic */ 1 a;

                        public final /* synthetic */ Object apply(Object obj) {
                            String str;
                            ajxm ajxm = (ajxm) obj;
                            akcr.b(ajxm, "<name for destructuring parameter 0>");
                            mmi.c cVar = (mmi.c) ajxm.a;
                            a.a aVar = (a.a) ajxm.b;
                            if (cVar instanceof mmi.c.a.d) {
                                lxw lxw = this.a.a.a;
                                Object obj2 = mmt;
                                akcr.a(obj2, "lensCore");
                                obj = lxw.f.a(new mwe.a.b(((mmi.c.a.d) cVar).a)).j().a((ajfl) c.a).p(d.a).a((ajfl) e.a).c(1).u(new f(lxw, aVar, obj2)).h((ajdt) ajdp.b(b.a.a));
                                str = "lensRepository.query(Len…bugUseCase.Result.Empty))";
                            } else {
                                obj = ajdp.b(b.a.a);
                                str = "just(DebugUseCase.Result.Empty)";
                            }
                            akcr.a(obj, str);
                            return obj;
                        }
                    }));
                }
            })).a();
        }
    }

    /* renamed from: lxw$c */
    static final class c<T> implements ajfl<List<? extends mux>> {
        public static final c a = new c();

        c() {
        }

        public final /* synthetic */ boolean test(Object obj) {
            List list = (List) obj;
            akcr.b(list, "it");
            return !((Collection) list).isEmpty();
        }
    }

    /* renamed from: lxw$d */
    static final class d<T, R> implements ajfc<T, R> {
        public static final d a = new d();

        d() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            akcr.b(list, "it");
            return (mux) list.get(0);
        }
    }

    /* renamed from: lxw$e */
    static final class e<T> implements ajfl<mux> {
        public static final e a = new e();

        e() {
        }

        public final /* synthetic */ boolean test(Object obj) {
            mux mux = (mux) obj;
            akcr.b(mux, "it");
            return !(mux.b instanceof f);
        }
    }

    /* renamed from: lxw$f */
    static final class f<T, R> implements ajfc<T, ajdt<? extends R>> {
        private /* synthetic */ lxw a;
        private /* synthetic */ a.a b;
        private /* synthetic */ mmt c;

        f(lxw lxw, a.a aVar, mmt mmt) {
            this.a = lxw;
            this.b = aVar;
            this.c = mmt;
        }

        public final /* synthetic */ Object apply(Object obj) {
            mux mux = (mux) obj;
            akcr.b(mux, "lens");
            if (!(this.b instanceof a.a.b)) {
                return ajdp.b(b.c.a);
            }
            Object a = ajdp.a((ajdt) this.c.r().a().a(1, TimeUnit.SECONDS), (ajdt) ((ajdp) this.a.a.b()).h(Double.valueOf(0.0d)), (ajex) a.a);
            akcr.a(a, "Observable.combineLatest…raFps)\n                })");
            ajdt ajdt = (ajdt) a;
            lxw lxw = this.a;
            obj = ajdp.a((ajdt) ajdp.a(0, 1, TimeUnit.SECONDS, (ajdw) lxw.e.b()).u(new i(this.c)), (ajdt) lxw.g.invoke(mux), (ajex) h.a);
            akcr.a(obj, "Observable.combineLatest…              }\n        )");
            return ajdp.b(ajdt, (ajdt) obj);
        }
    }

    /* renamed from: lxw$a */
    static final class a<T1, T2, R> implements ajex<min, Double, b.b> {
        public static final a a = new a();

        a() {
        }

        public final /* synthetic */ Object apply(Object obj, Object obj2) {
            min min = (min) obj;
            double doubleValue = ((Number) obj2).doubleValue();
            akcr.b(min, "processingTime");
            return new b.b(min, doubleValue);
        }
    }

    /* renamed from: lxw$h */
    static final class h<T1, T2, R> implements ajex<Integer, mvs, b.d> {
        public static final h a = new h();

        h() {
        }

        public final /* synthetic */ Object apply(Object obj, Object obj2) {
            int intValue = ((Number) obj).intValue();
            mvs mvs = (mvs) obj2;
            akcr.b(mvs, "lensContentInfo");
            return new b.d((long) intValue, mvs.a, mvs.b);
        }
    }

    /* renamed from: lxw$i */
    static final class i<T, R> implements ajfc<T, ajdt<? extends R>> {
        private /* synthetic */ mmt a;

        i(mmt mmt) {
            this.a = mmt;
        }

        public final /* synthetic */ Object apply(Object obj) {
            akcr.b((Long) obj, "it");
            return this.a.k().a().c(ajxw.a);
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(lxw.class), "throttledCameraAverageFps", "getThrottledCameraAverageFps()Lio/reactivex/Observable;"), new akdc(akde.a(lxw.class), "inputs", "getInputs()Lio/reactivex/functions/Consumer;"), new akdc(akde.a(lxw.class), "outputs", "getOutputs()Lio/reactivex/Observable;")};
    }

    public lxw(ajdp<mmt> ajdp, ajdp<Double> ajdp2, zfw zfw, mwe mwe, mvu mvu) {
        akcr.b(ajdp, "lensCore");
        akcr.b(ajdp2, "cameraAverageFps");
        akcr.b(zfw, "qualifiedSchedulers");
        akcr.b(mwe, "lensRepository");
        akcr.b(mvu, "lensContentInfoProvider");
        this.c = ajdp;
        this.d = ajdp2;
        this.e = zfw;
        this.f = mwe;
        this.g = mvu;
        Object r = new ajwo().r();
        akcr.a(r, "PublishSubject.create<De….Action>().toSerialized()");
        this.b = r;
        this.h = ajxh.a(new b(this));
        this.i = ajxh.a(new g(this));
    }

    public final ajfb<a> a() {
        return (ajfb) this.h.b();
    }

    public final ajdp<b> b() {
        return (ajdp) this.i.b();
    }
}
