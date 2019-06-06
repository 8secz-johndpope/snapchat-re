package defpackage;

import defpackage.hed.b.a.c;
import java.util.concurrent.Callable;

/* renamed from: hek */
public final class hek implements aiqc<ajdx<fts>> {
    private final ajwy<gxq> a;

    public static ajdx<fts> a(aipn<gxq> aipn) {
        akcr.b(aipn, "discoverFeedStorySnapUriHandlerLazy");
        Object a = ajdx.c((Callable) new hee(new c(aipn))).a();
        akcr.a(a, "Single.fromCallable<UriO…HandlerLazy::get).cache()");
        return (ajdx) aiqf.a(a, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return hek.a(aiqb.b(this.a));
    }
}
