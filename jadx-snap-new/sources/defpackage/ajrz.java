package defpackage;

/* renamed from: ajrz */
public final class ajrz<T> extends ajdx<T> {
    private ajeb<T> a;
    private ajfb<? super ajej> b;

    /* renamed from: ajrz$a */
    static final class a<T> implements ajdz<T> {
        private ajdz<? super T> a;
        private ajfb<? super ajej> b;
        private boolean c;

        a(ajdz<? super T> ajdz, ajfb<? super ajej> ajfb) {
            this.a = ajdz;
            this.b = ajfb;
        }

        public final void a(ajej ajej) {
            try {
                this.b.accept(ajej);
                this.a.a(ajej);
            } catch (Throwable th) {
                ajep.a(th);
                this.c = true;
                ajej.dispose();
                ajfq.a(th, this.a);
            }
        }

        public final void a(Throwable th) {
            if (this.c) {
                ajvo.a(th);
            } else {
                this.a.a(th);
            }
        }

        public final void b_(T t) {
            if (!this.c) {
                this.a.b_(t);
            }
        }
    }

    public ajrz(ajeb<T> ajeb, ajfb<? super ajej> ajfb) {
        this.a = ajeb;
        this.b = ajfb;
    }

    public final void b(ajdz<? super T> ajdz) {
        this.a.a(new a(ajdz, this.b));
    }
}
