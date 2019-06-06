package defpackage;

/* renamed from: ajov */
public final class ajov<T> extends ajnp<T, T> {
    private ajfl<? super T> b;

    /* renamed from: ajov$a */
    static final class a<T> extends ajgg<T, T> {
        private ajfl<? super T> a;

        a(ajdv<? super T> ajdv, ajfl<? super T> ajfl) {
            super(ajdv);
            this.a = ajfl;
        }

        public final int a(int i) {
            return b(i);
        }

        public final void a(T t) {
            if (this.e == 0) {
                try {
                    if (this.a.test(t)) {
                        this.b.a((Object) t);
                    }
                    return;
                } catch (Throwable th) {
                    b(th);
                    return;
                }
            }
            this.b.a(null);
        }

        public final T poll() {
            Object poll;
            do {
                poll = this.c.poll();
                if (poll == null) {
                    break;
                }
            } while (!this.a.test(poll));
            return poll;
        }
    }

    public ajov(ajdt<T> ajdt, ajfl<? super T> ajfl) {
        super(ajdt);
        this.b = ajfl;
    }

    public final void a_(ajdv<? super T> ajdv) {
        this.a.a(new a(ajdv, this.b));
    }
}
