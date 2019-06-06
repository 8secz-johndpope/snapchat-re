package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: ajnt */
public final class ajnt<T> extends ajdp<T> {
    private ajva<? extends T> a;
    private int b = 1;
    private ajfb<? super ajej> c;
    private AtomicInteger d;

    public ajnt(ajva<? extends T> ajva, int i, ajfb<? super ajej> ajfb) {
        this.a = ajva;
        this.c = ajfb;
        this.d = new AtomicInteger();
    }

    public final void a_(ajdv<? super T> ajdv) {
        this.a.a((ajdv) ajdv);
        if (this.d.incrementAndGet() == this.b) {
            this.a.a(this.c);
        }
    }
}
