package defpackage;

import android.content.Context;
import defpackage.lig.a.a;

/* renamed from: lih */
public final class lih implements aiqc<mqt> {
    private final ajwy<Context> a;
    private final ajwy<zgb> b;
    private final ajwy<achb<zjm, zjk>> c;
    private final ajwy<ajei> d;
    private final ajwy<kqf> e;

    public static mqt a(Context context, zgb zgb, ajwy<achb<zjm, zjk>> ajwy, ajei ajei, kqf kqf) {
        return (mqt) aiqf.a(a.a(context, zgb, ajwy, ajei, kqf), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        ajwy ajwy = this.a;
        ajwy ajwy2 = this.b;
        return lih.a((Context) ajwy.get(), (zgb) ajwy2.get(), this.c, (ajei) this.d.get(), (kqf) this.e.get());
    }
}
