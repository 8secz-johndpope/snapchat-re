package defpackage;

import android.os.Handler;
import com.google.common.base.Supplier;

/* renamed from: dse */
public final class dse implements aiqc<doo> {
    private final ajwy<Supplier<Handler>> a;

    public static doo a(Supplier<Handler> supplier) {
        akcr.b(supplier, "handler");
        return (doo) aiqf.a(new doo(supplier), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return dse.a((Supplier) this.a.get());
    }
}
