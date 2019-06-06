package defpackage;

import defpackage.ime.a.a.a;
import java.util.concurrent.Callable;

/* renamed from: imh */
public final class imh implements aiqc<ajdx<hwm<?, ?>>> {
    private final ajwy<imy> a;

    public static ajdx<hwm<?, ?>> a(imy imy) {
        akcr.b(imy, "processor");
        Object a = ajdx.c((Callable) new a(imy)).a();
        akcr.a(a, "Single.fromCallable<Dura…>>({ processor }).cache()");
        return (ajdx) aiqf.a(a, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return imh.a((imy) this.a.get());
    }
}
