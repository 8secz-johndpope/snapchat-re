package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ajen */
public final class ajen implements ajej {
    private AtomicReference<ajej> a;

    public ajen() {
        this.a = new AtomicReference();
    }

    public ajen(ajej ajej) {
        this.a = new AtomicReference(ajej);
    }

    public final boolean a(ajej ajej) {
        return ajfp.a(this.a, ajej);
    }

    public final void dispose() {
        ajfp.a(this.a);
    }

    public final boolean isDisposed() {
        return ajfp.a((ajej) this.a.get());
    }
}
