package defpackage;

import defpackage.lqf.b.b;
import defpackage.lqf.b.b.c;
import java.util.concurrent.TimeUnit;

/* renamed from: lqg */
public final class lqg {

    /* renamed from: lqg$a */
    public static final class a<T> implements ajfl<Object> {
        public static final a a = new a();

        public final boolean test(Object obj) {
            akcr.b(obj, "it");
            return obj instanceof b;
        }
    }

    /* renamed from: lqg$b */
    static final class b<T, R> implements ajfc<T, ajdt<U>> {
        private /* synthetic */ zfw a;

        b(zfw zfw) {
            this.a = zfw;
        }

        public final /* synthetic */ Object apply(Object obj) {
            defpackage.lqf.b.b bVar = (defpackage.lqf.b.b) obj;
            akcr.b(bVar, "event");
            return bVar instanceof c ? ajdp.b(Long.valueOf(0)) : ajdp.a(200, TimeUnit.MILLISECONDS, (ajdw) this.a.b());
        }
    }

    /* renamed from: lqg$c */
    static final class c<T, R> implements ajfc<T, R> {
        public static final c a = new c();

        c() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            b bVar = (b) obj;
            akcr.b(bVar, "event");
            return Boolean.valueOf(bVar instanceof defpackage.lqf.b.b.c);
        }
    }

    public static final ajdp<Boolean> a(ajdp<lqf> ajdp, zfw zfw) {
        akcr.b(ajdp, "receiver$0");
        akcr.b(zfw, "qualifiedSchedulers");
        Object a = ajdp.a((ajfl) a.a).a(b.class);
        akcr.a(a, "this.filter { it is R }.cast(R::class.java)");
        a = a.h((ajfc) new b(zfw)).p(c.a).j(ajfu.a);
        akcr.a(a, "this.filterByType<Camera…  .distinctUntilChanged()");
        return a;
    }
}
