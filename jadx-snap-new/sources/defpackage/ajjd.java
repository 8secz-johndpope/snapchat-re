package defpackage;

/* renamed from: ajjd */
public final class ajjd<T, K> extends ajim<T, T> {
    private ajfc<? super T, K> c;
    private ajey<? super K, ? super K> d;

    /* renamed from: ajjd$b */
    static final class b<T, K> extends ajts<T, T> implements ajfw<T> {
        private ajfc<? super T, K> a;
        private ajey<? super K, ? super K> g;
        private K h;
        private boolean i;

        b(akux<? super T> akux, ajfc<? super T, K> ajfc, ajey<? super K, ? super K> ajey) {
            super(akux);
            this.a = ajfc;
            this.g = ajey;
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
            if (this.f == 0) {
                try {
                    Object apply = this.a.apply(t);
                    if (this.i) {
                        boolean test = this.g.test(this.h, apply);
                        this.h = apply;
                        if (test) {
                            return false;
                        }
                    }
                    this.i = true;
                    this.h = apply;
                } catch (Throwable th) {
                    b(th);
                    return true;
                }
            }
            this.b.a((Object) t);
            return true;
        }

        public final T poll() {
            while (true) {
                Object poll = this.d.poll();
                if (poll == null) {
                    return null;
                }
                Object apply = this.a.apply(poll);
                if (!this.i) {
                    this.i = true;
                    this.h = apply;
                    return poll;
                } else if (this.g.test(this.h, apply)) {
                    this.h = apply;
                    if (this.f != 1) {
                        this.c.a(1);
                    }
                } else {
                    this.h = apply;
                    return poll;
                }
            }
        }
    }

    /* renamed from: ajjd$a */
    static final class a<T, K> extends ajtr<T, T> {
        private ajfc<? super T, K> f;
        private ajey<? super K, ? super K> g;
        private K h;
        private boolean i;

        a(ajfw<? super T> ajfw, ajfc<? super T, K> ajfc, ajey<? super K, ? super K> ajey) {
            super(ajfw);
            this.f = ajfc;
            this.g = ajey;
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
                return this.a.b(t);
            }
            try {
                Object apply = this.f.apply(t);
                if (this.i) {
                    boolean test = this.g.test(this.h, apply);
                    this.h = apply;
                    if (test) {
                        return false;
                    }
                }
                this.i = true;
                this.h = apply;
                this.a.a((Object) t);
                return true;
            } catch (Throwable th) {
                b(th);
                return true;
            }
        }

        public final T poll() {
            while (true) {
                Object poll = this.c.poll();
                if (poll == null) {
                    return null;
                }
                Object apply = this.f.apply(poll);
                if (!this.i) {
                    this.i = true;
                    this.h = apply;
                    return poll;
                } else if (this.g.test(this.h, apply)) {
                    this.h = apply;
                    if (this.e != 1) {
                        this.b.a(1);
                    }
                } else {
                    this.h = apply;
                    return poll;
                }
            }
        }
    }

    public ajjd(ajde<T> ajde, ajfc<? super T, K> ajfc, ajey<? super K, ? super K> ajey) {
        super(ajde);
        this.c = ajfc;
        this.d = ajey;
    }

    public final void a_(akux<? super T> akux) {
        ajde ajde;
        ajdh aVar;
        if (akux instanceof ajfw) {
            ajfw ajfw = (ajfw) akux;
            ajde = this.b;
            aVar = new a(ajfw, this.c, this.d);
        } else {
            ajde = this.b;
            aVar = new b(akux, this.c, this.d);
        }
        ajde.a(aVar);
    }
}
