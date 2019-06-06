package defpackage;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: ajia */
public final class ajia extends ajcx {
    private Iterable<? extends ajdb> a;

    /* renamed from: ajia$a */
    static final class a extends AtomicBoolean implements ajcz {
        private ajei a;
        private ajcz b;
        private AtomicInteger c;

        a(ajcz ajcz, ajei ajei, AtomicInteger atomicInteger) {
            this.b = ajcz;
            this.a = ajei;
            this.c = atomicInteger;
        }

        public final void a() {
            if (this.c.decrementAndGet() == 0 && compareAndSet(false, true)) {
                this.b.a();
            }
        }

        public final void a(ajej ajej) {
            this.a.a(ajej);
        }

        public final void a(Throwable th) {
            this.a.dispose();
            if (compareAndSet(false, true)) {
                this.b.a(th);
            } else {
                ajvo.a(th);
            }
        }
    }

    public ajia(Iterable<? extends ajdb> iterable) {
        this.a = iterable;
    }

    public final void b(ajcz ajcz) {
        ajej ajei = new ajei();
        ajcz.a(ajei);
        try {
            Iterator it = (Iterator) ajfv.a(this.a.iterator(), "The source iterator returned is null");
            AtomicInteger atomicInteger = new AtomicInteger(1);
            a aVar = new a(ajcz, ajei, atomicInteger);
            while (!ajei.isDisposed()) {
                try {
                    if (!it.hasNext()) {
                        aVar.a();
                        return;
                    } else if (!ajei.isDisposed()) {
                        try {
                            ajdb ajdb = (ajdb) ajfv.a(it.next(), "The iterator returned a null CompletableSource");
                            if (!ajei.isDisposed()) {
                                atomicInteger.getAndIncrement();
                                ajdb.a(aVar);
                            } else {
                                return;
                            }
                        } catch (Throwable th) {
                            ajep.a(th);
                            ajei.dispose();
                            aVar.a(th);
                            return;
                        }
                    } else {
                        return;
                    }
                } catch (Throwable th2) {
                    ajep.a(th2);
                    ajei.dispose();
                    aVar.a(th2);
                    return;
                }
            }
        } catch (Throwable th3) {
            ajep.a(th3);
            ajcz.a(th3);
        }
    }
}
