package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ajus */
public final class ajus {
    public static <T> void a(ajdv<? super T> ajdv, T t, AtomicInteger atomicInteger, ajul ajul) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            ajdv.a((Object) t);
            if (atomicInteger.decrementAndGet() != 0) {
                Throwable a = ajur.a((AtomicReference) ajul);
                if (a != null) {
                    ajdv.a(a);
                    return;
                }
                ajdv.a();
            }
        }
    }

    public static void a(ajdv<?> ajdv, Throwable th, AtomicInteger atomicInteger, ajul ajul) {
        if (!ajur.a((AtomicReference) ajul, th)) {
            ajvo.a(th);
        } else if (atomicInteger.getAndIncrement() == 0) {
            ajdv.a(ajur.a((AtomicReference) ajul));
        }
    }

    public static void a(ajdv<?> ajdv, AtomicInteger atomicInteger, ajul ajul) {
        if (atomicInteger.getAndIncrement() == 0) {
            Throwable a = ajur.a((AtomicReference) ajul);
            if (a != null) {
                ajdv.a(a);
                return;
            }
            ajdv.a();
        }
    }

    public static <T> void a(akux<? super T> akux, T t, AtomicInteger atomicInteger, ajul ajul) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            akux.a((Object) t);
            if (atomicInteger.decrementAndGet() != 0) {
                Throwable a = ajur.a((AtomicReference) ajul);
                if (a != null) {
                    akux.a(a);
                    return;
                }
                akux.a();
            }
        }
    }

    public static void a(akux<?> akux, Throwable th, AtomicInteger atomicInteger, ajul ajul) {
        if (!ajur.a((AtomicReference) ajul, th)) {
            ajvo.a(th);
        } else if (atomicInteger.getAndIncrement() == 0) {
            akux.a(ajur.a((AtomicReference) ajul));
        }
    }

    public static void a(akux<?> akux, AtomicInteger atomicInteger, ajul ajul) {
        if (atomicInteger.getAndIncrement() == 0) {
            Throwable a = ajur.a((AtomicReference) ajul);
            if (a != null) {
                akux.a(a);
                return;
            }
            akux.a();
        }
    }
}
