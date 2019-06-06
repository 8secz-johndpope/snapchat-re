package defpackage;

import com.google.common.base.Supplier;
import defpackage.elr.b;

/* renamed from: elt */
public final class elt implements aiqc<Supplier<aaqd>> {
    private final ajwy<ajwl<aaqd>> a;

    public static Supplier<aaqd> a(ajwl<aaqd> ajwl) {
        return (Supplier) aiqf.a(b.a((ajwl) ajwl), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return elt.a((ajwl) this.a.get());
    }
}
