package defpackage;

import com.google.common.base.Supplier;
import defpackage.ldf.k;
import java.util.concurrent.Callable;

/* renamed from: lds */
public final class lds implements aiqc<ajdx<fts>> {
    private final ajwy<akbl<abnb, gfl>> a;
    private final ajwy<gee> b;
    private final ajwy<Supplier<String>> c;
    private final ajwy<lcq> d;

    public static ajdx<fts> a(akbl<abnb, gfl> akbl, ajwy<gee> ajwy, Supplier<String> supplier, lcq lcq) {
        akcr.b(akbl, "payloadProcessorFactory");
        akcr.b(ajwy, "contentManager");
        akcr.b(supplier, "baseUriSupplier");
        akcr.b(lcq, "encryptionRegistry");
        Object c = ajdx.c((Callable) new k(akbl, ajwy, lcq, supplier));
        akcr.a(c, "Single.fromCallable {\n  …riSupplier)\n            }");
        return (ajdx) aiqf.a(c, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        ajwy ajwy = this.a;
        return lds.a((akbl) ajwy.get(), this.b, (Supplier) this.c.get(), (lcq) this.d.get());
    }
}
