package defpackage;

/* renamed from: ajwc */
public final class ajwc {

    /* renamed from: ajwc$a */
    static final class a<T1, T2, R> implements ajex<T, U, ajxm<? extends T, ? extends U>> {
        public static final a a = new a();

        a() {
        }

        public final /* synthetic */ Object apply(Object obj, Object obj2) {
            return new ajxm(obj, obj2);
        }
    }

    /* renamed from: ajwc$b */
    public static final class b<T1, T2, T3, R> implements ajfd<T1, T2, T3, ajxr<? extends T1, ? extends T2, ? extends T3>> {
        public static final b a = new b();

        b() {
        }

        public final /* synthetic */ Object apply(Object obj, Object obj2, Object obj3) {
            return new ajxr(obj, obj2, obj3);
        }
    }

    static {
        ajwc ajwc = new ajwc();
    }

    private ajwc() {
    }

    public static <T, U> ajdx<ajxm<T, U>> a(ajeb<T> ajeb, ajeb<U> ajeb2) {
        akcr.b(ajeb, "s1");
        akcr.b(ajeb2, "s2");
        Object a = ajdx.a((ajeb) ajeb, (ajeb) ajeb2, (ajex) a.a);
        akcr.a(a, "Single.zip(s1, s2, BiFun…on { t, u -> Pair(t,u) })");
        return a;
    }
}
