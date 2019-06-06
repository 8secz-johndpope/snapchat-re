package defpackage;

import defpackage.hed.b.a.a;
import java.util.concurrent.Callable;

/* renamed from: hei */
public final class hei implements aiqc<ajdx<fts>> {
    private final ajwy<gxl> a;

    public static ajdx<fts> a(aipn<gxl> aipn) {
        akcr.b(aipn, "discoverFeedPublisherSnapMediaUriHandler");
        Object a = ajdx.c((Callable) new hee(new a(aipn))).a();
        akcr.a(a, "Single.fromCallable<UriO…aUriHandler::get).cache()");
        return (ajdx) aiqf.a(a, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return hei.a(aiqb.b(this.a));
    }
}
