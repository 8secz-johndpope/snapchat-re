package defpackage;

import defpackage.clh.c.a.a;
import java.util.concurrent.Callable;

/* renamed from: clx */
public final class clx implements aiqc<ajdx<hwm<?, ?>>> {
    private final ajwy<col> a;

    public static ajdx<hwm<?, ?>> a(col col) {
        akcr.b(col, "processor");
        Object a = ajdx.c((Callable) new a(col)).a();
        akcr.a(a, "Single.fromCallable<Dura…>>({ processor }).cache()");
        return (ajdx) aiqf.a(a, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return clx.a((col) this.a.get());
    }
}
