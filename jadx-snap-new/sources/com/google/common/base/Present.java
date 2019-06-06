package com.google.common.base;

import java.util.Collections;
import java.util.Set;

final class Present<T> extends Optional<T> {
    private final T reference;

    Present(T t) {
        this.reference = t;
    }

    public final Set<T> asSet() {
        return Collections.singleton(this.reference);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Present)) {
            return false;
        }
        return this.reference.equals(((Present) obj).reference);
    }

    public final T get() {
        return this.reference;
    }

    public final int hashCode() {
        return this.reference.hashCode() + 1502476572;
    }

    public final boolean isPresent() {
        return true;
    }

    public final T or(Supplier<? extends T> supplier) {
        Preconditions.checkNotNull(supplier);
        return this.reference;
    }

    public final T or(T t) {
        Preconditions.checkNotNull(t, "use Optional.orNull() instead of Optional.or(null)");
        return this.reference;
    }

    public final T orNull() {
        return this.reference;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Optional.of(");
        stringBuilder.append(this.reference);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public final <V> Optional<V> transform(Function<? super T, V> function) {
        return new Present(Preconditions.checkNotNull(function.apply(this.reference), "the Function passed to Optional.transform() must not return null."));
    }
}
