package defpackage;

import java.util.Iterator;

/* renamed from: ajpe */
// ObservableFromIterable
public final class ajpe<T> extends ajdp<T> {
    private Iterable<? extends T> a;

    /* renamed from: ajpe$a */
    static final class a<T> extends ajgi<T> {
        final ajdv<? super T> a;
        final Iterator<? extends T> b;
        boolean c;
        private volatile boolean d;
        private boolean e;
        private boolean f;

        a(ajdv<? super T> ajdv, Iterator<? extends T> it) {
            this.a = ajdv;
            this.b = it;
        }

        public final int a(int i) {
            if ((i & 1) == 0) {
                return 0;
            }
            this.c = true;
            return 1;
        }

        public final void clear() {
            this.e = true;
        }

        public final void dispose() {
            this.d = true;
        }

        public final boolean isDisposed() {
            return this.d;
        }

        public final boolean isEmpty() {
            return this.e;
        }

        public final T poll() {
            if (this.e) {
                return null;
            }
            if (!this.f) {
                this.f = true;
            } else if (!this.b.hasNext()) {
                this.e = true;
                return null;
            }
            return ajfv.a(this.b.next(), "The iterator returned a null value");
        }
    }

    public ajpe(Iterable<? extends T> iterable) {
        this.a = iterable;
    }

    public final void a_(ajdv<? super T> ajdv) {
        try {
            Iterator it = this.a.iterator();
            try {
                if (it.hasNext()) {
                    ajej aVar = new a(ajdv, it);
                    ajdv.a(aVar);
                    if (!aVar.c) {
                        while (!aVar.isDisposed()) {
                            try {
                                aVar.a.a(ajfv.a(aVar.b.next(), "The iterator returned a null value"));
                                if (aVar.isDisposed()) {
                                    break;
                                }
                                try {
                                    if (!aVar.b.hasNext()) {
                                        if (!aVar.isDisposed()) {
                                            aVar.a.a();
                                        }
                                    }
                                } catch (Throwable th) {
                                    ajep.a(th);
                                    aVar.a.a(th);
                                    return;
                                }
                            } catch (Throwable th2) {
                                ajep.a(th2);
                                aVar.a.a(th2);
                            }
                        }
                    }
                    return;
                }
                ajfq.a((ajdv) ajdv);
            } catch (Throwable th3) {
                ajep.a(th3);
                ajfq.a(th3, (ajdv) ajdv);
            }
        } catch (Throwable th32) {
            ajep.a(th32);
            ajfq.a(th32, (ajdv) ajdv);
        }
    }
}
