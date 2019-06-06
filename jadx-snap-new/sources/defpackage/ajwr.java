package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ajwr */
public final class ajwr<T> extends ajdx<T> implements ajdz<T> {
    private static a[] b = new a[0];
    private static a[] c = new a[0];
    public final AtomicReference<a<T>[]> a = new AtomicReference(b);
    private AtomicBoolean d = new AtomicBoolean();
    private T e;
    private Throwable f;

    /* renamed from: ajwr$a */
    public static final class a<T> extends AtomicReference<ajwr<T>> implements ajej {
        final ajdz<? super T> a;

        a(ajdz<? super T> ajdz, ajwr<T> ajwr) {
            this.a = ajdz;
            lazySet(ajwr);
        }

        public final void dispose() {
            ajwr ajwr = (ajwr) getAndSet(null);
            if (ajwr != null) {
                ajwr.a(this);
            }
        }

        public final boolean isDisposed() {
            return get() == null;
        }
    }

    public final void a(ajej ajej) {
        if (this.a.get() == c) {
            ajej.dispose();
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(a<T> aVar) {
        a[] aVarArr;
        Object obj;
        do {
            aVarArr = (a[]) this.a.get();
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
            return;
        } while (!this.a.compareAndSet(aVarArr, obj));
    }

    public final void a(Throwable th) {
        ajfv.a((Object) th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        int i = 0;
        if (this.d.compareAndSet(false, true)) {
            this.f = th;
            a[] aVarArr = (a[]) this.a.getAndSet(c);
            int length = aVarArr.length;
            while (i < length) {
                aVarArr[i].a.a(th);
                i++;
            }
            return;
        }
        ajvo.a(th);
    }

    public final void b(ajdz<? super T> ajdz) {
        int i;
        a aVar = new a(ajdz, this);
        ajdz.a((ajej) aVar);
        a[] aVarArr;
        a[] aVarArr2;
        do {
            aVarArr = (a[]) this.a.get();
            i = 0;
            if (aVarArr == c) {
                break;
            }
            int length = aVarArr.length;
            aVarArr2 = new a[(length + 1)];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
        } while (!this.a.compareAndSet(aVarArr, aVarArr2));
        i = 1;
        if (i == 0) {
            Throwable th = this.f;
            if (th != null) {
                ajdz.a(th);
                return;
            }
            ajdz.b_(this.e);
        } else if (aVar.isDisposed()) {
            a(aVar);
        }
    }

    public final void b_(T t) {
        ajfv.a((Object) t, "onSuccess called with null. Null values are generally not allowed in 2.x operators and sources.");
        int i = 0;
        if (this.d.compareAndSet(false, true)) {
            this.e = t;
            a[] aVarArr = (a[]) this.a.getAndSet(c);
            int length = aVarArr.length;
            while (i < length) {
                aVarArr[i].a.b_(t);
                i++;
            }
        }
    }

    public final boolean j() {
        return this.a.get() == c && this.e != null;
    }

    public final boolean k() {
        return this.a.get() == c && this.f != null;
    }
}
