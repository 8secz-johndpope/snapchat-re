package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ajhy */
public final class ajhy extends ajcx {
    private ajdb[] a;

    /* renamed from: ajhy$a */
    static final class a implements ajcz {
        private ajcz a;
        private ajei b;
        private ajul c;
        private AtomicInteger d;

        a(ajcz ajcz, ajei ajei, ajul ajul, AtomicInteger atomicInteger) {
            this.a = ajcz;
            this.b = ajei;
            this.c = ajul;
            this.d = atomicInteger;
        }

        private void b() {
            if (this.d.decrementAndGet() == 0) {
                Throwable a = ajur.a(this.c);
                if (a == null) {
                    this.a.a();
                    return;
                }
                this.a.a(a);
            }
        }

        public final void a() {
            b();
        }

        public final void a(ajej ajej) {
            this.b.a(ajej);
        }

        public final void a(Throwable th) {
            if (ajur.a(this.c, th)) {
                b();
            } else {
                ajvo.a(th);
            }
        }
    }

    public ajhy(ajdb[] ajdbArr) {
        this.a = ajdbArr;
    }

    public final void b(ajcz ajcz) {
        ajej ajei = new ajei();
        AtomicInteger atomicInteger = new AtomicInteger(this.a.length + 1);
        AtomicReference ajul = new ajul();
        ajcz.a(ajei);
        ajdb[] ajdbArr = this.a;
        int length = ajdbArr.length;
        int i = 0;
        while (i < length) {
            ajdb ajdb = ajdbArr[i];
            if (!ajei.isDisposed()) {
                if (ajdb == null) {
                    ajul.a(new NullPointerException("A completable source is null"));
                    atomicInteger.decrementAndGet();
                } else {
                    ajdb.a(new a(ajcz, ajei, ajul, atomicInteger));
                }
                i++;
            } else {
                return;
            }
        }
        if (atomicInteger.decrementAndGet() == 0) {
            Throwable a = ajur.a(ajul);
            if (a == null) {
                ajcz.a();
                return;
            }
            ajcz.a(a);
        }
    }
}
