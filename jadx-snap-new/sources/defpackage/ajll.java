package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ajll */
public final class ajll<T> extends AtomicReference<ajej> implements ajdl<T>, ajej {
    private ajfb<? super T> a;
    private ajfb<? super Throwable> b;
    private ajev c;

    public ajll(ajfb<? super T> ajfb, ajfb<? super Throwable> ajfb2, ajev ajev) {
        this.a = ajfb;
        this.b = ajfb2;
        this.c = ajev;
    }

    public final void a() {
        lazySet(ajfp.DISPOSED);
        try {
            this.c.run();
        } catch (Throwable th) {
            ajep.a(th);
            ajvo.a(th);
        }
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
        return ajfp.a((ajej) get());
    }
}
