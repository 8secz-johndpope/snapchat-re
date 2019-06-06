package defpackage;

/* renamed from: ajjn */
public final class ajjn<T> extends ajim<T, T> {
    private ajfl<? super T> c;

    /* renamed from: ajjn$b */
    static final class b<T> extends ajts<T, T> implements ajfw<T> {
        private ajfl<? super T> a;

        b(akux<? super T> akux, ajfl<? super T> ajfl) {
            super(akux);
            this.a = ajfl;
        }

        public final int a(int i) {
            return b(i);
        }

        public final void a(T t) {
            if (!b(t)) {
                this.c.a(1);
            }
        }

        public final boolean b(T t) {
            if (this.e) {
                return false;
            }
            if (this.f != 0) {
                this.b.a(null);
                return true;
            }
            try {
                boolean test = this.a.test(t);
                if (test) {
                    this.b.a((Object) t);
                }
                return test;
            } catch (Throwable th) {
                b(th);
                return true;
            }
        }

        public final T poll() {
            ajgc ajgc = this.d;
            ajfl ajfl = this.a;
            while (true) {
                Object poll = ajgc.poll();
                if (poll == null) {
                    return null;
                }
                if (ajfl.test(poll)) {
                    return poll;
                }
                if (this.f == 2) {
                    ajgc.a(1);
                }
            }
        }
    }

    /* renamed from: ajjn$a */
    static final class a<T> extends ajtr<T, T> {
        private ajfl<? super T> f;

        a(ajfw<? super T> ajfw, ajfl<? super T> ajfl) {
            super(ajfw);
            this.f = ajfl;
        }

        public final int a(int i) {
            return b(i);
        }

        public final void a(T t) {
            if (!b(t)) {
                this.b.a(1);
            }
        }

        public final boolean b(T t) {
            if (this.d) {
                return false;
            }
            if (this.e != 0) {
                return this.a.b(null);
            }
            try {
                return this.f.test(t) && this.a.b(t);
            } catch (Throwable th) {
                b(th);
                return true;
            }
        }

        public final T poll() {
            ajgc ajgc = this.c;
            ajfl ajfl = this.f;
            while (true) {
                Object poll = ajgc.poll();
                if (poll == null) {
                    return null;
                }
                if (ajfl.test(poll)) {
                    return poll;
                }
                if (this.e == 2) {
                    ajgc.a(1);
                }
            }
        }
    }

    public ajjn(ajde<T> ajde, ajfl<? super T> ajfl) {
        super(ajde);
        this.c = ajfl;
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
