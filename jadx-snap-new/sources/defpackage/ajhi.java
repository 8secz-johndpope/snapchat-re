package defpackage;

import java.util.concurrent.Callable;

/* renamed from: ajhi */
public final class ajhi extends ajcx {
    private Callable<? extends ajdb> a;

    public ajhi(Callable<? extends ajdb> callable) {
        this.a = callable;
    }

    public final void b(ajcz ajcz) {
        try {
            ((ajdb) ajfv.a(this.a.call(), "The completableSupplier returned a null CompletableSource")).a(ajcz);
        } catch (Throwable th) {
            ajep.a(th);
            ajfq.a(th, ajcz);
        }
    }
}
