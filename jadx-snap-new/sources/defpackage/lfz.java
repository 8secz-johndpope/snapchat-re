package defpackage;

import android.content.Context;
import com.google.common.base.Supplier;

/* renamed from: lfz */
public final class lfz implements aiqc<lfq> {
    private final ajwy<gqr> a;
    private final ajwy<Context> b;
    private final ajwy<Supplier<abss>> c;
    private final ajwy<zgb> d;
    private final ajwy<ide> e;

    public static lfq a(gqr gqr, Context context, Supplier<abss> supplier, zgb zgb, ide ide) {
        return (lfq) aiqf.a(lfv.a(gqr, context, (Supplier) supplier, zgb, ide), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return lfz.a((gqr) this.a.get(), (Context) this.b.get(), (Supplier) this.c.get(), (zgb) this.d.get(), (ide) this.e.get());
    }
}
