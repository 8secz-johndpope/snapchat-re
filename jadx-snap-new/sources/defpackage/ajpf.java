package defpackage;

/* renamed from: ajpf */
public final class ajpf<T> extends ajdp<T> {
    private akuw<? extends T> a;

    /* renamed from: ajpf$a */
    static final class a<T> implements ajdh<T>, ajej {
        private ajdv<? super T> a;
        private akuy b;

        a(ajdv<? super T> ajdv) {
            this.a = ajdv;
        }

        public final void a() {
            this.a.a();
        }

        public final void a(akuy akuy) {
            if (ajui.a(this.b, akuy)) {
                this.b = akuy;
                this.a.a((ajej) this);
                akuy.a(Long.MAX_VALUE);
            }
        }

        public final void a(T t) {
            this.a.a((Object) t);
        }

        public final void a(Throwable th) {
            this.a.a(th);
        }

        public final void dispose() {
            this.b.b();
            this.b = ajui.CANCELLED;
        }

        public final boolean isDisposed() {
            return this.b == ajui.CANCELLED;
        }
    }

    public ajpf(akuw<? extends T> akuw) {
        this.a = akuw;
    }

    public final void a_(ajdv<? super T> ajdv) {
        this.a.a(new a(ajdv));
    }
}
