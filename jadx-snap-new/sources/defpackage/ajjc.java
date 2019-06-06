package defpackage;

import java.util.Collection;
import java.util.concurrent.Callable;

/* renamed from: ajjc */
public final class ajjc<T, K> extends ajim<T, T> {
    private ajfc<? super T, K> c;
    private Callable<? extends Collection<? super K>> d;

    /* renamed from: ajjc$a */
    static final class a<T, K> extends ajts<T, T> {
        private Collection<? super K> a;
        private ajfc<? super T, K> g;

        a(akux<? super T> akux, ajfc<? super T, K> ajfc, Collection<? super K> collection) {
            super(akux);
            this.g = ajfc;
            this.a = collection;
        }

        public final int a(int i) {
            return b(i);
        }

        public final void a() {
            if (!this.e) {
                this.e = true;
                this.a.clear();
                this.b.a();
            }
        }

        public final void a(T t) {
            if (!this.e) {
                if (this.f == 0) {
                    try {
                        if (this.a.add(ajfv.a(this.g.apply(t), "The keySelector returned a null key"))) {
                            this.b.a((Object) t);
                            return;
                        } else {
                            this.c.a(1);
                            return;
                        }
                    } catch (Throwable th) {
                        b(th);
                        return;
                    }
                }
                this.b.a(null);
            }
        }

        public final void a(Throwable th) {
            if (this.e) {
                ajvo.a(th);
                return;
            }
            this.e = true;
            this.a.clear();
            this.b.a(th);
        }

        public final void clear() {
            this.a.clear();
            super.clear();
        }

        public final T poll() {
            Object poll;
            while (true) {
                poll = this.d.poll();
                if (poll == null || this.a.add(ajfv.a(this.g.apply(poll), "The keySelector returned a null key"))) {
                    return poll;
                }
                if (this.f == 2) {
                    this.c.a(1);
                }
            }
            return poll;
        }
    }

    public ajjc(ajde<T> ajde, ajfc<? super T, K> ajfc, Callable<? extends Collection<? super K>> callable) {
        super(ajde);
        this.c = ajfc;
        this.d = callable;
    }

    public final void a_(akux<? super T> akux) {
        try {
            this.b.a(new a(akux, this.c, (Collection) ajfv.a(this.d.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (Throwable th) {
            ajep.a(th);
            ajuf.a(th, akux);
        }
    }
}
