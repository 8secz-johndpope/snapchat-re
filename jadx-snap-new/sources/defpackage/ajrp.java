package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ajrp */
public final class ajrp<T> extends ajdx<T> {
    private ajea<T> a;

    /* renamed from: ajrp$a */
    static final class a<T> extends AtomicReference<ajej> implements ajdy<T>, ajej {
        private ajdz<? super T> a;

        a(ajdz<? super T> ajdz) {
            this.a = ajdz;
        }

        public final void a(ajej ajej) {
            ajfp.a((AtomicReference) this, ajej);
        }

        public final void a(ajfa ajfa) {
            ajfp.a((AtomicReference) this, new ajfn(ajfa));
        }

        public final void a(T t) {
            if (get() != ajfp.DISPOSED) {
                ajej ajej = (ajej) getAndSet(ajfp.DISPOSED);
                if (ajej != ajfp.DISPOSED) {
                    if (t == null) {
                        try {
                            this.a.a(new NullPointerException("onSuccess called with null. Null values are generally not allowed in 2.x operators and sources."));
                        } catch (Throwable th) {
                            if (ajej != null) {
                                ajej.dispose();
                            }
                        }
                    } else {
                        this.a.b_(t);
                    }
                    if (ajej != null) {
                        ajej.dispose();
                    }
                }
            }
        }

        public final void a(Throwable th) {
            if (!b(th)) {
                ajvo.a(th);
            }
        }

        public final boolean b(Throwable th) {
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            if (get() != ajfp.DISPOSED) {
                ajej ajej = (ajej) getAndSet(ajfp.DISPOSED);
                if (ajej != ajfp.DISPOSED) {
                    try {
                        this.a.a(th);
                        return true;
                    } finally {
                        if (ajej != null) {
                            ajej.dispose();
                        }
                    }
                }
            }
            return false;
        }

        public final void dispose() {
            ajfp.a((AtomicReference) this);
        }

        public final boolean isDisposed() {
            return ajfp.a((ajej) get());
        }

        public final String toString() {
            return String.format("%s{%s}", new Object[]{getClass().getSimpleName(), super.toString()});
        }
    }

    public ajrp(ajea<T> ajea) {
        this.a = ajea;
    }

    public final void b(ajdz<? super T> ajdz) {
        ajej aVar = new a(ajdz);
        ajdz.a(aVar);
        try {
            this.a.subscribe(aVar);
        } catch (Throwable th) {
            ajep.a(th);
            aVar.a(th);
        }
    }
}
