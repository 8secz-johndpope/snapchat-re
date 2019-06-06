package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ajgj */
public final class ajgj<T> extends AtomicReference<ajej> implements ajdz<T>, ajej {
    private ajew<? super T, ? super Throwable> a;

    public ajgj(ajew<? super T, ? super Throwable> ajew) {
        this.a = ajew;
    }

    public final void a(ajej ajej) {
        ajfp.b(this, ajej);
    }

    public final void a(Throwable th) {
        try {
            lazySet(ajfp.DISPOSED);
            this.a.accept(null, th);
        } catch (Throwable th2) {
            ajep.a(th2);
            ajvo.a(new ajeo(th, th2));
        }
    }

    public final void b_(T t) {
        try {
            lazySet(ajfp.DISPOSED);
            this.a.accept(t, null);
        } catch (Throwable th) {
            ajep.a(th);
            ajvo.a(th);
        }
    }

    public final void dispose() {
        ajfp.a((AtomicReference) this);
    }

    public final boolean isDisposed() {
        return get() == ajfp.DISPOSED;
    }
}
