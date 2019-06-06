package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

@Deprecated
/* renamed from: abmq */
public final class abmq {
    @Deprecated
    public static final Supplier<Handler> a = Suppliers.memoize(new 1());
    private static final Supplier<HandlerThread> b = Suppliers.memoize(new 2());

    /* renamed from: abmq$1 */
    static class 1 implements Supplier<Handler> {
        1() {
        }

        public final /* synthetic */ Object get() {
            return new Handler(Looper.getMainLooper());
        }
    }

    /* renamed from: abmq$2 */
    static class 2 implements Supplier<HandlerThread> {
        2() {
        }

        public final /* synthetic */ Object get() {
            HandlerThread handlerThread = new HandlerThread("TMHand", 10);
            handlerThread.start();
            return handlerThread;
        }
    }

    @Deprecated
    public static Looper a() {
        return ((HandlerThread) b.get()).getLooper();
    }
}
