package defpackage;

import com.google.common.base.Preconditions;
import java.util.ArrayDeque;
import java.util.Deque;

/* renamed from: acik */
public final class acik<T extends achg, C extends achd<T, C>> extends acie<T, C> {
    private final T a;
    private final boolean b;
    private final acih c;

    public /* synthetic */ acik(achg achg) {
        this(achg, false, null);
    }

    public acik(T t, boolean z, acih acih) {
        akcr.b(t, "destinationPageType");
        this.a = t;
        this.b = z;
        this.c = acih;
        Preconditions.checkArgument(this.a.f());
    }

    public final acih a() {
        return this.c;
    }

    /* Access modifiers changed, original: protected|final */
    public final Deque<acig<T, C>> d(achc<T, C> achc, acjd<T, C> acjd) {
        akcr.b(achc, "navigationSpecs");
        akcr.b(acjd, "navigationStack");
        ArrayDeque arrayDeque = new ArrayDeque(2);
        arrayDeque.add(new acim(this.b));
        arrayDeque.add(new acif(this.a, this.b));
        return arrayDeque;
    }
}
