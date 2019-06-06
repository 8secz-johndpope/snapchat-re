package defpackage;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: akes */
public final class akes<T> implements akez<T> {
    private final AtomicReference<akez<T>> a;

    public akes(akez<? extends T> akez) {
        akcr.b(akez, "sequence");
        this.a = new AtomicReference(akez);
    }

    public final Iterator<T> iterator() {
        akez akez = (akez) this.a.getAndSet(null);
        if (akez != null) {
            return akez.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
