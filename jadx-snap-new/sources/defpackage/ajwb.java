package defpackage;

/* renamed from: ajwb */
public final class ajwb {

    /* renamed from: ajwb$a */
    static final class a<T1, T2, R> implements ajex<T, U, ajxm<? extends T, ? extends U>> {
        public static final a a = new a();

        a() {
        }

        public final /* synthetic */ Object apply(Object obj, Object obj2) {
            return new ajxm(obj, obj2);
        }
    }

    /* renamed from: ajwb$b */
    static final class b<T1, T2, R> implements ajex<T, U, ajxm<? extends T, ? extends U>> {
        public static final b a = new b();

        b() {
        }

        public final /* synthetic */ Object apply(Object obj, Object obj2) {
            return new ajxm(obj, obj2);
        }
    }

    public static final <T, U> ajdp<ajxm<T, U>> a(ajdp<T> ajdp, ajdt<U> ajdt) {
        akcr.b(ajdp, "$receiver");
        akcr.b(ajdt, "other");
        Object a = ajdp.a((ajdt) ajdt, (ajex) a.a);
        akcr.a(a, "withLatestFrom(other, Bi…on{ t, u -> Pair(t,u)  })");
        return a;
    }

    public static final <T, U> ajdp<ajxm<T, U>> b(ajdp<T> ajdp, ajdt<U> ajdt) {
        akcr.b(ajdp, "$receiver");
        akcr.b(ajdt, "other");
        Object b = ajdp.b((ajdt) ajdt, (ajex) b.a);
        akcr.a(b, "zipWith(other, BiFunction { t, u -> Pair(t,u) })");
        return b;
    }
}
