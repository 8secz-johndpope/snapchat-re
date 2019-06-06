package com.google.common.util.concurrent;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.AbstractFuture.TrustedFuture;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

abstract class AbstractTransformFuture<I, O, F, T> extends TrustedFuture<O> implements Runnable {
    F function;
    ListenableFuture<? extends I> inputFuture;

    static final class TransformFuture<I, O> extends AbstractTransformFuture<I, O, Function<? super I, ? extends O>, O> {
        TransformFuture(ListenableFuture<? extends I> listenableFuture, Function<? super I, ? extends O> function) {
            super(listenableFuture, function);
        }

        /* Access modifiers changed, original: final */
        public final O doTransform(Function<? super I, ? extends O> function, I i) {
            return function.apply(i);
        }

        /* Access modifiers changed, original: final */
        public final void setResult(O o) {
            set(o);
        }
    }

    AbstractTransformFuture(ListenableFuture<? extends I> listenableFuture, F f) {
        this.inputFuture = (ListenableFuture) Preconditions.checkNotNull(listenableFuture);
        this.function = Preconditions.checkNotNull(f);
    }

    static <I, O> ListenableFuture<O> create(ListenableFuture<I> listenableFuture, Function<? super I, ? extends O> function, Executor executor) {
        Preconditions.checkNotNull(function);
        TransformFuture transformFuture = new TransformFuture(listenableFuture, function);
        listenableFuture.addListener(transformFuture, MoreExecutors.rejectionPropagatingExecutor(executor, transformFuture));
        return transformFuture;
    }

    /* Access modifiers changed, original: protected|final */
    public final void afterDone() {
        maybePropagateCancellationTo(this.inputFuture);
        this.inputFuture = null;
        this.function = null;
    }

    public abstract T doTransform(F f, I i);

    /* Access modifiers changed, original: protected */
    public String pendingToString() {
        String stringBuilder;
        ListenableFuture listenableFuture = this.inputFuture;
        Object obj = this.function;
        String pendingToString = super.pendingToString();
        if (listenableFuture != null) {
            StringBuilder stringBuilder2 = new StringBuilder("inputFuture=[");
            stringBuilder2.append(listenableFuture);
            stringBuilder2.append("], ");
            stringBuilder = stringBuilder2.toString();
        } else {
            stringBuilder = "";
        }
        if (obj != null) {
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append(stringBuilder);
            stringBuilder3.append("function=[");
            stringBuilder3.append(obj);
            stringBuilder3.append("]");
            return stringBuilder3.toString();
        } else if (pendingToString == null) {
            return null;
        } else {
            StringBuilder stringBuilder4 = new StringBuilder();
            stringBuilder4.append(stringBuilder);
            stringBuilder4.append(pendingToString);
            return stringBuilder4.toString();
        }
    }

    public final void run() {
        ListenableFuture listenableFuture = this.inputFuture;
        Object obj = this.function;
        int i = 1;
        int isCancelled = isCancelled() | (listenableFuture == null ? 1 : 0);
        if (obj != null) {
            i = 0;
        }
        if ((isCancelled | i) == 0) {
            this.inputFuture = null;
            try {
                Object doTransform;
                try {
                    doTransform = doTransform(obj, Futures.getDone(listenableFuture));
                    setResult(doTransform);
                } catch (Throwable th) {
                    doTransform = th;
                    setException(doTransform);
                } finally {
                    this.function = null;
                }
            } catch (CancellationException unused) {
                cancel(false);
            } catch (ExecutionException e) {
                setException(e.getCause());
            } catch (RuntimeException e2) {
                setException(e2);
            } catch (Error e3) {
                setException(e3);
            }
        }
    }

    public abstract void setResult(T t);
}
