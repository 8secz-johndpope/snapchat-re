package defpackage;

import java.util.concurrent.Callable;

/* renamed from: ajsb */
public final class ajsb<T> extends ajdx<T> {
    private Callable<? extends Throwable> a;

    public ajsb(Callable<? extends Throwable> callable) {
        this.a = callable;
    }

    public final void b(ajdz<? super T> ajdz) {
        Throwable th;
        try {
            th = (Throwable) ajfv.a(this.a.call(), "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
        } catch (Throwable th2) {
            th = th2;
            ajep.a(th);
        }
        ajfq.a(th, (ajdz) ajdz);
    }
}
