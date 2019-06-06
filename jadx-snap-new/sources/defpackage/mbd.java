package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import defpackage.may.c;

/* renamed from: mbd */
public final class mbd implements aiqc<ajdp<mbh>> {
    private final ajwy<ajdp<ViewGroup>> a;
    private final ajwy<zfw> b;
    private final ajwy<akbl<Context, jn>> c;

    public static ajdp<mbh> a(ajdp<ViewGroup> ajdp, zfw zfw, akbl<Context, jn> akbl) {
        return (ajdp) aiqf.a(c.a((ajdp) ajdp, zfw, (akbl) akbl), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return mbd.a((ajdp) this.a.get(), (zfw) this.b.get(), (akbl) this.c.get());
    }
}
