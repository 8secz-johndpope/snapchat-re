package defpackage;

import android.os.Handler;
import com.google.common.base.Supplier;

/* renamed from: dta */
public final class dta implements aiqc<dvq> {
    private final ajwy<Supplier<Handler>> a;

    public static dvq a(Supplier<Handler> supplier) {
        akcr.b(supplier, "handler");
        return (dvq) aiqf.a(new dvq(supplier), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return dta.a((Supplier) this.a.get());
    }
}
