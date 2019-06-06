package defpackage;

import android.content.Context;
import defpackage.rzu.b;
import java.util.concurrent.Executor;

/* renamed from: ryc */
public final class ryc implements aiqc<rxy> {
    private final ajwy<Context> a;
    private final ajwy<Executor> b;
    private final ajwy<whi> c;
    private final ajwy<gcw> d;
    private final ajwy<ftl> e;
    private final ajwy<iha> f;
    private final ajwy<b> g;
    private final ajwy<igc> h;

    public static rxy a(Context context, Executor executor, whi whi, gcw gcw, ftl ftl, aipn<iha> aipn, b bVar, igc igc) {
        return (rxy) aiqf.a(rya.a(context, executor, whi, gcw, ftl, aipn, bVar, igc), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return ryc.a((Context) this.a.get(), (Executor) this.b.get(), (whi) this.c.get(), (gcw) this.d.get(), (ftl) this.e.get(), aiqb.b(this.f), (b) this.g.get(), (igc) this.h.get());
    }
}
