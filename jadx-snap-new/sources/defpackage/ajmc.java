package defpackage;

import java.util.concurrent.Callable;

/* renamed from: ajmc */
public final class ajmc<T> extends ajdj<T> implements Callable<T> {
    private Callable<? extends T> a;

    public ajmc(Callable<? extends T> callable) {
        this.a = callable;
    }

    public final void a(ajdl<? super T> ajdl) {
        ajej a = ajek.a(ajfu.b);
        ajdl.a(a);
        if (!a.isDisposed()) {
            try {
                Object call = this.a.call();
                if (!a.isDisposed()) {
                    if (call == null) {
                        ajdl.a();
                        return;
                    }
                    ajdl.b_(call);
                }
            } catch (Throwable th) {
                ajep.a(th);
                if (a.isDisposed()) {
                    ajvo.a(th);
                } else {
                    ajdl.a(th);
                }
            }
        }
    }

    public final T call() {
        return this.a.call();
    }
}
