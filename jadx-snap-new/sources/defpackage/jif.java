package defpackage;

/* renamed from: jif */
public final class jif {
    public final ftl a;
    public final hxs b;

    /* renamed from: jif$a */
    static final class a<T1, T2, R> implements ajex<Boolean, T, ajxm<? extends Boolean, ? extends T>> {
        public static final a a = new a();

        a() {
        }

        public final /* synthetic */ Object apply(Object obj, Object obj2) {
            return new ajxm(Boolean.valueOf(((Boolean) obj).booleanValue()), obj2);
        }
    }

    /* renamed from: jif$b */
    static final class b<T> implements ajfl<ajxm<? extends Boolean, ? extends T>> {
        public static final b a = new b();

        b() {
        }

        public final /* synthetic */ boolean test(Object obj) {
            ajxm ajxm = (ajxm) obj;
            akcr.b(ajxm, "pair");
            return ((Boolean) ajxm.a).booleanValue();
        }
    }

    /* renamed from: jif$c */
    static final class c<T, R> implements ajfc<T, R> {
        public static final c a = new c();

        c() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            ajxm ajxm = (ajxm) obj;
            akcr.b(ajxm, "pair");
            return ajxm.b;
        }
    }

    public jif(ftl ftl, hxs hxs) {
        akcr.b(ftl, "configProvider");
        akcr.b(hxs, "featureConfiguration");
        this.a = ftl;
        this.b = hxs;
    }

    public static <T> ajdp<T> a(ajdp<T> ajdp, ajdp<Boolean> ajdp2) {
        Object p = ajdp.a((ajdt) ajdp2, (ajdt) ajdp, (ajex) a.a).a((ajfl) b.a).p(c.a);
        akcr.a(p, "Observable.combineLatest….second\n                }");
        return p;
    }

    public final boolean a() {
        return this.a.a((fth) iui.TOS_VERSION_7_ACCEPTED);
    }

    public final boolean b() {
        return this.a.a((fth) iui.SEEN_PRIVACY_POLICY_GDPR);
    }
}
