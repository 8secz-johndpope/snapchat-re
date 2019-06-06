package defpackage;

/* renamed from: ajkc */
public final class ajkc<T, U> extends ajim<T, U> {
    private ajfc<? super T, ? extends U> c;

    /* renamed from: ajkc$b */
    static final class b<T, U> extends ajts<T, U> {
        private ajfc<? super T, ? extends U> a;

        b(akux<? super U> akux, ajfc<? super T, ? extends U> ajfc) {
            super(akux);
            this.a = ajfc;
        }

        public final int a(int i) {
            return b(i);
        }

        public final void a(T t) {
            if (!this.e) {
                if (this.f != 0) {
                    this.b.a(null);
                    return;
                }
                try {
                    this.b.a(ajfv.a(this.a.apply(t), "The mapper function returned a null value."));
                } catch (Throwable th) {
                    b(th);
                }
            }
        }

        public final U poll() {
            Object poll = this.d.poll();
            return poll != null ? ajfv.a(this.a.apply(poll), "The mapper function returned a null value.") : null;
        }
    }

    /* renamed from: ajkc$a */
    static final class a<T, U> extends ajtr<T, U> {
        private ajfc<? super T, ? extends U> f;

        a(ajfw<? super U> ajfw, ajfc<? super T, ? extends U> ajfc) {
            super(ajfw);
            this.f = ajfc;
        }

        public final int a(int i) {
            return b(i);
        }

        public final void a(T t) {
            if (!this.d) {
                if (this.e != 0) {
                    this.a.a(null);
                    return;
                }
                try {
                    this.a.a(ajfv.a(this.f.apply(t), "The mapper function returned a null value."));
                } catch (Throwable th) {
                    b(th);
                }
            }
        }

        public final boolean b(T t) {
            if (this.d) {
                return false;
            }
            try {
                return this.a.b(ajfv.a(this.f.apply(t), "The mapper function returned a null value."));
            } catch (Throwable th) {
                b(th);
                return true;
            }
        }

        public final U poll() {
            Object poll = this.c.poll();
            return poll != null ? ajfv.a(this.f.apply(poll), "The mapper function returned a null value.") : null;
        }
    }

    public ajkc(ajde<T> ajde, ajfc<? super T, ? extends U> ajfc) {
        super(ajde);
        this.c = ajfc;
    }

    public final void a_(akux<? super U> akux) {
        ajde ajde;
        ajdh aVar;
        if (akux instanceof ajfw) {
            ajde = this.b;
            aVar = new a((ajfw) akux, this.c);
        } else {
            ajde = this.b;
            aVar = new b(akux, this.c);
        }
        ajde.a(aVar);
    }
}
