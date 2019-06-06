package defpackage;

import java.util.ArrayDeque;
import java.util.Deque;

/* renamed from: acif */
public final class acif<T extends achg, C extends achd<T, C>> extends acie<T, C> {
    private final T a;
    private final boolean b;

    public acif(T t, boolean z) {
        super((byte) 0);
        this.a = t;
        this.b = z;
    }

    /* Access modifiers changed, original: protected|final */
    public final Deque<acig<T, C>> d(achc<T, C> achc, acjd<T, C> acjd) {
        ArrayDeque arrayDeque = new ArrayDeque(1);
        arrayDeque.add(achc.a(acjd.d(), this.a, this.b));
        return arrayDeque;
    }
}
