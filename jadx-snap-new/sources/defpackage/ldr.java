package defpackage;

import defpackage.ldf.j;
import defpackage.mhs.b;
import java.util.concurrent.Callable;

/* renamed from: ldr */
public final class ldr implements aiqc<ajdx<fts>> {
    private final ajwy<gee> a;
    private final ajwy<akbw<b, String, gfl>> b;

    public static ajdx<fts> a(ajwy<gee> ajwy, akbw<b, String, gfl> akbw) {
        akcr.b(ajwy, "contentManager");
        akcr.b(akbw, "lensPayloadProcessorProvider");
        Object c = ajdx.c((Callable) new j(ajwy, akbw));
        akcr.a(c, "Single.fromCallable {\n  …orProvider)\n            }");
        return (ajdx) aiqf.a(c, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return ldr.a(this.a, (akbw) this.b.get());
    }
}
