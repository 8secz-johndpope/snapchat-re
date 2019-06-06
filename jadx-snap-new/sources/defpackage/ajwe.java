package defpackage;

/* renamed from: ajwe */
public final class ajwe {
    public static final akbk<ajxw> a = a.a;
    private static final akbl<Object, ajxw> b = c.a;
    private static final akbl<Throwable, ajxw> c = b.a;

    /* renamed from: ajwe$c */
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

    /* renamed from: ajwe$b */
    static final class b extends akcs implements akbl<Throwable, ajxw> {
        public static final b a = new b();

        b() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            akcr.b(th, "it");
            ajvo.a((Throwable) new ajer(th));
            return ajxw.a;
        }
    }

    /* renamed from: ajwe$a */
    static final class a extends akcs implements akbk<ajxw> {
        public static final a a = new a();

        a() {
            super(0);
        }

        public final /* bridge */ /* synthetic */ Object invoke() {
            return ajxw.a;
        }
    }

    public static final ajej a(ajcx ajcx, akbl<? super Throwable, ajxw> akbl, akbk<ajxw> akbk) {
        akcr.b(ajcx, "$receiver");
        akcr.b(akbl, "onError");
        akcr.b(akbk, "onComplete");
        Object a = ajcx.a((ajev) new ajwf(akbk), (ajfb) new ajwg(akbl));
        akcr.a(a, "subscribe(onComplete, onError)");
        return a;
    }

    private static <T> ajej a(ajdj<T> ajdj, akbl<? super Throwable, ajxw> akbl, akbk<ajxw> akbk, akbl<? super T, ajxw> akbl2) {
        akcr.b(ajdj, "$receiver");
        akcr.b(akbl, "onError");
        akcr.b(akbk, "onComplete");
        akcr.b(akbl2, "onSuccess");
        Object a = ajdj.a((ajfb) new ajwg(akbl2), (ajfb) new ajwg(akbl), (ajev) new ajwf(akbk));
        akcr.a(a, "subscribe(onSuccess, onError, onComplete)");
        return a;
    }

    private static <T> ajej a(ajdp<T> ajdp, akbl<? super Throwable, ajxw> akbl, akbk<ajxw> akbk, akbl<? super T, ajxw> akbl2) {
        akcr.b(ajdp, "$receiver");
        akcr.b(akbl, "onError");
        akcr.b(akbk, "onComplete");
        akcr.b(akbl2, "onNext");
        Object a = ajdp.a((ajfb) new ajwg(akbl2), (ajfb) new ajwg(akbl), (ajev) new ajwf(akbk));
        akcr.a(a, "subscribe(onNext, onError, onComplete)");
        return a;
    }

    public static final <T> ajej a(ajdx<T> ajdx, akbl<? super Throwable, ajxw> akbl, akbl<? super T, ajxw> akbl2) {
        akcr.b(ajdx, "$receiver");
        akcr.b(akbl, "onError");
        akcr.b(akbl2, "onSuccess");
        Object a = ajdx.a((ajfb) new ajwg(akbl2), (ajfb) new ajwg(akbl));
        akcr.a(a, "subscribe(onSuccess, onError)");
        return a;
    }
}
