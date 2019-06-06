package defpackage;

import defpackage.clh.b.a.a;
import java.util.concurrent.Callable;

/* renamed from: cll */
public final class cll implements aiqc<ajdx<fts>> {
    private final ajwy<cmt> a;

    public static ajdx<fts> a(ajwy<cmt> ajwy) {
        akcr.b(ajwy, "handler");
        Object c = ajdx.c((Callable) new cli(new a(ajwy)));
        akcr.a(c, "Single.fromCallable<UriOpenHandler>(handler::get)");
        return (ajdx) aiqf.a(c, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return cll.a(this.a);
    }
}
