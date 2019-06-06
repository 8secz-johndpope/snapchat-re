package defpackage;

import defpackage.ojt.a.a;
import java.util.concurrent.Callable;

/* renamed from: ojz */
public final class ojz implements aiqc<ajdx<fts>> {
    private final ajwy<pes> a;

    public static ajdx<fts> a(ajwy<pes> ajwy) {
        akcr.b(ajwy, "memoriesEntryStreamingPrefetcherUriHandler");
        Object a = ajdx.c((Callable) new oju(new a(ajwy))).a();
        akcr.a(a, "Single.fromCallable<UriO…rUriHandler::get).cache()");
        return (ajdx) aiqf.a(a, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return ojz.a(this.a);
    }
}
