package defpackage;

import android.content.Context;
import com.google.common.base.Supplier;

/* renamed from: lgo */
public final class lgo implements aiqc<ajdi<aeqv, aeqv>> {
    private final ajwy<Context> a;
    private final ajwy<mhk> b;
    private final ajwy<ide> c;
    private final ajwy<zgb> d;
    private final ajwy<Supplier<iha>> e;
    private final ajwy<miw> f;

    public static ajdi<aeqv, aeqv> a(Context context, mhk mhk, ide ide, zgb zgb, Supplier<iha> supplier, miw miw) {
        return (ajdi) aiqf.a(lfv.a(context, mhk, ide, zgb, supplier, miw), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return lgo.a((Context) this.a.get(), (mhk) this.b.get(), (ide) this.c.get(), (zgb) this.d.get(), (Supplier) this.e.get(), (miw) this.f.get());
    }
}
