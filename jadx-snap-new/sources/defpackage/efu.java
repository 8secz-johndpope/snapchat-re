package defpackage;

import com.google.common.base.Supplier;
import defpackage.efr.b;

/* renamed from: efu */
public final class efu implements aiqc<Supplier<aaoh>> {
    private final ajwy<ajwl<aaoh>> a;

    public static Supplier<aaoh> a(ajwl<aaoh> ajwl) {
        return (Supplier) aiqf.a(b.a(ajwl), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return efu.a((ajwl) this.a.get());
    }
}
