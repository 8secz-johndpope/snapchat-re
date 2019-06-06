package defpackage;

import com.snap.core.db.api.SnapDb;

/* renamed from: nep */
public final class nep implements aiqc<nfd> {
    private final ajwy<SnapDb> a;

    public static nfd a(SnapDb snapDb) {
        return (nfd) aiqf.a(new nfd(snapDb), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return nep.a((SnapDb) this.a.get());
    }
}
