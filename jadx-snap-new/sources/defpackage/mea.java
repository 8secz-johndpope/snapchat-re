package defpackage;

import android.view.View;
import android.view.ViewStub;
import defpackage.mdu.c;

/* renamed from: mea */
public final class mea implements aiqc<mhi<? extends mha>> {
    private final ajwy<mdu> a;
    private final ajwy<Boolean> b;
    private final ajwy<ajdp<ViewStub>> c;
    private final ajwy<ajdp<View>> d;
    private final ajwy<ajdp<ajxw>> e;
    private final ajwy<ajdp<Boolean>> f;

    public static mhi<? extends mha> a(mdu mdu, boolean z, ajdp<ViewStub> ajdp, ajdp<View> ajdp2, ajdp<ajxw> ajdp3, ajdp<Boolean> ajdp4) {
        return (mhi) aiqf.a(c.a(mdu, z, ajdp, ajdp2, ajdp3, ajdp4), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return mea.a((mdu) this.a.get(), ((Boolean) this.b.get()).booleanValue(), (ajdp) this.c.get(), (ajdp) this.d.get(), (ajdp) this.e.get(), (ajdp) this.f.get());
    }
}
