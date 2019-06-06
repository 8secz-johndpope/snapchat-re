package defpackage;

/* renamed from: akww */
final class akww<T> extends ajdp<T> {
    private final ajdp<akws<T>> a;

    /* renamed from: akww$a */
    static class a<R> implements ajdv<akws<R>> {
        private final ajdv<? super R> a;
        private boolean b;

        a(ajdv<? super R> ajdv) {
            this.a = ajdv;
        }

        public final void a() {
            if (!this.b) {
                this.a.a();
            }
        }

        public final void a(ajej ajej) {
            this.a.a(ajej);
        }

        public final void a(Throwable th) {
            if (this.b) {
                Throwable assertionError = new AssertionError("This should never happen! Report as a bug with the full stacktrace.");
                assertionError.initCause(th);
                ajvo.a(assertionError);
                return;
            }
            this.a.a(th);
        }
    }

    akww(ajdp<akws<T>> ajdp) {
        this.a = ajdp;
    }

    public final void a_(ajdv<? super T> ajdv) {
        this.a.a(new a(ajdv));
    }
}
