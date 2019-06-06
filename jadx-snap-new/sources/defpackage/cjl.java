package defpackage;

/* renamed from: cjl */
public final class cjl {

    /* renamed from: cjl$b */
    static final class b implements ajev {
        private /* synthetic */ cjo a;

        b(cjo cjo) {
            this.a = cjo;
        }

        public final void run() {
            this.a.a();
        }
    }

    /* renamed from: cjl$a */
    static final class a implements ajev {
        private /* synthetic */ cjo a;

        a(cjo cjo) {
            this.a = cjo;
        }

        public final void run() {
            this.a.a();
        }
    }

    /* renamed from: cjl$c */
    static final class c implements ajev {
        private /* synthetic */ cjo a;

        c(cjo cjo) {
            this.a = cjo;
        }

        public final void run() {
            this.a.a();
        }
    }

    public static final void a(ajcx ajcx, akbk<ajxw> akbk, akbl<? super Throwable, ajxw> akbl, cjo cjo) {
        akcr.b(ajcx, "receiver$0");
        akcr.b(akbk, "onSuccess");
        akcr.b(akbl, "onError");
        akcr.b(cjo, "adDisposableManagerApi");
        Object a = ajcx.f(new a(cjo)).a((ajev) new cjm(akbk), (ajfb) new cjn(akbl));
        akcr.a(a, "this.doFinally { adDispo…cribe(onSuccess, onError)");
        cjo.a(a);
    }

    public static final <T> void a(ajdp<T> ajdp, akbl<? super T, ajxw> akbl, akbl<? super Throwable, ajxw> akbl2, cjo cjo) {
        akcr.b(ajdp, "receiver$0");
        akcr.b(akbl, "onSuccess");
        akcr.b(akbl2, "onError");
        akcr.b(cjo, "adDisposableManagerApi");
        Object a = ajdp.a((ajev) new c(cjo)).a((ajfb) new cjn(akbl), (ajfb) new cjn(akbl2));
        akcr.a(a, "this.doFinally { adDispo…cribe(onSuccess, onError)");
        cjo.a(a);
    }

    public static final <T> void a(ajdx<T> ajdx, akbl<? super T, ajxw> akbl, akbl<? super Throwable, ajxw> akbl2, cjo cjo) {
        akcr.b(ajdx, "receiver$0");
        akcr.b(akbl, "onSuccess");
        akcr.b(akbl2, "onError");
        akcr.b(cjo, "adDisposableManagerApi");
        Object a = ajdx.b((ajev) new b(cjo)).a((ajfb) new cjn(akbl), (ajfb) new cjn(akbl2));
        akcr.a(a, "this.doFinally { adDispo…cribe(onSuccess, onError)");
        cjo.a(a);
    }
}
