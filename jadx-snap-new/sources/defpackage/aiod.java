package defpackage;

/* renamed from: aiod */
public final class aiod {

    /* renamed from: aiod$b */
    static final class b<T, R> implements ajfc<T, R> {
        public static final b a = new b();

        b() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            ainb ainb = (ainb) obj;
            akcr.b(ainb, "it");
            return ainb.d();
        }
    }

    /* renamed from: aiod$a */
    public static final class a<T, R> implements ajfc<T, R> {
        public static final a a = new a();

        a() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            ainb ainb = (ainb) obj;
            akcr.b(ainb, "it");
            return ainb.c();
        }
    }

    /* renamed from: aiod$c */
    public static final class c<T, R> implements ajfc<T, ajdt<? extends R>> {
        public static final c a = new c();

        c() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            ainb ainb = (ainb) obj;
            akcr.b(ainb, "it");
            obj = ainb.e();
            return obj == null ? ajvo.a(ajot.a) : ajdp.b(obj);
        }
    }

    /* renamed from: aiod$d */
    public static final class d<T, R> implements ajfc<T, R> {
        private /* synthetic */ Object a;

        public d(Object obj) {
            this.a = obj;
        }

        public final /* synthetic */ Object apply(Object obj) {
            ainb ainb = (ainb) obj;
            akcr.b(ainb, "it");
            obj = ainb.e();
            return obj == null ? this.a : obj;
        }
    }

    public static final <T> ajdp<ainb<T>> a(ainb<? extends T> ainb, ajdw ajdw) {
        akcr.b(ainb, "receiver$0");
        akcr.b(ajdw, "scheduler");
        Object a = ajdp.a((ajdr) new aioc(ainb)).a(ajdw);
        akcr.a(a, "Observable.create(QueryO…is)).observeOn(scheduler)");
        return a;
    }

    public static final <T> ajdp<T> a(ajdp<ainb<T>> ajdp) {
        akcr.b(ajdp, "receiver$0");
        Object p = ajdp.p(b.a);
        akcr.a(p, "map { it.executeAsOne() }");
        return p;
    }
}
