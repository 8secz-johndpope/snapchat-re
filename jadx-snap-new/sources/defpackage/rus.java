package defpackage;

import android.app.Activity;
import com.snap.ui.view.surfaceview.SurfaceViewManager;

/* renamed from: rus */
public final class rus implements aiqc<SurfaceViewManager> {
    private final ajwy<abss> a;
    private final ajwy<ablx> b;
    private final ajwy<Activity> c;
    private final ajwy<zkq> d;
    private final ajwy<iib> e;
    private final ajwy<absi> f;
    private final ajwy<zgb> g;
    private final ajwy<ajei> h;

    public static SurfaceViewManager a(abss abss, ablx ablx, Activity activity, zkq zkq, iib iib, absi absi, zgb zgb, ajei ajei) {
        return (SurfaceViewManager) aiqf.a(rtw.a(abss, ablx, activity, zkq, iib, absi, zgb, ajei), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return rus.a((abss) this.a.get(), (ablx) this.b.get(), (Activity) this.c.get(), (zkq) this.d.get(), (iib) this.e.get(), (absi) this.f.get(), (zgb) this.g.get(), (ajei) this.h.get());
    }
}
