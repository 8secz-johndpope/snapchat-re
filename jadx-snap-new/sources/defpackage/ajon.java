package defpackage;

/* renamed from: ajon */
public final class ajon<T> extends ajnp<T, T> {
    private ajev b;

    /* renamed from: ajon$a */
    static final class a<T> extends ajgh<T> implements ajdv<T> {
        private ajdv<? super T> a;
        private ajev b;
        private ajej c;
        private ajga<T> d;
        private boolean e;

        a(ajdv<? super T> ajdv, ajev ajev) {
            this.a = ajdv;
            this.b = ajev;
        }

        private void b() {
            if (compareAndSet(0, 1)) {
                try {
                    this.b.run();
                } catch (Throwable th) {
                    ajep.a(th);
                    ajvo.a(th);
                }
            }
        }

        public final int a(int i) {
            ajga ajga = this.d;
            if (ajga == null || (i & 4) != 0) {
                return 0;
            }
            i = ajga.a(i);
            if (i != 0) {
                boolean z = true;
                if (i != 1) {
                    z = false;
                }
                this.e = z;
            }
            return i;
        }

        public final void a() {
            this.a.a();
            b();
        }

        public final void a(ajej ajej) {
            if (ajfp.a(this.c, ajej)) {
                this.c = ajej;
                if (ajej instanceof ajga) {
                    this.d = (ajga) ajej;
                }
                this.a.a((ajej) this);
            }
        }

        public final void a(T t) {
            this.a.a((Object) t);
        }

        public final void a(Throwable th) {
            this.a.a(th);
            b();
        }

        public final void clear() {
            this.d.clear();
        }

        public final void dispose() {
            this.c.dispose();
            b();
        }

        public final boolean isDisposed() {
            return this.c.isDisposed();
        }

        public final boolean isEmpty() {
            return this.d.isEmpty();
        }

        public final T poll() {
            Object poll = this.d.poll();
            if (poll == null && this.e) {
                b();
            }
            return poll;
        }
    }

    public ajon(ajdt<T> ajdt, ajev ajev) {
        super(ajdt);
        this.b = ajev;
    }

    public final void a_(ajdv<? super T> ajdv) {
        this.a.a(new a(ajdv, this.b));
    }
}
