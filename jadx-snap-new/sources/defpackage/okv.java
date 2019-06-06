package defpackage;

import defpackage.ojt.c.a.a;
import java.util.concurrent.Callable;

/* renamed from: okv */
public final class okv implements aiqc<ajdx<hwm<?, ?>>> {
    private final ajwy<pjh> a;

    public static ajdx<hwm<?, ?>> a(ajwy<pjh> ajwy) {
        akcr.b(ajwy, "processor");
        Object c = ajdx.c((Callable) new a(ajwy));
        akcr.a(c, "Single.fromCallable { processor.get() }");
        return (ajdx) aiqf.a(c, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return okv.a(this.a);
    }
}
