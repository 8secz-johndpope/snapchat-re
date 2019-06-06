package defpackage;

import com.google.common.base.Supplier;

/* renamed from: kyv */
public final class kyv implements aiqc<Supplier<mmf>> {
    private final ajwy<mjo> a;

    public static Supplier<mmf> a(mjo mjo) {
        return (Supplier) aiqf.a(kyd.b(mjo), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return kyv.a((mjo) this.a.get());
    }
}
