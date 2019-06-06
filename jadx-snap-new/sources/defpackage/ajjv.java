package defpackage;

import java.util.concurrent.Callable;

/* renamed from: ajjv */
public final class ajjv<T> extends ajde<T> implements Callable<T> {
    private Callable<? extends T> b;

    public ajjv(Callable<? extends T> callable) {
        this.b = callable;
    }

    public final void a_(akux<? super T> akux) {
        akuy ajue = new ajue(akux);
        akux.a(ajue);
        akux akux2;
        try {
            akux2 = ajfv.a(this.b.call(), "The callable returned a null value");
            ajue.b(akux2);
        } catch (Throwable th) {
            ajep.a(th);
            if ((ajue.get() == 4 ? 1 : null) != null) {
                ajvo.a(th);
            } else {
                akux2.a(th);
            }
        }
    }

    public final T call() {
        return ajfv.a(this.b.call(), "The callable returned a null value");
    }
}
