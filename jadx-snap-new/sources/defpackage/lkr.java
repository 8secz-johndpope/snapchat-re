package defpackage;

import com.snap.core.db.api.SnapDb;
import defpackage.lkp.c;

/* renamed from: lkr */
public final class lkr implements aiqc<mnr> {
    private final ajwy<SnapDb> a;
    private final ajwy<zfw> b;
    private final ajwy<ide> c;

    public static mnr a(SnapDb snapDb, zfw zfw, ide ide) {
        return (mnr) aiqf.a(c.a(snapDb, zfw, ide), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return lkr.a((SnapDb) this.a.get(), (zfw) this.b.get(), (ide) this.c.get());
    }
}
