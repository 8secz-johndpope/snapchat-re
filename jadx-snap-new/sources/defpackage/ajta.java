package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: ajta */
public final class ajta<E> extends AtomicReferenceArray<E> implements ajge<E> {
    private static final Integer a = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);
    private int b = (length() - 1);
    private AtomicLong c = new AtomicLong();
    private long d;
    private AtomicLong e = new AtomicLong();
    private int f;

    public ajta(int i) {
        super(ajux.a(i));
        this.f = Math.min(i / 4, a.intValue());
    }

    public final void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    public final boolean isEmpty() {
        return this.c.get() == this.e.get();
    }

    public final boolean offer(E e) {
        if (e != null) {
            int i = this.b;
            long j = this.c.get();
            int i2 = ((int) j) & i;
            if (j >= this.d) {
                long j2 = ((long) this.f) + j;
                if (get(i & ((int) j2)) == null) {
                    this.d = j2;
                } else if (get(i2) != null) {
                    return false;
                }
            }
            lazySet(i2, e);
            this.c.lazySet(j + 1);
            return true;
        }
        throw new NullPointerException("Null is not a valid element");
    }

    public final E poll() {
        long j = this.e.get();
        int i = ((int) j) & this.b;
        Object obj = get(i);
        if (obj == null) {
            return null;
        }
        this.e.lazySet(j + 1);
        lazySet(i, null);
        return obj;
    }
}
