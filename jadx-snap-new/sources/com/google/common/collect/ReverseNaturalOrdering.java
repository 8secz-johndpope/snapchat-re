package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.io.Serializable;

final class ReverseNaturalOrdering extends Ordering<Comparable> implements Serializable {
    static final ReverseNaturalOrdering INSTANCE = new ReverseNaturalOrdering();

    private ReverseNaturalOrdering() {
    }

    public final int compare(Comparable comparable, Comparable comparable2) {
        Preconditions.checkNotNull(comparable);
        return comparable == comparable2 ? 0 : comparable2.compareTo(comparable);
    }

    public final <S extends Comparable> Ordering<S> reverse() {
        return Ordering.natural();
    }

    public final String toString() {
        return "Ordering.natural().reverse()";
    }
}
