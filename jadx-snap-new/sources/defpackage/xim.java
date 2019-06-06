package defpackage;

import android.content.Context;
import defpackage.xhs.c;

/* renamed from: xim */
public final class xim implements aiqc<xoz> {
    private final ajwy<Context> a;
    private final ajwy<ygi> b;

    public static xoz a(Context context, ajwy<ygi> ajwy) {
        return (xoz) aiqf.a(c.a(context, ajwy), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        ajwy ajwy = this.a;
        return xim.a((Context) ajwy.get(), this.b);
    }
}
