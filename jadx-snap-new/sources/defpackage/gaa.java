package defpackage;

import com.google.common.base.Optional;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* renamed from: gaa */
public final class gaa implements aiqc<ryw<ryz>> {
    private final ajwy<Optional<ryw<ryz>>> a;
    private final ajwy<Executor> b;
    private final ajwy<ryt<ryz>> c;
    private final ajwy<rzi<ryz, glv>> d;
    private final ajwy<rzi<ryz, glq>> e;
    private final ajwy<rys<ryz, glv, glq>> f;
    private final ajwy<ryy> g;
    private final ajwy<rzn<ryz>> h;
    private final ajwy<rzd<ryz>> i;
    private final ajwy<ihh> j;
    private final ajwy<zgb> k;

    public static ryw<ryz> a(Optional<ryw<ryz>> optional, Executor executor, ryt<ryz> ryt, rzi<ryz, glv> rzi, rzi<ryz, glq> rzi2, rys<ryz, glv, glq> rys, ryy ryy, rzn<ryz> rzn, rzd<ryz> rzd, ihh ihh, zgb zgb) {
        Object obj;
        zfw a = zgb.a(gef.a, "networkManagerCallback");
        if (optional.isPresent()) {
            obj = (ryw) optional.get();
        } else {
            rzk rzk = new rzk(executor, ryt, rzi, rzi2, rys, ryy, rzn, rzd, ihh, a, new HashMap());
        }
        return (ryw) aiqf.a(obj, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return gaa.a((Optional) this.a.get(), (Executor) this.b.get(), (ryt) this.c.get(), (rzi) this.d.get(), (rzi) this.e.get(), (rys) this.f.get(), (ryy) this.g.get(), (rzn) this.h.get(), (rzd) this.i.get(), (ihh) this.j.get(), (zgb) this.k.get());
    }
}
