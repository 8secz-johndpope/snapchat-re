package defpackage;

import com.google.common.base.Supplier;

/* renamed from: llf */
public final class llf implements aiqc<lkf> {
    private final ajwy<Supplier<mmf>> a;

    public static lkf a(Supplier<mmf> supplier) {
        return (lkf) aiqf.a(lkx.a((Supplier) supplier), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return llf.a((Supplier) this.a.get());
    }
}
