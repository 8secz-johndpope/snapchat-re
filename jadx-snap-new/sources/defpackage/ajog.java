package defpackage;

import java.util.concurrent.Callable;

/* renamed from: ajog */
public final class ajog<T> extends ajdp<T> {
    private Callable<? extends ajdt<? extends T>> a;

    public ajog(Callable<? extends ajdt<? extends T>> callable) {
        this.a = callable;
    }

    public final void a_(ajdv<? super T> ajdv) {
        try {
            ((ajdt) ajfv.a(this.a.call(), "null ObservableSource supplied")).a(ajdv);
        } catch (Throwable th) {
            ajep.a(th);
            ajfq.a(th, (ajdv) ajdv);
        }
    }
}
