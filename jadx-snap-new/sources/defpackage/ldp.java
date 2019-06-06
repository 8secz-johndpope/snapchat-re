package defpackage;

import com.google.common.base.Supplier;
import defpackage.ldf.h;
import java.util.concurrent.Callable;

/* renamed from: ldp */
public final class ldp implements aiqc<ajdx<fts>> {
    private final ajwy<gfb> a;
    private final ajwy<Supplier<String>> b;
    private final ajwy<akbw<akbl<String, String>, String, gfl>> c;

    public static ajdx<fts> a(ajwy<gfb> ajwy, Supplier<String> supplier, akbw<akbl<String, String>, String, gfl> akbw) {
        akcr.b(ajwy, "contentManager");
        akcr.b(supplier, "baseUriSupplier");
        akcr.b(akbw, "zipPayloadProcessor");
        Object c = ajdx.c((Callable) new h(ajwy, akbw, supplier));
        akcr.a(c, "Single.fromCallable { Tr…essor, baseUriSupplier) }");
        return (ajdx) aiqf.a(c, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return ldp.a(this.a, (Supplier) this.b.get(), (akbw) this.c.get());
    }
}
