package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ajwo */
public final class ajwo<T> extends ajws<T> {
    private static a[] a = new a[0];
    private static a[] b = new a[0];
    private AtomicReference<a<T>[]> c = new AtomicReference(b);
    private Throwable d;

    /* renamed from: ajwo$a */
    static final class a<T> extends AtomicBoolean implements ajej {
        final ajdv<? super T> a;
        private ajwo<T> b;

        a(ajdv<? super T> ajdv, ajwo<T> ajwo) {
            this.a = ajdv;
            this.b = ajwo;
        }

        public final void dispose() {
            if (compareAndSet(false, true)) {
                this.b.a(this);
            }
        }

        public final boolean isDisposed() {
            return get();
        }
    }

    public final void a() {
        Object obj = this.c.get();
        Object obj2 = a;
        if (obj != obj2) {
            for (a aVar : (a[]) this.c.getAndSet(obj2)) {
                if (!aVar.get()) {
                    aVar.a.a();
                }
            }
        }
    }

    public final void a(ajej ajej) {
        if (this.c.get() == a) {
            ajej.dispose();
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(a<T> aVar) {
        a[] aVarArr;
        Object obj;
        do {
            aVarArr = (a[]) this.c.get();
            if (aVarArr != a && aVarArr != b) {
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
                        obj = b;
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
        } while (!this.c.compareAndSet(aVarArr, obj));
    }

    public final void a(T t) {
        ajfv.a((Object) t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        for (a aVar : (a[]) this.c.get()) {
            if (!aVar.get()) {
                aVar.a.a((Object) t);
            }
        }
    }

    public final void a(Throwable th) {
        ajfv.a((Object) th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        Object obj = this.c.get();
        Object obj2 = a;
        if (obj == obj2) {
            ajvo.a(th);
            return;
        }
        this.d = th;
        for (a aVar : (a[]) this.c.getAndSet(obj2)) {
            if (aVar.get()) {
                ajvo.a(th);
            } else {
                aVar.a.a(th);
            }
        }
    }

    public final void a_(ajdv<? super T> ajdv) {
        int i;
        a aVar = new a(ajdv, this);
        ajdv.a((ajej) aVar);
        a[] aVarArr;
        a[] aVarArr2;
        do {
            aVarArr = (a[]) this.c.get();
            i = 0;
            if (aVarArr == a) {
                break;
            }
            int length = aVarArr.length;
            aVarArr2 = new a[(length + 1)];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
        } while (!this.c.compareAndSet(aVarArr, aVarArr2));
        i = 1;
        if (i == 0) {
            Throwable th = this.d;
            if (th != null) {
                ajdv.a(th);
                return;
            }
            ajdv.a();
        } else if (aVar.isDisposed()) {
            a(aVar);
        }
    }

    public final boolean n() {
        return ((a[]) this.c.get()).length != 0;
    }

    public final boolean o() {
        return this.c.get() == a && this.d == null;
    }
}
