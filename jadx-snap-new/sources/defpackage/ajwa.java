package defpackage;

/* renamed from: ajwa */
public final class ajwa {

    /* renamed from: ajwa$c */
    static final class c<T1, T2, R> implements ajex<T1, T2, ajxm<? extends T1, ? extends T2>> {
        public static final c a = new c();

        c() {
        }

        public final /* synthetic */ Object apply(Object obj, Object obj2) {
            return ajxs.a(obj, obj2);
        }
    }

    /* renamed from: ajwa$a */
    static final class a<T1, T2, R> implements ajex<T1, T2, ajxm<? extends T1, ? extends T2>> {
        public static final a a = new a();

        a() {
        }

        public final /* synthetic */ Object apply(Object obj, Object obj2) {
            return ajxs.a(obj, obj2);
        }
    }

    /* renamed from: ajwa$b */
    static final class b<T1, T2, T3, R> implements ajfd<T1, T2, T3, ajxr<? extends T1, ? extends T2, ? extends T3>> {
        public static final b a = new b();

        b() {
        }

        public final /* synthetic */ Object apply(Object obj, Object obj2, Object obj3) {
            return new ajxr(obj, obj2, obj3);
        }
    }

    static {
        ajwa ajwa = new ajwa();
    }

    private ajwa() {
    }

    public static <T1, T2> ajdp<ajxm<T1, T2>> a(ajdp<T1> ajdp, ajdp<T2> ajdp2) {
        akcr.b(ajdp, "source1");
        akcr.b(ajdp2, "source2");
        ajdp a = ajdp.a((ajdt) ajdp, (ajdt) ajdp2, (ajex) a.a);
        if (a == null) {
            akcr.a();
        }
        return a;
    }

    public static <T1, T2, T3> ajdp<ajxr<T1, T2, T3>> a(ajdp<T1> ajdp, ajdp<T2> ajdp2, ajdp<T3> ajdp3) {
        akcr.b(ajdp, "source1");
        akcr.b(ajdp2, "source2");
        akcr.b(ajdp3, "source3");
        ajdp a = ajdp.a((ajdt) ajdp, (ajdt) ajdp2, (ajdt) ajdp3, (ajfd) b.a);
        if (a == null) {
            akcr.a();
        }
        return a;
    }

    public static <T1, T2> ajdp<ajxm<T1, T2>> b(ajdp<T1> ajdp, ajdp<T2> ajdp2) {
        akcr.b(ajdp, "source1");
        akcr.b(ajdp2, "source2");
        ajdp b = ajdp.b((ajdt) ajdp, (ajdt) ajdp2, (ajex) c.a);
        if (b == null) {
            akcr.a();
        }
        return b;
    }
}
