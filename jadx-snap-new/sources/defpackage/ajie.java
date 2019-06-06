package defpackage;

/* renamed from: ajie */
public final class ajie extends ajcx {
    final ajfb<? super ajej> a;
    final ajfb<? super Throwable> b;
    final ajev c;
    final ajev d;
    final ajev e;
    final ajev f;
    private ajdb g;

    /* renamed from: ajie$a */
    final class a implements ajcz, ajej {
        private ajcz a;
        private ajej b;

        a(ajcz ajcz) {
            this.a = ajcz;
        }

        private void b() {
            try {
                ajie.this.e.run();
            } catch (Throwable th) {
                ajep.a(th);
                ajvo.a(th);
            }
        }

        public final void a() {
            if (this.b != ajfp.DISPOSED) {
                try {
                    ajie.this.c.run();
                    ajie.this.d.run();
                    this.a.a();
                    b();
                } catch (Throwable th) {
                    ajep.a(th);
                    this.a.a(th);
                }
            }
        }

        public final void a(ajej ajej) {
            try {
                ajie.this.a.accept(ajej);
                if (ajfp.a(this.b, ajej)) {
                    this.b = ajej;
                    this.a.a((ajej) this);
                }
            } catch (Throwable th) {
                ajep.a(th);
                ajej.dispose();
                this.b = ajfp.DISPOSED;
                ajfq.a(th, this.a);
            }
        }

        public final void a(Throwable th) {
            if (this.b == ajfp.DISPOSED) {
                ajvo.a(th);
                return;
            }
            try {
                ajie.this.b.accept(th);
                ajie.this.d.run();
            } catch (Throwable th2) {
                ajep.a(th2);
                th = new ajeo(th, th2);
            }
            this.a.a(th);
            b();
        }

        public final void dispose() {
            try {
                ajie.this.f.run();
            } catch (Throwable th) {
                ajep.a(th);
                ajvo.a(th);
            }
            this.b.dispose();
        }

        public final boolean isDisposed() {
            return this.b.isDisposed();
        }
    }

    public ajie(ajdb ajdb, ajfb<? super ajej> ajfb, ajfb<? super Throwable> ajfb2, ajev ajev, ajev ajev2, ajev ajev3, ajev ajev4) {
        this.g = ajdb;
        this.a = ajfb;
        this.b = ajfb2;
        this.c = ajev;
        this.d = ajev2;
        this.e = ajev3;
        this.f = ajev4;
    }

    public final void b(ajcz ajcz) {
        this.g.a(new a(ajcz));
    }
}
