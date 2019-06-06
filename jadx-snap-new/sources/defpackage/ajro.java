package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ajro */
public final class ajro<T> extends ajdx<T> implements ajdz<T> {
    private static a[] a = new a[0];
    private static a[] b = new a[0];
    private ajeb<? extends T> c;
    private AtomicInteger d = new AtomicInteger();
    private AtomicReference<a<T>[]> e = new AtomicReference(a);
    private T f;
    private Throwable g;

    /* renamed from: ajro$a */
    static final class a<T> extends AtomicBoolean implements ajej {
        final ajdz<? super T> a;
        private ajro<T> b;

        a(ajdz<? super T> ajdz, ajro<T> ajro) {
            this.a = ajdz;
            this.b = ajro;
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

    public ajro(ajeb<? extends T> ajeb) {
        this.c = ajeb;
    }

    public final void a(ajej ajej) {
    }

    /* Access modifiers changed, original: final */
    public final void a(a<T> aVar) {
        a[] aVarArr;
        Object obj;
        do {
            aVarArr = (a[]) this.e.get();
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
                    if (length == 1) {
                        obj = a;
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
            return;
        } while (!this.e.compareAndSet(aVarArr, obj));
    }

    public final void a(Throwable th) {
        this.g = th;
        for (a aVar : (a[]) this.e.getAndSet(b)) {
            if (!aVar.isDisposed()) {
                aVar.a.a(th);
            }
        }
    }

    public final void b(ajdz<? super T> ajdz) {
        int i;
        a aVar = new a(ajdz, this);
        ajdz.a((ajej) aVar);
        a[] aVarArr;
        a[] aVarArr2;
        do {
            aVarArr = (a[]) this.e.get();
            i = 0;
            if (aVarArr == b) {
                break;
            }
            int length = aVarArr.length;
            aVarArr2 = new a[(length + 1)];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
        } while (!this.e.compareAndSet(aVarArr, aVarArr2));
        i = 1;
        if (i != 0) {
            if (aVar.isDisposed()) {
                a(aVar);
            }
            if (this.d.getAndIncrement() == 0) {
                this.c.a(this);
            }
            return;
        }
        Throwable th = this.g;
        if (th != null) {
            ajdz.a(th);
        } else {
            ajdz.b_(this.f);
        }
    }

    public final void b_(T t) {
        this.f = t;
        for (a aVar : (a[]) this.e.getAndSet(b)) {
            if (!aVar.isDisposed()) {
                aVar.a.b_(t);
            }
        }
    }
}
