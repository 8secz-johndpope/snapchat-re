package defpackage;

import defpackage.ajmk.a;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ajnc */
public final class ajnc<T, R> extends ajdj<R> {
    final ajfc<? super Object[], ? extends R> a;
    private ajdn<? extends T>[] b;

    /* renamed from: ajnc$b */
    static final class b<T, R> extends AtomicInteger implements ajej {
        final ajdl<? super R> a;
        final ajfc<? super Object[], ? extends R> b;
        final c<T>[] c;
        final Object[] d;

        b(ajdl<? super R> ajdl, int i, ajfc<? super Object[], ? extends R> ajfc) {
            super(i);
            this.a = ajdl;
            this.b = ajfc;
            c[] cVarArr = new c[i];
            for (int i2 = 0; i2 < i; i2++) {
                cVarArr[i2] = new c(this, i2);
            }
            this.c = cVarArr;
            this.d = new Object[i];
        }

        /* Access modifiers changed, original: final */
        public final void a(int i) {
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

    /* renamed from: ajnc$c */
    static final class c<T> extends AtomicReference<ajej> implements ajdl<T> {
        private b<T, ?> a;
        private int b;

        c(b<T, ?> bVar, int i) {
            this.a = bVar;
            this.b = i;
        }

        public final void a() {
            b bVar = this.a;
            int i = this.b;
            if (bVar.getAndSet(0) > 0) {
                bVar.a(i);
                bVar.a.a();
            }
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

    /* renamed from: ajnc$a */
    final class a implements ajfc<T, R> {
        a() {
        }

        public final R apply(T t) {
            return ajfv.a(ajnc.this.a.apply(new Object[]{t}), "The zipper returned a null value");
        }
    }

    public ajnc(ajdn<? extends T>[] ajdnArr, ajfc<? super Object[], ? extends R> ajfc) {
        this.b = ajdnArr;
        this.a = ajfc;
    }

    public final void a(ajdl<? super R> ajdl) {
        ajdn[] ajdnArr = this.b;
        int length = ajdnArr.length;
        int i = 0;
        if (length == 1) {
            ajdnArr[0].b(new a(ajdl, new a()));
            return;
        }
        ajej bVar = new b(ajdl, length, this.a);
        ajdl.a(bVar);
        while (i < length && !bVar.isDisposed()) {
            ajdn ajdn = ajdnArr[i];
            if (ajdn == null) {
                bVar.a(new NullPointerException("One of the sources is null"), i);
                return;
            } else {
                ajdn.b(bVar.c[i]);
                i++;
            }
        }
    }
}
