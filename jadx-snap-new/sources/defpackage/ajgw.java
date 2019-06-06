package defpackage;

/* renamed from: ajgw */
public abstract class ajgw<T, U, V> extends ajgy implements ajdv<T>, ajuv<U, V> {
    protected final ajdv<? super V> a;
    public final ajge<U> b;
    public volatile boolean c;
    protected volatile boolean d;
    protected Throwable e;

    public ajgw(ajdv<? super V> ajdv, ajge<U> ajge) {
        this.a = ajdv;
        this.b = ajge;
    }

    public final int a(int i) {
        return this.f.addAndGet(i);
    }

    public void a(ajdv<? super V> ajdv, U u) {
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(U u, ajej ajej) {
        ajdv ajdv = this.a;
        ajge ajge = this.b;
        if (this.f.get() == 0 && this.f.compareAndSet(0, 1)) {
            a(ajdv, (Object) u);
            if (a(-1) == 0) {
                return;
            }
        }
        ajge.offer(u);
        if (!d()) {
            return;
        }
        ajuz.a(ajge, ajdv, false, ajej, (ajuv) this);
    }

    public final void b(U u, ajej ajej) {
        ajdv ajdv = this.a;
        ajge ajge = this.b;
        if (this.f.get() != 0 || !this.f.compareAndSet(0, 1)) {
            ajge.offer(u);
            if (!d()) {
                return;
            }
        } else if (ajge.isEmpty()) {
            a(ajdv, (Object) u);
            if (a(-1) == 0) {
                return;
            }
        } else {
            ajge.offer(u);
        }
        ajuz.a(ajge, ajdv, false, ajej, (ajuv) this);
    }

    public final boolean b() {
        return this.c;
    }

    public final boolean c() {
        return this.d;
    }

    public final boolean d() {
        return this.f.getAndIncrement() == 0;
    }

    public final boolean e() {
        return this.f.get() == 0 && this.f.compareAndSet(0, 1);
    }

    public final Throwable f() {
        return this.e;
    }
}
