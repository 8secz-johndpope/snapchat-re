package defpackage;

import defpackage.dej.a.b;
import java.util.concurrent.Callable;

/* renamed from: deq */
public final class deq implements aiqc<ajdx<fts>> {
    private final ajwy<deh> a;

    public static ajdx<fts> a(aipn<deh> aipn) {
        akcr.b(aipn, "uriHandler");
        Object c = ajdx.c((Callable) new dek(new b(aipn)));
        akcr.a(c, "Single.fromCallable<UriO…Handler>(uriHandler::get)");
        return (ajdx) aiqf.a(c, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return deq.a(aiqb.b(this.a));
    }
}
