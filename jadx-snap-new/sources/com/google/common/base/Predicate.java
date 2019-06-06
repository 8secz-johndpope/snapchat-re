package com.google.common.base;

public interface Predicate<T> {
    boolean apply(T t);

    boolean equals(Object obj);
}
