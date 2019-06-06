package defpackage;

import defpackage.dej.a.a;
import java.util.concurrent.Callable;

/* renamed from: den */
public final class den implements aiqc<ajdx<fts>> {
    private final ajwy<dea> a;

    public static ajdx<fts> a(aipn<dea> aipn) {
        akcr.b(aipn, "handler");
        Object c = ajdx.c((Callable) new dek(new a(aipn)));
        akcr.a(c, "Single.fromCallable<UriOpenHandler>(handler::get)");
        return (ajdx) aiqf.a(c, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return den.a(aiqb.b(this.a));
    }
}
