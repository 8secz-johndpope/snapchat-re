package defpackage;

import android.content.Context;
import defpackage.ksw.x;

/* renamed from: ktq */
public final class ktq implements aiqc<lkn> {
    private final ajwy<Context> a;
    private final ajwy<sdu> b;

    public static lkn a(Context context, ajwy<sdu> ajwy) {
        akcr.b(context, "context");
        akcr.b(ajwy, "notificationEmitter");
        return (lkn) aiqf.a(new lkm(context, new kuu(new x(ajwy))), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        ajwy ajwy = this.a;
        return ktq.a((Context) ajwy.get(), this.b);
    }
}
