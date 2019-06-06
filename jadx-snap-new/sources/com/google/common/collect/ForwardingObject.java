package com.google.common.collect;

public abstract class ForwardingObject {
    protected ForwardingObject() {
    }

    public abstract Object delegate();

    public String toString() {
        return delegate().toString();
    }
}
