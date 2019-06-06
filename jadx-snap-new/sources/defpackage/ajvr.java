package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ajvr */
public final class ajvr<T> extends ajvq<T> {
    private static a[] m = new a[0];
    private static a[] n = new a[0];
    private AtomicInteger b = new AtomicInteger();
    private AtomicReference<akuy> c = new AtomicReference();
    private AtomicReference<a<T>[]> d = new AtomicReference(m);
    private AtomicBoolean e = new AtomicBoolean();
    private int f;
    private int g;
    private boolean h = false;
    private volatile ajgf<T> i;
    private volatile boolean j;
    private volatile Throwable k;
    private int l;

    /* renamed from: ajvr$a */
    static final class a<T> extends AtomicLong implements akuy {
        long a;
        private akux<? super T> b;
        private ajvr<T> c;

        a(akux<? super T> akux, ajvr<T> ajvr) {
            this.b = akux;
            this.c = ajvr;
        }

        /* Access modifiers changed, original: final */
        public final void a() {
            if (get() != Long.MIN_VALUE) {
                this.b.a();
            }
        }

        public final void a(long j) {
            if (ajui.b(j)) {
                long j2;
                long j3;
                do {
                    j2 = get();
                    if (j2 != Long.MIN_VALUE) {
                        j3 = Long.MAX_VALUE;
                        if (j2 != Long.MAX_VALUE) {
                            long j4 = j2 + j;
                            if (j4 >= 0) {
                                j3 = j4;
                            }
                        } else {
                            return;
                        }
                    }
                    return;
                } while (!compareAndSet(j2, j3));
                this.c.n();
            }
        }

        /* Access modifiers changed, original: final */
        public final void a(T t) {
            if (get() != Long.MIN_VALUE) {
                this.a++;
                this.b.a((Object) t);
            }
        }

        /* Access modifiers changed, original: final */
        public final void a(Throwable th) {
            if (get() != Long.MIN_VALUE) {
                this.b.a(th);
            }
        }

        public final void b() {
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.c.a(this);
            }
        }
    }

    private ajvr(int i) {
        ajfv.a(i, "bufferSize");
        this.f = i;
        this.g = i - (i >> 2);
    }

    public static <T> ajvr<T> l() {
        return new ajvr(ajde.a);
    }

    public final void a() {
        if (this.e.compareAndSet(false, true)) {
            this.j = true;
            n();
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(a<T> aVar) {
        while (true) {
            a[] aVarArr = (a[]) this.d.get();
            int length = aVarArr.length;
            if (length != 0) {
                int i = -1;
                for (int i2 = 0; i2 < length; i2++) {
                    if (aVarArr[i2] == aVar) {
                        i = i2;
                        break;
                    }
                }
                if (i >= 0) {
                    if (length != 1) {
                        a[] aVarArr2 = new a[(length - 1)];
                        System.arraycopy(aVarArr, 0, aVarArr2, 0, i);
                        System.arraycopy(aVarArr, i + 1, aVarArr2, i, (length - i) - 1);
                        if (this.d.compareAndSet(aVarArr, aVarArr2)) {
                            break;
                        }
                    } else if (this.d.compareAndSet(aVarArr, m)) {
                        return;
                    }
                } else {
                    break;
                }
            }
            return;
        }
    }

    public final void a(akuy akuy) {
        if (ajui.a(this.c, akuy)) {
            if (akuy instanceof ajgc) {
                ajgc ajgc = (ajgc) akuy;
                int a = ajgc.a(3);
                if (a == 1) {
                    this.l = a;
                    this.i = ajgc;
                    this.j = true;
                    n();
                    return;
                } else if (a == 2) {
                    this.l = a;
                    this.i = ajgc;
                    akuy.a((long) this.f);
                    return;
                }
            }
            this.i = new ajta(this.f);
            akuy.a((long) this.f);
        }
    }

    public final void a(T t) {
        if (!this.e.get()) {
            if (this.l == 0) {
                ajfv.a((Object) t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
                if (!this.i.offer(t)) {
                    ajui.a(this.c);
                    a(new ajeq());
                    return;
                }
            }
            n();
        }
    }

    public final void a(Throwable th) {
        ajfv.a((Object) th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.e.compareAndSet(false, true)) {
            this.k = th;
            this.j = true;
            n();
            return;
        }
        ajvo.a(th);
    }

    public final void a_(akux<? super T> akux) {
        int i;
        a aVar = new a(akux, this);
        akux.a((akuy) aVar);
        a[] aVarArr;
        a[] aVarArr2;
        do {
            aVarArr = (a[]) this.d.get();
            i = 0;
            if (aVarArr == n) {
                break;
            }
            int length = aVarArr.length;
            aVarArr2 = new a[(length + 1)];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
        } while (!this.d.compareAndSet(aVarArr, aVarArr2));
        i = 1;
        if (i == 0) {
            this.e.get();
            Throwable th = this.k;
            if (th != null) {
                akux.a(th);
            } else {
                akux.a();
            }
        } else if (aVar.get() == Long.MIN_VALUE) {
            a(aVar);
        } else {
            n();
        }
    }

    public final void m() {
        if (ajui.a(this.c, ajuf.INSTANCE)) {
            this.i = new ajta(this.f);
        }
    }

    /* Access modifiers changed, original: final */
    public final void n() {
        Throwable th;
        if (this.b.getAndIncrement() == 0) {
            AtomicReference atomicReference = this.d;
            int i = this.g;
            int i2 = this.l;
            int i3 = 0;
            int i4 = 1;
            while (true) {
                ajgf ajgf = this.i;
                if (ajgf != null) {
                    a[] aVarArr = (a[]) atomicReference.get();
                    if (aVarArr.length != 0) {
                        a aVar;
                        a[] aVarArr2;
                        int length = aVarArr.length;
                        long j = -1;
                        long j2 = -1;
                        int i5 = 0;
                        while (i5 < length) {
                            aVar = aVarArr[i5];
                            long j3 = aVar.get();
                            if (j3 >= 0) {
                                j2 = j2 == j ? j3 - aVar.a : Math.min(j2, j3 - aVar.a);
                            }
                            i5++;
                            j = -1;
                        }
                        int i6 = i3;
                        while (j2 > 0) {
                            aVarArr2 = (a[]) atomicReference.get();
                            if (aVarArr2 != n) {
                                if (aVarArr != aVarArr2) {
                                    break;
                                }
                                boolean z;
                                Object obj;
                                try {
                                    Object poll = ajgf.poll();
                                    z = this.j;
                                    obj = poll;
                                } catch (Throwable th2) {
                                    Throwable th3 = th2;
                                    ajep.a(th3);
                                    ajui.a(this.c);
                                    obj = null;
                                    this.k = th3;
                                    this.j = true;
                                    z = true;
                                }
                                Object obj2 = obj == null ? 1 : null;
                                if (!z || obj2 == null) {
                                    if (obj2 != null) {
                                        break;
                                    }
                                    for (a a : aVarArr) {
                                        a.a(obj);
                                    }
                                    j2--;
                                    if (i2 != 1) {
                                        i6++;
                                        if (i6 == i) {
                                            ((akuy) this.c.get()).a((long) i);
                                            i6 = 0;
                                        }
                                    }
                                } else {
                                    th2 = this.k;
                                    if (th2 != null) {
                                        for (a aVar2 : (a[]) atomicReference.getAndSet(n)) {
                                            aVar2.a(th2);
                                        }
                                        return;
                                    }
                                    for (a a2 : (a[]) atomicReference.getAndSet(n)) {
                                        a2.a();
                                    }
                                    return;
                                }
                            }
                            ajgf.clear();
                            return;
                        }
                        if (j2 == 0) {
                            aVarArr2 = (a[]) atomicReference.get();
                            if (aVarArr2 == n) {
                                ajgf.clear();
                                return;
                            }
                            if (aVarArr == aVarArr2) {
                                if (this.j && ajgf.isEmpty()) {
                                    th2 = this.k;
                                    if (th2 != null) {
                                        for (a aVar22 : (a[]) atomicReference.getAndSet(n)) {
                                            aVar22.a(th2);
                                        }
                                        return;
                                    }
                                    for (a a22 : (a[]) atomicReference.getAndSet(n)) {
                                        a22.a();
                                    }
                                    return;
                                }
                            }
                            i3 = i6;
                        }
                        i3 = i6;
                    }
                }
                i4 = this.b.addAndGet(-i4);
                if (i4 == 0) {
                    return;
                }
            }
        }
    }
}
