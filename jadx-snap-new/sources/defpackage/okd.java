package defpackage;

import defpackage.ojt.a.d;
import java.util.concurrent.Callable;

/* renamed from: okd */
public final class okd implements aiqc<ajdx<fts>> {
    private final ajwy<pew> a;

    public static ajdx<fts> a(ajwy<pew> ajwy) {
        akcr.b(ajwy, "memoriesMediaUriHandler");
        Object a = ajdx.c((Callable) new oju(new d(ajwy))).a();
        akcr.a(a, "Single.fromCallable<UriO…aUriHandler::get).cache()");
        return (ajdx) aiqf.a(a, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return okd.a(this.a);
    }
}
