package defpackage;

import com.google.common.base.Optional;
import java.util.Set;

/* renamed from: fxz */
public final class fxz implements aiqc<ghb> {
    private final ajwy<Set<gfp>> a;
    private final ajwy<Optional<gfq>> b;
    private final ajwy<ilv> c;

    public static ghb a(Set<gfp> set, Optional<gfq> optional, ajwy<ilv> ajwy) {
        return (ghb) aiqf.a(new ghb(set, optional, ajwy), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        ajwy ajwy = this.a;
        ajwy ajwy2 = this.b;
        return fxz.a((Set) ajwy.get(), (Optional) ajwy2.get(), this.c);
    }
}
