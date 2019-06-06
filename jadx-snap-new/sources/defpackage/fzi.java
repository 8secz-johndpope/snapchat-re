package defpackage;

import android.content.Context;
import com.snap.core.db.api.DbLogger;
import com.snap.core.db.api.PlatformCoreDbManager;
import com.snap.core.db.api.SqlDelightDbManager;

/* renamed from: fzi */
public final class fzi implements aiqc<SqlDelightDbManager> {
    private final ajwy<Context> a;
    private final ajwy<gqr> b;
    private final ajwy<zgb> c;
    private final ajwy<ihh> d;
    private final ajwy<DbLogger> e;
    private final ajwy<igb> f;

    public static SqlDelightDbManager a(Context context, gqr gqr, zgb zgb, ihh ihh, DbLogger dbLogger, igb igb) {
        zfw a = zgb.a(gef.a, "CoreDb");
        return (SqlDelightDbManager) aiqf.a(new PlatformCoreDbManager(context, gqr, zgb, a.p(), a.i(), a.p().a(), ihh, dbLogger, igb), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return fzi.a((Context) this.a.get(), (gqr) this.b.get(), (zgb) this.c.get(), (ihh) this.d.get(), (DbLogger) this.e.get(), (igb) this.f.get());
    }
}
