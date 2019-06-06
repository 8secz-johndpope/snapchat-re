package defpackage;

import com.google.common.base.Supplier;

/* renamed from: kpr */
public final class kpr implements aiqc<krh> {
    private final ajwy<kre> a;
    private final ajwy<Supplier<iha>> b;

    public static krh a(kre kre, Supplier<iha> supplier) {
        akcr.b(kre, "blizzardEventLogger");
        akcr.b(supplier, "serializationHelper");
        return (krh) aiqf.a(new krh(kre, supplier), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return kpr.a((kre) this.a.get(), (Supplier) this.b.get());
    }
}
