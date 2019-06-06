package defpackage;

import defpackage.hdq.a.a.a;
import java.util.concurrent.Callable;

/* renamed from: hdv */
public final class hdv implements aiqc<ajdx<fts>> {
    private final ajwy<hpf> a;

    public static ajdx<fts> a(ajwy<hpf> ajwy) {
        akcr.b(ajwy, "discoverFeedMediaUriHandlerProvider");
        Object a = ajdx.c((Callable) new hdr(new a(ajwy))).a();
        akcr.a(a, "Single.fromCallable<UriO…lerProvider::get).cache()");
        return (ajdx) aiqf.a(a, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return hdv.a(this.a);
    }
}
