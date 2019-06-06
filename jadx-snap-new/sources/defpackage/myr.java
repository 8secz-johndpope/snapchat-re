package defpackage;

/* renamed from: myr */
public final class myr {
    private static final ajfb<Object> a = a.a;

    /* renamed from: myr$a */
    static final class a<T> implements ajfb<Object> {
        public static final a a = new a();

        a() {
        }

        public final void accept(Object obj) {
        }
    }

    /* renamed from: myr$b */
    static final class b<T> implements ajfb<T> {
        private /* synthetic */ ajfb[] a;

        b(ajfb[] ajfbArr) {
            this.a = ajfbArr;
        }

        public final void accept(T t) {
            for (ajfb accept : this.a) {
                accept.accept(t);
            }
        }
    }

    static {
        myr myr = new myr();
    }

    private myr() {
    }

    public static final <T> ajfb<T> a() {
        ajfb ajfb = a;
        if (ajfb != null) {
            return ajfb;
        }
        throw new ajxt("null cannot be cast to non-null type io.reactivex.functions.Consumer<T>");
    }

    public static <T> ajfb<T> a(ajfb<T>... ajfbArr) {
        akcr.b(ajfbArr, "consumers");
        return new b(ajfbArr);
    }
}
