package defpackage;

import defpackage.ojt.a.j;
import java.util.concurrent.Callable;

/* renamed from: okj */
public final class okj implements aiqc<ajdx<fts>> {
    private final ajwy<pfi> a;

    public static ajdx<fts> a(ajwy<pfi> ajwy) {
        akcr.b(ajwy, "memoriesThumbnailUriHandler");
        Object a = ajdx.c((Callable) new oju(new j(ajwy))).a();
        akcr.a(a, "Single.fromCallable<UriO…lUriHandler::get).cache()");
        return (ajdx) aiqf.a(a, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return okj.a(this.a);
    }
}
