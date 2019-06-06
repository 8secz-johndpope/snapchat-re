package defpackage;

/* renamed from: ajts */
public abstract class ajts<T, R> implements ajdh<T>, ajgc<R> {
    protected final akux<? super R> b;
    protected akuy c;
    protected ajgc<T> d;
    protected boolean e;
    protected int f;

    public ajts(akux<? super R> akux) {
        this.b = akux;
    }

    public void a() {
        if (!this.e) {
            this.e = true;
            this.b.a();
        }
    }

    public final void a(long j) {
        this.c.a(j);
    }

    public final void a(akuy akuy) {
        if (ajui.a(this.c, akuy)) {
            this.c = akuy;
            if (akuy instanceof ajgc) {
                this.d = (ajgc) akuy;
            }
            this.b.a((akuy) this);
        }
    }

    public void a(Throwable th) {
        if (this.e) {
            ajvo.a(th);
            return;
        }
        this.e = true;
        this.b.a(th);
    }

    /* Access modifiers changed, original: protected|final */
    public final int b(int i) {
        ajgc ajgc = this.d;
        if (ajgc == null || (i & 4) != 0) {
            return 0;
        }
        i = ajgc.a(i);
        if (i != 0) {
            this.f = i;
        }
        return i;
    }

    public final void b() {
        this.c.b();
    }

    /* Access modifiers changed, original: protected|final */
    public final void b(Throwable th) {
        ajep.a(th);
        this.c.b();
        a(th);
    }

    public void clear() {
        this.d.clear();
    }

    public boolean isEmpty() {
        return this.d.isEmpty();
    }

    public final boolean offer(R r) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
