package defpackage;

import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: gal */
public final class gal implements aiqc<rzw> {
    private final ajwy<Executor> a;
    private final ajwy<List<saa>> b;
    private final ajwy<gme> c;
    private final ajwy<ihh> d;
    private final ajwy<rxh> e;

    public static rzw a(Executor executor, List<saa> list, gme gme, ihh ihh, rxh rxh) {
        return (rzw) aiqf.a(fzb.a(executor, list, gme, ihh, rxh), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return gal.a((Executor) this.a.get(), (List) this.b.get(), (gme) this.c.get(), (ihh) this.d.get(), (rxh) this.e.get());
    }
}
