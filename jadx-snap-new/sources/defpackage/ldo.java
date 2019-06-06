package defpackage;

import defpackage.ldf.g;
import java.util.concurrent.Callable;

/* renamed from: ldo */
public final class ldo implements aiqc<ajdx<fts>> {
    private final ajwy<gee> a;

    public static ajdx<fts> a(ajwy<gee> ajwy) {
        akcr.b(ajwy, "contentManager");
        Object c = ajdx.c((Callable) new g(ajwy));
        akcr.a(c, "Single.fromCallable { Le…r(contentManager.get()) }");
        return (ajdx) aiqf.a(c, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return ldo.a(this.a);
    }
}
