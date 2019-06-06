package defpackage;

import com.google.common.base.Optional;
import com.google.common.base.Supplier;
import defpackage.emy.b;

/* renamed from: eoa */
public final class eoa implements aiqc<Supplier<abaw>> {
    private final ajwy<Supplier<Optional<dnk>>> a;

    public static Supplier<abaw> a(Supplier<Optional<dnk>> supplier) {
        return (Supplier) aiqf.a(b.a((Supplier) supplier), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return eoa.a((Supplier) this.a.get());
    }
}
