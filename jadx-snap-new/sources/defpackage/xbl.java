package defpackage;

import android.content.Context;

/* renamed from: xbl */
public final class xbl implements aiqc<xfn> {
    private final ajwy<Context> a;

    public xbl(ajwy<Context> ajwy) {
        this.a = ajwy;
    }

    public final /* synthetic */ Object get() {
        Context context = (Context) this.a.get();
        akcr.b(context, "context");
        return (xfn) aiqf.a(new xfn(context), "Cannot return null from a non-@Nullable @Provides method");
    }
}
