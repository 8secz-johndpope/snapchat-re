package defpackage;

import java.util.concurrent.Callable;

/* renamed from: ajsh */
public final class ajsh<T> extends ajdx<T> {
    private Callable<? extends T> a;

    public ajsh(Callable<? extends T> callable) {
        this.a = callable;
    }

    public final void b(ajdz<? super T> ajdz) {
        ajej a = ajek.a(ajfu.b);
        ajdz.a(a);
        if (!a.isDisposed()) {
            try {
                Object a2 = ajfv.a(this.a.call(), "The callable returned a null value");
                if (!a.isDisposed()) {
                    ajdz.b_(a2);
                }
            } catch (Throwable th) {
                ajep.a(th);
                if (a.isDisposed()) {
                    ajvo.a(th);
                } else {
                    ajdz.a(th);
                }
            }
        }
    }
}
