package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ajhe */
public final class ajhe extends ajcx implements ajcz {
    private static a[] a = new a[0];
    private static a[] b = new a[0];
    private ajdb c;
    private AtomicReference<a[]> d = new AtomicReference(a);
    private AtomicBoolean e = new AtomicBoolean();
    private Throwable f;

    /* renamed from: ajhe$a */
    final class a extends AtomicBoolean implements ajej {
        final ajcz a;

        a(ajcz ajcz) {
            this.a = ajcz;
        }

        public final void dispose() {
            if (compareAndSet(false, true)) {
                ajhe.this.a(this);
            }
        }

        public final boolean isDisposed() {
            return get();
        }
    }

    public ajhe(ajdb ajdb) {
        this.c = ajdb;
    }

    public final void a() {
        for (a aVar : (a[]) this.d.getAndSet(b)) {
            if (!aVar.get()) {
                aVar.a.a();
            }
        }
    }

    public final void a(ajej ajej) {
    }

    /* Access modifiers changed, original: final */
    public final void a(a aVar) {
        a[] aVarArr;
        Object obj;
        do {
            aVarArr = (a[]) this.d.get();
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
        } while (!this.d.compareAndSet(aVarArr, obj));
    }

    public final void a(Throwable th) {
        this.f = th;
        for (a aVar : (a[]) this.d.getAndSet(b)) {
            if (!aVar.get()) {
                aVar.a.a(th);
            }
        }
    }

    public final void b(ajcz ajcz) {
        Object obj;
        a aVar = new a(ajcz);
        ajcz.a((ajej) aVar);
        a[] aVarArr;
        a[] aVarArr2;
        do {
            aVarArr = (a[]) this.d.get();
            if (aVarArr == b) {
                obj = null;
                break;
            }
            int length = aVarArr.length;
            aVarArr2 = new a[(length + 1)];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
        } while (!this.d.compareAndSet(aVarArr, aVarArr2));
        obj = 1;
        if (obj != null) {
            if (aVar.isDisposed()) {
                a(aVar);
            }
            if (this.e.compareAndSet(false, true)) {
                this.c.a(this);
                return;
            }
        }
        Throwable th = this.f;
        if (th != null) {
            ajcz.a(th);
            return;
        }
        ajcz.a();
    }
}
