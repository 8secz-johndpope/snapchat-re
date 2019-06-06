package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ajvg */
public abstract class ajvg<T> implements ajdz<T>, ajej {
    private AtomicReference<ajej> a = new AtomicReference();

    /* Access modifiers changed, original: protected */
    public void a() {
    }

    public final void a(ajej ajej) {
        if (ajup.a(this.a, ajej, getClass())) {
            a();
        }
    }

    public final void dispose() {
        ajfp.a(this.a);
    }

    public final boolean isDisposed() {
        return this.a.get() == ajfp.DISPOSED;
    }
}
