package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: ajhx */
public final class ajhx extends ajcx {
    private ajdb[] a;

    /* renamed from: ajhx$a */
    static final class a extends AtomicInteger implements ajcz {
        private ajcz a;
        private AtomicBoolean b;
        private ajei c;

        a(ajcz ajcz, AtomicBoolean atomicBoolean, ajei ajei, int i) {
            this.a = ajcz;
            this.b = atomicBoolean;
            this.c = ajei;
            lazySet(i);
        }

        public final void a() {
            if (decrementAndGet() == 0 && this.b.compareAndSet(false, true)) {
                this.a.a();
            }
        }

        public final void a(ajej ajej) {
            this.c.a(ajej);
        }

        public final void a(Throwable th) {
            this.c.dispose();
            if (this.b.compareAndSet(false, true)) {
                this.a.a(th);
            } else {
                ajvo.a(th);
            }
        }
    }

    public ajhx(ajdb[] ajdbArr) {
        this.a = ajdbArr;
    }

    public final void b(ajcz ajcz) {
        ajej ajei = new ajei();
        a aVar = new a(ajcz, new AtomicBoolean(), ajei, this.a.length + 1);
        ajcz.a(ajei);
        ajdb[] ajdbArr = this.a;
        int length = ajdbArr.length;
        int i = 0;
        while (i < length) {
            ajdb ajdb = ajdbArr[i];
            if (!ajei.isDisposed()) {
                if (ajdb == null) {
                    ajei.dispose();
                    aVar.a(new NullPointerException("A completable source is null"));
                    return;
                }
                ajdb.a(aVar);
                i++;
            } else {
                return;
            }
        }
        aVar.a();
    }
}
