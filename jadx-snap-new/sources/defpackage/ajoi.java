package defpackage;

/* renamed from: ajoi */
public final class ajoi<T, U> extends ajdp<T> {
    final ajdt<? extends T> a;
    private ajdt<U> b;

    /* renamed from: ajoi$a */
    final class a implements ajdv<U> {
        final ajft a;
        final ajdv<? super T> b;
        private boolean c;

        /* renamed from: ajoi$a$a */
        final class a implements ajdv<T> {
            a() {
            }

            public final void a() {
                a.this.b.a();
            }

            public final void a(ajej ajej) {
                ajfp.a(a.this.a, ajej);
            }

            public final void a(T t) {
                a.this.b.a((Object) t);
            }

            public final void a(Throwable th) {
                a.this.b.a(th);
            }
        }

        a(ajft ajft, ajdv<? super T> ajdv) {
            this.a = ajft;
            this.b = ajdv;
        }

        public final void a() {
            if (!this.c) {
                this.c = true;
                ajoi.this.a.a(new a());
            }
        }

        public final void a(ajej ajej) {
            ajfp.a(this.a, ajej);
        }

        public final void a(U u) {
            a();
        }

        public final void a(Throwable th) {
            if (this.c) {
                ajvo.a(th);
                return;
            }
            this.c = true;
            this.b.a(th);
        }
    }

    public ajoi(ajdt<? extends T> ajdt, ajdt<U> ajdt2) {
        this.a = ajdt;
        this.b = ajdt2;
    }

    public final void a_(ajdv<? super T> ajdv) {
        ajej ajft = new ajft();
        ajdv.a(ajft);
        this.b.a(new a(ajft, ajdv));
    }
}
