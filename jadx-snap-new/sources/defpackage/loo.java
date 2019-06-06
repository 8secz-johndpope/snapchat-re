package defpackage;

import defpackage.mhs.b;
import java.util.Set;

/* renamed from: loo */
public final class loo implements aiqc<lor> {
    private final ajwy<ajdp<mmt>> a;
    private final ajwy<nay> b;
    private final ajwy<ajdp<Set<b>>> c;
    private final ajwy<lop> d;

    public static lor a(ajdp<mmt> ajdp, nay nay, ajdp<Set<b>> ajdp2, lop lop) {
        akcr.b(ajdp, "lensCore");
        akcr.b(nay, "userDataRepository");
        akcr.b(ajdp2, "friendUserIds");
        akcr.b(lop, "bitmojiDataRepository");
        return (lor) aiqf.a(new lot(ajdp, nay, ajdp2, lop), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return loo.a((ajdp) this.a.get(), (nay) this.b.get(), (ajdp) this.c.get(), (lop) this.d.get());
    }
}
