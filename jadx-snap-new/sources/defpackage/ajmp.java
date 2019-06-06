package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ajmp */
public final class ajmp<T> extends ajlj<T, T> {
    private ajfc<? super Throwable, ? extends ajdn<? extends T>> b;
    private boolean c = true;

    /* renamed from: ajmp$a */
    static final class a<T> extends AtomicReference<ajej> implements ajdl<T>, ajej {
        private ajdl<? super T> a;
        private ajfc<? super Throwable, ? extends ajdn<? extends T>> b;
        private boolean c;

        /* renamed from: ajmp$a$a */
        static final class a<T> implements ajdl<T> {
            private ajdl<? super T> a;
            private AtomicReference<ajej> b;

            a(ajdl<? super T> ajdl, AtomicReference<ajej> atomicReference) {
                this.a = ajdl;
                this.b = atomicReference;
            }

            public final void a() {
                this.a.a();
            }

            public final void a(ajej ajej) {
                ajfp.b(this.b, ajej);
            }

            public final void a(Throwable th) {
                this.a.a(th);
            }

            public final void b_(T t) {
                this.a.b_(t);
            }
        }

        a(ajdl<? super T> ajdl, ajfc<? super Throwable, ? extends ajdn<? extends T>> ajfc, boolean z) {
            this.a = ajdl;
            this.b = ajfc;
            this.c = z;
        }

        public final void a() {
            this.a.a();
        }

        public final void a(ajej ajej) {
            if (ajfp.b(this, ajej)) {
                this.a.a((ajej) this);
            }
        }

        public final void a(Throwable th) {
            if (this.c || (th instanceof Exception)) {
                try {
                    ajdn ajdn = (ajdn) ajfv.a(this.b.apply(th), "The resumeFunction returned a null MaybeSource");
                    ajfp.c(this, null);
                    ajdn.b(new a(this.a, this));
                    return;
                } catch (Throwable th2) {
                    ajep.a(th2);
                    this.a.a(new ajeo(th, th2));
                    return;
                }
            }
            this.a.a(th);
        }

        public final void b_(T t) {
            this.a.b_(t);
        }

        public final void dispose() {
            ajfp.a((AtomicReference) this);
        }

        public final boolean isDisposed() {
            return ajfp.a((ajej) get());
        }
    }

    public ajmp(ajdn<T> ajdn, ajfc<? super Throwable, ? extends ajdn<? extends T>> ajfc) {
        super(ajdn);
        this.b = ajfc;
    }

    public final void a(ajdl<? super T> ajdl) {
        this.a.b(new a(ajdl, this.b, this.c));
    }
}
