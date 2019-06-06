package defpackage;

import defpackage.ajfu.t;
import defpackage.mae.a;
import defpackage.mhs.b;
import defpackage.mmi.c;
import defpackage.mmi.c.a.d;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: lzv */
public final class lzv implements mae {
    final ajdp<mmt> a;
    final zfw b;
    final long c;
    final TimeUnit d;
    private final ajxe e;
    private final mwe f;

    /* renamed from: lzv$c */
    static final class c extends akcs implements akbk<ajdp<a>> {
        final /* synthetic */ lzv a;

        /* renamed from: lzv$c$b */
        static final class b<T, R> implements ajfc<T, ajdt<? extends R>> {
            final /* synthetic */ c a;

            /* renamed from: lzv$c$b$1 */
            static final class 1<T, R> implements ajfc<T, ajdt<? extends R>> {
                private /* synthetic */ b a;

                1(b bVar) {
                    this.a = bVar;
                }

                public final /* synthetic */ Object apply(Object obj) {
                    String str;
                    defpackage.mmk.b bVar = (defpackage.mmk.b) obj;
                    akcr.b(bVar, "it");
                    if (bVar instanceof defpackage.mmk.b.b) {
                        lzv lzv = this.a.a.a;
                        obj = lzv.a.u(new d(lzv, (defpackage.mmk.b.b) bVar));
                        str = "lensCore.switchMap { len…   }.distinct()\n        }";
                    } else {
                        obj = ajdp.b(defpackage.mae.a.b.a);
                        str = "just(Result.Hidden)";
                    }
                    akcr.a(obj, str);
                    return obj;
                }
            }

            b(c cVar) {
                this.a = cVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                mmt mmt = (mmt) obj;
                akcr.b(mmt, "lensCore");
                return mmt.j().a().u(new 1(this));
            }
        }

        /* renamed from: lzv$c$c */
        static final class c<T, R> implements ajfc<T, ajdt<? extends R>> {
            public static final c a = new c();

            c() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                mmt mmt = (mmt) obj;
                akcr.b(mmt, "it");
                return mmt.a().b();
            }
        }

        /* renamed from: lzv$c$a */
        public static final class a<T> implements ajfl<Object> {
            public static final a a = new a();

            public final boolean test(Object obj) {
                akcr.b(obj, "it");
                return obj instanceof d;
            }
        }

        /* renamed from: lzv$c$d */
        static final class d<T, R> implements ajfc<T, ajdt<? extends R>> {
            private /* synthetic */ c a;

            d(c cVar) {
                this.a = cVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                defpackage.mmi.c.a.d dVar = (defpackage.mmi.c.a.d) obj;
                akcr.b(dVar, "it");
                lzv lzv = this.a.a;
                obj = lzv.a(dVar.a).u(new a(lzv));
                akcr.a(obj, "findLensById(filterId).s…)\n            }\n        }");
                return obj;
            }
        }

        c(lzv lzv) {
            this.a = lzv;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            ajdp u = this.a.a.u(new b(this));
            Object a = this.a.a.a((ajfc) c.a);
            akcr.a(a, "lensCore\n               …licator.filterLifecycle }");
            a = a.a((ajfl) a.a).a(d.class);
            akcr.a(a, "this.filter { it is R }.cast(R::class.java)");
            ajdt ajdt = u;
            return ajpy.k(ajdp.b((ajdt) a.u(new d(this)).c(300, this.a.d, this.a.b.b()).j(ajdt), ajdt)).a();
        }
    }

    /* renamed from: lzv$b */
    static final class b<T, R> implements ajfc<T, ajdt<? extends R>> {
        public static final b a = new b();

        b() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            akcr.b(list, "lenses");
            return list.isEmpty() ? ajvo.a(ajot.a) : ajdp.b(ajyu.f(list));
        }
    }

    /* renamed from: lzv$a */
    static final class a<T, R> implements ajfc<T, ajdt<? extends R>> {
        private /* synthetic */ lzv a;

        a(lzv lzv) {
            this.a = lzv;
        }

        public final /* synthetic */ Object apply(Object obj) {
            mux mux = (mux) obj;
            akcr.b(mux, "lens");
            mhs a = mux.h.a();
            return a instanceof b ? ajdp.b(lzv.a(mux.h.b(), (b) a, true)) : ajvo.a(ajot.a);
        }
    }

    /* renamed from: lzv$d */
    static final class d<T, R> implements ajfc<T, ajdt<? extends R>> {
        final /* synthetic */ lzv a;
        final /* synthetic */ mmk.b.b b;

        /* renamed from: lzv$d$1 */
        static final class 1<T, R> implements ajfc<T, ajdt<? extends R>> {
            private /* synthetic */ d a;

            1(d dVar) {
                this.a = dVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                String str;
                c cVar = (c) obj;
                akcr.b(cVar, "it");
                if ((cVar instanceof c.a) && akcr.a(((c.a) cVar).a, this.a.b.a)) {
                    lzv lzv = this.a.a;
                    b bVar = this.a.b.a;
                    b bVar2 = this.a.b.b;
                    obj = lzv.a(bVar).p(new e(lzv, bVar2)).c(new a.a(bVar2, null, false, 6));
                    str = "findLensById(filterId)\n …Result.Displayed(hintId))";
                } else {
                    obj = ajdp.b(a.b.a);
                    str = "just(Result.Hidden)";
                }
                akcr.a(obj, str);
                return obj;
            }
        }

        d(lzv lzv, mmk.b.b bVar) {
            this.a = lzv;
            this.b = bVar;
        }

        public final /* synthetic */ Object apply(Object obj) {
            mmt mmt = (mmt) obj;
            akcr.b(mmt, "lensCore");
            return mmt.a().b().u(new 1(this)).a(ajfu.a, t.INSTANCE);
        }
    }

    /* renamed from: lzv$e */
    static final class e<T, R> implements ajfc<T, R> {
        private /* synthetic */ lzv a;
        private /* synthetic */ b b;

        e(lzv lzv, b bVar) {
            this.a = lzv;
            this.b = bVar;
        }

        public final /* synthetic */ Object apply(Object obj) {
            mux mux = (mux) obj;
            akcr.b(mux, "lens");
            return lzv.a(mux.h.b(), this.b, false);
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(lzv.class), "outputs", "getOutputs()Lio/reactivex/Observable;");
    }

    private /* synthetic */ lzv(ajdp ajdp, mwe mwe, zfw zfw) {
        this(ajdp, mwe, zfw, TimeUnit.MILLISECONDS);
    }

    public lzv(ajdp<mmt> ajdp, mwe mwe, zfw zfw, byte b) {
        this(ajdp, mwe, zfw);
    }

    private lzv(ajdp<mmt> ajdp, mwe mwe, zfw zfw, TimeUnit timeUnit) {
        akcr.b(ajdp, "lensCore");
        akcr.b(mwe, "lensRepository");
        akcr.b(zfw, "qualifiedSchedulers");
        akcr.b(timeUnit, "showDefaultHintAfterTimeoutUnit");
        this.a = ajdp;
        this.f = mwe;
        this.b = zfw;
        this.c = 300;
        this.d = timeUnit;
        this.e = ajxh.a(new c(this));
    }

    static a.a a(Map<String, String> map, b bVar, boolean z) {
        Object obj = (String) map.get(bVar.a);
        return (obj == null || akcr.a(obj, (Object) "unknown_lens_hint")) ? new a.a(bVar, null, z, 2) : new a.a(bVar, obj, z);
    }

    /* Access modifiers changed, original: final */
    public final ajdp<mux> a(b bVar) {
        Object u = this.f.a(new mwe.a.b(bVar)).j().u(b.a);
        akcr.a(u, "lensRepository.query(Len…      }\n                }");
        return u;
    }

    public final ajfb a() {
        return myr.a();
    }

    public final ajdp<a> b() {
        return (ajdp) this.e.b();
    }
}
