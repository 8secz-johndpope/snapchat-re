package defpackage;

import android.content.Context;
import com.google.common.base.Supplier;
import defpackage.ksw.a;
import defpackage.ksw.b;
import defpackage.ksw.c;

/* renamed from: ksy */
public final class ksy implements aiqc<lnr> {
    private final ajwy<Context> a;
    private final ajwy<gcy> b;
    private final ajwy<zgb> c;
    private final ajwy<ajei> d;

    public static lnr a(Context context, ajwy<gcy> ajwy, zgb zgb, ajei ajei) {
        akcr.b(context, "context");
        akcr.b(ajwy, "fsnServiceFactory");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(ajei, "activityDisposable");
        zfw a = zgb.a(kus.b, "DefaultAssetsUploader");
        Supplier cVar = new c(ajwy);
        Supplier aVar = new a(context);
        akbl lhk = new lhk();
        akbw bVar = new b();
        mhk mhk = mhk.b.a;
        akcr.b(mhk, "clock");
        return (lnr) aiqf.a(new lfi(aVar, lhk, bVar, new lfn.a(mhk), cVar, a, ajei), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        ajwy ajwy = this.a;
        return ksy.a((Context) ajwy.get(), this.b, (zgb) this.c.get(), (ajei) this.d.get());
    }
}
