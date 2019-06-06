package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: ajqk */
public final class ajqk {

    /* renamed from: ajqk$a */
    public static final class a<T> extends AtomicInteger implements ajga<T>, Runnable {
        private ajdv<? super T> a;
        private T b;

        public a(ajdv<? super T> ajdv, T t) {
            this.a = ajdv;
            this.b = t;
        }

        public final int a(int i) {
            if ((i & 1) == 0) {
                return 0;
            }
            lazySet(1);
            return 1;
        }

        public final void clear() {
            lazySet(3);
        }

        public final void dispose() {
            set(3);
        }

        public final boolean isDisposed() {
            return get() == 3;
        }

        public final boolean isEmpty() {
            return get() != 1;
        }

        public final boolean offer(T t) {
            throw new UnsupportedOperationException("Should not be called!");
        }

        public final T poll() {
            if (get() != 1) {
                return null;
            }
            lazySet(3);
            return this.b;
        }

        public final void run() {
            if (get() == 0 && compareAndSet(0, 2)) {
                this.a.a(this.b);
                if (get() == 2) {
                    lazySet(3);
                    this.a.a();
                }
            }
        }
    }

    /* renamed from: ajqk$b */
    static final class b<T, R> extends ajdp<R> {
        private T a;
        private ajfc<? super T, ? extends ajdt<? extends R>> b;

        b(T t, ajfc<? super T, ? extends ajdt<? extends R>> ajfc) {
            this.a = t;
            this.b = ajfc;
        }

        public final void a_(ajdv<? super R> ajdv) {
            try {
                ajdt ajdt = (ajdt) ajfv.a(this.b.apply(this.a), "The mapper returned a null ObservableSource");
                if (ajdt instanceof Callable) {
                    try {
                        Object call = ((Callable) ajdt).call();
                        if (call == null) {
                            ajfq.a((ajdv) ajdv);
                            return;
                        }
                        ajej aVar = new a(ajdv, call);
                        ajdv.a(aVar);
                        aVar.run();
                        return;
                    } catch (Throwable th) {
                        ajep.a(th);
                        ajfq.a(th, (ajdv) ajdv);
                        return;
                    }
                }
                ajdt.a(ajdv);
            } catch (Throwable th2) {
                ajfq.a(th2, (ajdv) ajdv);
            }
        }
    }

    private ajqk() {
        throw new IllegalStateException("No instances!");
    }

    public static <T, U> ajdp<U> a(T t, ajfc<? super T, ? extends ajdt<? extends U>> ajfc) {
        return ajvo.a(new b(t, ajfc));
    }

    public static <T, R> boolean a(ajdt<T> ajdt, ajdv<? super R> ajdv, ajfc<? super T, ? extends ajdt<? extends R>> ajfc) {
        if (!(ajdt instanceof Callable)) {
            return false;
        }
        try {
            Object call = ((Callable) ajdt).call();
            if (call == null) {
                ajfq.a((ajdv) ajdv);
                return true;
            }
            ajdt ajdt2 = (ajdt) ajfv.a(ajfc.apply(call), "The mapper returned a null ObservableSource");
            if (ajdt2 instanceof Callable) {
                call = ((Callable) ajdt2).call();
                if (call == null) {
                    ajfq.a((ajdv) ajdv);
                    return true;
                }
                ajej aVar = new a(ajdv, call);
                ajdv.a(aVar);
                aVar.run();
            } else {
                ajdt2.a(ajdv);
            }
            return true;
        } catch (Throwable th) {
            ajep.a(th);
            ajfq.a(th, (ajdv) ajdv);
            return true;
        }
    }
}
