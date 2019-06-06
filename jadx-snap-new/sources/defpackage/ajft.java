package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ajft */
public final class ajft extends AtomicReference<ajej> implements ajej {
    public ajft(ajej ajej) {
        lazySet(ajej);
    }

    public final void dispose() {
        ajfp.a((AtomicReference) this);
    }

    public final boolean isDisposed() {
        return ajfp.a((ajej) get());
    }
}
