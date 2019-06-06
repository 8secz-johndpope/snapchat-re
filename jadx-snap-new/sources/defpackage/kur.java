package defpackage;

import android.content.Context;
import defpackage.lno.a;

/* renamed from: kur */
public final class kur implements aiqc<a> {
    private final ajwy<Context> a;
    private final ajwy<zgb> b;
    private final ajwy<jwb> c;
    private final ajwy<jwe> d;

    public static a a(Context context, zgb zgb, jwb jwb, jwe jwe) {
        return (a) aiqf.a(ktz.a.a(context, zgb, jwb, jwe), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return kur.a((Context) this.a.get(), (zgb) this.b.get(), (jwb) this.c.get(), (jwe) this.d.get());
    }
}
