package defpackage;

import com.google.common.base.Supplier;
import defpackage.elr.b;

/* renamed from: elu */
public final class elu implements aiqc<Supplier<Boolean>> {
    private final ajwy<Supplier<aaqd>> a;

    public static Supplier<Boolean> a(Supplier<aaqd> supplier) {
        return (Supplier) aiqf.a(b.a((Supplier) supplier), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return elu.a((Supplier) this.a.get());
    }
}
