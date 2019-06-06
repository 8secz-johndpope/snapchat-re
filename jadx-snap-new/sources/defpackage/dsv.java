package defpackage;

import android.content.Context;
import android.os.Handler;
import com.google.common.base.Supplier;
import defpackage.dru.b.b;

/* renamed from: dsv */
public final class dsv implements aiqc<dvo> {
    private final ajwy<dqo> a;
    private final ajwy<dpf> b;
    private final ajwy<jwa> c;
    private final ajwy<dny> d;
    private final ajwy<gqr> e;
    private final ajwy<Context> f;
    private final ajwy<Supplier<Handler>> g;
    private final ajwy<dyw> h;
    private final ajwy<adhk> i;
    private final ajwy<dvq> j;

    public static dvo a(dqo dqo, dpf dpf, jwa jwa, dny dny, gqr gqr, Context context, Supplier<Handler> supplier, dyw dyw, adhk adhk, dvq dvq) {
        dyw dyw2 = dyw;
        dqo dqo2 = dqo;
        akcr.b(dqo, "cameraStore");
        dpf dpf2 = dpf;
        akcr.b(dpf, "cameraConfiguration");
        jwa jwa2 = jwa;
        akcr.b(jwa, "bitmapFactory");
        dny dny2 = dny;
        akcr.b(dny2, "analyticsReporter");
        gqr gqr2 = gqr;
        akcr.b(gqr2, "exceptionTracker");
        Context context2 = context;
        akcr.b(context2, "context");
        Supplier<Handler> supplier2 = supplier;
        akcr.b(supplier2, "handler");
        akcr.b(dyw2, "cameraFrameDispatcherFactory");
        adhk adhk2 = adhk;
        akcr.b(adhk2, "gles20Wrapper");
        dvq dvq2 = dvq;
        akcr.b(dvq2, "cameraStatusListenerManager");
        return (dvo) aiqf.a(new dvo(dqo2, dpf2, dny2, gqr2, context2, supplier2, jwa2, new b(dyw2), adhk2, dvq2), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return dsv.a((dqo) this.a.get(), (dpf) this.b.get(), (jwa) this.c.get(), (dny) this.d.get(), (gqr) this.e.get(), (Context) this.f.get(), (Supplier) this.g.get(), (dyw) this.h.get(), (adhk) this.i.get(), (dvq) this.j.get());
    }
}
