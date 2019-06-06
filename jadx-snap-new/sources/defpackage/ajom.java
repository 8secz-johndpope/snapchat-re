package defpackage;

/* renamed from: ajom */
public final class ajom<T> extends ajnp<T, T> {
    private ajfb<? super T> b;

    /* renamed from: ajom$a */
    static final class a<T> extends ajgg<T, T> {
        private ajfb<? super T> a;

        a(ajdv<? super T> ajdv, ajfb<? super T> ajfb) {
            super(ajdv);
            this.a = ajfb;
        }

        public final int a(int i) {
            return b(i);
        }

        public final void a(T t) {
            this.b.a((Object) t);
            if (this.e == 0) {
                try {
                    this.a.accept(t);
                } catch (Throwable th) {
                    b(th);
                }
            }
        }

        public final T poll() {
            Object poll = this.c.poll();
            if (poll != null) {
                this.a.accept(poll);
            }
            return poll;
        }
    }

    public ajom(ajdt<T> ajdt, ajfb<? super T> ajfb) {
        super(ajdt);
        this.b = ajfb;
    }

    public final void a_(ajdv<? super T> ajdv) {
        this.a.a(new a(ajdv, this.b));
    }
}
