package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.AbstractFuture.TrustedFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;

class TrustedListenableFutureTask<V> extends TrustedFuture<V> implements RunnableFuture<V> {
    private volatile InterruptibleTask<?> task;

    final class TrustedFutureInterruptibleTask extends InterruptibleTask<V> {
        private final Callable<V> callable;

        TrustedFutureInterruptibleTask(Callable<V> callable) {
            this.callable = (Callable) Preconditions.checkNotNull(callable);
        }

        /* Access modifiers changed, original: final */
        public final void afterRanInterruptibly(V v, Throwable th) {
            if (th == null) {
                TrustedListenableFutureTask.this.set(v);
            } else {
                TrustedListenableFutureTask.this.setException(th);
            }
        }

        /* Access modifiers changed, original: final */
        public final boolean isDone() {
            return TrustedListenableFutureTask.this.isDone();
        }

        /* Access modifiers changed, original: final */
        public final V runInterruptibly() {
            return this.callable.call();
        }

        /* Access modifiers changed, original: final */
        public final String toPendingString() {
            return this.callable.toString();
        }
    }

    TrustedListenableFutureTask(Callable<V> callable) {
        this.task = new TrustedFutureInterruptibleTask(callable);
    }

    static <V> TrustedListenableFutureTask<V> create(Runnable runnable, V v) {
        return new TrustedListenableFutureTask(Executors.callable(runnable, v));
    }

    static <V> TrustedListenableFutureTask<V> create(Callable<V> callable) {
        return new TrustedListenableFutureTask(callable);
    }

    /* Access modifiers changed, original: protected */
    public void afterDone() {
        super.afterDone();
        if (wasInterrupted()) {
            InterruptibleTask interruptibleTask = this.task;
            if (interruptibleTask != null) {
                interruptibleTask.interruptTask();
            }
        }
        this.task = null;
    }

    /* Access modifiers changed, original: protected */
    public String pendingToString() {
        InterruptibleTask interruptibleTask = this.task;
        if (interruptibleTask == null) {
            return super.pendingToString();
        }
        StringBuilder stringBuilder = new StringBuilder("task=[");
        stringBuilder.append(interruptibleTask);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public void run() {
        InterruptibleTask interruptibleTask = this.task;
        if (interruptibleTask != null) {
            interruptibleTask.run();
        }
        this.task = null;
    }
}
