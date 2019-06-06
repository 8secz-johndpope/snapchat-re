package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ajfp */
public enum ajfp implements ajej {
    ;

    private ajfp(String str) {
    }

    private static void a() {
        ajvo.a(new ajes("Disposable already set!"));
    }

    public static boolean a(ajej ajej) {
        return ajej == DISPOSED;
    }

    public static boolean a(ajej ajej, ajej ajej2) {
        if (ajej2 == null) {
            ajvo.a(new NullPointerException("next is null"));
            return false;
        } else if (ajej == null) {
            return true;
        } else {
            ajej2.dispose();
            ajfp.a();
            return false;
        }
    }

    public static boolean a(AtomicReference<ajej> atomicReference) {
        ajej ajej = (ajej) atomicReference.get();
        ajej ajej2 = DISPOSED;
        if (ajej != ajej2) {
            ajej ajej3 = (ajej) atomicReference.getAndSet(ajej2);
            if (ajej3 != ajej2) {
                if (ajej3 != null) {
                    ajej3.dispose();
                }
                return true;
            }
        }
        return false;
    }

    public static boolean a(AtomicReference<ajej> atomicReference, ajej ajej) {
        ajej ajej2;
        do {
            ajej2 = (ajej) atomicReference.get();
            if (ajej2 == DISPOSED) {
                if (ajej != null) {
                    ajej.dispose();
                }
                return false;
            }
        } while (!atomicReference.compareAndSet(ajej2, ajej));
        if (ajej2 != null) {
            ajej2.dispose();
        }
        return true;
    }

    public static boolean b(AtomicReference<ajej> atomicReference, ajej ajej) {
        ajfv.a((Object) ajej, "d is null");
        if (atomicReference.compareAndSet(null, ajej)) {
            return true;
        }
        ajej.dispose();
        if (atomicReference.get() != DISPOSED) {
            ajfp.a();
        }
        return false;
    }

    public static boolean c(AtomicReference<ajej> atomicReference, ajej ajej) {
        ajej ajej2;
        do {
            ajej2 = (ajej) atomicReference.get();
            if (ajej2 == DISPOSED) {
                if (ajej != null) {
                    ajej.dispose();
                }
                return false;
            }
        } while (!atomicReference.compareAndSet(ajej2, ajej));
        return true;
    }

    public static boolean d(AtomicReference<ajej> atomicReference, ajej ajej) {
        if (atomicReference.compareAndSet(null, ajej)) {
            return true;
        }
        if (atomicReference.get() == DISPOSED) {
            ajej.dispose();
        }
        return false;
    }

    public final void dispose() {
    }

    public final boolean isDisposed() {
        return true;
    }
}
