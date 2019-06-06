package defpackage;

import com.google.common.base.Supplier;
import com.snap.core.db.api.SnapDb;
import defpackage.lni.c;

/* renamed from: lnj */
public final class lnj implements aiqc<nay> {
    private final ajwy<Supplier<gpb>> a;
    private final ajwy<Supplier<SnapDb>> b;
    private final ajwy<ide> c;
    private final ajwy<zgb> d;

    public static nay a(Supplier<gpb> supplier, Supplier<SnapDb> supplier2, ide ide, zgb zgb) {
        return (nay) aiqf.a(c.a(supplier, supplier2, ide, zgb), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return lnj.a((Supplier) this.a.get(), (Supplier) this.b.get(), (ide) this.c.get(), (zgb) this.d.get());
    }
}
