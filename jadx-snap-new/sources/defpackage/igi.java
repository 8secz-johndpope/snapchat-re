package defpackage;

/* renamed from: igi */
public final class igi<T> {
    T a;
    private final ajxe b;
    private final ajxe c;

    /* renamed from: igi$b */
    static final class b extends akcs implements akbk<T> {
        private /* synthetic */ igi a;
        private /* synthetic */ Object b;

        b(igi igi, Object obj) {
            this.a = igi;
            this.b = obj;
            super(0);
        }

        public final T invoke() {
            this.a.b().dispose();
            Object obj = this.a.a;
            return obj == null ? this.b : obj;
        }
    }

    /* renamed from: igi$a */
    static final class a extends akcs implements akbk<ajej> {
        final /* synthetic */ igi a;
        private /* synthetic */ ajdp b;
        private /* synthetic */ akbl c;

        /* renamed from: igi$a$1 */
        static final class 1<T> implements ajfb<T> {
            private /* synthetic */ a a;

            1(a aVar) {
                this.a = aVar;
            }

            public final void accept(T t) {
                this.a.a.a = t;
            }
        }

        a(igi igi, ajdp ajdp, akbl akbl) {
            this.a = igi;
            this.b = ajdp;
            this.c = akbl;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            ajdp ajdp = this.b;
            ajfb 1 = new 1(this);
            akbl akbl = this.c;
            if (akbl != null) {
                akbl = new igj(akbl);
            }
            return ajdp.a(1, (ajfb) akbl);
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(igi.class), "value", "getValue()Ljava/lang/Object;"), new akdc(akde.a(igi.class), "disposable", "getDisposable()Lio/reactivex/disposables/Disposable;")};
    }

    public igi(T t, ajdp<T> ajdp, akbl<? super Throwable, ajxw> akbl) {
        akcr.b(ajdp, "valueStream");
        akcr.b(akbl, "doOnError");
        this.b = ajxh.a(new b(this, t));
        this.c = ajxh.a(new a(this, ajdp, akbl));
    }

    public final T a() {
        return this.b.b();
    }

    public final ajej b() {
        return (ajej) this.c.b();
    }
}
