package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ajgn */
public final class ajgn extends AtomicReference<ajej> implements ajcz, ajej, ajfb<Throwable> {
    private ajfb<? super Throwable> a;
    private ajev b;

    public ajgn(ajev ajev) {
        this.a = this;
        this.b = ajev;
    }

    public ajgn(ajfb<? super Throwable> ajfb, ajev ajev) {
        this.a = ajfb;
        this.b = ajev;
    }

    public final void a() {
        try {
            this.b.run();
        } catch (Throwable th) {
            ajep.a(th);
            ajvo.a(th);
        }
        lazySet(ajfp.DISPOSED);
    }

    public final void a(ajej ajej) {
        ajfp.b(this, ajej);
    }

    public final void a(Throwable th) {
        try {
            this.a.accept(th);
        } catch (Throwable th2) {
            ajep.a(th2);
            ajvo.a(th2);
        }
        lazySet(ajfp.DISPOSED);
    }

    public final /* synthetic */ void accept(Object obj) {
        ajvo.a(new ajer((Throwable) obj));
    }

    public final void dispose() {
        ajfp.a((AtomicReference) this);
    }

    public final boolean isDisposed() {
        return get() == ajfp.DISPOSED;
    }
}
