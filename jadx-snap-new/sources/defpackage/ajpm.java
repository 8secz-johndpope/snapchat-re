package defpackage;

/* renamed from: ajpm */
public final class ajpm {

    /* renamed from: ajpm$f */
    public static final class f<T> implements ajfb<T> {
        private ajdv<T> a;

        public f(ajdv<T> ajdv) {
            this.a = ajdv;
        }

        public final void accept(T t) {
            this.a.a((Object) t);
        }
    }

    /* renamed from: ajpm$e */
    public static final class e<T> implements ajfb<Throwable> {
        private ajdv<T> a;

        public e(ajdv<T> ajdv) {
            this.a = ajdv;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.a((Throwable) obj);
        }
    }

    /* renamed from: ajpm$d */
    public static final class d<T> implements ajev {
        private ajdv<T> a;

        public d(ajdv<T> ajdv) {
            this.a = ajdv;
        }

        public final void run() {
            this.a.a();
        }
    }

    /* renamed from: ajpm$c */
    static final class c<T, U> implements ajfc<T, ajdt<T>> {
        private ajfc<? super T, ? extends ajdt<U>> a;

        c(ajfc<? super T, ? extends ajdt<U>> ajfc) {
            this.a = ajfc;
        }

        public final /* synthetic */ Object apply(Object obj) {
            return new ajqw((ajdt) ajfv.a(this.a.apply(obj), "The itemDelay returned a null ObservableSource"), 1).p(ajfu.b(obj)).c(obj);
        }
    }

    /* renamed from: ajpm$a */
    static final class a<U, R, T> implements ajfc<U, R> {
        private final ajex<? super T, ? super U, ? extends R> a;
        private final T b;

        a(ajex<? super T, ? super U, ? extends R> ajex, T t) {
            this.a = ajex;
            this.b = t;
        }

        public final R apply(U u) {
            return this.a.apply(this.b, u);
        }
    }

    /* renamed from: ajpm$b */
    static final class b<T, R, U> implements ajfc<T, ajdt<R>> {
        private final ajex<? super T, ? super U, ? extends R> a;
        private final ajfc<? super T, ? extends ajdt<? extends U>> b;

        b(ajex<? super T, ? super U, ? extends R> ajex, ajfc<? super T, ? extends ajdt<? extends U>> ajfc) {
            this.a = ajex;
            this.b = ajfc;
        }

        public final /* synthetic */ Object apply(Object obj) {
            return new ajpr((ajdt) ajfv.a(this.b.apply(obj), "The mapper returned a null ObservableSource"), new a(this.a, obj));
        }
    }

    public static <T, U> ajfc<T, ajdt<T>> a(ajfc<? super T, ? extends ajdt<U>> ajfc) {
        return new c(ajfc);
    }

    public static <T, U, R> ajfc<T, ajdt<R>> a(ajfc<? super T, ? extends ajdt<? extends U>> ajfc, ajex<? super T, ? super U, ? extends R> ajex) {
        return new b(ajex, ajfc);
    }
}
