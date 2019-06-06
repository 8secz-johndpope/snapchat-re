package defpackage;

import com.google.common.base.Supplier;
import com.snap.ui.view.ViewFinder;
import defpackage.ehc.b;

/* renamed from: ehl */
public final class ehl implements aiqc<ejj> {
    private final ajwy<dpd> a;
    private final ajwy<ViewFinder> b;
    private final ajwy<ejl> c;
    private final ajwy<Supplier<Boolean>> d;
    private final ajwy<Supplier<Boolean>> e;
    private final ajwy<Supplier<Boolean>> f;
    private final ajwy<ilv> g;

    public static ejj a(dpd dpd, ViewFinder viewFinder, ejl ejl, Supplier<Boolean> supplier, Supplier<Boolean> supplier2, Supplier<Boolean> supplier3, ilv ilv) {
        return (ejj) aiqf.a(b.a(dpd, viewFinder, ejl, supplier, supplier2, supplier3, ilv), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return ehl.a((dpd) this.a.get(), (ViewFinder) this.b.get(), (ejl) this.c.get(), (Supplier) this.d.get(), (Supplier) this.e.get(), (Supplier) this.f.get(), (ilv) this.g.get());
    }
}
