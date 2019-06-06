package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ajvf */
public abstract class ajvf<T> implements ajdv<T>, ajej {
    private AtomicReference<ajej> a = new AtomicReference();

    public final void a(ajej ajej) {
        if (ajup.a(this.a, ajej, getClass())) {
            b();
        }
    }

    /* Access modifiers changed, original: protected */
    public void b() {
    }

    public final void dispose() {
        ajfp.a(this.a);
    }

    public final boolean isDisposed() {
        return this.a.get() == ajfp.DISPOSED;
    }
}
