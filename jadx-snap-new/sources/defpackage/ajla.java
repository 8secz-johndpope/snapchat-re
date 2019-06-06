package defpackage;

/* renamed from: ajla */
public final class ajla<T> extends ajim<T, T> {
    private akuw<? extends T> c;

    /* renamed from: ajla$a */
    static final class a<T> implements ajdh<T> {
        final ajuh a = new ajuh();
        private akux<? super T> b;
        private akuw<? extends T> c;
        private boolean d = true;

        a(akux<? super T> akux, akuw<? extends T> akuw) {
            this.b = akux;
            this.c = akuw;
        }

        public final void a() {
            if (this.d) {
                this.d = false;
                this.c.a(this);
                return;
            }
            this.b.a();
        }

        public final void a(akuy akuy) {
            this.a.b(akuy);
        }

        public final void a(T t) {
            if (this.d) {
                this.d = false;
            }
            this.b.a((Object) t);
        }

        public final void a(Throwable th) {
            this.b.a(th);
        }
    }

    public ajla(ajde<T> ajde, akuw<? extends T> akuw) {
        super(ajde);
        this.c = akuw;
    }

    public final void a_(akux<? super T> akux) {
        ajdh aVar = new a(akux, this.c);
        akux.a(aVar.a);
        this.b.a(aVar);
    }
}
