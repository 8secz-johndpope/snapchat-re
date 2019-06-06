package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* renamed from: ajud */
public abstract class ajud<T> extends AtomicLong implements ajgc<T> {
    public final boolean offer(T t) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
