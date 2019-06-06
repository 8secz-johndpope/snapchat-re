package defpackage;

import android.content.Context;
import defpackage.ljx.a;

/* renamed from: ktl */
public final class ktl implements aiqc<a> {
    private final ajwy<Context> a;
    private final ajwy<nbl> b;
    private final ajwy<zgb> c;
    private final ajwy<gcy> d;
    private final ajwy<lbp> e;

    public static a a(Context context, ajwy<nbl> ajwy, zgb zgb, ajwy<gcy> ajwy2, lbp lbp) {
        return (a) aiqf.a(ksw.a(context, (ajwy) ajwy, zgb, (ajwy) ajwy2, lbp), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        ajwy ajwy = this.a;
        ajwy ajwy2 = this.b;
        ajwy ajwy3 = this.c;
        return ktl.a((Context) ajwy.get(), ajwy2, (zgb) ajwy3.get(), this.d, (lbp) this.e.get());
    }
}
