package defpackage;

/* renamed from: ajlf */
public final class ajlf<T> extends ajim<T, T> {
    private ajfl<? super T> c;

    /* renamed from: ajlf$a */
    static final class a<T> implements ajdh<T>, akuy {
        private akux<? super T> a;
        private ajfl<? super T> b;
        private akuy c;
        private boolean d;

        a(akux<? super T> akux, ajfl<? super T> ajfl) {
            this.a = akux;
            this.b = ajfl;
        }

        public final void a() {
            if (!this.d) {
                this.d = true;
                this.a.a();
            }
        }

        public final void a(long j) {
            this.c.a(j);
        }

        public final void a(akuy akuy) {
            if (ajui.a(this.c, akuy)) {
                this.c = akuy;
                this.a.a((akuy) this);
            }
        }

        public final void a(T t) {
            if (!this.d) {
                try {
                    if (this.b.test(t)) {
                        this.a.a((Object) t);
                        return;
                    }
                    this.d = true;
                    this.c.b();
                    this.a.a();
                } catch (Throwable th) {
                    ajep.a(th);
                    this.c.b();
                    a(th);
                }
            }
        }

        public final void a(Throwable th) {
            if (this.d) {
                ajvo.a(th);
                return;
            }
            this.d = true;
            this.a.a(th);
        }

        public final void b() {
            this.c.b();
        }
    }

    public ajlf(ajde<T> ajde, ajfl<? super T> ajfl) {
        super(ajde);
        this.c = ajfl;
    }

    public final void a_(akux<? super T> akux) {
        this.b.a(new a(akux, this.c));
    }
}
