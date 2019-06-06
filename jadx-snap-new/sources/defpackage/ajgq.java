package defpackage;

/* renamed from: ajgq */
public final class ajgq<T> implements ajdv<T>, ajej {
    private ajdv<? super T> a;
    private ajfb<? super ajej> b;
    private ajev c;
    private ajej d;

    public ajgq(ajdv<? super T> ajdv, ajfb<? super ajej> ajfb, ajev ajev) {
        this.a = ajdv;
        this.b = ajfb;
        this.c = ajev;
    }

    public final void a() {
        if (this.d != ajfp.DISPOSED) {
            this.d = ajfp.DISPOSED;
            this.a.a();
        }
    }

    public final void a(ajej ajej) {
        try {
            this.b.accept(ajej);
            if (ajfp.a(this.d, ajej)) {
                this.d = ajej;
                this.a.a((ajej) this);
            }
        } catch (Throwable th) {
            ajep.a(th);
            ajej.dispose();
            this.d = ajfp.DISPOSED;
            ajfq.a(th, this.a);
        }
    }

    public final void a(T t) {
        this.a.a((Object) t);
    }

    public final void a(Throwable th) {
        if (this.d != ajfp.DISPOSED) {
            this.d = ajfp.DISPOSED;
            this.a.a(th);
            return;
        }
        ajvo.a(th);
    }

    public final void dispose() {
        ajej ajej = this.d;
        if (ajej != ajfp.DISPOSED) {
            this.d = ajfp.DISPOSED;
            try {
                this.c.run();
            } catch (Throwable th) {
                ajep.a(th);
                ajvo.a(th);
            }
            ajej.dispose();
        }
    }

    public final boolean isDisposed() {
        return this.d.isDisposed();
    }
}
