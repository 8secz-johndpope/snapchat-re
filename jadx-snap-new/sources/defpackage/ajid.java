package defpackage;

/* renamed from: ajid */
public final class ajid extends ajcx {
    final ajfl<? super Throwable> a;
    private ajdb b;

    /* renamed from: ajid$a */
    final class a implements ajcz {
        private final ajcz a;

        a(ajcz ajcz) {
            this.a = ajcz;
        }

        public final void a() {
            this.a.a();
        }

        public final void a(ajej ajej) {
            this.a.a(ajej);
        }

        public final void a(Throwable th) {
            try {
                if (ajid.this.a.test(th)) {
                    this.a.a();
                } else {
                    this.a.a(th);
                }
            } catch (Throwable th2) {
                ajep.a(th2);
                this.a.a(new ajeo(th, th2));
            }
        }
    }

    public ajid(ajdb ajdb, ajfl<? super Throwable> ajfl) {
        this.b = ajdb;
        this.a = ajfl;
    }

    public final void b(ajcz ajcz) {
        this.b.a(new a(ajcz));
    }
}
