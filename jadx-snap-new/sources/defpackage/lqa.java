package defpackage;

import android.view.ViewGroup;
import defpackage.lpj.c;

/* renamed from: lqa */
public final class lqa implements aiqc<mhi<? extends mha>> {
    private final ajwy<lpj> a;
    private final ajwy<lqp> b;
    private final ajwy<ajdp<mih>> c;
    private final ajwy<Boolean> d;
    private final ajwy<ajdp<Boolean>> e;
    private final ajwy<ajdp<ViewGroup>> f;

    public static mhi<? extends mha> a(lpj lpj, lqp lqp, ajdp<mih> ajdp, boolean z, ajdp<Boolean> ajdp2, ajdp<ViewGroup> ajdp3) {
        return (mhi) aiqf.a(c.a(lpj, lqp, (ajdp) ajdp, z, (ajdp) ajdp2, (ajdp) ajdp3), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return lqa.a((lpj) this.a.get(), (lqp) this.b.get(), (ajdp) this.c.get(), ((Boolean) this.d.get()).booleanValue(), (ajdp) this.e.get(), (ajdp) this.f.get());
    }
}
