package defpackage;

import defpackage.ojt.a.f;
import java.util.concurrent.Callable;

/* renamed from: okf */
public final class okf implements aiqc<ajdx<fts>> {
    private final ajwy<pfa> a;

    public static ajdx<fts> a(ajwy<pfa> ajwy) {
        akcr.b(ajwy, "memoriesPlaybackUriHandler");
        Object a = ajdx.c((Callable) new oju(new f(ajwy))).a();
        akcr.a(a, "Single.fromCallable<UriO…kUriHandler::get).cache()");
        return (ajdx) aiqf.a(a, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return okf.a(this.a);
    }
}
