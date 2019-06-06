package defpackage;

/* renamed from: ajjx */
public final class ajjx<T> extends ajde<T> {
    private final ajdp<T> b;

    /* renamed from: ajjx$a */
    static final class a<T> implements ajdv<T>, akuy {
        private akux<? super T> a;
        private ajej b;

        a(akux<? super T> akux) {
            this.a = akux;
        }

        public final void a() {
            this.a.a();
        }

        public final void a(long j) {
        }

        public final void a(ajej ajej) {
            this.b = ajej;
            this.a.a((akuy) this);
        }

        public final void a(T t) {
            this.a.a((Object) t);
        }

        public final void a(Throwable th) {
            this.a.a(th);
        }

        public final void b() {
            this.b.dispose();
        }
    }

    public ajjx(ajdp<T> ajdp) {
        this.b = ajdp;
    }

    public final void a_(akux<? super T> akux) {
        this.b.a(new a(akux));
    }
}
