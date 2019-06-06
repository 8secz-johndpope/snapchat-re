package defpackage;

import com.google.common.base.Supplier;
import defpackage.ehc.b;

/* renamed from: ehw */
public final class ehw implements aiqc<Supplier<Boolean>> {
    private final ajwy<ajwl<Boolean>> a;

    public static Supplier<Boolean> a(ajwl<Boolean> ajwl) {
        return (Supplier) aiqf.a(b.b((ajwl) ajwl), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return ehw.a((ajwl) this.a.get());
    }
}
