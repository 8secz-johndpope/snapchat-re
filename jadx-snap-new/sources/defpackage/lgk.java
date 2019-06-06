package defpackage;

import defpackage.lgx.c;
import java.util.TimeZone;

/* renamed from: lgk */
public final class lgk implements aiqc<lgx> {
    private final ajwy<c> a;
    private final ajwy<TimeZone> b;
    private final ajwy<mhk> c;
    private final ajwy<ajdp<Boolean>> d;
    private final ajwy<ajdp<Boolean>> e;
    private final ajwy<Long> f;
    private final ajwy<ajdi<aeqv, aeqv>> g;
    private final ajwy<lfq> h;
    private final ajwy<ide> i;
    private final ajwy<zgb> j;

    public static lgx a(c cVar, TimeZone timeZone, mhk mhk, ajdp<Boolean> ajdp, ajdp<Boolean> ajdp2, long j, ajdi<aeqv, aeqv> ajdi, lfq lfq, ide ide, zgb zgb) {
        return (lgx) aiqf.a(lfv.a(cVar, timeZone, mhk, ajdp, ajdp2, j, ajdi, lfq, ide, zgb), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return lgk.a((c) this.a.get(), (TimeZone) this.b.get(), (mhk) this.c.get(), (ajdp) this.d.get(), (ajdp) this.e.get(), ((Long) this.f.get()).longValue(), (ajdi) this.g.get(), (lfq) this.h.get(), (ide) this.i.get(), (zgb) this.j.get());
    }
}
