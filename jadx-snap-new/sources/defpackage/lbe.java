package defpackage;

import defpackage.lqf.b.b.b;
import defpackage.lqf.b.b.c;

/* renamed from: lbe */
public final class lbe implements ajdu<lqf, lqf> {
    private final ajdp<achi<zjm, zjk>> a;

    /* renamed from: lbe$d */
    static final class d<T, R> implements ajfc<T, R> {
        public static final d a = new d();

        d() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            achi achi = (achi) obj;
            akcr.b(achi, "it");
            return Boolean.valueOf(lbf.a.contains(((zjm) achi.f.e()).d.c));
        }
    }

    /* renamed from: lbe$a */
    static final class a<T1, T2, R> implements ajex<lqf, lqf, lqf> {
        public static final a a = new a();

        a() {
        }

        public final /* synthetic */ Object apply(Object obj, Object obj2) {
            lqf lqf = (lqf) obj;
            lqf lqf2 = (lqf) obj2;
            akcr.b(lqf, "previous");
            akcr.b(lqf2, "current");
            return (((lqf instanceof c) || (lqf instanceof defpackage.lqf.b.b.a)) && (lqf2 instanceof b)) ? lqf : ((lqf instanceof defpackage.lqf.b.a) && ((lqf2 instanceof c) || (lqf2 instanceof defpackage.lqf.b.b.a))) ? lqf : lqf2;
        }
    }

    /* renamed from: lbe$b */
    static final class b<T> implements ajfl<Boolean> {
        public static final b a = new b();

        b() {
        }

        public final /* synthetic */ boolean test(Object obj) {
            Boolean bool = (Boolean) obj;
            akcr.b(bool, "isFiltered");
            return bool.booleanValue();
        }
    }

    /* renamed from: lbe$c */
    static final class c<T, R> implements ajfc<ajdp<Object>, ajdt<?>> {
        final /* synthetic */ ajdp a;
        private /* synthetic */ ajdp b;

        /* renamed from: lbe$c$1 */
        static final class 1<T> implements ajfl<Boolean> {
            public static final 1 a = new 1();

            1() {
            }

            public final /* synthetic */ boolean test(Object obj) {
                Boolean bool = (Boolean) obj;
                akcr.b(bool, "isFiltered");
                return !bool.booleanValue();
            }
        }

        /* renamed from: lbe$c$2 */
        static final class 2<T, R> implements ajfc<T, ajdt<U>> {
            private /* synthetic */ c a;

            2(c cVar) {
                this.a = cVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                akcr.b((Boolean) obj, "it");
                obj = this.a.a.b(lqf.b.b.class);
                akcr.a(obj, "ofType(R::class.java)");
                return obj;
            }
        }

        c(ajdp ajdp, ajdp ajdp2) {
            this.b = ajdp;
            this.a = ajdp2;
        }

        public final /* synthetic */ Object apply(Object obj) {
            akcr.b((ajdp) obj, "it");
            return this.b.a((ajfl) 1.a).i((ajfc) new 2(this));
        }
    }

    public lbe(ajdp<achi<zjm, zjk>> ajdp) {
        akcr.b(ajdp, "navigationEvents");
        this.a = ajdp;
    }

    public final ajdt<lqf> apply(ajdp<lqf> ajdp) {
        akcr.b(ajdp, "upstream");
        ajdp j = this.a.p(d.a).j(ajfu.a);
        Object t = ajdp.b((ajex) a.a).j((ajdt) j.a((ajfl) b.a)).t(new c(j, ajdp));
        akcr.a(t, "upstream\n               …      }\n                }");
        return (ajdt) t;
    }
}
