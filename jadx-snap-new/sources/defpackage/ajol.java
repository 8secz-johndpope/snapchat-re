package defpackage;

/* renamed from: ajol */
public final class ajol<T, K> extends ajnp<T, T> {
    private ajfc<? super T, K> b;
    private ajey<? super K, ? super K> c;

    /* renamed from: ajol$a */
    static final class a<T, K> extends ajgg<T, T> {
        private ajfc<? super T, K> a;
        private ajey<? super K, ? super K> f;
        private K g;
        private boolean h;

        a(ajdv<? super T> ajdv, ajfc<? super T, K> ajfc, ajey<? super K, ? super K> ajey) {
            super(ajdv);
            this.a = ajfc;
            this.f = ajey;
        }

        public final int a(int i) {
            return b(i);
        }

        public final void a(T t) {
            if (!this.d) {
                if (this.e == 0) {
                    try {
                        Object apply = this.a.apply(t);
                        if (this.h) {
                            boolean test = this.f.test(this.g, apply);
                            this.g = apply;
                            if (test) {
                                return;
                            }
                        }
                        this.h = true;
                        this.g = apply;
                    } catch (Throwable th) {
                        b(th);
                        return;
                    }
                }
                this.b.a((Object) t);
            }
        }

        public final T poll() {
            while (true) {
                Object poll = this.c.poll();
                if (poll == null) {
                    return null;
                }
                Object apply = this.a.apply(poll);
                if (!this.h) {
                    this.h = true;
                    this.g = apply;
                    return poll;
                } else if (this.f.test(this.g, apply)) {
                    this.g = apply;
                } else {
                    this.g = apply;
                    return poll;
                }
            }
        }
    }

    public ajol(ajdt<T> ajdt, ajfc<? super T, K> ajfc, ajey<? super K, ? super K> ajey) {
        super(ajdt);
        this.b = ajfc;
        this.c = ajey;
    }

    public final void a_(ajdv<? super T> ajdv) {
        this.a.a(new a(ajdv, this.b, this.c));
    }
}
