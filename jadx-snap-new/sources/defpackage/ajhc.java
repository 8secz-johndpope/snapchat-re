package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: ajhc */
public final class ajhc extends ajcx {
    private final ajdb[] a;
    private final Iterable<? extends ajdb> b = null;

    /* renamed from: ajhc$a */
    static final class a implements ajcz {
        private AtomicBoolean a;
        private ajei b;
        private ajcz c;
        private ajej d;

        a(AtomicBoolean atomicBoolean, ajei ajei, ajcz ajcz) {
            this.a = atomicBoolean;
            this.b = ajei;
            this.c = ajcz;
        }

        public final void a() {
            if (this.a.compareAndSet(false, true)) {
                this.b.c(this.d);
                this.b.dispose();
                this.c.a();
            }
        }

        public final void a(ajej ajej) {
            this.d = ajej;
            this.b.a(ajej);
        }

        public final void a(Throwable th) {
            if (this.a.compareAndSet(false, true)) {
                this.b.c(this.d);
                this.b.dispose();
                this.c.a(th);
                return;
            }
            ajvo.a(th);
        }
    }

    public ajhc(ajdb[] ajdbArr) {
        this.a = ajdbArr;
    }

    public final void b(ajcz ajcz) {
        int i;
        int i2;
        Throwable th;
        Object obj = this.a;
        String str = "One of the sources is null";
        if (obj == null) {
            obj = new ajdb[8];
            Iterable<ajdb> iterable = null;
            try {
                i = 0;
                for (ajdb ajdb : iterable) {
                    if (ajdb == null) {
                        ajfq.a(new NullPointerException(str), ajcz);
                        return;
                    }
                    if (i == obj.length) {
                        Object obj2 = new ajdb[((i >> 2) + i)];
                        System.arraycopy(obj, 0, obj2, 0, i);
                        obj = obj2;
                    }
                    i2 = i + 1;
                    obj[i] = ajdb;
                    i = i2;
                }
            } catch (Throwable th2) {
                ajep.a(th2);
                ajfq.a(th2, ajcz);
                return;
            }
        }
        i = obj.length;
        ajej ajei = new ajei();
        ajcz.a(ajei);
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        i2 = 0;
        while (i2 < i) {
            ajdb ajdb2 = obj[i2];
            if (!ajei.isDisposed()) {
                if (ajdb2 == null) {
                    th2 = new NullPointerException(str);
                    if (atomicBoolean.compareAndSet(false, true)) {
                        ajei.dispose();
                        ajcz.a(th2);
                        return;
                    }
                    ajvo.a(th2);
                    return;
                }
                ajdb2.a(new a(atomicBoolean, ajei, ajcz));
                i2++;
            } else {
                return;
            }
        }
        if (i == 0) {
            ajcz.a();
        }
    }
}
