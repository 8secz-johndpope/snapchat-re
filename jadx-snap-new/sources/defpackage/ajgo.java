package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ajgo */
public final class ajgo<T> extends AtomicReference<ajej> implements ajdz<T>, ajej {
    private ajfb<? super T> a;
    private ajfb<? super Throwable> b;

    public ajgo(ajfb<? super T> ajfb, ajfb<? super Throwable> ajfb2) {
        this.a = ajfb;
        this.b = ajfb2;
    }

    public final void a(ajej ajej) {
        ajfp.b(this, ajej);
    }

    public final void a(Throwable th) {
        lazySet(ajfp.DISPOSED);
        try {
            this.b.accept(th);
        } catch (Throwable th2) {
            ajep.a(th2);
            ajvo.a(new ajeo(th, th2));
        }
    }

    public final void b_(T t) {
        lazySet(ajfp.DISPOSED);
        try {
            this.a.accept(t);
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
