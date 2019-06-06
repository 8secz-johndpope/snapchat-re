package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ajui */
public enum ajui implements akuy {
    ;

    private ajui(String str) {
    }

    private static void a() {
        ajvo.a(new ajes("Subscription already set!"));
    }

    public static void a(AtomicReference<akuy> atomicReference, AtomicLong atomicLong, long j) {
        akuy akuy = (akuy) atomicReference.get();
        if (akuy != null) {
            akuy.a(j);
            return;
        }
        if (ajui.b(j)) {
            ajum.a(atomicLong, j);
            akuy akuy2 = (akuy) atomicReference.get();
            if (akuy2 != null) {
                long andSet = atomicLong.getAndSet(0);
                if (andSet != 0) {
                    akuy2.a(andSet);
                }
            }
        }
    }

    public static boolean a(akuy akuy, akuy akuy2) {
        if (akuy2 == null) {
            ajvo.a(new NullPointerException("next is null"));
            return false;
        } else if (akuy == null) {
            return true;
        } else {
            akuy2.b();
            ajui.a();
            return false;
        }
    }

    public static boolean a(AtomicReference<akuy> atomicReference) {
        akuy akuy = (akuy) atomicReference.get();
        akuy akuy2 = CANCELLED;
        if (akuy != akuy2) {
            akuy akuy3 = (akuy) atomicReference.getAndSet(akuy2);
            if (akuy3 != CANCELLED) {
                if (akuy3 != null) {
                    akuy3.b();
                }
                return true;
            }
        }
        return false;
    }

    public static boolean a(AtomicReference<akuy> atomicReference, akuy akuy) {
        ajfv.a((Object) akuy, "s is null");
        if (atomicReference.compareAndSet(null, akuy)) {
            return true;
        }
        akuy.b();
        if (atomicReference.get() != CANCELLED) {
            ajui.a();
        }
        return false;
    }

    public static boolean a(AtomicReference<akuy> atomicReference, akuy akuy, long j) {
        if (!ajui.a((AtomicReference) atomicReference, akuy)) {
            return false;
        }
        akuy.a(j);
        return true;
    }

    public static boolean a(AtomicReference<akuy> atomicReference, AtomicLong atomicLong, akuy akuy) {
        if (!ajui.a((AtomicReference) atomicReference, akuy)) {
            return false;
        }
        long andSet = atomicLong.getAndSet(0);
        if (andSet != 0) {
            akuy.a(andSet);
        }
        return true;
    }

    public static boolean b(long j) {
        if (j > 0) {
            return true;
        }
        ajvo.a(new IllegalArgumentException("n > 0 required but it was ".concat(String.valueOf(j))));
        return false;
    }

    public static void c(long j) {
        ajvo.a(new ajes("More produced than requested: ".concat(String.valueOf(j))));
    }

    public final void a(long j) {
    }

    public final void b() {
    }
}
