package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ajup */
public final class ajup {
    public static boolean a(AtomicReference<ajej> atomicReference, ajej ajej, Class<?> cls) {
        ajfv.a((Object) ajej, "next is null");
        if (atomicReference.compareAndSet(null, ajej)) {
            return true;
        }
        ajej.dispose();
        if (atomicReference.get() != ajfp.DISPOSED) {
            String name = cls.getName();
            StringBuilder stringBuilder = new StringBuilder("It is not allowed to subscribe with a(n) ");
            stringBuilder.append(name);
            stringBuilder.append(" multiple times. Please create a fresh instance of ");
            stringBuilder.append(name);
            stringBuilder.append(" and subscribe that to the target source instead.");
            ajvo.a(new ajes(stringBuilder.toString()));
        }
        return false;
    }
}
