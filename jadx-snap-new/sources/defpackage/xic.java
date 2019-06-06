package defpackage;

import com.google.common.base.Optional;
import defpackage.xhs.b;

/* renamed from: xic */
public final class xic implements aiqc<Optional<adjm>> {
    private final ajwy<xpt> a;
    private final ajwy<xpn> b;
    private final ajwy<xhm> c;

    public static Optional<adjm> a(ajwy<xpt> ajwy, xpn xpn, xhm xhm) {
        return (Optional) aiqf.a(b.a(ajwy, xpn, xhm), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return xic.a(this.a, (xpn) this.b.get(), (xhm) this.c.get());
    }
}
