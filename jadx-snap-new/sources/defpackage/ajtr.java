package defpackage;

/* renamed from: ajtr */
public abstract class ajtr<T, R> implements ajfw<T>, ajgc<R> {
    protected final ajfw<? super R> a;
    protected akuy b;
    protected ajgc<T> c;
    protected boolean d;
    protected int e;

    public ajtr(ajfw<? super R> ajfw) {
        this.a = ajfw;
    }

    public void a() {
        if (!this.d) {
            this.d = true;
            this.a.a();
        }
    }

    public final void a(long j) {
        this.b.a(j);
    }

    public final void a(akuy akuy) {
        if (ajui.a(this.b, akuy)) {
            this.b = akuy;
            if (akuy instanceof ajgc) {
                this.c = (ajgc) akuy;
            }
            this.a.a(this);
        }
    }

    public void a(Throwable th) {
        if (this.d) {
            ajvo.a(th);
            return;
        }
        this.d = true;
        this.a.a(th);
    }

    /* Access modifiers changed, original: protected|final */
    public final int b(int i) {
        ajgc ajgc = this.c;
        if (ajgc == null || (i & 4) != 0) {
            return 0;
        }
        i = ajgc.a(i);
        if (i != 0) {
            this.e = i;
        }
        return i;
    }

    public final void b() {
        this.b.b();
    }

    /* Access modifiers changed, original: protected|final */
    public final void b(Throwable th) {
        ajep.a(th);
        this.b.b();
        a(th);
    }

    public void clear() {
        this.c.clear();
    }

    public boolean isEmpty() {
        return this.c.isEmpty();
    }

    public final boolean offer(R r) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
