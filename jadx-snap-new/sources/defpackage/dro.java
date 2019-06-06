package defpackage;

import android.os.Handler;
import com.google.common.base.Supplier;

/* renamed from: dro */
public final class dro implements aiqc<dnx> {
    private final ajwy<ebc> a;
    private final ajwy<Supplier<Handler>> b;
    private final ajwy<dqm> c;
    private final ajwy<dmy> d;
    private final ajwy<ifs> e;
    private final ajwy<dvo> f;
    private final ajwy<dqy> g;
    private final ajwy<dpf> h;
    private final ajwy<eaq> i;

    public static dnx a(ebc ebc, Supplier<Handler> supplier, dqm dqm, dmy dmy, ifs ifs, ajwy<dvo> ajwy, ajwy<dqy> ajwy2, dpf dpf, eaq eaq) {
        return (dnx) aiqf.a(drl.a(ebc, (Supplier) supplier, dqm, dmy, ifs, (ajwy) ajwy, (ajwy) ajwy2, dpf, eaq), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        ajwy ajwy = this.a;
        ajwy ajwy2 = this.b;
        ajwy ajwy3 = this.c;
        ajwy ajwy4 = this.d;
        ajwy ajwy5 = this.e;
        return dro.a((ebc) ajwy.get(), (Supplier) ajwy2.get(), (dqm) ajwy3.get(), (dmy) ajwy4.get(), (ifs) ajwy5.get(), this.f, this.g, (dpf) this.h.get(), (eaq) this.i.get());
    }
}
