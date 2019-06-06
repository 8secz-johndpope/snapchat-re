package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ajir */
public final class ajir<T> extends ajim<T, T> implements ajdh<T> {
    static final a[] d = new a[0];
    private static a[] h = new a[0];
    final AtomicReference<a<T>[]> c;
    final b<T> e;
    private AtomicBoolean f = new AtomicBoolean();
    private int g = 16;
    private volatile long i;
    private b<T> j;
    private int k;
    private Throwable l;
    private volatile boolean m;

    /* renamed from: ajir$a */
    static final class a<T> extends AtomicInteger implements akuy {
        final akux<? super T> a;
        final AtomicLong b = new AtomicLong();
        b<T> c;
        int d;
        long e;
        private ajir<T> f;

        a(akux<? super T> akux, ajir<T> ajir) {
            this.a = akux;
            this.f = ajir;
            this.c = ajir.e;
        }

        public final void a(long j) {
            if (ajui.b(j)) {
                ajum.b(this.b, j);
                this.f.a(this);
            }
        }

        public final void b() {
            if (this.b.getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                ajir ajir = this.f;
                a[] aVarArr;
                Object obj;
                do {
                    aVarArr = (a[]) ajir.c.get();
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
                            obj = ajir.d;
                        } else {
                            Object obj2 = new a[(length - 1)];
                            System.arraycopy(aVarArr, 0, obj2, 0, i);
                            System.arraycopy(aVarArr, i + 1, obj2, i, (length - i) - 1);
                            obj = obj2;
                        }
                    } else {
                        return;
                    }
                } while (!ajir.c.compareAndSet(aVarArr, obj));
            }
        }
    }

    /* renamed from: ajir$b */
    static final class b<T> {
        final T[] a;
        volatile b<T> b;

        b(int i) {
            this.a = new Object[i];
        }
    }

    public ajir(ajde<T> ajde) {
        super(ajde);
        b bVar = new b(16);
        this.e = bVar;
        this.j = bVar;
        this.c = new AtomicReference(d);
    }

    public final void a() {
        this.m = true;
        for (a a : (a[]) this.c.getAndSet(h)) {
            a(a);
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(a<T> aVar) {
        a<T> aVar2 = aVar;
        if (aVar.getAndIncrement() == 0) {
            long j = aVar2.e;
            int i = aVar2.d;
            b bVar = aVar2.c;
            AtomicLong atomicLong = aVar2.b;
            akux akux = aVar2.a;
            int i2 = this.g;
            b bVar2 = bVar;
            int i3 = i;
            i = 1;
            while (true) {
                boolean z = this.m;
                int i4 = 0;
                Object obj = this.i == j ? 1 : null;
                if (!z || obj == null) {
                    if (obj == null) {
                        long j2 = atomicLong.get();
                        if (j2 == Long.MIN_VALUE) {
                            aVar2.c = null;
                            return;
                        } else if (j2 != j) {
                            if (i3 == i2) {
                                bVar2 = bVar2.b;
                            } else {
                                i4 = i3;
                            }
                            akux.a(bVar2.a[i4]);
                            i3 = i4 + 1;
                            j++;
                        }
                    }
                    aVar2.e = j;
                    aVar2.d = i3;
                    aVar2.c = bVar2;
                    i = aVar2.addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                } else {
                    aVar2.c = null;
                    Throwable th = this.l;
                    if (th != null) {
                        akux.a(th);
                        return;
                    } else {
                        akux.a();
                        return;
                    }
                }
            }
        }
    }

    public final void a(akuy akuy) {
        akuy.a(Long.MAX_VALUE);
    }

    public final void a(T t) {
        int i = this.k;
        int i2 = 0;
        if (i == this.g) {
            b bVar = new b(i);
            bVar.a[0] = t;
            this.k = 1;
            this.j.b = bVar;
            this.j = bVar;
        } else {
            this.j.a[i] = t;
            this.k = i + 1;
        }
        this.i++;
        a[] aVarArr = (a[]) this.c.get();
        i = aVarArr.length;
        while (i2 < i) {
            a(aVarArr[i2]);
            i2++;
        }
    }

    public final void a(Throwable th) {
        if (this.m) {
            ajvo.a(th);
            return;
        }
        this.l = th;
        this.m = true;
        for (a a : (a[]) this.c.getAndSet(h)) {
            a(a);
        }
    }

    public final void a_(akux<? super T> akux) {
        a aVar = new a(akux, this);
        akux.a((akuy) aVar);
        a[] aVarArr;
        a[] aVarArr2;
        do {
            aVarArr = (a[]) this.c.get();
            if (aVarArr == h) {
                break;
            }
            int length = aVarArr.length;
            aVarArr2 = new a[(length + 1)];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
        } while (!this.c.compareAndSet(aVarArr, aVarArr2));
        if (this.f.get() || !this.f.compareAndSet(false, true)) {
            a(aVar);
        } else {
            this.b.a((ajdh) this);
        }
    }
}
