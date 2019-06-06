package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ajnq */
public final class ajnq<T> extends ajdp<T> {
    private ajdt<? extends T>[] a;
    private Iterable<? extends ajdt<? extends T>> b = null;

    /* renamed from: ajnq$b */
    static final class b<T> extends AtomicReference<ajej> implements ajdv<T> {
        private a<T> a;
        private int b;
        private ajdv<? super T> c;
        private boolean d;

        b(a<T> aVar, int i, ajdv<? super T> ajdv) {
            this.a = aVar;
            this.b = i;
            this.c = ajdv;
        }

        public final void a() {
            if (this.d) {
                this.c.a();
                return;
            }
            if (this.a.a(this.b)) {
                this.d = true;
                this.c.a();
            }
        }

        public final void a(ajej ajej) {
            ajfp.b(this, ajej);
        }

        public final void a(T t) {
            if (this.d) {
                this.c.a((Object) t);
            } else if (this.a.a(this.b)) {
                this.d = true;
                this.c.a((Object) t);
            } else {
                ((ajej) get()).dispose();
            }
        }

        public final void a(Throwable th) {
            if (!this.d) {
                if (this.a.a(this.b)) {
                    this.d = true;
                } else {
                    ajvo.a(th);
                    return;
                }
            }
            this.c.a(th);
        }
    }

    /* renamed from: ajnq$a */
    static final class a<T> implements ajej {
        private ajdv<? super T> a;
        private b<T>[] b;
        private AtomicInteger c = new AtomicInteger();

        a(ajdv<? super T> ajdv, int i) {
            this.a = ajdv;
            this.b = new b[i];
        }

        public final void a(ajdt<? extends T>[] ajdtArr) {
            b[] bVarArr = this.b;
            int length = bVarArr.length;
            int i = 0;
            int i2 = 0;
            while (i2 < length) {
                int i3 = i2 + 1;
                bVarArr[i2] = new b(this, i3, this.a);
                i2 = i3;
            }
            this.c.lazySet(0);
            this.a.a((ajej) this);
            while (i < length && this.c.get() == 0) {
                ajdtArr[i].a(bVarArr[i]);
                i++;
            }
        }

        public final boolean a(int i) {
            int i2 = this.c.get();
            int i3 = 0;
            if (i2 != 0) {
                return i2 == i;
            } else {
                if (!this.c.compareAndSet(0, i)) {
                    return false;
                }
                b[] bVarArr = this.b;
                int length = bVarArr.length;
                while (i3 < length) {
                    int i4 = i3 + 1;
                    if (i4 != i) {
                        ajfp.a(bVarArr[i3]);
                    }
                    i3 = i4;
                }
                return true;
            }
        }

        public final void dispose() {
            if (this.c.get() != -1) {
                this.c.lazySet(-1);
                for (AtomicReference a : this.b) {
                    ajfp.a(a);
                }
            }
        }

        public final boolean isDisposed() {
            return this.c.get() == -1;
        }
    }

    public ajnq(ajdt<? extends T>[] ajdtArr) {
        this.a = ajdtArr;
    }

    public final void a_(ajdv<? super T> ajdv) {
        int i;
        ajdt[] ajdtArr = this.a;
        if (ajdtArr == null) {
            ajdtArr = new ajdp[8];
            Iterable<ajdt> iterable = null;
            try {
                i = 0;
                for (ajdt ajdt : iterable) {
                    if (ajdt == null) {
                        ajfq.a(new NullPointerException("One of the sources is null"), (ajdv) ajdv);
                        return;
                    }
                    if (i == ajdtArr.length) {
                        ajdt[] ajdtArr2 = new ajdt[((i >> 2) + i)];
                        System.arraycopy(ajdtArr, 0, ajdtArr2, 0, i);
                        ajdtArr = ajdtArr2;
                    }
                    int i2 = i + 1;
                    ajdtArr[i] = ajdt;
                    i = i2;
                }
            } catch (Throwable th) {
                ajep.a(th);
                ajfq.a(th, (ajdv) ajdv);
                return;
            }
        }
        i = ajdtArr.length;
        if (i == 0) {
            ajfq.a((ajdv) ajdv);
        } else if (i == 1) {
            ajdtArr[0].a(ajdv);
        } else {
            new a(ajdv, i).a(ajdtArr);
        }
    }
}
