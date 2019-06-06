package defpackage;

import java.util.concurrent.Callable;

/* renamed from: epl */
public final class epl {
    public static final <T> ajdp<T> a(ajdp<T> ajdp, Callable<T> callable) {
        akcr.b(ajdp, "receiver$0");
        akcr.b(callable, "callable");
        Object h = ajdp.h((ajdt) ajdj.b((Callable) callable).g());
        akcr.a(h, "this.startWith(Maybe.fro…callable).toObservable())");
        return h;
    }
}
