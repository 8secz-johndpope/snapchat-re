package defpackage;

/* renamed from: yit */
public final class yit {
    private static final akbl<Object, ajxw> a = c.a;
    private static final akbk<ajxw> b = a.a;
    private static final akbl<Throwable, ajxw> c = b.a;

    /* renamed from: yit$c */
    static final class c extends akcs implements akbl<Object, ajxw> {
        public static final c a = new c();

        c() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b(obj, "it");
            return ajxw.a;
        }
    }

    /* renamed from: yit$a */
    static final class a extends akcs implements akbk<ajxw> {
        public static final a a = new a();

        a() {
            super(0);
        }

        public final /* bridge */ /* synthetic */ Object invoke() {
            return ajxw.a;
        }
    }

    /* renamed from: yit$b */
    static final class b extends akcs implements akbl<Throwable, ajxw> {
        public static final b a = new b();

        b() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((Throwable) obj, "throwable");
            return ajxw.a;
        }
    }

    public static final ajej a(ajcx ajcx, akbl<? super Throwable, ajxw> akbl, akbk<ajxw> akbk) {
        akcr.b(ajcx, "receiver$0");
        akcr.b(akbl, "onError");
        akcr.b(akbk, "onComplete");
        Object a = ajcx.a((ajev) new yiu(akbk), (ajfb) new yiv(akbl));
        akcr.a(a, "subscribe(onComplete, onError)");
        return a;
    }

    private static <T> ajej a(ajdp<T> ajdp, akbl<? super Throwable, ajxw> akbl, akbk<ajxw> akbk, akbl<? super T, ajxw> akbl2) {
        akcr.b(ajdp, "receiver$0");
        akcr.b(akbl, "onError");
        akcr.b(akbk, "onComplete");
        akcr.b(akbl2, "onNext");
        Object a = ajdp.a((ajfb) new yiv(akbl2), (ajfb) new yiv(akbl), (ajev) new yiu(akbk));
        akcr.a(a, "subscribe(onNext, onError, onComplete)");
        return a;
    }

    public static /* synthetic */ ajej a(ajdp ajdp, akbl akbl, akbk akbk, akbl akbl2, int i) {
        if ((i & 1) != 0) {
            akbl = c;
        }
        if ((i & 2) != 0) {
            akbk = b;
        }
        if ((i & 4) != 0) {
            akbl2 = a;
        }
        return yit.a(ajdp, akbl, akbk, akbl2);
    }

    public static final <T> ajej a(ajdx<T> ajdx, akbl<? super Throwable, ajxw> akbl, akbl<? super T, ajxw> akbl2) {
        akcr.b(ajdx, "receiver$0");
        akcr.b(akbl, "onError");
        akcr.b(akbl2, "onSuccess");
        Object a = ajdx.a((ajfb) new yiv(akbl2), (ajfb) new yiv(akbl));
        akcr.a(a, "subscribe(onSuccess, onError)");
        return a;
    }
}
