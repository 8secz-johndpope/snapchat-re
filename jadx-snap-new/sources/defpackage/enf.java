package defpackage;

import android.app.Activity;
import com.snap.ui.view.ViewFinder;
import defpackage.dqc.a;
import defpackage.emy.b;

/* renamed from: enf */
public final class enf implements aiqc<dno> {
    private final ajwy<a> a;
    private final ajwy<Activity> b;
    private final ajwy<ViewFinder> c;
    private final ajwy<dni> d;
    private final ajwy<ajdp<ebk>> e;
    private final ajwy<ajdp<?>> f;

    public static dno a(a aVar, Activity activity, ViewFinder viewFinder, dni dni, ajdp<ebk> ajdp, ajdp<?> ajdp2) {
        return (dno) aiqf.a(b.a(aVar, activity, viewFinder, dni, ajdp, ajdp2), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return enf.a((a) this.a.get(), (Activity) this.b.get(), (ViewFinder) this.c.get(), (dni) this.d.get(), (ajdp) this.e.get(), (ajdp) this.f.get());
    }
}
