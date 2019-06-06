package defpackage;

import defpackage.ojt.a.g;
import java.util.concurrent.Callable;

/* renamed from: okg */
public final class okg implements aiqc<ajdx<fts>> {
    private final ajwy<pfd> a;

    public static ajdx<fts> a(ajwy<pfd> ajwy) {
        akcr.b(ajwy, "memoriesSnapEditsUriHandler");
        Object a = ajdx.c((Callable) new oju(new g(ajwy))).a();
        akcr.a(a, "Single.fromCallable<UriO…sUriHandler::get).cache()");
        return (ajdx) aiqf.a(a, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return okg.a(this.a);
    }
}
