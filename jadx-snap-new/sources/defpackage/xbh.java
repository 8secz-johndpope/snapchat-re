package defpackage;

import android.content.Context;

/* renamed from: xbh */
public final class xbh implements aiqc<xhc> {
    private final ajwy<Context> a;

    public xbh(ajwy<Context> ajwy) {
        this.a = ajwy;
    }

    public final /* synthetic */ Object get() {
        Context context = (Context) this.a.get();
        akcr.b(context, "context");
        return (xhc) aiqf.a(new xhc(context), "Cannot return null from a non-@Nullable @Provides method");
    }
}
