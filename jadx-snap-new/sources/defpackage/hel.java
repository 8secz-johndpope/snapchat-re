package defpackage;

import defpackage.hed.b.a.d;
import java.util.concurrent.Callable;

/* renamed from: hel */
public final class hel implements aiqc<ajdx<fts>> {
    private final ajwy<gxs> a;

    public static ajdx<fts> a(aipn<gxs> aipn) {
        akcr.b(aipn, "discoverStoryStreamingSnapUriHandler");
        Object a = ajdx.c((Callable) new hee(new d(aipn))).a();
        akcr.a(a, "Single.fromCallable<UriO…pUriHandler::get).cache()");
        return (ajdx) aiqf.a(a, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return hel.a(aiqb.b(this.a));
    }
}
