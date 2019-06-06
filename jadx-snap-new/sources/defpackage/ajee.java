package defpackage;

import java.util.concurrent.Callable;

/* renamed from: ajee */
public final class ajee {
    public static volatile ajfc<Callable<ajdw>, ajdw> a;

    public static ajdw a(ajdw ajdw) {
        if (ajdw != null) {
            return ajdw;
        }
        throw new NullPointerException("scheduler == null");
    }

    public static ajdw a(Callable<ajdw> callable) {
        try {
            ajdw ajdw = (ajdw) callable.call();
            if (ajdw != null) {
                return ajdw;
            }
            throw new NullPointerException("Scheduler Callable returned null");
        } catch (Throwable th) {
            RuntimeException a = ajur.a(th);
        }
    }

    public static <T, R> R a(ajfc<T, R> ajfc, T t) {
        try {
            return ajfc.apply(t);
        } catch (Throwable th) {
            RuntimeException a = ajur.a(th);
        }
    }
}
