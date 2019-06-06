package defpackage;

/* renamed from: ajjg */
public final class ajjg<T> extends ajim<T, T> {
    private ajfb<? super T> c;
    private ajfb<? super Throwable> d;
    private ajev e;
    private ajev f;

    /* renamed from: ajjg$b */
    static final class b<T> extends ajts<T, T> {
        private ajfb<? super T> a;
        private ajfb<? super Throwable> g;
        private ajev h;
        private ajev i;

        b(akux<? super T> akux, ajfb<? super T> ajfb, ajfb<? super Throwable> ajfb2, ajev ajev, ajev ajev2) {
            super(akux);
            this.a = ajfb;
            this.g = ajfb2;
            this.h = ajev;
            this.i = ajev2;
        }

        public final int a(int i) {
            return b(i);
        }

        public final void a() {
            if (!this.e) {
                try {
                    this.h.run();
                    this.e = true;
                    this.b.a();
                    try {
                        this.i.run();
                    } catch (Throwable th) {
                        ajep.a(th);
                        ajvo.a(th);
                    }
                } catch (Throwable th2) {
                    b(th2);
                }
            }
        }

        public final void a(T t) {
            if (!this.e) {
                if (this.f != 0) {
                    this.b.a(null);
                    return;
                }
                try {
                    this.a.accept(t);
                    this.b.a((Object) t);
                } catch (Throwable th) {
                    b(th);
                }
            }
        }

        public final void a(Throwable th) {
            if (this.e) {
                ajvo.a(th);
                return;
            }
            boolean z = true;
            this.e = true;
            try {
                this.g.accept(th);
            } catch (Throwable th2) {
                ajep.a(th2);
                this.b.a(new ajeo(th, th2));
                z = false;
            }
            if (z) {
                this.b.a(th);
            }
            try {
                this.i.run();
            } catch (Throwable th3) {
                ajep.a(th3);
                ajvo.a(th3);
            }
        }

        public final T poll() {
            Exception b;
            ajeo ajeo;
            try {
                Object poll = this.d.poll();
                if (poll != null) {
                    try {
                        this.a.accept(poll);
                    } catch (Throwable th) {
                        ajeo = new ajeo(th, th);
                    }
                } else {
                    if (this.f == 1) {
                        this.h.run();
                    }
                    return poll;
                }
                this.i.run();
                return poll;
            } catch (Throwable th2) {
                ajeo = new ajeo(th, th2);
            }
        }
    }

    /* renamed from: ajjg$a */
    static final class a<T> extends ajtr<T, T> {
        private ajfb<? super T> f;
        private ajfb<? super Throwable> g;
        private ajev h;
        private ajev i;

        a(ajfw<? super T> ajfw, ajfb<? super T> ajfb, ajfb<? super Throwable> ajfb2, ajev ajev, ajev ajev2) {
            super(ajfw);
            this.f = ajfb;
            this.g = ajfb2;
            this.h = ajev;
            this.i = ajev2;
        }

        public final int a(int i) {
            return b(i);
        }

        public final void a() {
            if (!this.d) {
                try {
                    this.h.run();
                    this.d = true;
                    this.a.a();
                    try {
                        this.i.run();
                    } catch (Throwable th) {
                        ajep.a(th);
                        ajvo.a(th);
                    }
                } catch (Throwable th2) {
                    b(th2);
                }
            }
        }

        public final void a(T t) {
            if (!this.d) {
                if (this.e != 0) {
                    this.a.a(null);
                    return;
                }
                try {
                    this.f.accept(t);
                    this.a.a((Object) t);
                } catch (Throwable th) {
                    b(th);
                }
            }
        }

        public final void a(Throwable th) {
            if (this.d) {
                ajvo.a(th);
                return;
            }
            boolean z = true;
            this.d = true;
            try {
                this.g.accept(th);
            } catch (Throwable th2) {
                ajep.a(th2);
                this.a.a((Throwable) new ajeo(th, th2));
                z = false;
            }
            if (z) {
                this.a.a(th);
            }
            try {
                this.i.run();
            } catch (Throwable th3) {
                ajep.a(th3);
                ajvo.a(th3);
            }
        }

        public final boolean b(T t) {
            if (this.d) {
                return false;
            }
            try {
                this.f.accept(t);
                return this.a.b(t);
            } catch (Throwable th) {
                b(th);
                return false;
            }
        }

        public final T poll() {
            Exception b;
            ajeo ajeo;
            try {
                Object poll = this.c.poll();
                if (poll != null) {
                    try {
                        this.f.accept(poll);
                    } catch (Throwable th) {
                        ajeo = new ajeo(th, th);
                    }
                } else {
                    if (this.e == 1) {
                        this.h.run();
                    }
                    return poll;
                }
                this.i.run();
                return poll;
            } catch (Throwable th2) {
                ajeo = new ajeo(th, th2);
            }
        }
    }

    public ajjg(ajde<T> ajde, ajfb<? super T> ajfb, ajfb<? super Throwable> ajfb2, ajev ajev, ajev ajev2) {
        super(ajde);
        this.c = ajfb;
        this.d = ajfb2;
        this.e = ajev;
        this.f = ajev2;
    }

    public final void a_(akux<? super T> akux) {
        ajde ajde;
        ajdh aVar;
        if (akux instanceof ajfw) {
            ajde = this.b;
            aVar = new a((ajfw) akux, this.c, this.d, this.e, this.f);
        } else {
            ajde = this.b;
            aVar = new b(akux, this.c, this.d, this.e, this.f);
        }
        ajde.a(r7);
    }
}
