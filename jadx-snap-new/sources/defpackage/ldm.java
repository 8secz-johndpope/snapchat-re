package defpackage;

import defpackage.ldf.e;
import defpackage.mhs.b;
import java.util.concurrent.Callable;

/* renamed from: ldm */
public final class ldm implements aiqc<ajdx<fts>> {
    private final ajwy<gfb> a;
    private final ajwy<akbw<b, String, gfl>> b;

    public static ajdx<fts> a(ajwy<gfb> ajwy, akbw<b, String, gfl> akbw) {
        akcr.b(ajwy, "contentManager");
        akcr.b(akbw, "lensPayloadProcessorProvider");
        Object c = ajdx.c((Callable) new e(ajwy, akbw));
        akcr.a(c, "Single.fromCallable { Le…yloadProcessorProvider) }");
        return (ajdx) aiqf.a(c, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return ldm.a(this.a, (akbw) this.b.get());
    }
}
