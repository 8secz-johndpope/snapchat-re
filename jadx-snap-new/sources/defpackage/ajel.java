package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ajel */
abstract class ajel<T> extends AtomicReference<T> implements ajej {
    ajel(T t) {
        super(ajfv.a((Object) t, "value is null"));
    }

    public abstract void a(T t);

    public final void dispose() {
        if (get() != null) {
            Object andSet = getAndSet(null);
            if (andSet != null) {
                a(andSet);
            }
        }
    }

    public final boolean isDisposed() {
        return get() == null;
    }
}
