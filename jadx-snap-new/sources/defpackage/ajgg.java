package defpackage;

/* renamed from: ajgg */
public abstract class ajgg<T, R> implements ajdv<T>, ajga<R> {
    private ajej a;
    protected final ajdv<? super R> b;
    protected ajga<T> c;
    protected boolean d;
    protected int e;

    public ajgg(ajdv<? super R> ajdv) {
        this.b = ajdv;
    }

    public void a() {
        if (!this.d) {
            this.d = true;
            this.b.a();
        }
    }

    public final void a(ajej ajej) {
        if (ajfp.a(this.a, ajej)) {
            this.a = ajej;
            if (ajej instanceof ajga) {
                this.c = (ajga) ajej;
            }
            this.b.a((ajej) this);
        }
    }

    public void a(Throwable th) {
        if (this.d) {
            ajvo.a(th);
            return;
        }
        this.d = true;
        this.b.a(th);
    }

    /* Access modifiers changed, original: protected|final */
    public final int b(int i) {
        ajga ajga = this.c;
        if (ajga == null || (i & 4) != 0) {
            return 0;
        }
        i = ajga.a(i);
        if (i != 0) {
            this.e = i;
        }
        return i;
    }

    /* Access modifiers changed, original: protected|final */
    public final void b(Throwable th) {
        ajep.a(th);
        this.a.dispose();
        a(th);
    }

    public void clear() {
        this.c.clear();
    }

    public void dispose() {
        this.a.dispose();
    }

    public boolean isDisposed() {
        return this.a.isDisposed();
    }

    public boolean isEmpty() {
        return this.c.isEmpty();
    }

    public final boolean offer(R r) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
