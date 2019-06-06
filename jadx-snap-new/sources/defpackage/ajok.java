package defpackage;

import java.util.Collection;
import java.util.concurrent.Callable;

/* renamed from: ajok */
public final class ajok<T, K> extends ajnp<T, T> {
    private ajfc<? super T, K> b;
    private Callable<? extends Collection<? super K>> c;

    /* renamed from: ajok$a */
    static final class a<T, K> extends ajgg<T, T> {
        private Collection<? super K> a;
        private ajfc<? super T, K> f;

        a(ajdv<? super T> ajdv, ajfc<? super T, K> ajfc, Collection<? super K> collection) {
            super(ajdv);
            this.f = ajfc;
            this.a = collection;
        }

        public final int a(int i) {
            return b(i);
        }

        public final void a() {
            if (!this.d) {
                this.d = true;
                this.a.clear();
                this.b.a();
            }
        }

        public final void a(T t) {
            if (!this.d) {
                if (this.e == 0) {
                    try {
                        if (this.a.add(ajfv.a(this.f.apply(t), "The keySelector returned a null key"))) {
                            this.b.a((Object) t);
                        }
                        return;
                    } catch (Throwable th) {
                        b(th);
                        return;
                    }
                }
                this.b.a(null);
            }
        }

        public final void a(Throwable th) {
            if (this.d) {
                ajvo.a(th);
                return;
            }
            this.d = true;
            this.a.clear();
            this.b.a(th);
        }

        public final void clear() {
            this.a.clear();
            super.clear();
        }

        public final T poll() {
            Object poll;
            do {
                poll = this.c.poll();
                if (poll == null) {
                    break;
                }
            } while (!this.a.add(ajfv.a(this.f.apply(poll), "The keySelector returned a null key")));
            return poll;
        }
    }

    public ajok(ajdt<T> ajdt, ajfc<? super T, K> ajfc, Callable<? extends Collection<? super K>> callable) {
        super(ajdt);
        this.b = ajfc;
        this.c = callable;
    }

    public final void a_(ajdv<? super T> ajdv) {
        try {
            this.a.a(new a(ajdv, this.b, (Collection) ajfv.a(this.c.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (Throwable th) {
            ajep.a(th);
            ajfq.a(th, (ajdv) ajdv);
        }
    }
}
