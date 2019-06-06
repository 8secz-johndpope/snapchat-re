package defpackage;

/* renamed from: ajwd */
public final class ajwd {

    /* renamed from: ajwd$a */
    static final class a<T1, T2, R> implements ajex<T, U, ajxm<? extends T, ? extends U>> {
        public static final a a = new a();

        a() {
        }

        public final /* synthetic */ Object apply(Object obj, Object obj2) {
            return new ajxm(obj, obj2);
        }
    }

    public static final <T, U> ajdx<ajxm<T, U>> a(ajdx<T> ajdx, ajeb<U> ajeb) {
        akcr.b(ajdx, "$receiver");
        akcr.b(ajeb, "other");
        Object a = ajdx.a((ajeb) ajdx, (ajeb) ajeb, (ajex) a.a);
        akcr.a(a, "zipWith(other, BiFunction { t, u -> Pair(t,u) })");
        return a;
    }
}
