package defpackage;

import android.content.Context;
import com.snap.core.db.api.DbLogger;
import com.snap.core.db.api.SnapDb;
import defpackage.guf.a;

/* renamed from: gug */
public final class gug implements aiqc<SnapDb> {
    private final ajwy<Context> a;
    private final ajwy<gqr> b;
    private final ajwy<zgb> c;
    private final ajwy<ihh> d;
    private final ajwy<DbLogger> e;
    private final ajwy<igb> f;

    public static SnapDb a(Context context, gqr gqr, zgb zgb, ihh ihh, DbLogger dbLogger, igb igb) {
        return (SnapDb) aiqf.a(a.a(context, gqr, zgb, ihh, dbLogger, igb), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return gug.a((Context) this.a.get(), (gqr) this.b.get(), (zgb) this.c.get(), (ihh) this.d.get(), (DbLogger) this.e.get(), (igb) this.f.get());
    }
}
