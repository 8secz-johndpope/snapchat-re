package defpackage;

import defpackage.ojt.c.a.b;
import java.util.concurrent.Callable;

/* renamed from: okx */
public final class okx implements aiqc<ajdx<hwm<?, ?>>> {
    private final ajwy<pms> a;

    public static ajdx<hwm<?, ?>> a(ajwy<pms> ajwy) {
        akcr.b(ajwy, "processor");
        Object c = ajdx.c((Callable) new b(ajwy));
        akcr.a(c, "Single.fromCallable { processor.get() }");
        return (ajdx) aiqf.a(c, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return okx.a(this.a);
    }
}
