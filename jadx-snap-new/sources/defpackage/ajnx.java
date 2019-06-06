package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ajnx */
public final class ajnx<T> extends ajnp<T, T> implements ajdv<T> {
    static final a[] c = new a[0];
    private static a[] g = new a[0];
    final AtomicReference<a<T>[]> b;
    final b<T> d;
    private AtomicBoolean e = new AtomicBoolean();
    private int f = 16;
    private volatile long h;
    private b<T> i;
    private int j;
    private Throwable k;
    private volatile boolean l;

    /* renamed from: ajnx$b */
    static final class b<T> {
        final T[] a;
        volatile b<T> b;

        b(int i) {
            this.a = new Object[i];
        }
    }

    /* renamed from: ajnx$a */
    static final class a<T> extends AtomicInteger implements ajej {
        final ajdv<? super T> a;
        b<T> b;
        int c;
        long d;
        volatile boolean e;
        private ajnx<T> f;

        a(ajdv<? super T> ajdv, ajnx<T> ajnx) {
            this.a = ajdv;
            this.f = ajnx;
            this.b = ajnx.d;
        }

        public final void dispose() {
            if (!this.e) {
                this.e = true;
                ajnx ajnx = this.f;
                a[] aVarArr;
                Object obj;
                do {
                    aVarArr = (a[]) ajnx.b.get();
                    int length = aVarArr.length;
                    if (length != 0) {
                        int i = -1;
                        for (int i2 = 0; i2 < length; i2++) {
                            if (aVarArr[i2] == this) {
                                i = i2;
                                break;
                            }
                        }
                        if (i < 0) {
                            return;
                        }
                        if (length == 1) {
                            obj = ajnx.c;
                        } else {
                            Object obj2 = new a[(length - 1)];
                            System.arraycopy(aVarArr, 0, obj2, 0, i);
                            System.arraycopy(aVarArr, i + 1, obj2, i, (length - i) - 1);
                            obj = obj2;
                        }
                    } else {
                        return;
                    }
                } while (!ajnx.b.compareAndSet(aVarArr, obj));
            }
        }

        public final boolean isDisposed() {
            return this.e;
        }
    }

    public ajnx(ajdp<T> ajdp) {
        super(ajdp);
        b bVar = new b(16);
        this.d = bVar;
        this.i = bVar;
        this.b = new AtomicReference(c);
    }

    private void a(a<T> aVar) {
        if (aVar.getAndIncrement() == 0) {
            long j = aVar.d;
            int i = aVar.c;
            b bVar = aVar.b;
            ajdv ajdv = aVar.a;
            int i2 = this.f;
            int i3 = 1;
            while (!aVar.e) {
                boolean z = this.l;
                Object obj = this.h == j ? 1 : null;
                if (z && obj != null) {
                    aVar.b = null;
                    Throwable th = this.k;
                    if (th != null) {
                        ajdv.a(th);
                        return;
                    } else {
                        ajdv.a();
                        return;
                    }
                } else if (obj == null) {
                    if (i == i2) {
                        bVar = bVar.b;
                        i = 0;
                    }
                    ajdv.a(bVar.a[i]);
                    i++;
                    j++;
                } else {
                    aVar.d = j;
                    aVar.c = i;
                    aVar.b = bVar;
                    i3 = aVar.addAndGet(-i3);
                    if (i3 == 0) {
                        return;
                    }
                }
            }
            aVar.b = null;
        }
    }

    public final void a() {
        this.l = true;
        for (a a : (a[]) this.b.getAndSet(g)) {
            a(a);
        }
    }

    public final void a(ajej ajej) {
    }

    public final void a(T t) {
        int i = this.j;
        int i2 = 0;
        if (i == this.f) {
            b bVar = new b(i);
            bVar.a[0] = t;
            this.j = 1;
            this.i.b = bVar;
            this.i = bVar;
        } else {
            this.i.a[i] = t;
            this.j = i + 1;
        }
        this.h++;
        a[] aVarArr = (a[]) this.b.get();
        i = aVarArr.length;
        while (i2 < i) {
            a(aVarArr[i2]);
            i2++;
        }
    }

    public final void a(Throwable th) {
        this.k = th;
        this.l = true;
        for (a a : (a[]) this.b.getAndSet(g)) {
            a(a);
        }
    }

    public final void a_(ajdv<? super T> ajdv) {
        a aVar = new a(ajdv, this);
        ajdv.a((ajej) aVar);
        a[] aVarArr;
        a[] aVarArr2;
        do {
            aVarArr = (a[]) this.b.get();
            if (aVarArr == g) {
                break;
            }
            int length = aVarArr.length;
            aVarArr2 = new a[(length + 1)];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
        } while (!this.b.compareAndSet(aVarArr, aVarArr2));
        if (this.e.get() || !this.e.compareAndSet(false, true)) {
            a(aVar);
        } else {
            this.a.a(this);
        }
    }
}
