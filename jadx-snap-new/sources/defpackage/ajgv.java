package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ajgv */
public final class ajgv<T> extends AtomicReference<ajej> implements ajdv<T>, ajej {
    private ajfb<? super T> a;
    private ajfb<? super Throwable> b;
    private ajev c;
    private ajfb<? super ajej> d;

    public ajgv(ajfb<? super T> ajfb, ajfb<? super Throwable> ajfb2, ajev ajev, ajfb<? super ajej> ajfb3) {
        this.a = ajfb;
        this.b = ajfb2;
        this.c = ajev;
        this.d = ajfb3;
    }

    public final void a() {
        if (!isDisposed()) {
            lazySet(ajfp.DISPOSED);
            try {
                this.c.run();
            } catch (Throwable th) {
                ajep.a(th);
                ajvo.a(th);
            }
        }
    }

    public final void a(ajej ajej) {
        if (ajfp.b(this, ajej)) {
            try {
                this.d.accept(this);
            } catch (Throwable th) {
                ajep.a(th);
                ajej.dispose();
                a(th);
            }
        }
    }

    public final void a(T t) {
        if (!isDisposed()) {
            try {
                this.a.accept(t);
            } catch (Throwable th) {
                ajep.a(th);
                ((ajej) get()).dispose();
                a(th);
            }
        }
    }

    public final void a(Throwable th) {
        if (isDisposed()) {
            ajvo.a(th);
            return;
        }
        lazySet(ajfp.DISPOSED);
        try {
            this.b.accept(th);
        } catch (Throwable th2) {
            ajep.a(th2);
            ajvo.a(new ajeo(th, th2));
        }
    }

    public final void dispose() {
        ajfp.a((AtomicReference) this);
    }

    public final boolean isDisposed() {
        return get() == ajfp.DISPOSED;
    }
}
