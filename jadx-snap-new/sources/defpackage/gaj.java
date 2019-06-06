package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* renamed from: gaj */
public final class gaj implements aiqc<Executor> {
    static {
        gaj gaj = new gaj();
    }

    public static Executor a() {
        return (Executor) aiqf.a(Executors.newSingleThreadExecutor(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return gaj.a();
    }
}
