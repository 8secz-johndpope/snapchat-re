package defpackage;

import java.util.concurrent.Callable;

/* renamed from: rqy */
public final class rqy {

    /* renamed from: rqy$a */
    static final class a<V> implements Callable<T> {
        private /* synthetic */ ajwy a;

        a(ajwy ajwy) {
            this.a = ajwy;
        }

        public final U call() {
            return this.a.get();
        }
    }

    static final <T extends U, U> ajdx<U> a(ajwy<T> ajwy) {
        Object a = ajdx.c((Callable) new a(ajwy)).a();
        akcr.a(a, "Single.fromCallable { this.get() as U }.cache()");
        return a;
    }
}
