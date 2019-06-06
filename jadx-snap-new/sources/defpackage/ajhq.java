package defpackage;

import java.util.concurrent.Callable;

/* renamed from: ajhq */
public final class ajhq extends ajcx {
    private Callable<?> a;

    public ajhq(Callable<?> callable) {
        this.a = callable;
    }

    public final void b(ajcz ajcz) {
        ajej a = ajek.a(ajfu.b);
        ajcz.a(a);
        try {
            this.a.call();
            if (!a.isDisposed()) {
                ajcz.a();
            }
        } catch (Throwable th) {
            ajep.a(th);
            if (a.isDisposed()) {
                ajvo.a(th);
            } else {
                ajcz.a(th);
            }
        }
    }
}
