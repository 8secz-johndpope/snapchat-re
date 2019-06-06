package defpackage;

import android.content.Context;

/* renamed from: umv */
public final class umv implements aiqc<ugi> {
    private final ajwy<Context> a;

    public static ugi a(Context context) {
        return (ugi) aiqf.a(umm.a(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return umv.a((Context) this.a.get());
    }
}
