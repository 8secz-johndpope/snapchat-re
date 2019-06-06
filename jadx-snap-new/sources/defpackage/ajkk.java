package defpackage;

/* renamed from: ajkk */
public final class ajkk<T> extends ajim<T, T> {
    private ajfc<? super Throwable, ? extends akuw<? extends T>> c;
    private boolean d = false;

    /* renamed from: ajkk$a */
    static final class a<T> extends ajuh implements ajdh<T> {
        private akux<? super T> a;
        private ajfc<? super Throwable, ? extends akuw<? extends T>> b;
        private boolean e = false;
        private boolean f;
        private boolean g;
        private long h;

        a(akux<? super T> akux, ajfc<? super Throwable, ? extends akuw<? extends T>> ajfc, boolean z) {
            this.a = akux;
            this.b = ajfc;
        }

        public final void a() {
            if (!this.g) {
                this.g = true;
                this.f = true;
                this.a.a();
            }
        }

        public final void a(akuy akuy) {
            b(akuy);
        }

        public final void a(T t) {
            if (!this.g) {
                if (!this.f) {
                    this.h++;
                }
                this.a.a((Object) t);
            }
        }

        public final void a(Throwable th) {
            if (!this.f) {
                this.f = true;
                if (!this.e || (th instanceof Exception)) {
                    try {
                        akuw akuw = (akuw) ajfv.a(this.b.apply(th), "The nextSupplier returned a null Publisher");
                        long j = this.h;
                        if (j != 0) {
                            b(j);
                        }
                        akuw.a(this);
                        return;
                    } catch (Throwable th2) {
                        ajep.a(th2);
                        this.a.a(new ajeo(th, th2));
                        return;
                    }
                }
                this.a.a(th);
            } else if (this.g) {
                ajvo.a(th);
            } else {
                this.a.a(th);
            }
        }
    }

    public ajkk(ajde<T> ajde, ajfc<? super Throwable, ? extends akuw<? extends T>> ajfc) {
        super(ajde);
        this.c = ajfc;
    }

    public final void a_(akux<? super T> akux) {
        ajdh aVar = new a(akux, this.c, false);
        akux.a((akuy) aVar);
        this.b.a(aVar);
    }
}
