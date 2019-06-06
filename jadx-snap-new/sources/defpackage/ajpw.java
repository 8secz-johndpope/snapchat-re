package defpackage;

/* renamed from: ajpw */
public final class ajpw<T> extends ajnp<T, T> {
    private ajfc<? super Throwable, ? extends ajdt<? extends T>> b;
    private boolean c = false;

    /* renamed from: ajpw$a */
    static final class a<T> implements ajdv<T> {
        final ajft a = new ajft();
        private ajdv<? super T> b;
        private ajfc<? super Throwable, ? extends ajdt<? extends T>> c;
        private boolean d = false;
        private boolean e;
        private boolean f;

        a(ajdv<? super T> ajdv, ajfc<? super Throwable, ? extends ajdt<? extends T>> ajfc, boolean z) {
            this.b = ajdv;
            this.c = ajfc;
        }

        public final void a() {
            if (!this.f) {
                this.f = true;
                this.e = true;
                this.b.a();
            }
        }

        public final void a(ajej ajej) {
            ajfp.c(this.a, ajej);
        }

        public final void a(T t) {
            if (!this.f) {
                this.b.a((Object) t);
            }
        }

        public final void a(Throwable th) {
            if (!this.e) {
                this.e = true;
                if (!this.d || (th instanceof Exception)) {
                    try {
                        ajdt ajdt = (ajdt) this.c.apply(th);
                        if (ajdt == null) {
                            Throwable nullPointerException = new NullPointerException("Observable is null");
                            nullPointerException.initCause(th);
                            this.b.a(nullPointerException);
                            return;
                        }
                        ajdt.a(this);
                        return;
                    } catch (Throwable th2) {
                        ajep.a(th2);
                        this.b.a(new ajeo(th, th2));
                        return;
                    }
                }
                this.b.a(th);
            } else if (this.f) {
                ajvo.a(th);
            } else {
                this.b.a(th);
            }
        }
    }

    public ajpw(ajdt<T> ajdt, ajfc<? super Throwable, ? extends ajdt<? extends T>> ajfc) {
        super(ajdt);
        this.b = ajfc;
    }

    public final void a_(ajdv<? super T> ajdv) {
        a aVar = new a(ajdv, this.b, false);
        ajdv.a(aVar.a);
        this.a.a(aVar);
    }
}
