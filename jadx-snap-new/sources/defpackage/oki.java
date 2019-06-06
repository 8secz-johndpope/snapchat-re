package defpackage;

import defpackage.ojt.a.i;
import java.util.concurrent.Callable;

/* renamed from: oki */
public final class oki implements aiqc<ajdx<fts>> {
    private final ajwy<pfg> a;

    public static ajdx<fts> a(ajwy<pfg> ajwy) {
        akcr.b(ajwy, "memoriesStreamingUriHandler");
        Object a = ajdx.c((Callable) new oju(new i(ajwy))).a();
        akcr.a(a, "Single.fromCallable<UriO…gUriHandler::get).cache()");
        return (ajdx) aiqf.a(a, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return oki.a(this.a);
    }
}
