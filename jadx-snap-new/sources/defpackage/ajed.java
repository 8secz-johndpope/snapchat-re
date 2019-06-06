package defpackage;

import android.os.Looper;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: ajed */
public abstract class ajed implements ajej {
    private final AtomicBoolean unsubscribed = new AtomicBoolean();

    /* renamed from: ajed$1 */
    class 1 implements Runnable {
        1() {
        }

        public final void run() {
            ajed.this.onDispose();
        }
    }

    public static void verifyMainThread() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            StringBuilder stringBuilder = new StringBuilder("Expected to be called on the main thread but was ");
            stringBuilder.append(Thread.currentThread().getName());
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    public final void dispose() {
        if (this.unsubscribed.compareAndSet(false, true)) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                onDispose();
                return;
            }
            ajee.a(ajef.a).a(new 1());
        }
    }

    public final boolean isDisposed() {
        return this.unsubscribed.get();
    }

    public abstract void onDispose();
}
