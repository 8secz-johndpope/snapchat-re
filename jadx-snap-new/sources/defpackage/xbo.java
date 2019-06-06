package defpackage;

import android.content.Context;

/* renamed from: xbo */
public final class xbo implements aiqc<xhl> {
    private final ajwy<xfn> a;
    private final ajwy<Context> b;

    public xbo(ajwy<xfn> ajwy, ajwy<Context> ajwy2) {
        this.a = ajwy;
        this.b = ajwy2;
    }

    public final /* synthetic */ Object get() {
        aipn b = aiqb.b(this.a);
        Context context = (Context) this.b.get();
        akcr.b(b, "preferences");
        akcr.b(context, "context");
        return (xhl) aiqf.a(new xhl(b, context), "Cannot return null from a non-@Nullable @Provides method");
    }
}
