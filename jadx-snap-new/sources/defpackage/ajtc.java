package defpackage;

import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ajtc */
public abstract class ajtc extends AtomicReference<Future<?>> implements ajej {
    protected static final FutureTask<Void> c = new FutureTask(ajfu.b, null);
    private static FutureTask<Void> d = new FutureTask(ajfu.b, null);
    protected final Runnable a;
    protected Thread b;

    ajtc(Runnable runnable) {
        this.a = runnable;
    }

    public final void a(Future<?> future) {
        Future future2;
        do {
            future2 = (Future) get();
            if (future2 == c) {
                break;
            } else if (future2 == d) {
                future.cancel(this.b != Thread.currentThread());
                return;
            }
        } while (!compareAndSet(future2, future));
    }

    public final void dispose() {
        Future future = (Future) get();
        if (future != c) {
            Future future2 = d;
            if (future != future2 && compareAndSet(future, future2) && future != null) {
                future.cancel(this.b != Thread.currentThread());
            }
        }
    }

    public final boolean isDisposed() {
        Future future = (Future) get();
        return future == c || future == d;
    }
}
