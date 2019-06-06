package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: ajuc */
public abstract class ajuc<T> extends AtomicInteger implements ajgc<T> {
    public final boolean offer(T t) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
