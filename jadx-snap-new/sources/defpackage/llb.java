package defpackage;

import com.google.common.base.Supplier;

/* renamed from: llb */
public final class llb implements aiqc<Supplier<mmf>> {
    private final ajwy<mjo> a;

    public static Supplier<mmf> a(mjo mjo) {
        return (Supplier) aiqf.a(lkx.a(mjo), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return llb.a((mjo) this.a.get());
    }
}
