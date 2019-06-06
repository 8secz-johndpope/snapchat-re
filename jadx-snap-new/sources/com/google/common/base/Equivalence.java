package com.google.common.base;

import java.io.Serializable;

public abstract class Equivalence<T> {

    static final class Equals extends Equivalence<Object> implements Serializable {
        static final Equals INSTANCE = new Equals();

        Equals() {
        }

        /* Access modifiers changed, original: protected|final */
        public final boolean doEquivalent(Object obj, Object obj2) {
            return obj.equals(obj2);
        }

        /* Access modifiers changed, original: protected|final */
        public final int doHash(Object obj) {
            return obj.hashCode();
        }
    }

    static final class Identity extends Equivalence<Object> implements Serializable {
        static final Identity INSTANCE = new Identity();

        Identity() {
        }

        /* Access modifiers changed, original: protected|final */
        public final boolean doEquivalent(Object obj, Object obj2) {
            return false;
        }

        /* Access modifiers changed, original: protected|final */
        public final int doHash(Object obj) {
            return System.identityHashCode(obj);
        }
    }

    protected Equivalence() {
    }

    public static Equivalence<Object> equals() {
        return Equals.INSTANCE;
    }

    public static Equivalence<Object> identity() {
        return Identity.INSTANCE;
    }

    public abstract boolean doEquivalent(T t, T t2);

    public abstract int doHash(T t);

    public final boolean equivalent(T t, T t2) {
        return t == t2 ? true : (t == null || t2 == null) ? false : doEquivalent(t, t2);
    }

    public final int hash(T t) {
        return t == null ? 0 : doHash(t);
    }
}
