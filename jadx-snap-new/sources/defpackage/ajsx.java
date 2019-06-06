package defpackage;

import defpackage.ajsm.a;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ajsx */
public final class ajsx<T, R> extends ajdx<R> {
    final ajfc<? super Object[], ? extends R> a;
    private ajeb<? extends T>[] b;

    /* renamed from: ajsx$c */
    static final class c<T> extends AtomicReference<ajej> implements ajdz<T> {
        private b<T, ?> a;
        private int b;

        c(b<T, ?> bVar, int i) {
            this.a = bVar;
            this.b = i;
        }

        public final void a(ajej ajej) {
            ajfp.b(this, ajej);
        }

        public final void a(Throwable th) {
            this.a.a(th, this.b);
        }

        public final void b_(T t) {
            b bVar = this.a;
            bVar.d[this.b] = t;
            if (bVar.decrementAndGet() == 0) {
                try {
                    bVar.a.b_(ajfv.a(bVar.b.apply(bVar.d), "The zipper returned a null value"));
                } catch (Throwable th) {
                    ajep.a(th);
                    bVar.a.a(th);
                }
            }
        }
    }

    /* renamed from: ajsx$b */
    static final class b<T, R> extends AtomicInteger implements ajej {
        final ajdz<? super R> a;
        final ajfc<? super Object[], ? extends R> b;
        final c<T>[] c;
        final Object[] d;

        b(ajdz<? super R> ajdz, int i, ajfc<? super Object[], ? extends R> ajfc) {
            super(i);
            this.a = ajdz;
            this.b = ajfc;
            c[] cVarArr = new c[i];
            for (int i2 = 0; i2 < i; i2++) {
                cVarArr[i2] = new c(this, i2);
            }
            this.c = cVarArr;
            this.d = new Object[i];
        }

        private void a(int i) {
            c[] cVarArr = this.c;
            int length = cVarArr.length;
            for (int i2 = 0; i2 < i; i2++) {
                ajfp.a(cVarArr[i2]);
            }
            while (true) {
                i++;
                if (i < length) {
                    ajfp.a(cVarArr[i]);
                } else {
                    return;
                }
            }
        }

        /* Access modifiers changed, original: final */
        public final void a(Throwable th, int i) {
            if (getAndSet(0) > 0) {
                a(i);
                this.a.a(th);
                return;
            }
            ajvo.a(th);
        }

        public final void dispose() {
            int i = 0;
            if (getAndSet(0) > 0) {
                c[] cVarArr = this.c;
                int length = cVarArr.length;
                while (i < length) {
                    ajfp.a(cVarArr[i]);
                    i++;
                }
            }
        }

        public final boolean isDisposed() {
            return get() <= 0;
        }
    }

    /* renamed from: ajsx$a */
    final class a implements ajfc<T, R> {
        a() {
        }

        public final R apply(T t) {
            return ajfv.a(ajsx.this.a.apply(new Object[]{t}), "The zipper returned a null value");
        }
    }

    public ajsx(ajeb<? extends T>[] ajebArr, ajfc<? super Object[], ? extends R> ajfc) {
        this.b = ajebArr;
        this.a = ajfc;
    }

    public final void b(ajdz<? super R> ajdz) {
        ajeb[] ajebArr = this.b;
        int length = ajebArr.length;
        int i = 0;
        if (length == 1) {
            ajebArr[0].a(new a(ajdz, new a()));
            return;
        }
        ajej bVar = new b(ajdz, length, this.a);
        ajdz.a(bVar);
        while (i < length && !bVar.isDisposed()) {
            ajeb ajeb = ajebArr[i];
            if (ajeb == null) {
                bVar.a(new NullPointerException("One of the sources is null"), i);
                return;
            } else {
                ajeb.a(bVar.c[i]);
                i++;
            }
        }
    }
}
