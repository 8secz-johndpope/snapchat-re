package defpackage;

import defpackage.hed.b.a.b;
import java.util.concurrent.Callable;

/* renamed from: hej */
public final class hej implements aiqc<ajdx<fts>> {
    private final ajwy<gxo> a;

    public static ajdx<fts> a(aipn<gxo> aipn) {
        akcr.b(aipn, "discoverRichMediaStorySnapUriHandler");
        Object a = ajdx.c((Callable) new hee(new b(aipn))).a();
        akcr.a(a, "Single.fromCallable<UriO…pUriHandler::get).cache()");
        return (ajdx) aiqf.a(a, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return hej.a(aiqb.b(this.a));
    }
}
