package defpackage;

import com.snap.core.db.api.SnapDb;
import defpackage.lkp.a;

/* renamed from: kul */
public final class kul implements aiqc<a> {
    private final ajwy<SnapDb> a;
    private final ajwy<zgb> b;

    public static a a(SnapDb snapDb, zgb zgb) {
        return (a) aiqf.a(ktz.a.a(snapDb, zgb), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return kul.a((SnapDb) this.a.get(), (zgb) this.b.get());
    }
}
