package defpackage;

import android.content.Context;
import com.google.common.base.Supplier;
import defpackage.myq.a;

/* renamed from: myg */
public final class myg implements aiqc<Supplier<adiv>> {
    private final ajwy<Context> a;
    private final ajwy<a> b;
    private final ajwy<gqr> c;

    public static Supplier<adiv> a(Context context, aipn<a> aipn, gqr gqr) {
        akcr.b(context, "context");
        akcr.b(aipn, "config");
        akcr.b(gqr, "exceptionTracker");
        return (Supplier) aiqf.a(new mye.a(context, aipn, gqr), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return myg.a((Context) this.a.get(), aiqb.b(this.b), (gqr) this.c.get());
    }
}
