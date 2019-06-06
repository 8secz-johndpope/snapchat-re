package defpackage;

/* renamed from: ajik */
public final class ajik<T> extends ajdp<T> {
    private ajdb a;

    /* renamed from: ajik$a */
    static final class a extends ajgi<Void> implements ajcz {
        private ajdv<?> a;
        private ajej b;

        a(ajdv<?> ajdv) {
            this.a = ajdv;
        }

        public final int a(int i) {
            return i & 2;
        }

        public final void a() {
            this.a.a();
        }

        public final void a(ajej ajej) {
            if (ajfp.a(this.b, ajej)) {
                this.b = ajej;
                this.a.a((ajej) this);
            }
        }

        public final void a(Throwable th) {
            this.a.a(th);
        }

        public final void clear() {
        }

        public final void dispose() {
            this.b.dispose();
        }

        public final boolean isDisposed() {
            return this.b.isDisposed();
        }

        public final boolean isEmpty() {
            return true;
        }

        public final /* bridge */ /* synthetic */ Object poll() {
            return null;
        }
    }

    public ajik(ajdb ajdb) {
        this.a = ajdb;
    }

    public final void a_(ajdv<? super T> ajdv) {
        this.a.a(new a(ajdv));
    }
}
