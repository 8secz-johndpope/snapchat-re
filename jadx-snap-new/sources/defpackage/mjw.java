package defpackage;

import android.content.Context;
import defpackage.mjo.c.b;

/* renamed from: mjw */
public final class mjw implements aiqc<mpc> {
    private final ajwy<Context> a;

    public static mpc a(Context context) {
        akcr.b(context, "context");
        return (mpc) aiqf.a(new b(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return mjw.a((Context) this.a.get());
    }
}
