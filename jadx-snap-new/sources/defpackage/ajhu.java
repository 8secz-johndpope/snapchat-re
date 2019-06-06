package defpackage;

/* renamed from: ajhu */
public final class ajhu<T> extends ajcx {
    private ajeb<T> a;

    /* renamed from: ajhu$a */
    static final class a<T> implements ajdz<T> {
        private ajcz a;

        a(ajcz ajcz) {
            this.a = ajcz;
        }

        public final void a(ajej ajej) {
            this.a.a(ajej);
        }

        public final void a(Throwable th) {
            this.a.a(th);
        }

        public final void b_(T t) {
            this.a.a();
        }
    }

    public ajhu(ajeb<T> ajeb) {
        this.a = ajeb;
    }

    public final void b(ajcz ajcz) {
        this.a.a(new a(ajcz));
    }
}
