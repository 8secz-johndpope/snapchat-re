package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: ajhl */
public final class ajhl extends ajcx {
    private ajdb a;
    private ajev b;

    /* renamed from: ajhl$a */
    static final class a extends AtomicInteger implements ajcz, ajej {
        private ajcz a;
        private ajev b;
        private ajej c;

        a(ajcz ajcz, ajev ajev) {
            this.a = ajcz;
            this.b = ajev;
        }

        private void b() {
            if (compareAndSet(0, 1)) {
                try {
                    this.b.run();
                } catch (Throwable th) {
                    ajep.a(th);
                    ajvo.a(th);
                }
            }
        }

        public final void a() {
            this.a.a();
            b();
        }

        public final void a(ajej ajej) {
            if (ajfp.a(this.c, ajej)) {
                this.c = ajej;
                this.a.a((ajej) this);
            }
        }

        public final void a(Throwable th) {
            this.a.a(th);
            b();
        }

        public final void dispose() {
            this.c.dispose();
            b();
        }

        public final boolean isDisposed() {
            return this.c.isDisposed();
        }
    }

    public ajhl(ajdb ajdb, ajev ajev) {
        this.a = ajdb;
        this.b = ajev;
    }

    public final void b(ajcz ajcz) {
        this.a.a(new a(ajcz, this.b));
    }
}
