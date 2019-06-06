package defpackage;

import android.view.View;
import defpackage.mdu.c;

/* renamed from: mdz */
public final class mdz implements aiqc<mhi<? extends mha>> {
    private final ajwy<mdu> a;
    private final ajwy<ajdp<View>> b;
    private final ajwy<Boolean> c;

    public static mhi<? extends mha> a(mdu mdu, ajdp<View> ajdp, boolean z) {
        return (mhi) aiqf.a(c.a(mdu, ajdp, z), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return mdz.a((mdu) this.a.get(), (ajdp) this.b.get(), ((Boolean) this.c.get()).booleanValue());
    }
}
