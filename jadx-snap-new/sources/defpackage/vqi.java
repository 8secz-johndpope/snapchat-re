package defpackage;

import android.content.Context;
import defpackage.vqf.a;

/* renamed from: vqi */
public final class vqi implements aiqc<vpc> {
    private final ajwy<Context> a;
    private final ajwy<vpa> b;
    private final ajwy<vpv> c;

    public static vpc a(Context context, vpa vpa, vpv vpv) {
        return (vpc) aiqf.a(a.a(context, vpa, vpv), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return vqi.a((Context) this.a.get(), (vpa) this.b.get(), (vpv) this.c.get());
    }
}
