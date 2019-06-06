package defpackage;

/* renamed from: ajje */
public final class ajje<T> extends ajim<T, T> {
    private ajfb<? super T> c;

    /* renamed from: ajje$b */
    static final class b<T> extends ajts<T, T> {
        private ajfb<? super T> a;

        b(akux<? super T> akux, ajfb<? super T> ajfb) {
            super(akux);
            this.a = ajfb;
        }

        public final int a(int i) {
            return b(i);
        }

        public final void a(T t) {
            if (!this.e) {
                this.b.a((Object) t);
                if (this.f == 0) {
                    try {
                        this.a.accept(t);
                    } catch (Throwable th) {
                        b(th);
                    }
                }
            }
        }

        public final T poll() {
            Object poll = this.d.poll();
            if (poll != null) {
                this.a.accept(poll);
            }
            return poll;
        }
    }

    /* renamed from: ajje$a */
    static final class a<T> extends ajtr<T, T> {
        private ajfb<? super T> f;

        a(ajfw<? super T> ajfw, ajfb<? super T> ajfb) {
            super(ajfw);
            this.f = ajfb;
        }

        public final int a(int i) {
            return b(i);
        }

        public final void a(T t) {
            this.a.a((Object) t);
            if (this.e == 0) {
                try {
                    this.f.accept(t);
                } catch (Throwable th) {
                    b(th);
                }
            }
        }

        public final boolean b(T t) {
            boolean b = this.a.b(t);
            try {
                this.f.accept(t);
            } catch (Throwable th) {
                b(th);
            }
            return b;
        }

        public final T poll() {
            Object poll = this.c.poll();
            if (poll != null) {
                this.f.accept(poll);
            }
            return poll;
        }
    }

    public ajje(ajde<T> ajde, ajfb<? super T> ajfb) {
        super(ajde);
        this.c = ajfb;
    }

    public final void a_(akux<? super T> akux) {
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
