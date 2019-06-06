package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ajgr */
public final class ajgr extends AtomicReference<ajej> implements ajcz, ajej {
    public final void a() {
        lazySet(ajfp.DISPOSED);
    }

    public final void a(ajej ajej) {
        ajfp.b(this, ajej);
    }

    public final void a(Throwable th) {
        lazySet(ajfp.DISPOSED);
        ajvo.a(new ajer(th));
    }

    public final void dispose() {
        ajfp.a((AtomicReference) this);
    }

    public final boolean isDisposed() {
        return get() == ajfp.DISPOSED;
    }
}
