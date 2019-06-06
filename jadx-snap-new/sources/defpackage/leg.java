package defpackage;

import android.net.Uri;
import com.google.common.base.Supplier;
import defpackage.miq.d.a;

/* renamed from: leg */
public final class leg implements aiqc<mof> {
    private final ajwy<Supplier<gfu>> a;
    private final ajwy<zgb> b;
    private final ajwy<akbl<a, Uri>> c;
    private final ajwy<ide> d;

    public static mof a(Supplier<gfu> supplier, zgb zgb, akbl<a, Uri> akbl, ide ide) {
        return (mof) aiqf.a(ldv.a(supplier, zgb, akbl, ide), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return leg.a((Supplier) this.a.get(), (zgb) this.b.get(), (akbl) this.c.get(), (ide) this.d.get());
    }
}
