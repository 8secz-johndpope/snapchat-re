package defpackage;

import java.util.Iterator;

/* renamed from: ajse */
public final class ajse<T, R> extends ajdp<R> {
    private ajeb<T> a;
    private ajfc<? super T, ? extends Iterable<? extends R>> b;

    /* renamed from: ajse$a */
    static final class a<T, R> extends ajgh<R> implements ajdz<T> {
        private ajdv<? super R> a;
        private ajfc<? super T, ? extends Iterable<? extends R>> b;
        private ajej c;
        private volatile Iterator<? extends R> d;
        private volatile boolean e;
        private boolean f;

        a(ajdv<? super R> ajdv, ajfc<? super T, ? extends Iterable<? extends R>> ajfc) {
            this.a = ajdv;
            this.b = ajfc;
        }

        public final int a(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            this.f = true;
            return 2;
        }

        public final void a(ajej ajej) {
            if (ajfp.a(this.c, ajej)) {
                this.c = ajej;
                this.a.a((ajej) this);
            }
        }

        public final void a(Throwable th) {
            this.c = ajfp.DISPOSED;
            this.a.a(th);
        }

        public final void b_(T t) {
            ajdv ajdv = this.a;
            try {
                Iterator it = ((Iterable) this.b.apply(t)).iterator();
                if (!it.hasNext()) {
                    ajdv.a();
                } else if (this.f) {
                    this.d = it;
                    ajdv.a(null);
                    ajdv.a();
                } else {
                    while (!this.e) {
                        try {
                            ajdv.a(it.next());
                            if (!this.e) {
                                try {
                                    if (!it.hasNext()) {
                                        ajdv.a();
                                        return;
                                    }
                                } catch (Throwable th) {
                                    ajep.a(th);
                                    ajdv.a(th);
                                    return;
                                }
                            }
                            return;
                        } catch (Throwable th2) {
                            ajep.a(th2);
                            ajdv.a(th2);
                            return;
                        }
                    }
                }
            } catch (Throwable th22) {
                ajep.a(th22);
                this.a.a(th22);
            }
        }

        public final void clear() {
            this.d = null;
        }

        public final void dispose() {
            this.e = true;
            this.c.dispose();
            this.c = ajfp.DISPOSED;
        }

        public final boolean isDisposed() {
            return this.e;
        }

        public final boolean isEmpty() {
            return this.d == null;
        }

        public final R poll() {
            Iterator it = this.d;
            if (it == null) {
                return null;
            }
            Object a = ajfv.a(it.next(), "The iterator returned a null value");
            if (!it.hasNext()) {
                this.d = null;
            }
            return a;
        }
    }

    public ajse(ajeb<T> ajeb, ajfc<? super T, ? extends Iterable<? extends R>> ajfc) {
        this.a = ajeb;
        this.b = ajfc;
    }

    public final void a_(ajdv<? super R> ajdv) {
        this.a.a(new a(ajdv, this.b));
    }
}
