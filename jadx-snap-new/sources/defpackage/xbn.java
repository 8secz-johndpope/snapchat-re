package defpackage;

import android.content.Context;

/* renamed from: xbn */
public final class xbn implements aiqc<xgq> {
    private final ajwy<xfn> a;
    private final ajwy<xgk> b;
    private final ajwy<Context> c;

    public xbn(ajwy<xfn> ajwy, ajwy<xgk> ajwy2, ajwy<Context> ajwy3) {
        this.a = ajwy;
        this.b = ajwy2;
        this.c = ajwy3;
    }

    public final /* synthetic */ Object get() {
        ajwy ajwy = this.a;
        ajwy ajwy2 = this.b;
        Context context = (Context) this.c.get();
        akcr.b(ajwy, "preferences");
        akcr.b(ajwy2, "eventObservables");
        akcr.b(context, "context");
        return (xgq) aiqf.a(new xgq(ajwy, ajwy2, context), "Cannot return null from a non-@Nullable @Provides method");
    }
}
