package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ajvs */
public final class ajvs<T> extends ajvq<T> {
    private static a[] b = new a[0];
    private static a[] c = new a[0];
    private AtomicReference<a<T>[]> d = new AtomicReference(c);
    private Throwable e;

    /* renamed from: ajvs$a */
    static final class a<T> extends AtomicLong implements akuy {
        final akux<? super T> a;
        private ajvs<T> b;

        a(akux<? super T> akux, ajvs<T> ajvs) {
            this.a = akux;
            this.b = ajvs;
        }

        public final void a(long j) {
            if (ajui.b(j)) {
                ajum.b(this, j);
            }
        }

        public final void b() {
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.b.a(this);
            }
        }
    }

    public final void a() {
        Object obj = this.d.get();
        Object obj2 = b;
        if (obj != obj2) {
            for (a aVar : (a[]) this.d.getAndSet(obj2)) {
                if (aVar.get() != Long.MIN_VALUE) {
                    aVar.a.a();
                }
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(a<T> aVar) {
        a[] aVarArr;
        Object obj;
        do {
            aVarArr = (a[]) this.d.get();
            if (aVarArr != b && aVarArr != c) {
                int length = aVarArr.length;
                int i = -1;
                for (int i2 = 0; i2 < length; i2++) {
                    if (aVarArr[i2] == aVar) {
                        i = i2;
                        break;
                    }
                }
                if (i >= 0) {
                    if (length == 1) {
                        obj = c;
                    } else {
                        Object obj2 = new a[(length - 1)];
                        System.arraycopy(aVarArr, 0, obj2, 0, i);
                        System.arraycopy(aVarArr, i + 1, obj2, i, (length - i) - 1);
                        obj = obj2;
                    }
                } else {
                    return;
                }
            }
        } while (!this.d.compareAndSet(aVarArr, obj));
    }

    public final void a(akuy akuy) {
        if (this.d.get() == b) {
            akuy.b();
        } else {
            akuy.a(Long.MAX_VALUE);
        }
    }

    public final void a(T t) {
        ajfv.a((Object) t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        for (a aVar : (a[]) this.d.get()) {
            long j = aVar.get();
            if (j != Long.MIN_VALUE) {
                if (j != 0) {
                    aVar.a.a((Object) t);
                    ajum.d(aVar, 1);
                } else {
                    aVar.b();
                    aVar.a.a(new ajeq("Could not emit value due to lack of requests"));
                }
            }
        }
    }

    public final void a(Throwable th) {
        ajfv.a((Object) th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        Object obj = this.d.get();
        Object obj2 = b;
        if (obj == obj2) {
            ajvo.a(th);
            return;
        }
        this.e = th;
        for (a aVar : (a[]) this.d.getAndSet(obj2)) {
            if (aVar.get() != Long.MIN_VALUE) {
                aVar.a.a(th);
            } else {
                ajvo.a(th);
            }
        }
    }

    public final void a_(akux<? super T> akux) {
        Object obj;
        Object obj2;
        a aVar = new a(akux, this);
        akux.a((akuy) aVar);
        a[] aVarArr;
        a[] aVarArr2;
        do {
            aVarArr = (a[]) this.d.get();
            obj = 1;
            if (aVarArr == b) {
                obj2 = null;
                break;
            }
            int length = aVarArr.length;
            aVarArr2 = new a[(length + 1)];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
        } while (!this.d.compareAndSet(aVarArr, aVarArr2));
        obj2 = 1;
        if (obj2 != null) {
            if (aVar.get() != Long.MIN_VALUE) {
                obj = null;
            }
            if (obj != null) {
                a(aVar);
                return;
            }
        }
        Throwable th = this.e;
        if (th != null) {
            akux.a(th);
            return;
        }
        akux.a();
    }
}
