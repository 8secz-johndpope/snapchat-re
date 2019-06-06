package defpackage;

import defpackage.lqf.a;
import defpackage.lqf.b;
import defpackage.lqh.a.a.c;
import java.util.Collection;
import java.util.List;

/* renamed from: kxg */
public final class kxg {

    /* renamed from: kxg$c */
    static final class c<T1, T2, R> implements ajex<R, T, R> {
        public static final c a = new c();

        c() {
        }

        public final /* synthetic */ Object apply(Object obj, Object obj2) {
            ajxm ajxm = (ajxm) obj;
            lqf lqf = (lqf) obj2;
            akcr.b(ajxm, "state");
            akcr.b(lqf, "lifecycle");
            boolean z = ((lqf) ajxm.a) == a.a && (lqf instanceof b);
            return ajxs.a(lqf, Boolean.valueOf(z));
        }
    }

    /* renamed from: kxg$d */
    static final class d<T> implements ajfb<ajxm<? extends lqf, ? extends Boolean>> {
        public static final d a = new d();

        d() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: kxg$e */
    static final class e<T> implements ajfl<ajxm<? extends lqf, ? extends Boolean>> {
        public static final e a = new e();

        e() {
        }

        public final /* synthetic */ boolean test(Object obj) {
            ajxm ajxm = (ajxm) obj;
            akcr.b(ajxm, "<name for destructuring parameter 0>");
            return ((Boolean) ajxm.b).booleanValue();
        }
    }

    /* renamed from: kxg$f */
    static final class f<T> implements ajfl<ajxm<? extends lqf, ? extends Boolean>> {
        public static final f a = new f();

        f() {
        }

        public final /* synthetic */ boolean test(Object obj) {
            ajxm ajxm = (ajxm) obj;
            akcr.b(ajxm, "<name for destructuring parameter 0>");
            return ((Boolean) ajxm.b).booleanValue();
        }
    }

    /* renamed from: kxg$g */
    static final class g<T, R> implements ajfc<ajdp<Object>, ajdt<?>> {
        private /* synthetic */ ajdp a;

        /* renamed from: kxg$g$1 */
        static final class 1<T> implements ajfl<lqf> {
            public static final 1 a = new 1();

            1() {
            }

            public final /* synthetic */ boolean test(Object obj) {
                lqf lqf = (lqf) obj;
                akcr.b(lqf, "it");
                return lqf instanceof a;
            }
        }

        g(ajdp ajdp) {
            this.a = ajdp;
        }

        public final /* synthetic */ Object apply(Object obj) {
            akcr.b((ajdp) obj, "<anonymous parameter 0>");
            return this.a.a((ajfl) 1.a);
        }
    }

    /* renamed from: kxg$a */
    static final class a<T> implements ajfl<List<? extends mux>> {
        public static final a a = new a();

        a() {
        }

        public final /* synthetic */ boolean test(Object obj) {
            List list = (List) obj;
            akcr.b(list, "it");
            return !((Collection) list).isEmpty();
        }
    }

    /* renamed from: kxg$b */
    static final class b<T, R> implements ajfc<T, R> {
        private /* synthetic */ String a;

        b(String str) {
            this.a = str;
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            akcr.b(list, "lenses");
            return new c(((mux) ajyu.f(list)).a, false, this.a, 14);
        }
    }

    static final ajdp<ajxm<lqf, Boolean>> a(ajdp<lqf> ajdp) {
        return ajdp.b(ajxs.a(a.a, Boolean.FALSE), (ajex) c.a).d((ajfb) d.a).a((ajfl) e.a).c((ajfl) f.a).t(new g(ajdp));
    }

    public static final ajdp<lqh.a> a(mwe mwe, mwe.a aVar, String str) {
        akcr.b(mwe, "lensRepository");
        akcr.b(aVar, "query");
        akcr.b(str, "tag");
        Object j = mip.a(mwe.a(aVar), "CameraUseCaseActionSource:takeFirstLensMatchingQuery").b((ajfl) a.a).h().d((ajfc) new b(str)).j();
        akcr.a(j, "lensRepository.query(que…          .toObservable()");
        return j;
    }
}
