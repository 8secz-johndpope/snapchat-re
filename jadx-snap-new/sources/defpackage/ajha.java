package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ajha */
public final class ajha<T> implements ajdz<T> {
    private AtomicReference<ajej> a;
    private ajdz<? super T> b;

    public ajha(AtomicReference<ajej> atomicReference, ajdz<? super T> ajdz) {
        this.a = atomicReference;
        this.b = ajdz;
    }

    public final void a(ajej ajej) {
        ajfp.c(this.a, ajej);
    }

    public final void a(Throwable th) {
        this.b.a(th);
    }

    public final void b_(T t) {
        this.b.b_(t);
    }
}
