package defpackage;

import defpackage.gxv.a.a.a;
import java.util.concurrent.Callable;

/* renamed from: gxx */
public final class gxx implements aiqc<ajdx<hwm<?, ?>>> {
    private final ajwy<gyw> a;

    public static ajdx<hwm<?, ?>> a(gyw gyw) {
        akcr.b(gyw, "jobProcessor");
        Object c = ajdx.c((Callable) new a(gyw));
        akcr.a(c, "Single.fromCallable { jobProcessor }");
        return (ajdx) aiqf.a(c, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return gxx.a((gyw) this.a.get());
    }
}
