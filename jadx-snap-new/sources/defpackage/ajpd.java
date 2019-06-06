package defpackage;

import java.util.concurrent.Callable;

/* renamed from: ajpd */
public final class ajpd<T> extends ajdp<T> implements Callable<T> {
    private Callable<? extends T> a;

    public ajpd(Callable<? extends T> callable) {
        this.a = callable;
    }

    public final void a_(ajdv<? super T> ajdv) {
        ajej ajgp = new ajgp(ajdv);
        ajdv.a(ajgp);
        if (!ajgp.isDisposed()) {
            ajdv ajdv2;
            try {
                ajdv2 = ajfv.a(this.a.call(), "Callable returned null");
                ajgp.b((Object) ajdv2);
            } catch (Throwable th) {
                ajep.a(th);
                if (ajgp.isDisposed()) {
                    ajvo.a(th);
                } else {
                    ajdv2.a(th);
                }
            }
        }
    }

    public final T call() {
        return ajfv.a(this.a.call(), "The callable returned a null value");
    }
}
