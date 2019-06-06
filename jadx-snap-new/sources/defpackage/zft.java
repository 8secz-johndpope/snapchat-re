package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* renamed from: zft */
public final class zft<V> extends FutureTask<V> {
    public zft(Callable<V> callable) {
        super(callable);
    }
}
