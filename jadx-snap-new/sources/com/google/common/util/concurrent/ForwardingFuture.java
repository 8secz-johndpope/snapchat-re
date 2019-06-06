package com.google.common.util.concurrent;

import com.google.common.collect.ForwardingObject;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public abstract class ForwardingFuture<V> extends ForwardingObject implements Future<V> {
    protected ForwardingFuture() {
    }

    public boolean cancel(boolean z) {
        return delegate().cancel(z);
    }

    public abstract Future<? extends V> delegate();

    public V get() {
        return delegate().get();
    }

    public V get(long j, TimeUnit timeUnit) {
        return delegate().get(j, timeUnit);
    }

    public boolean isCancelled() {
        return delegate().isCancelled();
    }

    public boolean isDone() {
        return delegate().isDone();
    }
}
