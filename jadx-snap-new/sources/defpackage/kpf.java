package defpackage;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

@Deprecated
/* renamed from: kpf */
public final class kpf {
    public static volatile aipn<kpc> a;
    private static final Supplier<kpc> b = Suppliers.memoize(-$$Lambda$kpf$HyH0Zn_k8g977fBiCqLYTkrsCNs.INSTANCE);

    public static kpc a() {
        return (kpc) (a == null ? b.get() : a.get());
    }
}
