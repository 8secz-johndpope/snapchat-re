package defpackage;

import defpackage.mid.a;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* renamed from: mif */
public final class mif {

    /* renamed from: mif$b */
    static final class b<I, R> implements mid<I, R> {
        private final akbl<I, R> a;

        /* renamed from: mif$b$a */
        static final class a<V> implements Callable<T> {
            private /* synthetic */ b a;
            private /* synthetic */ Object b;

            a(b bVar, Object obj) {
                this.a = bVar;
                this.b = obj;
            }

            public final R call() {
                return this.a.a(this.b);
            }
        }

        public b(akbl<? super I, ? extends R> akbl) {
            akcr.b(akbl, "block");
            this.a = akbl;
        }

        public final ajdp<min> a(long j, TimeUnit timeUnit) {
            akcr.b(timeUnit, "timeUnit");
            return a.a(timeUnit);
        }

        public final R a(I i) {
            return this.a.invoke(i);
        }

        public final ajdx<R> b(I i) {
            Object c = ajdx.c((Callable) new a(this, i));
            akcr.a(c, "Single.fromCallable { execute(input) }");
            return c;
        }

        public final ajdp<R> c(I i) {
            return a.a(this, i);
        }
    }

    /* renamed from: mif$a */
    static final class a<I, R> implements mid<I, R> {
        private final R a;

        public a(R r) {
            this.a = r;
        }

        public final ajdp<min> a(long j, TimeUnit timeUnit) {
            akcr.b(timeUnit, "timeUnit");
            return defpackage.mid.a.a(timeUnit);
        }

        public final R a(I i) {
            return this.a;
        }

        public final ajdx<R> b(I i) {
            Object b = ajdx.b(this.a);
            akcr.a(b, "Single.just(value)");
            return b;
        }

        public final ajdp<R> c(I i) {
            return defpackage.mid.a.a(this, i);
        }
    }

    static {
        mif mif = new mif();
    }

    private mif() {
    }

    public static final <I, R> mid<I, R> a(akbl<? super I, ? extends R> akbl) {
        akcr.b(akbl, "block");
        return new b(akbl);
    }

    public static final <I, R> mid<I, R> a(R r) {
        return new a(r);
    }
}
