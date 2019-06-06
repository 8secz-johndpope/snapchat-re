package defpackage;

import android.content.Context;
import defpackage.xhs.b;

/* renamed from: xhz */
public final class xhz implements aiqc<xaz> {
    private final ajwy<Context> a;

    public static xaz a(Context context) {
        return (xaz) aiqf.a(b.a(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return xhz.a((Context) this.a.get());
    }
}
