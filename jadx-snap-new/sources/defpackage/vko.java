package defpackage;

import android.content.Context;

/* renamed from: vko */
public final class vko implements aiqc<odu> {
    private final ajwy<Context> a;
    private final ajwy<ygi> b;
    private final ajwy<ohr> c;
    private final ajwy<iha> d;
    private final ajwy<oec> e;
    private final ajwy<ohj> f;
    private final ajwy<odl> g;

    public static odu a(Context context, ygi ygi, ohr ohr, aipn<iha> aipn, aipn<oec> aipn2, aipn<ohj> aipn3, odl odl) {
        return (odu) aiqf.a(vkl.a(context, ygi, ohr, (aipn) aipn, (aipn) aipn2, (aipn) aipn3, odl), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return vko.a((Context) this.a.get(), (ygi) this.b.get(), (ohr) this.c.get(), aiqb.b(this.d), aiqb.b(this.e), aiqb.b(this.f), (odl) this.g.get());
    }
}
