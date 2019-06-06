package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ajrw */
public final class ajrw<T> extends ajdx<T> {
    private ajeb<T> a;
    private ajev b;

    /* renamed from: ajrw$a */
    static final class a<T> extends AtomicReference<ajev> implements ajdz<T>, ajej {
        private ajdz<? super T> a;
        private ajej b;

        a(ajdz<? super T> ajdz, ajev ajev) {
            this.a = ajdz;
            lazySet(ajev);
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

        public final void b_(T t) {
            this.a.b_(t);
        }

        public final void dispose() {
            ajev ajev = (ajev) getAndSet(null);
            if (ajev != null) {
                try {
                    ajev.run();
                } catch (Throwable th) {
                    ajep.a(th);
                    ajvo.a(th);
                }
                this.b.dispose();
            }
        }

        public final boolean isDisposed() {
            return this.b.isDisposed();
        }
    }

    public ajrw(ajeb<T> ajeb, ajev ajev) {
        this.a = ajeb;
        this.b = ajev;
    }

    public final void b(ajdz<? super T> ajdz) {
        this.a.a(new a(ajdz, this.b));
    }
}
