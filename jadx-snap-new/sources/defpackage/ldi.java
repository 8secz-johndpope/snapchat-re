package defpackage;

import com.google.common.base.Supplier;
import defpackage.ldf.c;
import java.util.concurrent.Callable;

/* renamed from: ldi */
public final class ldi implements aiqc<ajdx<fts>> {
    private final ajwy<gee> a;
    private final ajwy<Supplier<String>> b;

    public static ajdx<fts> a(ajwy<gee> ajwy, Supplier<String> supplier) {
        akcr.b(ajwy, "contentManager");
        akcr.b(supplier, "baseUriSupplier");
        Object c = ajdx.c((Callable) new c(ajwy, supplier));
        akcr.a(c, "Single.fromCallable {\n  …          )\n            }");
        return (ajdx) aiqf.a(c, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return ldi.a(this.a, (Supplier) this.b.get());
    }
}
