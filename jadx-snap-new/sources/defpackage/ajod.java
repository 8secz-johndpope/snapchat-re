package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ajod */
// ObservableCreate
public final class ajod<T> extends ajdp<T> {
    private ajdr<T> a;

    /* renamed from: ajod$a */
    static final class a<T> extends AtomicReference<ajej> implements ajdq<T>, ajej {
        private ajdv<? super T> a;

        a(ajdv<? super T> ajdv) {
            this.a = ajdv;
        }

        public final void a() {
            if (!isDisposed()) {
                try {
                    this.a.a();
                } finally {
                    dispose();
                }
            }
        }

        public final void a(ajej ajej) {
            ajfp.a((AtomicReference) this, ajej);
        }

        public final void a(ajfa ajfa) {
            ajfp.a((AtomicReference) this, new ajfn(ajfa));
        }

        public final void a(T t) {
            if (t == null) {
                a(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                return;
            }
            if (!isDisposed()) {
                this.a.a((Object) t);
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
            if (isDisposed()) {
                return false;
            }
            try {
                this.a.a(th);
                return true;
            } finally {
                dispose();
            }
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

    public ajod(ajdr<T> ajdr) {
        this.a = ajdr;
    }

    public final void a_(ajdv<? super T> ajdv) {
        ajej aVar = new a(ajdv);
        ajdv.a(aVar);
        try {
            this.a.subscribe(aVar);
        } catch (Throwable th) {
            ajep.a(th);
            aVar.a(th);
        }
    }
}
