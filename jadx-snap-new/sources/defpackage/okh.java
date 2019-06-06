package defpackage;

import defpackage.ojt.a.h;
import java.util.concurrent.Callable;

/* renamed from: okh */
public final class okh implements aiqc<ajdx<fts>> {
    private final ajwy<pfe> a;

    public static ajdx<fts> a(ajwy<pfe> ajwy) {
        akcr.b(ajwy, "memoriesSnapStreamingPrefetcherUriHandler");
        Object a = ajdx.c((Callable) new oju(new h(ajwy))).a();
        akcr.a(a, "Single.fromCallable<UriO…rUriHandler::get).cache()");
        return (ajdx) aiqf.a(a, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return okh.a(this.a);
    }
}
