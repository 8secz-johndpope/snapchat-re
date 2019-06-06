package defpackage;

import defpackage.clh.b.a.c;
import java.util.concurrent.Callable;

/* renamed from: clp */
public final class clp implements aiqc<ajdx<fts>> {
    private final ajwy<cun> a;

    public static ajdx<fts> a(ajwy<cun> ajwy) {
        akcr.b(ajwy, "handler");
        Object a = ajdx.c((Callable) new cli(new c(ajwy))).a();
        akcr.a(a, "Single.fromCallable<UriO…er>(handler::get).cache()");
        return (ajdx) aiqf.a(a, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return clp.a(this.a);
    }
}
