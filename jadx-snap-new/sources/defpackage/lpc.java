package defpackage;

import defpackage.lqh.b.a;
import defpackage.mec.c;
import defpackage.mec.c.b;

/* renamed from: lpc */
public final class lpc {
    static final akbl<c, ajdp<Boolean>> a = a.a;

    /* renamed from: lpc$a */
    static final class a extends akcs implements akbl<c, ajdp<Boolean>> {
        public static final a a = new a();

        a() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            String str;
            obj = (c) obj;
            akcr.b(obj, "result");
            if (akcr.a(obj, defpackage.mec.c.a.a)) {
                obj = ajdp.b(Boolean.TRUE);
                str = "just(true)";
            } else if (obj instanceof b) {
                obj = ajdp.b(Boolean.FALSE);
                str = "just(false)";
            } else {
                obj = ajvo.a(ajot.a);
                str = "empty()";
            }
            akcr.a(obj, str);
            return obj;
        }
    }

    /* renamed from: lpc$c */
    public static final class c<T> implements ajfl<Object> {
        public static final c a = new c();

        public final boolean test(Object obj) {
            akcr.b(obj, "it");
            return obj instanceof lqh.b.b;
        }
    }

    /* renamed from: lpc$d */
    static final class d<T, R> implements ajfc<ajdp<Object>, ajdt<?>> {
        private /* synthetic */ lqh a;

        /* renamed from: lpc$d$a */
        public static final class a<T> implements ajfl<Object> {
            public static final a a = new a();

            public final boolean test(Object obj) {
                akcr.b(obj, "it");
                return obj instanceof defpackage.lqh.b.a;
            }
        }

        d(lqh lqh) {
            this.a = lqh;
        }

        public final /* synthetic */ Object apply(Object obj) {
            akcr.b((ajdp) obj, "<anonymous parameter 0>");
            obj = this.a.b().a((ajfl) a.a).a(a.class);
            akcr.a(obj, "this.filter { it is R }.cast(R::class.java)");
            return obj;
        }
    }

    /* renamed from: lpc$b */
    public static final class b<T> implements ajfl<Object> {
        public static final b a = new b();

        public final boolean test(Object obj) {
            akcr.b(obj, "it");
            return obj instanceof a;
        }
    }

    /* renamed from: lpc$e */
    public static final class e<T1, T2> implements ajey<lqh.b, lqh.b> {
        public static final e a = new e();

        public final /* synthetic */ boolean test(Object obj, Object obj2) {
            lqh.b bVar = (lqh.b) obj;
            obj2 = (lqh.b) obj2;
            akcr.b(bVar, "old");
            akcr.b(obj2, "new");
            if (bVar instanceof a) {
                return obj2 instanceof a;
            }
            if (bVar instanceof lqh.b.b) {
                return akcr.a(obj2, lqh.b.b.a);
            }
            throw new ajxk();
        }
    }

    /* renamed from: lpc$f */
    static final class f<T, R> implements ajfc<T, ajdt<? extends R>> {
        private /* synthetic */ akbk a;

        f(akbk akbk) {
            this.a = akbk;
        }

        public final /* synthetic */ Object apply(Object obj) {
            lqh.b bVar = (lqh.b) obj;
            akcr.b(bVar, "result");
            if (bVar instanceof a) {
                return (ajdp) this.a.invoke();
            }
            obj = ajvo.a(ajot.a);
            akcr.a(obj, "empty()");
            return obj;
        }
    }

    static final <T> ajdp<T> a(ajdp<T> ajdp, lqh lqh) {
        Object a = lqh.b().a((ajfl) c.a).a(lqh.b.b.class);
        String str = "this.filter { it is R }.cast(R::class.java)";
        akcr.a(a, str);
        ajdp t = ajdp.j((ajdt) a).t(new d(lqh));
        Object a2 = lqh.b().a((ajfl) b.a).a(a.class);
        akcr.a(a2, str);
        Object d = t.d((ajdt) a2);
        akcr.a(d, "takeUntil(cameraUseCase.…eraUseCase.whenActivated)");
        return d;
    }

    static final <T> ajdp<T> a(lqh lqh, akbk<? extends ajdp<T>> akbk) {
        Object a = lqh.b().a((ajey) e.a);
        akcr.a(a, "distinctUntilChanged { o…activated\n        }\n    }");
        a = a.u(new f(akbk));
        akcr.a(a, "whenActivatedDeactivated…  else -> empty()\n    }\n}");
        return a;
    }
}
