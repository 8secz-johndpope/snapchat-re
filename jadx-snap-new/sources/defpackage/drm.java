package defpackage;

import android.os.Handler;
import com.google.common.base.Supplier;

/* renamed from: drm */
public final class drm implements aiqc<dqn> {
    private final ajwy<Supplier<Handler>> a;
    private final ajwy<dou> b;
    private final ajwy<dqo> c;
    private final ajwy<dpf> d;
    private final ajwy<dvo> e;
    private final ajwy<dny> f;
    private final ajwy<dyw> g;
    private final ajwy<ajws<dpy>> h;
    private final ajwy<dvq> i;

    public static dqn a(Supplier<Handler> supplier, dou dou, dqo dqo, dpf dpf, dvo dvo, aipn<dny> aipn, ajwy<dyw> ajwy, ajws<dpy> ajws, dvq dvq) {
        return (dqn) aiqf.a(drl.a((Supplier) supplier, dou, dqo, dpf, dvo, (aipn) aipn, (ajwy) ajwy, (ajws) ajws, dvq), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        ajwy ajwy = this.a;
        ajwy ajwy2 = this.b;
        ajwy ajwy3 = this.c;
        ajwy ajwy4 = this.d;
        ajwy ajwy5 = this.e;
        ajwy ajwy6 = this.f;
        return drm.a((Supplier) ajwy.get(), (dou) ajwy2.get(), (dqo) ajwy3.get(), (dpf) ajwy4.get(), (dvo) ajwy5.get(), aiqb.b(ajwy6), this.g, (ajws) this.h.get(), (dvq) this.i.get());
    }
}
