package defpackage;

import com.google.common.base.Optional;
import java.util.Set;

/* renamed from: fzw */
public final class fzw implements aiqc<ifg> {
    private final ajwy<ajdw> a;
    private final ajwy<Set<ifj>> b;
    private final ajwy<ihh> c;
    private final ajwy<Optional<ifk>> d;
    private final ajwy<abnm> e;

    public static ifg a(ajdw ajdw, Set<ifj> set, ihh ihh, Optional<ifk> optional, ajwy<abnm> ajwy) {
        ifc ifc = new ifc(ajdw, ihh, optional, ajwy);
        for (ifj a : set) {
            a.a(ifc);
        }
        return (ifg) aiqf.a(ifc, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        ajwy ajwy = this.a;
        ajwy ajwy2 = this.b;
        ajwy ajwy3 = this.c;
        ajwy ajwy4 = this.d;
        return fzw.a((ajdw) ajwy.get(), (Set) ajwy2.get(), (ihh) ajwy3.get(), (Optional) ajwy4.get(), this.e);
    }
}
