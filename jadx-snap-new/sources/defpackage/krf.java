package defpackage;

import java.util.concurrent.Callable;

/* renamed from: krf */
public final class krf {

    /* renamed from: krf$b */
    static final class b extends akcs implements akbl<Throwable, ajxw> {
        public static final b a = new b();

        b() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((Throwable) obj, "it");
            return ajxw.a;
        }
    }

    /* renamed from: krf$a */
    static final class a extends akcs implements akbl<aajt, ajxw> {
        private /* synthetic */ dib a;

        a(dib dib) {
            this.a = dib;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            this.a.a((aajt) obj);
            return ajxw.a;
        }
    }

    public static final void a(dib dib, akbk<? extends aajt> akbk, ajdw ajdw, ajei ajei) {
        akcr.b(dib, "receiver$0");
        akcr.b(akbk, "createEvent");
        akcr.b(ajdw, "scheduler");
        akcr.b(ajei, "disposableContainer");
        Object b = ajdx.c((Callable) new krg(akbk)).a(ajdw).b(ajdw);
        akcr.a(b, "Single.fromCallable(crea…  .subscribeOn(scheduler)");
        kry.a(b, new a(dib), b.a, ajei);
    }
}
