package defpackage;

import defpackage.clh.b.a.b;
import java.util.concurrent.Callable;

/* renamed from: cln */
public final class cln implements aiqc<ajdx<fts>> {
    private final ajwy<cmy> a;

    public static ajdx<fts> a(ajwy<cmy> ajwy) {
        akcr.b(ajwy, "handler");
        Object a = ajdx.c((Callable) new cli(new b(ajwy))).a();
        akcr.a(a, "Single.fromCallable<UriO…er>(handler::get).cache()");
        return (ajdx) aiqf.a(a, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return cln.a(this.a);
    }
}
