package com.google.common.util.concurrent;

import com.google.common.util.concurrent.AbstractFuture.TrustedFuture;

public final class SettableFuture<V> extends TrustedFuture<V> {
    private SettableFuture() {
    }

    public static <V> SettableFuture<V> create() {
        return new SettableFuture();
    }

    public final boolean set(V v) {
        return super.set(v);
    }

    public final boolean setException(Throwable th) {
        return super.setException(th);
    }
}
