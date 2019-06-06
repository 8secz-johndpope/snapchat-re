package defpackage;

import java.util.concurrent.Callable;

/* renamed from: ajrq */
public final class ajrq<T> extends ajdx<T> {
    private Callable<? extends ajeb<? extends T>> a;

    public ajrq(Callable<? extends ajeb<? extends T>> callable) {
        this.a = callable;
    }

    public final void b(ajdz<? super T> ajdz) {
        try {
            ((ajeb) ajfv.a(this.a.call(), "The singleSupplier returned a null SingleSource")).a(ajdz);
        } catch (Throwable th) {
            ajep.a(th);
            ajfq.a(th, (ajdz) ajdz);
        }
    }
}
