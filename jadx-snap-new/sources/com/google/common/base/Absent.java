package com.google.common.base;

import java.util.Collections;
import java.util.Set;

final class Absent<T> extends Optional<T> {
    static final Absent<Object> INSTANCE = new Absent();

    private Absent() {
    }

    static <T> Optional<T> withType() {
        return INSTANCE;
    }

    public final Set<T> asSet() {
        return Collections.emptySet();
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final T get() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final boolean isPresent() {
        return false;
    }

    public final T or(Supplier<? extends T> supplier) {
        return Preconditions.checkNotNull(supplier.get(), "use Optional.orNull() instead of a Supplier that returns null");
    }

    public final T or(T t) {
        return Preconditions.checkNotNull(t, "use Optional.orNull() instead of Optional.or(null)");
    }

    public final T orNull() {
        return null;
    }

    public final String toString() {
        return "Optional.absent()";
    }

    public final <V> Optional<V> transform(Function<? super T, V> function) {
        Preconditions.checkNotNull(function);
        return Optional.absent();
    }
}
