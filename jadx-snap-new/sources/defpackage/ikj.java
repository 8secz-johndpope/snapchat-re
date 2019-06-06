package defpackage;

import defpackage.ikd.a.a;
import java.util.concurrent.Callable;

/* renamed from: ikj */
public final class ikj implements aiqc<ajdx<fts>> {
    private final ajwy<ijh> a;

    public static ajdx<fts> a(aipn<ijh> aipn) {
        akcr.b(aipn, "geofilterOverlayUriHandler");
        Object a = ajdx.c((Callable) new ike(new a(aipn))).a();
        akcr.a(a, "Single.fromCallable<UriO…yUriHandler::get).cache()");
        return (ajdx) aiqf.a(a, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return ikj.a(aiqb.b(this.a));
    }
}
