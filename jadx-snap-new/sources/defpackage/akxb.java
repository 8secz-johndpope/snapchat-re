package defpackage;

/* renamed from: akxb */
final class akxb<T> extends ajdp<akxa<T>> {
    private final ajdp<akws<T>> a;

    /* renamed from: akxb$a */
    static class a<R> implements ajdv<akws<R>> {
        private final ajdv<? super akxa<R>> a;

        a(ajdv<? super akxa<R>> ajdv) {
            this.a = ajdv;
        }

        public final void a() {
            this.a.a();
        }

        public final void a(ajej ajej) {
            this.a.a(ajej);
        }

        public final void a(Throwable th) {
            try {
                this.a.a(akxa.a(th));
                this.a.a();
            } catch (Throwable th2) {
                ajep.a(th2);
                ajvo.a(new ajeo(th, th2));
            }
        }
    }

    akxb(ajdp<akws<T>> ajdp) {
        this.a = ajdp;
    }

    public final void a_(ajdv<? super akxa<T>> ajdv) {
        this.a.a(new a(ajdv));
    }
}
