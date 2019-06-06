package defpackage;

/* renamed from: ajhb */
public final class ajhb<T> implements ajcz, akuy {
    private akux<? super T> a;
    private ajej b;

    public ajhb(akux<? super T> akux) {
        this.a = akux;
    }

    public final void a() {
        this.a.a();
    }

    public final void a(long j) {
    }

    public final void a(ajej ajej) {
        if (ajfp.a(this.b, ajej)) {
            this.b = ajej;
            this.a.a((akuy) this);
        }
    }

    public final void a(Throwable th) {
        this.a.a(th);
    }

    public final void b() {
        this.b.dispose();
    }
}
